package com.leemanni.codetest;

public class StringConvertToInteger {
	public int solution(String s) {
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		StringConvertToInteger sct = new StringConvertToInteger();
		
	
		sct.solution("-1234");
		System.out.println(Integer.parseInt("-1234"));
	}
}
