package tiposgenericos;

public class IgualdadeEntreObjetos {
    Animal foo = new Animal();
    Animal bar = new Animal();

    public void go(){
        // uma lista do Tipo HashSet faz essas duas verificações 
        if(foo.equals(bar) && foo.hashCode() == bar.hashCode()){

        }
    }

}
