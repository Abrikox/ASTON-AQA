package org.example.employee;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

//    public void printInfo() {
//        System.out.println("Employee Information:");
//        System.out.println("Full Name: " + fullName);
//        System.out.println("Position: " + position);
//        System.out.println("Email: " + email);
//        System.out.println("Phone: " + phone);
//        System.out.println("Salary: $" + salary);
//        System.out.println("Age: " + age);
//        System.out.println();
//    }


    @Override
    public String toString() {
        return "Full Name: " + fullName +
                "\nPosition: " + position +
                "\nEmail: " + email +
                "\nPhone: " + phone +
                "\nSalary: $" + salary +
                "\nAge: " + age + "\n";
    }

    public void printArrInfo(Employee[] employeeArr) {
        for (Employee array : employeeArr) {
            System.out.println(array);
        }
    }
}
