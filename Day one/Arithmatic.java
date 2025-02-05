/*Write a Java program to define a class Arithmetic with two member variable and following methods. 
#1 add() to do sum of to numbers and 
#2 sub() to do subtraction of two numbers
#3 mult() to multiply 2 numbers and 
#4 div() two divide  two numbers.
and print the result
get() method to initialize two variable, create two objects of Arithmetic class and perform all operations*/

class Arithmatic{
  int x,y;
void get(int a, int b){
x=a;
y=b;
}
void add(){
 System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
}

void sub(){
System.out.println("The difference of "+x+" and "+y+" is "+(x-y));

}

void mult(){
System.out.println("The multiplication of "+x+" and "+y+" is "+(x*y));

}

void div(){
System.out.println("The division of "+x+" and "+y+" is "+(x/y));

}

public static void main(String args[]){
Arithmatic obj1=new Arithmatic();
Arithmatic obj2=new Arithmatic();
obj1.get(10,6);
obj1.add();
obj1.sub();
obj1.mult();
obj1.div();
obj2.get (21,11);
obj2.add();
obj2.sub();
obj2.mult();
obj2.div();

}
}