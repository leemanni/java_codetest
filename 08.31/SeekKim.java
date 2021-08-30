package com.leemanni.codetest;

import java.util.Arrays;

public class SeekKim {
	public String solution(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				index = i;
				break;
			}
		}
        return String.format("김서방은 %d에 있다", index);
    }
	
	public static void main(String[] args) {
		String [] test = {"기","러","기"};
		
		
		
		System.out.println(Arrays.asList(test));
	}
}
