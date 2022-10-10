import java.util.Scanner;
class Animal{
    Scanner inp = new Scanner(System.in);
    String name;
    public void get(){
        name = inp.next();
    }
    public void display(){
        System.out.println("The animal is hehe");
    }
}
class Dog extends Animal{
    String name;
    public void get(){
        name = inp.next();
    }
    public void disp(){
        System.out.println("The animal is " + this.name);
    }
    public void display(){
        System.out.println("NUB");
        super.display();
    }
}
class classes{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Animal a1 = new Animal();
        a1.get();
        a1.display();
        Dog d1 = new Dog();
        d1.get();
        d1.disp();
        d1.display();
    }
}