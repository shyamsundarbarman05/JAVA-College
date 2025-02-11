
//ass 3 q9
class Student {
    String name,reg,roll;
   
    Student(String sname,String re,String ro){
      name = sname;
        reg = re;
        roll = ro;
    }
}
class UgStudent extends Student{
    String course;
    int duration;
    UgStudent(String sname,String re,String ro,String c,int d){
        super(sname,re,ro);
        course = c;
        duration = d;
    }
    void display(){
System.out.println("Name: "+name+"\nReg: "+reg+"\nRoll: "+roll+"\nCourse: "+course+"\nDuration: "+duration+" years\n");

    }
} 
class PgStudent extends Student{
    String course;
    int duration;
    PgStudent(String sname,String re,String ro,String c,int d){
        super(sname,re,ro);
        course = c;
        duration = d;
    }
    void display(){
System.out.println("Name: "+name+"\nReg: "+reg+"\nRoll: "+roll+"\nCourse: "+course+"\nDuration: "+duration+" years");
    }
}
public class Main3 {
    public static void main(String[] args) {
        UgStudent ug = new UgStudent("Shyam","UG1234","35","B.Tech CSE",4);
        PgStudent pg = new PgStudent("Shyam","PG1234","35","M.Tech CSE",2);
        ug.display();
        pg.display();
    }
}
