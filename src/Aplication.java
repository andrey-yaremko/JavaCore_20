public class Aplication {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myThread1 = new Thread(new RunnableThread());
        myThread1.start();
        myThread.start();

    }
}
