public class ThreadStart extends Thread {

    public static void main(String[] args) {
        ThreadStart threadStart = new ThreadStart();
        threadStart.start();
    }
    @Override
    public void run() {
//        super.run();
        System.out.println("A");

    }
}
