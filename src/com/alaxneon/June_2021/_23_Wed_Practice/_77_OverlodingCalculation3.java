package com.alaxneon.June_2021._23_Wed_Practice;

public class _77_OverlodingCalculation3 {
    void sum(int a, long b){
        System.out.println("a methode is invoked");
    }
    void sum(long a, int b){
        System.out.println("b methode is invoked");
    }

    public static void main(String[] args) {
        _77_OverlodingCalculation3 obj = new _77_OverlodingCalculation3();
//        obj.sum(10, 10);
//        obj.sum(10, 10);
        //ambiguous methode call
    }
}
