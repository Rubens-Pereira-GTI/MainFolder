package fundamentos;

public class HelloWord {
    
    public static void main(String[] args) {
        System.out.println("olá pessoal");
        String nome="Rubens", sobrenome="Pereira";
        int idade= 35;
        float salario=3500; 
        //String.format();
        System.out.printf("O %s %s tem %d e ganha %,.2f ", nome, sobrenome, idade, salario);
        
    }
}
