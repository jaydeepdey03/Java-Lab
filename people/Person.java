package people;
import java.util.Scanner;

public class Person {
    String name; int age;
    Scanner sc = new Scanner(System.in);
    public void read(){
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


