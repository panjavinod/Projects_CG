package com.cg;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "javajava";
//
//		char ch[] = a.toCharArray();
//		int count;
//		for (int i = 0; i < ch.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j] && ch[i] != ' ') {
//					count++;
//					ch[j] = '0';
//				}
//			}
//			if (count > 1 && ch[i] != '0') {
//				System.out.println(ch[i] + "=" + count);
//			}
//   }
//		System.out.println("------------------------------------------------------------------");
//		
//		String a = "javajava";
//		char ch[] = a.toCharArray();
//		int count=0;
////		String b="";
//		for (int i = 0; i < ch.length; i++) {
////		     b+=ch[i];
//			    for (int j =0; j < ch.length; j++)
//			     {
//				    if (ch[i] == ch[j] )
//				      {
//					    count++;					   
//				      }				
//			     }
//			  if (count > 1 ) 
//			  {
//				System.out.println(ch[i] + "=" + count);
//			  }
//			 
//       	 count=0;
//       	
//       	 
//		}
//		//System.out.println(b);
//		System.out.println("-------------------------------------------------------------------");
		
		String a="javajava";
		char c[]=a.toCharArray();
		int count=0;
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count>1) {
				map.put(c[i], count);
			}
			count=0;
		}
		System.out.println(map);
	//}
		
//		System.out.println("-----------------------------------------------------------------");
//		String str = new String("Sakkett");
//        int count = 0;
//        char[] chars = str.toCharArray();
//        System.out.println("Duplicate characters are:");
//        for (int i=0; i<str.length();i++) {
//                    for(int j=i+1; j<str.length();j++) {
//                               if (chars[i] == chars[j]) {
//                                          System.out.println(chars[j]);
//                                          count++;
//                                          break;
//                                }
//                     }
//         }

  }
}
