public class MonthlySales {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        double[] sales = {45000, 52000, 38000, 61000, 57000, 49000,
                72000, 68000, 41000, 55000, 63000, 80000};

        double max = sales[0];
        double min = sales[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
                maxIndex = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                minIndex = i;
            }
        }

        System.out.println("Monthly Sales:");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(months[i] + " : " + sales[i]);
        }
        System.out.println("\nHighest Sales : " + max + " in " + months[maxIndex]);
        System.out.println("Lowest Sales  : " + min + " in " + months[minIndex]);
    }
}
