package fundamentos;

import javax.swing.JOptionPane;

public class ConversorString {
    // programa vai capturar através de uma janela grafica de input dois valores em String 
    // em seguinda vamos converter os valores que estão em sting para tipos double

    public static void main(String[] args) {
        
        String val1 = JOptionPane.showInputDialog("Digite um numero");
        String val2 = JOptionPane.showInputDialog("Digite o segundo numero");

        double num1= Double.parseDouble(val1);
        double num2= Double.parseDouble(val2);

        System.out.println("Os valores digitados foram respectiavamente:" +val1+ ", " +val2 );
        System.out.println(num1+num2);
        //JOptionPane.showMessageDialog(null, num1+num2, val2, 1, null);
        JOptionPane.showMessageDialog(null, val1, "resultado da soma", 2);

    }

}
