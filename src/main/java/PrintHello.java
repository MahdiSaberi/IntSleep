public class PrintHello extends Thread{
    @Override
    public void run() {

        try {
            while (true) {
                printHello();
                Thread.sleep(100);
                //System.out.println(Thread.currentThread().getName());
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void printHello(){
        System.out.println("Hello");
    }
}
