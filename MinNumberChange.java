package com.leemanni.codetest;

import java.util.ArrayList;

public class MinNumberChange {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int index =0;
		ArrayList<Integer> list = new ArrayList<>();
		if (arr.length > 1) {
			answer = new int[arr.length - 1];
			int min = arr[0];
			
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
				if(min > arr[i]) {
					min = arr[i];
					index = i;
				}
			}
			list.remove(index);
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}else {
			answer = new int[1];
			answer[0] = -1;
		}

		return answer;
	}

	public static void main(String[] args) {
		MinNumberChange m = new MinNumberChange();
		int[] arr = { 4,3,2,1};
		int [] result = m.solution(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
