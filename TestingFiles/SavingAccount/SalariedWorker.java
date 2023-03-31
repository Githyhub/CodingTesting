package SavingAccount;

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double payRate) {
        super(name, payRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * getPayRate();
    }
}
