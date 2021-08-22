package com.leemanni.codetest;

public class HarshadNum {
	public boolean solution(int x) {
        boolean answer = false;
        // 해당 수의 자리수
        int sum = 0;
        	int r = 0 ; // 나머지
        	int m = x; // 숫자 기억
        	while(x != 0) {
        		r = x % 10 ;
        		x /= 10;
        		sum += r;
        	}
        	System.out.println(sum);
        	answer = m % sum == 0? true : false;
        return answer;
    }
	public static void main(String[] args) {
		HarshadNum h = new HarshadNum();
		System.out.println(h.solution(113));
	}
}
