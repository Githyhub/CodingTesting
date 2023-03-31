package SavingAccount;

abstract class Worker {
    private String name;
    private double payRate;

    public Worker(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public double getPayRate() {
        return payRate;
    }

    public abstract double computePay(int hours);
}
