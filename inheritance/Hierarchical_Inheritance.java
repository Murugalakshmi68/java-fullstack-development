package inheritance;
class Hospital {
    Hospital() {
        System.out.println("It is a Hospital");
    }
}
class Doctor extends Hospital {
    Doctor() {
        System.out.println("Doctors Here");
    }
}
class Patient extends Hospital {
    Patient() {
        System.out.println("Patient Here");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Hospital obj1 = new Doctor();
        Hospital obj2 = new Patient();
    }
}
