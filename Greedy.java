package com.leemanni.code_test;

import java.util.Arrays;

public class Greedy {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);

//		여벌 체육복 가진 사람이 도난 당햇을 경우
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					answer += 1;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}
		
//	   체육복 빌려준 경우
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] -1 == reserve[j] || lost[i]+1 == reserve[j]) {
					reserve[j] = -1;
					answer ++;
					break;
				}
			}
		}
		
		return answer;
	}
}
