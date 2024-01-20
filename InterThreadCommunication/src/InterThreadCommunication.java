class Q {
    int num; //by default it is 0;
    boolean valueset = false;

    public synchronized void put(int num)
    { if (num != 0)
        while (valueset) 
        {
            try{wait();} catch(Exception e){}//this method is object of Object method. thus it is available fof every class object.
                                                // then it will wait till it is notified. but after it do its job.
        } 
        System.out.println("Put: "+ num);
        this.num=num;
        valueset = true; //Then after notified it 
        notify();//this method is object of Object method. thus it is available fof every class object.
                // this notify the waiting (Consumer) thread so that it wont wait nomore
    }
    public synchronized void get()
    {
        while (!valueset) 
        {
            try{wait(1000);} catch(Exception e){}//this method is object of Object method. thus it is available fof every class object.
                                                // then it will wait till it is notified. but after it do its job.
        } 
        System.out.println("Get: "+num);
        valueset = false;
        notify();//this method is object of Object method. thus it is available fof every class object.
                // this notify the waiting or just existing thread (eg: Producer) thread so that it wont wait nomore or it start running
    }
}
//////////////Producer class//////////////////
class Producer implements Runnable
{
    Q q;

    public Producer(Q q)
    {
        this.q = q;

        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run()
    {
        int i = 3;
        while (true)
        {
            q.put(i++);
            try {
                Thread.sleep(500);//sleep is static method of thread
            } catch (Exception e) {// TODO: handle exception           }
        }
    }
}
}
//////////////consumer class////////////

class Consumer implements Runnable
{
   Q q;

   public Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
   }

   public void run(){
        while (true){
            q.get();

            try {
                Thread.sleep(1000);//sleep is static method of thread
            } catch (Exception e) { }
   }
}
}
public class InterThreadCommunication {
    public static void main(String[] args) throws Exception {
        Q q = new Q();
       Consumer c = new Consumer(q);
       Producer p = new Producer(q);

    }
}
