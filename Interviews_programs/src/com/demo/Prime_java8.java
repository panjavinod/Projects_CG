package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Prime_java8 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(29, 15, 37, 40, 17);

        
        numbers.forEach(number -> {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        });
    }

    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // Prime numbers are greater than 1
        }

       
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);  // Returns true if no divisors are found
    }
	

}
