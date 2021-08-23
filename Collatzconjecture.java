package com.leemanni.codetest;

public class Collatzconjecture {
   public int solution(long num) {
        int answer = 0;
        int cnt = 0;
        while(true) {
        	if(num == 1) {
        		answer = cnt;
        		break;
        	}
        	++cnt;
        	num = num % 2 == 0 ? num / 2 : (num * 3 + 1);
        	if(cnt >=500) {
        		answer = -1;
        		break;
        	}
        }
        return answer;
    }
   public static void main(String[] args) {
	Collatzconjecture c = new Collatzconjecture();
	System.out.println(c.solution(626331));
	
}
}
