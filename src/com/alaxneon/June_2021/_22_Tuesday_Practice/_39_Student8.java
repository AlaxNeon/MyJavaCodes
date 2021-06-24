package com.alaxneon.June_2021._22_Tuesday_Practice;

public class _39_Student8 {
    int roleNo;
    String studentName;
    int standard;
    int noOfSubjects;
    String firstLanguage;
    String secondLanguage;
    String thirdLanguage;
    static String collegeName = "NIOS";

    public _39_Student8(int rn, int st ,int sub ,String fl ,String sl ,String tl ,String sn){
        roleNo = rn;
        standard = st;
        noOfSubjects = sub;
        firstLanguage = fl;
        secondLanguage = sl;
        thirdLanguage = tl;
        studentName = sn;
    }

    void display(){
        System.out.println("Role No.: " + roleNo);
        System.out.println("Student Name: " + studentName);
        System.out.println("Standard: " + standard + "th");
        System.out.println("No. of Subjects: " + noOfSubjects);
        System.out.println("1st Language: " + firstLanguage);
        System.out.println("2nd Language: " + secondLanguage);
        System.out.println("3rd Language: " + thirdLanguage);
        System.out.println();
    }

    public static void main(String[] args) {
        _39_Student8 s1 = new _39_Student8(1, 12, 5, "English", "French", "Spanish", "Alax Neon");
        _39_Student8 s2 = new _39_Student8(2, 12, 5, "English", "Spanish", "French", "Miguel");
        _39_Student8 s3 = new _39_Student8(3, 11, 5, "English", "French", "Spanish", "Aryan Ray");
        _39_Student8 s4 = new _39_Student8(4, 11, 5, "English", "None", "None", "Somnath Gorai");
        _39_Student8 s5 = new _39_Student8(5, 4, 8, "English", "Hindi", "Kannada", "Nandini Gorai");


        System.out.println();
        System.out.println("Students List:");
        System.out.println();
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
