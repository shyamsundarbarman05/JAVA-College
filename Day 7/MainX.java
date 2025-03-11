// ass7 ps 1
class Firstthread extends Thread {
    String m;

    Firstthread(String m) {
        this.m = m;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(m + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
              
            }
        }
    }
}

class Secondthread extends Thread {
    String s;

    Secondthread(String s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(s + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
              
            }
        }
    }
}

public class MainX {

    public static void main(String[] args) {
        Firstthread ob = new Firstthread("First Thread");
        Secondthread ob1 = new Secondthread("Second Thread");
        ob.start();
        ob1.start();
    }
}