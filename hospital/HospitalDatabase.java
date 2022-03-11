package hospital;
import patients.Patient;
import doctors.Doctor;
import nurses.Nurse;

public class HospitalDatabase {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Doctor d1 = new Doctor();
        Nurse n1 = new Nurse();

        p1.read();
        p1.display();

        d1.read();
        d1.display();

        n1.read();
        n1.display();
    }
}
