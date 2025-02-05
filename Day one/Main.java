//ass3 q6

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
