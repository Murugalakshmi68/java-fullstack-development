package inheritance;
//Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
// Subclass
class Bike extends Vehicle {
    Bike() {
        System.out.println("This Vehicle is Bike");
    }
}

public class SingleInhrit {
    public static void main(String[] args){
        Vehicle c = new Bike();
    }
}
