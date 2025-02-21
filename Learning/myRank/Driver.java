package myRank;

// informa name, money e id
public class Driver {
    private String name;
    private int money;
    private int idSteam;
    MyRank serverConfigs = new MyRank();

    public Driver(String name, int money, int idSteam){
        this.name = name; 
        this.money= money; 
        this.idSteam= idSteam;
    }
    
    public String getname(){
        return name;
    }
    public void setName(String n){
        name=n; 
    }   
    public int getMoney(boolean b){      
        return money;
    }
    public void setMoney(int p){
        money= p;
    }
    public int getId(){
        return idSteam;
    }

     // escolha da quantidade inicial atribuida a cada jogador
    
    

}
