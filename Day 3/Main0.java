// Write a Java program to define a class Fruit with member variable name and member method getname(), showname(). Define a child class orange of fruit class with member method getdata() and display(). Create object of the Orange Class and display the record. 
 class Fruit {
    String name;
    void getname(String x){
        name=x;
    }
    void showname(){
        System.out.println("Name: "+name);
    }
}
class Orange extends Fruit{
    String season;
    double price;
    void getdata(String s ,double p){
        season=s;
        price=p;
    }
    void display(){
        System.out.println("Season: "+season);
        System.out.println("Price: "+price);
}
}
public class Main0{
    public static void main(String args[]){
        Orange ob=new Orange();
        ob.getname("Kamala");
        ob.getdata("winter",50);
        ob.showname();
        ob.display();

    }
}
