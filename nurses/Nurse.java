package nurses;
import staff.Staff;
import java.util.Scanner;

public class Nurse extends Staff {
    int experience;
    Scanner sc = new Scanner(System.in);
    public void read(){
        super.read();
        System.out.println("Enter experience: ");
        experience = sc.nextInt();
    }
    public void display(){
        super.display();
        System.out.println("Experience: " + experience);
    }
}

