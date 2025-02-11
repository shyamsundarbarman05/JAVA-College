//ass 3 q8

class Transport{
    int transportid;
    String name;
    Transport(int tr, String n){
        transportid = tr;
        name = n;
    }
}
class RoadTransport extends Transport{
String vehicle;
    RoadTransport(int tr, String n, String w){
        super(tr, n);
       vehicle = w;
    }
    void display(){
        System.out.println("Transport ID: "+transportid+"\nName: "+name+"\nVehicle: "+vehicle);
      System.out.println();
    }
}
class Watertransport extends Transport{
    String boat;
    Watertransport(int tr, String n, String b){
        super(tr, n);
        boat = b;
    }
    void display(){
        System.out.println("Transport ID: "+transportid+"\nName: "+name+"\nBoat: "+boat);
        System.out.println();
    }
}
class AirTransport extends Transport{
    String plane;
    AirTransport(int tr, String n, String p){
        super(tr, n);
        plane = p;
    }
    void display(){
        System.out.println("Transport ID: "+transportid+"\nName: "+name+"\nPlane: "+plane);
        System.out.println();
    }
}



public class Main2 {
    public static void main(String[] args) {
        RoadTransport r = new RoadTransport(101, "Road Transport", "Car");
        Watertransport w = new Watertransport(102, "Water Transport", "Boat");
        AirTransport a = new AirTransport(103, "Air Transport", "Plane");
        r.display();
        w.display();
        a.display();
    }
}
