package com.alaxneon.June_2021._24_Thu_Practice;

public class _104_Dogs extends _104_Animals{
    void eat(){
        System.out.println("The dog is eating!!");
    }

    public static void main(String[] args) {
        _104_Animals dog = new _104_Dogs();
        dog.eat();
    }
}
