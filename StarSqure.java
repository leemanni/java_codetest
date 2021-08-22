package com.leemanni.codeTest;

import java.util.Scanner;

public class StarSqure {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        if(a>0 && a<=1000 && b >0 && b <= 1000) {
	        	for (int i = 0; i < b; i++) {
	        		StringBuilder s = new StringBuilder("");
					for (int j = 0; j < a; j++) {
						s.append("*");
					}
					System.out.println(s);
				}
	        }
	    }
}
