package com.alaxneon.June_2021._22_Tuesday_Practice;

public class _34_Student6 {
    int id;
    String name;

    public _34_Student6(int i, String n){
        id = i;
        name = n;
    }

    public _34_Student6(_34_Student6 s){
        id = s.id;
        name = s.name;
    }

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main (String args[]){
        _34_Student6 s1 = new _34_Student6(1, "Alax Neon");
        _34_Student6 s2 = new _34_Student6(2, "Miguel");
        _34_Student6 s3 = new _34_Student6(s1);

        s1.display();
        s2.display();
        s3.display();
    }
}
