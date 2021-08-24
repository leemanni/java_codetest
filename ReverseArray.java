package com.leemanni.CodeTest;

public class ReverseArray {
	public int [] solution(long n) {
		StringBuilder number = new StringBuilder(String.valueOf(n));
		number.reverse();
        int [] answer = new int [number.length()];
        int index = 0;
        for (int i = 0 ; i < number.length(); i++) {
			answer[index] = Integer.parseInt(number.charAt(i)+"");
			 index += 1;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		ReverseArray r = new ReverseArray();
		System.out.println(r.solution(12345)[0]);
		String ii = "abcdefg";
	}
}
