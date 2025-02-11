// Define a class vehicle with one member variable type, initialize the variable with constructor, define a class car with member variable model and price. Initialize the variable with constructor define a method display() to show the record of a car. 


class Vehicle{
    String type;
    Vehicle(){
        type="petrol";
    }
}
class Car extends Vehicle{
    String model;
    double price;
    Car(){
        super();
        model="hundai creta";
        price =15000000;
    }
    void display(){
        System.out.println("Car type: "+type);
        System.out.println("Car model: "+model);
        System.out.println("Car price: "+price);
    }

}


public class Main01 {
    public static void main(String[] args) {
        Car ob=new Car();
        ob.display();
    }
}