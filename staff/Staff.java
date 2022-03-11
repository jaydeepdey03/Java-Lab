package staff;

import people.Person;
import java.util.Scanner;

public class Staff extends Person {
    int ID;
    Scanner sc = new Scanner(System.in);
    public void read() {
        System.out.println("Enter ID: ");
        ID = sc.nextInt();
        super.read();
    }

    public void display() {
        System.out.println("ID: " + ID);
        super.display();
    }
}
