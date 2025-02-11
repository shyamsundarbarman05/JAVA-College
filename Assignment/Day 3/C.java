// Write a Java program with multiple classes A,B and C respectively. That classes have a single member variable. Class A and Class B have method to initialize the member variable. Class C has the method for addition of two variable of Class A and B, respectively. And a show() method to display the sum. Define the main method in Class C. 
 class A{
int x;
void getx(){
x=5;
}
}
class B{
    int y;
  void gety( ){
y=20;
  }
}
 public  class C{
    int s;
    void add(A a,B b){
s=a.x+b.y;

    }
    void show(){
        System.out.println("sum is: "+s);
    }
    public static void main(String[] args) {
        C c=new C();
        A ob =new A();
        ob.getx();
        B ob1=new B();
        ob1.gety();
        c.add(ob,ob1);
        c.show();
    }

    

}
