package com.cg;

public class HYD {

	    public static void main(String[] args) {
	        long s = 125;
	        long result = getKCount(s);
	        System.out.println(result);
	    }

	    static long getKCount(long s) {
	        long count = 0;

	        for (long k = 1; k <= s; k++) {
	            long sum = k;
	            for (long i = k + 1; sum < s; i++) {
	                sum += i;
	            }
	          
	            if (sum == s) {
	                count++;
	            }
	        }
	        return count;
	    }
	}
