package Jukebox;

import java.util.HashMap;

public class TestMap implements Comparable<TestMap> {
    
    String nome ="Amor";
    public int compareTo(TestMap map){
        return nome.compareTo(map.nome);
    }

    public static void main(String[] args) {
        
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Rubens", 42);
        scores.put("Edna", 343);
        scores.put("Bruno", 18);

        System.out.println(scores);
        System.out.println(scores.get("Rubens"));
    }
}
