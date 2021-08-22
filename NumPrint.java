package com.leemanni.codeTest;

public class NumPrint {
	 public long[] solution(int x, int n) {
	        long[] answer = {};
	        if(x >= -10000000 && x <= 10000000 && n <= 1000) {
	        	answer = new long [n];
	        	for (long i = 0; i < n; ++i) {
	        		long index = x * (i+1);
	        		answer[(int)i] = index;
				}
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		NumPrint s = new NumPrint();
		long [] test = s.solution(0, 2);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}
}
