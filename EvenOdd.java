package com.leemanni.codetest;

public class EvenOdd {
	public String solution(int num) {
        String answer = "";
        if(num == 0) {
        	answer ="Even";
        }else {
        	answer = num % 2 ==0? "Even" : "Odd";
        }
        return answer;
    }
}
