
// Define base class animal with type as member variable that implies domestic or wild animal. Initialize the variable with get() method, define a derive class cat, which has two member variable with set() method. Define show() method in cat class. And show the attributes of a cat. Define a main class and create two objects of the cat class. 
class Animal{
    String type;
    void get(String ty){
        type =ty;
    }


}
class Cat extends Animal{
    String breed,colour;
    void set(String bre,String col){
        breed=bre;
        colour=col;
    }
    void show(){
        System.out.println("Type: "+type);
        System.out.println("Breed: "+breed);
        System.out.println("colour: "+colour);
    }
}



public class Main03{
    public static void main(String[] args) {
        Cat ob1=new Cat();
 Cat ob2=new Cat();
 ob1.get("Domestic"); 
 ob1.set("American Curl","Brown");
 ob1.show();
 ob2.get("Domestic");
 ob2.set("Calico","Orange");
 ob2.show();
 
 
    }
 
}

