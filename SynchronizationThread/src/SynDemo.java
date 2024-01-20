public class SynDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter(); 
        Thread t1 = new Thread(new Runnable() {  
            public void run(){
                for (int i=1; i<=1000; i++){
                    c.increment(); 
                }
            } 
        });
 
    
    Thread t2 = new Thread(new Runnable() {  
            public void run(){
                for (int i=1; i<=1000; i++){
                    c.increment(); 
                }
            } 
        });

    t1.start();
    t2.start();
// Since the two threads are already started their exicution and are accessing 
// and incrementing the same resource the count value will be incorrect.
// therefore we have to SYNCHRONIZE the resource inorder not to corrupt data.
    t1.join();// to allow t1 complete before excuting other.
    t2.join();// to allow t2 complete before excuting other. 
    System.out.println("count: "+ c.count);
    }
}
