/**
 * Exercicio de imãs do livro java use a cabeça, livro fornece varios trechos de codigos 
 * e preciso montar de forma que a saída seja: 
 * one 98098
 * two 98099
 */

public class TestThreads {   

    public static void main(String[] args) {
        
        ThreadOne t1 = new ThreadOne();
        Thread one = new Thread(t1);

        ThreadTwo t2 = new ThreadTwo();
        Thread two = new Thread(t2);

        one.start();
        two.start();
    }
       
        
}





