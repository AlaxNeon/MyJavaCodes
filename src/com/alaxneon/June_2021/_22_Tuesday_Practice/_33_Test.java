package com.alaxneon.June_2021._22_Tuesday_Practice;

public class _33_Test {
    int i;
    public _33_Test(int k){
        i = k;
    }
    public _33_Test(int k, int m){
        System.out.println("Hi I am assigning the value max(k, m) to i");
        if(k > m){
            i = k;
        }else {
            i = m;
        }
    }
}
