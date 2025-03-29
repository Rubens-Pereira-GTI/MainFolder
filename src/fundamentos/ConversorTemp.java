package fundamentos;

import java.util.Scanner;

public class ConversorTemp {
    
    

    public double faToCel(double f){
        
        return ((f-32)*5) /9;
    }

    public double celToFa(double c){
        
        return ((c * 9)/5)+32;
    }

    public double conversor(){
        Scanner scan = new Scanner(System.in);
        int op=0;
        double result=0;
        while (op !=-1 && op !=1 && op!=2) {
            System.out.println("Informe o que deseja converter");
            System.out.println("1- F para C");
            System.out.println("2- C para F ");
            op =scan.nextInt();
            
        
            switch (op) {
                case 1:
                    System.out.println("informe a temperatura em Fah : ");
                    result = faToCel(scan.nextDouble());  
                    System.out.println("RESULTADO: "+ result+ "ºC");              
                    break;
                case 2: 
                    System.out.println("informe a temperatura em C: ");
                    result = celToFa(scan.nextDouble());
                    System.out.println("RESULTADO: "+ result+ "F");
                    break;
            
                default:
                System.out.println("informe um dos valores pedidos  1 ou 2");      
                System.out.println("Ou -1 para sair");
                    break;
            }
        }
        scan.close();
        return result;       
    }

    public static void main(String[] args) {
        ConversorTemp conversor = new ConversorTemp();
        conversor.conversor();
    }
}
