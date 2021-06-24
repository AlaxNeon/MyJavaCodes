package com.alaxneon.June_2021._23_Wed_Practice;

class _66_Employee extends _66_Person{
    float salary;
    _66_Employee(float salary, String name, String country, int age){
        super(age, name, country);
        this.salary = salary;
    }
}