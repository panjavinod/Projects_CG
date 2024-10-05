package com.cg;

public class Frequency_Of_Charecter {

	public static void main(String[] args) {

		String a = "picture perfect";

		char ch[] = a.toCharArray();
		int count;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] ) {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 0 && ch[i] != '0' && ch[i]!=' ') {
				System.out.println(ch[i] + "=" + count);
			}
		}

	}

}
