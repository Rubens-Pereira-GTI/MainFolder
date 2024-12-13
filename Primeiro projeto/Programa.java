public class Programa {
        public static int num =1;
        public String nome="rubens";

        public void go(){
            nome = "Carlos";
        
    }
        
    public static void main(String[] args) {
        System.out.println("olá");
        Programa p = new Programa();
        p.go();
        System.out.println( Programa.num);
        System.out.println( p.nome);
    }
}
