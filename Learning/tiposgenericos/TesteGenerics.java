package tiposgenericos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesteGenerics {
    public static void main(String[] args){
        new TesteGenerics().go();
    }

    public void go(){        
        ArrayList<Animal> listaAnimais = new ArrayList<Animal>();         
        listaAnimais.add(new Dog());
        listaAnimais.add(new Cat());
        takeAnimals(listaAnimais);

        ArrayList<Dog>dogList = new ArrayList<Dog>();
        dogList.add(new Dog());        
        //takeAnimals(dogList);
        
        Dog[] dogsList = {new Dog(), new Dog()};
        takeAnimals2(dogsList);
    }
    public void takeAnimals(ArrayList<? extends Animal> animais){        
       animais.add(new Cat());
    }
    public void takeAnimals2(Animal[] animais){        
       animais[0] = new Cat();
    }


    
}
