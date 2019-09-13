package com.kamaldwip.coding.stringsops;

import java.util.Scanner;

public class Palindrome {

    static boolean checkPalindrome(String input){

        if(input != null && !(input.isEmpty())) {
            char[] inputArr = input.toCharArray();
            int left = 0;
            int right = inputArr.length - 1;
            while (left < right){
                if(inputArr[left] != inputArr[right]){
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;

    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input String");
        String input = scanner.next();
        System.out.println("Is "+input+" a palindrome : "+Palindrome.checkPalindrome(input));

    }


}
