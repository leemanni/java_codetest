package com.leemanni.CodeTest;

public class RollerCoster {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long total = 0;
		long rememberPrice = price;
		for (int i = 0; i < count; i++) {
			total += price;
			price += rememberPrice;
		}
		if (money <= total) {
			answer = total - money;
		}
		return answer;
	}

}
