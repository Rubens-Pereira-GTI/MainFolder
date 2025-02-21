package tiposgenericos;

import java.util.HashMap;

public class TestMap {
    
    public static void main(String[] args) {
        HashMap<String, Integer> scores= new HashMap<String,Integer>();

        scores.put("Kath", 42);
        scores.put("Rubens", 343);
        scores.put("Bruno", 420);

        System.out.println(scores);
        System.out.println(scores.get("Rubens"));
    }
}
