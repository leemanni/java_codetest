package com.leemanni.codetest;

public class BasicString {
	public boolean solution(String s) {
		boolean answer = false;
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				answer =true;
			} catch (NumberFormatException e) {
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("s"));
	}
}
