package com.leemanni.codetest_0902;

public class BetweenSum {
	public long solution(int a, int b) {
		long answer = 0;
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			answer += i;
		}
		return answer;
	}
}
