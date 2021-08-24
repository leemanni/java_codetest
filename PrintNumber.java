package com.leemanni.CodeTest;

public class PrintNumber {
 public int solution(int n) {
        int answer = 0;
        String chage = String.valueOf(n);
        for (int i = 0; i < chage.length(); i++) {
			answer += Integer.parseInt(chage.charAt(i)+"");
		}
        return answer;
    }
 	public static void main(String[] args) {
		
	}
 	
}
