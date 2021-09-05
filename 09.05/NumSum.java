package com.leemanni.codetest_0905;

import java.util.ArrayList;
import java.util.Collections;

public class NumSum {
	public Integer[] solution(int[] numbers) {
		ArrayList<Integer>sum = new ArrayList<>();
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int result = numbers[i] + numbers[j];
				if(!sum.contains(result)) {
					sum.add(result);
				}
			}
		}
		Collections.sort(sum);
		Integer[] answer = sum.stream().toArray(Integer[]::new);
		return answer;
	}
	
	
	public static void main(String[] args) {
		NumSum ns = new NumSum();
//		int [] numbers = {2,1,3,4,1};
		int [] numbers = {5,0,2,7};
		ns.solution(numbers);
	}
}
