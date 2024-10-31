import java.util.concurrent.*;
public class Contador4 extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <= 6; i++) {
            System.out.println("T2: " + i);
            try{
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
