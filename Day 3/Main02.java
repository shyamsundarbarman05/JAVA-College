
// Define three classes named add Sub and div with two member variables in each. And get() method to initialize the variable and add() sub() div() method in the respective classes. All the classes have show() method to display the result of addition, subtraction, division, respectively, define main class that have main method. In main method, create object of three classes and perform arithmetic operations. The variables are initialized with 12 & 6 respectively.


class Add{
int a,b;
int res;
void get( ){
  a=12;
  b=6;
}
void add()
{
res=a+b;
}
void show(){
System.out.println("Result of additon: "+res);
}
}




class Sub{
    int a,b;
    int res;
    void get(){
        a=12;
        b=6;}
    void sub()
{
res=a-b;
}
void show(){
    System.out.println("Result of subtraction: "+res);
}
}


class Div{
    int a,b;
    int res;
    void get(){
        a=12;
        b=6;}
    void div()
    {
    res=a/b;
    }
    void show(){
        System.out.println("Result of division: "+res);
        
    }
}


public class Main02 {
    public static void main(String args[]){
        Add ob=new Add();
        Sub ob1=new Sub();
        Div ob2=new Div();
        ob.get();
        ob.add();
        ob.show();
        ob1.get();
        ob1.sub();
        ob1.show();
        ob2.get();
        ob2.div();
        ob2.show();
    }
}