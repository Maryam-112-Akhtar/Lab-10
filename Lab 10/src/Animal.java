public abstract class  Animal{
    abstract void makeSound();

    void eat(){
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {
    void makeSound() {
        System.out.println("baooo baooo");
    }
}
class Cat extends Animal {
    void makeSound(){
        System.out.println("meow meow");
    }

}

class main8{
public static void main(String[] args) {
 Cat c = new Cat();
    c.makeSound();
    c.eat();

 Dog d = new Dog();
 d.makeSound();
 d.eat();
} }