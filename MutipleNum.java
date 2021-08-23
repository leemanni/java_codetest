package com.leemanni.codetest;

public class MutipleNum {
	  public int[] solution(int n, int m) {
	        int[] answer = new int [2];
	        int big = 0;
	        int small = 0;
	        if(m > n) {
	        	big = m;
	        	small = n;
	        }else {
	        	big = n;
	        	small = m;
	        }
	        while(true) {
	        	if(big % small == 0) {
	        		answer[0] = small;
	        		break;
	        	}else {
	        		int temp = big;
	        		big = small;
	        		small = temp % small;
	        	}
	        }
	        answer[1] = n * m / answer[0];
	        return answer;
	    }
}
