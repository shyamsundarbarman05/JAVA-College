//Define class student with variable name,department,rollnumber initialize the variable with constructor. Define a method show() to display the record of a student. Create two object of the student class and print their record.
class Student{
int s_rollno;
String s_name,s_department;
Student(String name,String department,int rollno){
s_name=name;
s_department=department;
s_rollno=rollno;
}
void show(){
System.out.println("The student details: ");
System.out.println("Name: "+s_name+" \nDepartment: "+s_department+" \nRoll no: "+s_rollno);
}
public static void main(String args[]){
Student stu1=new Student("Shyamsundar Barman","CSE",35);
Student stu2=new Student("Dheeraj Kumar","CSE",58);
stu1.show();
stu2.show();

}

}