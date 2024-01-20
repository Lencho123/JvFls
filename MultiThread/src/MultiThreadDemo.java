public class MultiThreadDemo {


    public static void main(String[] args) throws Exception {
            TheThread myThing = new TheThread(3);
            // whenever you call start method runn method will
            // automatically excuted
            myThing.start();

            TheThread myhing = new TheThread(9);
            // whenever you call start method runn method will
            // automatically excuted
            myhing.start();
            TheThread gg = new TheThread(6);
            // whenever you call start method runn method will
            // automatically excuted
            gg.start();

//////////////////////////////////////////////////////////////////////
            // //  FOR RUNNABLE INTERFECE
// Since u can impliment multiple interfaces at the same time it is more flexible to 
//  to use runnuble interface rather than extending thread class method.
            RunnableClass rn1 = new RunnableClass(11);
            RunnableClass rn2 = new RunnableClass(12);
            RunnableClass rn3 = new RunnableClass(13);
            RunnableClass rn4 = new RunnableClass(14);
            Thread mythread1 = new Thread(rn1);
            mythread1.start();
            Thread mythread2 = new Thread(rn2);
            mythread2.start();
            Thread mythread3 = new Thread(rn3);
            mythread3.start();
            Thread mythread4 = new Thread(rn4);
            mythread4.start();
            
            throw new RuntimeException();
        }
    }
