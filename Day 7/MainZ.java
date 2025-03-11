//ass 7 ps 3
import java.util.*;

class Add extends Thread {
    int a, b;
    Add(int x, int y) { a = x; b = y; }
    public void run() { System.out.println("Addition: " + (a + b)); }
}

class Sub extends Thread {
    int a, b;
    Sub(int x, int y) { a = x; b = y; }
    public void run() { System.out.println("Subtraction: " + (a - b)); }
}

class Div extends Thread {
    int a, b;
    Div(int x, int y) { a = x; b = y; }
    public void run() { System.out.println(b != 0 ? "Division: " + ((double) a / b) : "Cannot divide by zero!"); }
}

class Mod extends Thread {
    int a, b;
    Mod(int x, int y) { a = x; b = y; }
    public void run() { System.out.println(b != 0 ? "Modulus: " + (a % b) : "Cannot find modulus with zero!"); }
}

public class MainZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("Enter priorities for Addition, Subtraction, Division, and Modulus (1-10):");
        int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = sc.nextInt(), p4 = sc.nextInt();

        Add ob1 = new Add(a, b);
        Sub ob2 = new Sub(a, b);
        Div ob3 = new Div(a, b);
        Mod ob4 = new Mod(a, b);

        ob1.setPriority(Math.min(Math.max(p1, Thread.MIN_PRIORITY), Thread.MAX_PRIORITY));
        ob2.setPriority(Math.min(Math.max(p2, Thread.MIN_PRIORITY), Thread.MAX_PRIORITY));
        ob3.setPriority(Math.min(Math.max(p3, Thread.MIN_PRIORITY), Thread.MAX_PRIORITY));
        ob4.setPriority(Math.min(Math.max(p4, Thread.MIN_PRIORITY), Thread.MAX_PRIORITY));

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();
    }
}
