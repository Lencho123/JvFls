public class ThreadPriority {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PriorityDemo p1 = new PriorityDemo();
        PriorityDemo p2 = new PriorityDemo();

        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);

        p1.start();
        p2.start();
    }
}
