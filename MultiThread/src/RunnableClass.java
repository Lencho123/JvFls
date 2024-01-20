public class RunnableClass implements Runnable {
    private int threadNumber;
    public RunnableClass(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i =1; i<5; i++){
            System.out.println(i + "from RunnablethreadInterfece: " + threadNumber);
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
