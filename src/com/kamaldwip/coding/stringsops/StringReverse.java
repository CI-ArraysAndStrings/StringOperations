package com.kamaldwip.coding.stringsops;

import java.util.Scanner;

public class StringReverse {

     static void doReverse(String input){
        if(input!=null && !(input.isEmpty())) {
             char[] inputArr = input.toCharArray();
             int left = 0;
             int right = inputArr.length - 1;
             char temp;
             while (left < right) {
                 temp = inputArr[left];
                 inputArr[left] = inputArr[right];
                 inputArr[right] = temp;
                 left++;
                 right--;
             }
             for (char c : inputArr) {
                 System.out.print(c);
             }
             System.out.println();
         } else {
            System.out.println("Input Not Allowed.");
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input String");
        String input = scan.next();
        System.out.println("Reverse String is :");
        StringReverse.doReverse(input);
    }
}
