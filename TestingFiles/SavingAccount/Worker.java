package SavingAccount;

public abstract class Worker {
    private Double wage;
    private String name;


    public void HourlyWorker(int hours){
        wage = 45.00;
        if (hours>40){
            wage= 1.5 * wage;
        }
    }
    public void SalariedWorker(){
        wage = 35.00;
    }
    double computePay(int hours){
       return hours*wage;
    }
    String computePay(Worker w,int hours){
        return w +":"+ (hours*wage);
    }
}
