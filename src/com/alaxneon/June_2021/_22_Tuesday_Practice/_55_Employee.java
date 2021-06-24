package com.alaxneon.June_2021._22_Tuesday_Practice;

public class _55_Employee {
    int id, age;
    String name, country;

    public _55_Employee(int id){
        this.id = id;
    }
    public _55_Employee(int id, int age){
        this(id);
        this.age = age;
    }
    public _55_Employee(int id, int age, String name, String country){
        this(id, age);
        this.name = name;
        this.country = country;
    }

    public static void main(String[] args) {

        _55_Employee emp1 = new _55_Employee(1, 16, "Alax Neon", "France");
        _55_Employee emp2 = new _55_Employee(2, 15, "Miguel", "America");

        System.out.println("Employee List:");
        System.out.println();
        System.out.println("Employee ID: " + emp1.id);
        System.out.println("Name: " + emp1.name);
        System.out.println("Age: " + emp1.age);
        System.out.println("Country: " + emp1.country);

        System.out.println();
        System.out.println("Employee ID: " + emp2.id);
        System.out.println("Name: " + emp2.name);
        System.out.println("Age: " + emp2.age);
        System.out.println("Country: " + emp2.country);
    }
}