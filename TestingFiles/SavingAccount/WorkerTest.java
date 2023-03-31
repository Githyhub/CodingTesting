package SavingAccount;

public class WorkerTest {

    public static String computePay(Worker w, int hours) {
        double pay = w.computePay(hours);
        return String.format("%s: $%.2f", w.getName(), pay);
    }

    public static void main(String[] args) {
        
        
            SalariedWorker sally = new SalariedWorker("Sally", 45.0);
            HourlyWorker harry = new HourlyWorker("Harry", 35.0);

        System.out.println("The salaried worker works at a $" + sally.getPayRate() + " dollar rate");
        System.out.println("The hourly worker works at a $" + harry.getPayRate() + " dollar rate");

            int hours = 30;
        System.out.println("Pay for " + hours + " hours:");
        System.out.println(" " + computePay(sally, hours));
        System.out.println(" " + computePay(harry, hours));

                     hours = 50;
        System.out.println("Pay for " + hours + " hours:");
        System.out.println(" " + computePay(sally, hours));
        System.out.println(" " + computePay(harry, hours));
    }
}