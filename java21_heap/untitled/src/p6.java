interface Vehicle {
    void start();
}
class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }
}
//------------------------------
//class Car {
//
//    public void start() {
//        System.out.println("Car Started");
//    }
//}
/// from line 1 to line 9 using interface vehicle and from 11 to 16 normal
/// but when you run this code from 21 to 26 after commenting 1 to 9 and only show 11 to 16 and vise versa
/// the output is same then why we use interface  is from 28 aand onwaards
//--------------------------------------------

public class p6 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start(); //Car Started
    }
}
//Excellent question. This is exactly where most beginners get confused.
//
//You're looking at the output and thinking:
//
//Car Started
//
//vs
//
//Car Started
//
//and asking:
//
//        "If the result is the same, why do we need interfaces?"
//
//Because interfaces are not for changing the output. They're for changing how we design code.
//
//Version 1: No Interface
//class Car {
//    public void start() {
//        System.out.println("Car Started");
//    }
//}
//
//Usage:
//
//Car c = new Car();
//c.start();
//
//This works.
//
//But now suppose you add:
//
//class Bike {
//    public void start() {
//        System.out.println("Bike Started");
//    }
//}
//
//class Truck {
//    public void start() {
//        System.out.println("Truck Started");
//    }
//}
//
//Now you have:
//
//Car c = new Car();
//Bike b = new Bike();
//Truck t = new Truck();
//
//These are all different types."Truck","Bike","Truck"
//
//        Version 2: Using Interface
//interface Vehicle {
//    void start();
//}
//class Car implements Vehicle {
//    public void start() {
//        System.out.println("Car Started");
//    }
//}
//class Bike implements Vehicle {
//    public void start() {
//        System.out.println("Bike Started");
//    }
//}
//class Truck implements Vehicle {
//    public void start() {
//        System.out.println("Truck Started");
//    }
//}
//
//Now all of them are also a Vehicle.
//
//The Real Power
//
//Without interface:
//
//Car c = new Car();
//Bike b = new Bike();
//Truck t = new Truck();
//
//Need separate variables.
//
//        With interface:
//
//Vehicle v;
//
//Now:
//
//v = new Car();
//v.start();
//
//v = new Bike();
//v.start();
//
//v = new Truck();
//v.start();
//
//Same variable works for all.