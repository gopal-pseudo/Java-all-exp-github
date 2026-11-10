class OrderPlacement extends Thread {
    public void run() {
        String[] steps = {"Order received", "Payment confirmed", "Restaurant accepted the order", "Food is being prepared"};
        for (String step : steps) {
            System.out.println("[Order Placement] " + step);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OrderDelivery extends Thread {
    public void run() {
        String[] steps = {"Delivery partner assigned", "Food picked up", "Out for delivery", "Order delivered"};
        for (String step : steps) {
            System.out.println("[Order Delivery] " + step);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) throws InterruptedException {
        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();
        placement.start();
        placement.join();
        delivery.start();
        delivery.join();
        System.out.println("Order completed successfully!");
    }
}
