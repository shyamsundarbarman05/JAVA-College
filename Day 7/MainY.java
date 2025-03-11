//ass7 ps2
class AP implements Runnable {
    int n;
    Thread t;

    AP(int x) {
        n = x;
        t = new Thread(this);
    }
    public void run (){
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
            System.out.println(s+"Ap");
            try{
                t.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
        }
    }
}

}
class GP implements Runnable {
    int m;
    Thread th;

    GP(int x) {
        m = x;
        th = new Thread(this);
    }
    public void run (){
        int k=0;
        for(int i=1;i<=m;i++){
            k+=i;
            System.out.println(k+"Gp");
            try{
                th.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
        }
        }
    }

}
public class MainY{
    public static void main(String[] args) {
        AP ob = new AP(10);
        GP ob1 = new GP(10);
        ob.t.start();
        ob1.th.start();
    }
}