// Defining class employee with member variable employee id employee name and salary and Designation. Define a constructor to initialize all the variables.Define display() method to display record of employee. Define compare() method to compare salary of employee and print the name and designation, who is highest paid, create to employee object. And show their  record and find the highest paid employee.

class Employee {
    int empid;
    double salary;
    String empname, designation;

    Employee(int empid, String empname, double salary, String designation) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("Employee details: ");
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Designation: " + designation);
    }

    void compare(Employee e) {
        if (salary > e.salary) {
            System.out.println("Highest salary paid to:Employee 1\nDesignation: cybersecuriety officer");
        } else {
            System.out.println("Highest salary paid to:Employee 2\nDesignation: coder");
        }
    }
    public static void  main(String a[])
{
    Employee e1 =new Employee(1, "Shyamsundar", 60000, "cybersecuriety officer");
    Employee e2 = new Employee(2, "Dheeraj", 50000, "coder");
    e1.display();
    e2.display();
    e1.compare(e2);
}
}