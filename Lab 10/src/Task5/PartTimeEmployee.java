package Task5;

public class PartTimeEmployee extends Employee implements TaxPayer{
    @Override
    public double calculateSalary() {
        return 50;
    }
    public void payTax(){
        System.out.println("5% tax payed");
    }
    public PartTimeEmployee(String name,int age){
        super(name, age);
    }
}
