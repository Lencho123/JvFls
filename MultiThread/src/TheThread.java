// CREATING THREAD BY EXTENDING Runnable Class:

public class TheThread extends Thread{
    private int threadNumber;
    public TheThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i =1; i<5; i++){
            System.out.println(i + "from threadClass: " + threadNumber);
            if (threadNumber==3){
                throw new RuntimeException();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
        }
    }
}
