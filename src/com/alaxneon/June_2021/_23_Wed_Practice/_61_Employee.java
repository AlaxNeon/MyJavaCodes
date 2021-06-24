package com.alaxneon.June_2021._23_Wed_Practice;

public class _61_Employee{
    int id;
    String name, division;
    _61_Addresses addresses;

    public _61_Employee(int id, String name, String division, _61_Addresses addresses){
        this.id = id;
        this.name = name;
        this.division = division;
        this.addresses = addresses;
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Division: "+ division);
        System.out.println("Employee Addresses: " + addresses.city + ", " + addresses.state + ", " + addresses.country);
        System.out.println();
    }

    public static void main(String[] args) {
        _61_Addresses ad1 = new _61_Addresses("Massy", "Paris", "France");
        _61_Addresses ad2 = new _61_Addresses("La Defence", "Paris", "France");
        _61_Addresses ad3 = new _61_Addresses("Bangalore", "Karnataka", "India");

        _61_Employee emp1 = new _61_Employee(1, "Alax Neon", "Robotic Engineer", ad1);
        _61_Employee emp2 = new _61_Employee(2, "Miguel", "Robotic Engineer", ad2);
        _61_Employee emp3 = new _61_Employee(3, "Aryan Ray", "Atomic Engineer", ad2);
        _61_Employee emp4 = new _61_Employee(4, "Somnath Gorai", "Software Engineer", ad3);
        _61_Employee emp5 = new _61_Employee(5, "Nandini Gorai", "Chemical Scientist", ad3);

        System.out.println();
        System.out.println("Employee List:");
        System.out.println();
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
        emp5.display();
    }
}
