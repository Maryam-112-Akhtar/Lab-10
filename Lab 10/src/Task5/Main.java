package Task5;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee("Maryam", 21);
        PartTimeEmployee e2 = new PartTimeEmployee("Bisma", 19);
        System.out.println(e1.name + " full time employee monthly salary: " + e1.calculateSalary());
        System.out.println(e2.name + " part time employee monthly salary: " + e2.calculateSalary());

        e1.payTax();
        e2.payTax();

    }
}
