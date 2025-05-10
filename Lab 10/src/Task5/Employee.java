package Task5;

public  abstract class  Employee {
String name;
int id;

public Employee(String name,int id){
    this.name = name;
    this.id = id;
}

public abstract double calculateSalary();

}
