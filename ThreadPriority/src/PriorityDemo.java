
public class PriorityDemo extends Thread{
    public void run(){
        System.out.println("Current theread Name is: " + Thread.currentThread().getName());
        System.out.println("Priority of the Current theread is: " + Thread.currentThread().getPriority());
    }
    

}
