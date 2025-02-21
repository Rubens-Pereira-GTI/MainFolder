package tiposgenericos;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{    
    
    List<Animal> list = new ArrayList<Animal>();
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    ArrayList<Animal> animals;
    public <T extends Animal> void takethings(ArrayList<T> list, ArrayList<T> list2){}
    
    public void takethings2(ArrayList<? extends Animal> list){
        animals.addAll(dogs);
    }

    private String especie = "Cão";
    public void eat(){
        System.out.println("O "+ especie+ " está comendo");
    }
}
