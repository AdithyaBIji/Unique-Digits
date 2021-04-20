package com.example.java;
import java.util.Scanner;

public class UniqueDigits {

       private static int countDigits(long num) {

        int arr[] = new int[10];
        int remainder = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = 0;
        }
        
        
        while(num > 0) {
           
            remainder = (int)(num % 10);
            arr[remainder] = 1;
            num /= 10;
        }


        for(int i: arr) {

            if (i == 1)
                count++;

        }
        return count;
    }


    public static void main(String[] args) {

        long num = 0;
        int digits = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer number:: ");
        num = scan.nextLong();
        digits = countDigits(num);
        
        System.out.println("Unique digits = "+ digits);

        scan.close();
    }

}
