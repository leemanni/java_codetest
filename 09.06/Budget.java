package com.leemanni.codetest_0906;

import java.util.Arrays;

public class Budget {
	public int solution(int[] d, int budget) {
		int answer = 0;
		
		int index = -1;
		int sum = 0;
		Arrays.sort(d);
		while(++index < d.length) {
			++answer;
			sum += d[index];
			System.out.println(sum);
			if(sum == budget) {
				break;
			}else if(sum > budget) {
				answer--;
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		Budget b = new Budget();
		int [] d = {2,2,3,3};
//		int [] d = {1,3,2,5,4};
		b.solution(d, 10);
	}
}
