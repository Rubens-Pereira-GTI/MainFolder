package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    private String salario1, salario2, salario3;
    private float  media;
    // pegaremos 3 string, essas strings vão conter os três salários do funcionário
    
    public void go(){
        //utilizei o metodo .replace que vai agir caso o usuário coloque uma virgula ao invez do ponto
        Scanner scan = new Scanner(System.in);        
        System.out.println("Informe o 1º salário: ");
        salario1 = scan.nextLine().replace(',', '.');
        System.out.println("Informe o 2º salário:");
        salario2 = scan.nextLine().replace(',', '.');
        System.out.println("informe o 3º salário:");
        salario3 = scan.nextLine().replace(',', '.');                
        scan.close();
        //covertendo String em float
        float s1 = Float.parseFloat(salario1);
        float s2 = Float.parseFloat(salario2);
        float s3 = Float.parseFloat(salario3);
        
        float media = calMedia(s1, s2, s3);

        System.out.printf("Essa é a media dos três salários: %,.2f", media);
        
    }

    public float calMedia(float s1, float s2, float s3){
        media = (s1 + s2 + s3) / 3;

        return media;
    }
    public static void main(String[] args) {
        DesafioConversao des = new DesafioConversao();
        des.go();
        
    }
}
