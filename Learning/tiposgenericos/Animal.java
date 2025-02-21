package tiposgenericos;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Animal {  

     /*agora utilize um parametro tipado em uma classe que não foi tipada com os tipos genericos
    / utilize o método abaixo como referência, e faça o tipo T funcionar
    / public void takeThings(ArrayList<T> list){   }
    */
    //public <T extends Animal> void takeThings(ArrayList<T> list){}

    public void takeThings(ArrayList<Animal> lista){}

    public static void main(String[] args) {
        // Declare uma variável genérica, use a classe generica List e atribua o tipo Dog
        // crie uma instância de classe pode ser a ArrayList e tipe ele como Animal    
        List<Animal> listaAnimals = new ArrayList<Animal>(); 
        // chame o metodo generico foo passando a lista generica
        Animal a = new Animal();
        a.foo(listaAnimals);
        
    }         
    // declare o método foo como um tipo generico
    public void foo(List<Animal> lista){}

   
    public void eat(){
        System.out.println("animal está comendo");
    }

}
