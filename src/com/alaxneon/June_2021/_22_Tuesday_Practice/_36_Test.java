package com.alaxneon.June_2021._22_Tuesday_Practice;

public class _36_Test {
    _36_Test(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
    }

    _36_Test(int a, float b){
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String args[]){
        byte a = 30;
        byte b = 10;
        _36_Test test = new _36_Test(a, b);
    }
}
