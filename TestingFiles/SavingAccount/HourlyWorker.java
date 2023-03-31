package SavingAccount;

class HourlyWorker extends Worker {
    public HourlyWorker(String name, double payRate) {
        super(name, payRate);
    }

    @Override
    public double computePay(int hours) {
        double pay;
        if (hours <= 40) {
            pay = hours * getPayRate();
        } else {
            pay = 40 * getPayRate() + (hours - 40) * getPayRate() * 1.5;
        }
        return pay;
    }
}
