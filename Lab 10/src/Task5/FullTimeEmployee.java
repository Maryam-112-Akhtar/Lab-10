package Task5;

public class FullTimeEmployee extends Employee implements TaxPayer {

    @Override
   public double calculateSalary() {
        return 10000;

    }
    public void payTax(){
        System.out.println("10% tax payed");
    }
    public FullTimeEmployee(String name, int age){
        super(name,age);
    }
}
