//Define class animal with a single variable type and a parameterized constructor to initialize the variable, define a class dog, which is a child class of animal with two variable breed and name. Write a parameterized constructor in the dog class to initialize the object, define display() method to show the record, create to object of dog class and show the record.

class Animal{
    String type;
    Animal(String t){
        type = t;
    }
}
class Dog extends Animal{
    String name,breed;
    Dog(String x,String y,String z){
        super(x);
        name = z;
        breed = y;
    }
    void display(){
        System.out.println("Type: "+type+"\nName: "+name+"\nBreed: "+breed);
      
    }
}


public class Main {
public static void main(String[] args) {
    Dog d = new Dog("Domestic","Pitbull","Tommy");
    Dog d1 = new Dog("Domestic","Labrador","Samu");
    d.display();
    d1.display();
}

    
}
