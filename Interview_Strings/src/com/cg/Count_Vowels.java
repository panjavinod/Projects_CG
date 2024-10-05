package com.cg;

public class Count_Vowels {

	public static void main(String[] args) {

        String str="mynameisjavadeveloper";
        char ch[] = str.toCharArray();
        int count;
        for(int i=0;i<ch.length;i++) {
        	count = 1;
        		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
        		
        		for(int j=i+1;j<ch.length;j++) {
        			if (ch[i] == ch[j] ) {
    					count++;
    					ch[j] = '0';
    				}
        		}
        		if (count > 0 && ch[i] != '0') {
    				System.out.println(ch[i] + "=" + count);
    			}
        	}
        }

	}

}
