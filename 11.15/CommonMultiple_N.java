package com.leemanni.code_test;

import java.util.Arrays;

public class CommonMultiple_N {
	public int solution(int[] arr) {
		Arrays.sort(arr);
		int answer = arr[0] * arr[1] / Cal_maxFactor(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			answer = answer * arr[i] / Cal_maxFactor(answer, arr[i]);
		}
		return answer;
	}
//	 최대 공약수 구하는 메소드
	public int Cal_maxFactor(int big, int small) {
		if(big % small == 0) {
			return small;
		}
		return Cal_maxFactor(small, big % small);
	}
}
