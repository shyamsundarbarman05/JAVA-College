// Define a class box with member variable length, breadth and height, defined constructor to create object of cube and cuboid. Define method to calculate volume of both cube and cuboid. Define display() method to show the volume of cube  and cuboid. In main() method Create object of Box class, where one object cube type and another is cuboid. Find volume of both.

 class Box {
    int length, breadth, height;
    Box (int side) {
        length = breadth = height = side;
    }
    Box (int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    int  calvol(){
        return (length * breadth * height);
    }
    void display(String s){
        System.out.println("The volume of "+s+" is: "+calvol());
    }
    public static void main(String[] args) {
        Box obj1 = new Box(5, 6, 7);
        Box obj2 = new Box(5);
        obj1.display("Cuboid");
        obj2.display("Cube");
    }
}

