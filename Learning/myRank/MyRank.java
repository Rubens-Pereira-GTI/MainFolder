package myRank;

import java.awt.ActiveEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

//esse codigo terá uma breve logica de um sitema de rankings via pontos
// Seus atributos: armazenará pontos, nomes e ID
//Funções: adicionar pontos, tirar pontos

public class MyRank {
    ArrayList<Driver> listaDrivers;
    JTextArea textArea;
    
    private boolean moneySystem=true; 
    private static String simbolo=""; 
    private static int startMoney=1000;


    public int getStartMoney(){
        return startMoney;
    }
    public void setStartMoney(int startMoney){
        MyRank.startMoney = startMoney;
    }

    public ArrayList<Driver> getListaDrivers(){
        return listaDrivers;
    }
    
    //usuário escolhe se quer o sistema de dinheiro 
    public void setMoneySystem(String resp){
        
        if (resp.equals("sim") ){
            moneySystem=true;        
            
        }else{
            moneySystem=false;
        }

    }

    // usuario escolhe o simbolo do dinheiro
    public void setMoneySymbol(String s){       
        simbolo= s;

    }
    
    public void configMoneySystem(Scanner scanner){
        System.out.println("Deseja utilizar o sistema de moedas?");
        setMoneySystem(scanner.nextLine());
        
        if(moneySystem){
            System.out.println("Informe o simbolo da moeda");
            simbolo = scanner.nextLine();
        }

        System.out.println("valor inicial para cada player");
        startMoney = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Valores informados:");
        System.out.println("Valor inicial: "+ startMoney);
        System.out.println("Simbolo informado: "+ simbolo);

    }

    public void ranking(Driver driver){
        listaDrivers = new ArrayList<Driver>();
        listaDrivers.add(driver);        
    }

    

    public void go(){
        String nome = "Rubens";
        int id = 9899;
        Scanner scanner = new Scanner(System.in);
        configMoneySystem(scanner);
        
    }
    
    public static void main(String[] args) {        
        MyRank myRank = new MyRank(); 
        myRank.gui();
        //myRank.go();
     
        
    }

    // a ideia vai ser simular uma conexão, aperto o botão e simulo que um usuário se conectou. 
    // quando isso acontecer será gerado um nome aleatorio um id aleatorio e o usuário entrara na lista de ranking
    
    public void gui(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("novo usuário");
        JButton buttonLista = new JButton("imprimir Nomes"); 
        textArea = new JTextArea(10,9);        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.add(scrollPane);
        panel.add(button);
        panel.add(buttonLista);
        button.addActionListener(new EscutaDoBotao());
        buttonLista.addActionListener(null);


        frame. setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class EscutaDoBotao implements ActionListener{
       
        public void actionPerformed(ActionEvent event){
            String[] nomes = {
                "Ana", "Bruno", "Carla", "Daniel", "Eduarda",
                "Felipe", "Gabriela", "Henrique", "Isabela", "João",
                "Karen", "Lucas", "Mariana", "Nicolas", "Olivia",
                "Pedro", "Quênia", "Rafael", "Sofia", "Tiago"
            };

            int valMin = 70000;
            int valMax = 80000;
            int i =(int) (Math.random() * 20); 
            int id =  valMin +( (int) (Math.random() * (valMax - valMin)) );

            Driver driver = new Driver(nomes[i], MyRank.startMoney, id);
            
            ranking(driver);
        }               
    }
    public class BotaoLista implements ActionListener{
        public void actionPerformed(ActionEvent event){
           

           // parei aqui preciso agora fazer com que a lista de pessas seja impressa no text area
            
            

        }
    }

   
   
}
