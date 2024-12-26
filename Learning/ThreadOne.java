

public class ThreadOne implements Runnable {
    Accum a = Accum.getAccum();
    public void run(){
        
        System.out.println("teste t1");       

        for(int x=0; x<99; x++){
            a.updateCounter(1000);
          
        }
        

        System.out.println("one "+a.getCounter());

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
       
    }
    
}

