public class ThreadTwo implements Runnable {
    Accum a = Accum.getAccum();
    
    public void run(){    
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        
        System.out.println("teste");        

        for(int x=0; x<98; x++){
            a.updateCounter(1);
         
        }  
        System.out.println("two "+a.getCounter());   
    }
}
