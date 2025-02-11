// Define a java class Area witih member variable radious area and side ,Define calarea() 
// method to calculate area of circle and square ,Define show() method to display area of.
// Take input from user in main method and pass through calarea() method.

import java.util.Scanner;
class Area {
    int side;
    float radious ,area;
    void calarea(float radious){
        area=(3.14f*radious*radious);
    }
    void calarea(int side){
        area=side*side;
    }
    void show(String s){
        System.out.println("The area of "+s+" is "+area);
    }
    public static void main(String[] args) {
        int b;
        float a;
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of circle: ");
        a = sc.nextFloat();
        obj.calarea(a);
        obj.show("Circle");
        System.out.println("Enter the side of square: ");
        b = sc.nextInt();
        obj.calarea(b);
        obj.show("Square");
    }
}

