package rifa;

import java.util.*;

class EmployeeT {
    int empid;
    String name, address;
    float salary;

    EmployeeT() {}

    EmployeeT(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT {
    String department, subject;

    Teacher(int empid, String name, float salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Teacher id: " + empid);
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher salary: " + salary);
        System.out.println("Teacher address: " + address);
        System.out.println("Teacher department: " + department);
        System.out.println("Teacher subject: " + subject);
    }
}

public class TeacherArrObjects {
    public static void main(String[] args) {
        int n, id;
        String name, address, department, subject;
        float salary;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        n = s.nextInt();
        s.nextLine(); // consume leftover newline

        Teacher teacher[] = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter teacher " + (i + 1) + " details:");

            System.out.print("ID: ");
            id = s.nextInt();
            s.nextLine(); // consume newline

            System.out.print("Name: ");
            name = s.nextLine();

            System.out.print("Salary: ");
            salary = s.nextFloat();
            s.nextLine(); // consume newline

            System.out.print("Address: ");
            address = s.nextLine();

            System.out.print("Department: ");
            department = s.nextLine();

            System.out.print("Subject: ");
            subject = s.nextLine();

            teacher[i] = new Teacher(id, name, salary, address, department, subject);
        }

        System.out.println("\nTeachers are:");
        for (Teacher x : teacher) {
            x.display();
            System.out.println();
        }
    }
}



