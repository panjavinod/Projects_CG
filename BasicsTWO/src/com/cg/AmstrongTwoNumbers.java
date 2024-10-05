package com.cg;

import java.util.Scanner;

public class AmstrongTwoNumbers {
	public static boolean Amstrong(int num) {
		int digits = 0;
        int result = 0;
        int originalNumber = num;
        // number of digits calculation
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }
        originalNumber = num;

        // result contains sum of nth power of its digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        if (result == num)
            return true;
        
        return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int a=sc.nextInt();
		System.out.println("Enter the ending range");
		int b=sc.nextInt();
		for(int number = a + 1; number < b; ++number) {

            if (Amstrong(number))
                System.out.print(number + " ");
        }
	}

}
