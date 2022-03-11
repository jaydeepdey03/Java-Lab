package doctors;
import staff.Staff;
import java.util.Scanner;

public class Doctor extends Staff {
    String speciality;
    Scanner sc = new Scanner(System.in);
    public void read(){
        System.out.println("Enter speciality: ");
        speciality = sc.nextLine();
        super.read();
    }
    public void display(){
        System.out.println("Speciality: " + speciality);
        super.display();
    }
}
