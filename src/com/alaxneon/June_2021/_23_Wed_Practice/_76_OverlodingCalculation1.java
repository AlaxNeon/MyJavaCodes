package com.alaxneon.June_2021._23_Wed_Practice;

public class _76_OverlodingCalculation1 {
    void sum(float a, int b){
        System.out.println(a + b);
    }
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        _76_OverlodingCalculation1 obj = new _76_OverlodingCalculation1();
        obj.sum(10, 10);
        obj.sum(10, 10, 10);
    }
}
