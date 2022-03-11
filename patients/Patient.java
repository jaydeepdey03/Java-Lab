package patients;
import java.util.Scanner;

import people.Person;

public class Patient extends Person {
        int regNo;
        Scanner sc = new Scanner(System.in);
        public void read(){
            System.out.println("Enter regNo: ");
            regNo = sc.nextInt();
            super.read();
        }
        public void display(){
            System.out.println("RegNo: " + regNo);
            super.display();
        }
}

