package com.alaxneon;


public class Exercise2_Search {

    public static void main(String[] args) {
        //Creating Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters,'A');
        System.out.println(count);
    }
    public static int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        System.out.println("Number of time the letter " + searchLetter + " is appearing is ");
        return (count);
    }
}
