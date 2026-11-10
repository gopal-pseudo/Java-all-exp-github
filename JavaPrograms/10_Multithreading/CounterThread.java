public class CounterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Counting finished.");
    }

    public static void main(String[] args) {
        CounterThread t = new CounterThread();
        t.start();
    }
}
