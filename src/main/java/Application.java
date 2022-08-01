public class Application extends Thread{
    public static void main(String[] args) throws InterruptedException {

        PrintHello printHello = new PrintHello();
        Thread thread = new Thread(printHello);
        //thread.join();

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

    }
}
