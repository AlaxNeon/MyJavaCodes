package com.alaxneon.Exercise;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1_User_Input {

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("Your were born in " + year);

        if (age >= 18) {
            System.out.println("and you are an adult. ;)");
        } else if (age >= 13){
            System.out.println("and you are a teenager. ;)");
        } else {
            System.out.println("and you are a child. :(");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite colour?");
        String colour = input.nextLine();
        System.out.println("So, your favorite colour is " + colour);

        System.out.println("Let me check your IQ");

        System.out.println("What is 2 + 2 - 2 + 2 * 4 ?");
        int answer1 = input.nextInt();
        System.out.println("Your answer: " + answer1);

        if (answer1 == 10){
            System.out.println("You are right!!.");
        }else {
            System.out.println("You are wrong :(");
            System.out.println("Better Luck Next time...");
        }


        Scanner input1 = new Scanner(System.in);
        System.out.println("Wanna try another one?");
        System.out.println("yes or no ?");
        String yesOrNo = input1.nextLine();

        if (yesOrNo.equals("yes")){
            System.out.println(" What is [(2 + 2) - (2 + 2)] * (4 * 4)?");
            int answer2 = input1.nextInt();
            System.out.println("Your answer: " + answer2);

            if (answer1 != 10 & answer2 == 0){
                System.out.println("You are right!!.");
            }else if(answer1 == 10 & answer2 == 0){
                System.out.println("You are right again!!.");
                System.out.println("Very Good!! ;)");
            }else if(answer1 == 10 & answer2 != 0){
                System.out.println("You are wrong :(");
                System.out.println("Don't worry");
                System.out.println("You will have to practice");
                System.out.println("Practice makes a person better!!");
            }else {
                System.out.println("You are wrong again :(");
                System.out.println("Don't worry");
                System.out.println("You will have to practice");
                System.out.println("Practice makes a person better!!");
            }

        }
        System.out.println("Thank You!!");
        System.out.println("Nice to meet you " + userName + " ;)");
    }
}
