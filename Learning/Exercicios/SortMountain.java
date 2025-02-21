package Exercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountain {
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();
    

    public class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return one.name.compareTo(two.name); 
        }
    }
    
    public class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return (two.height - one.height); 
        }

    }

    public void go(){
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14153));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n" + mtn);        
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);        
        System.out.println("By name:\n"+ mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By hight:\n"+ mtn );        

    }

    public static void main(String[] args) {
        SortMountain sm = new SortMountain();
        sm.go();
    }

    public class Mountain{
        String name;
        int height;
        public Mountain(String n, int h){
            name = n;
            height = h;
        }

        public String toString(){
            return name + " " + height;
        }
        // falta algo aqui
    }
}
