package com.leemanni.codetest_0903;

import java.util.ArrayList;

public class NotSameNumber {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int index = 0;
		ArrayList<Integer> rememberList = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			if(arr[index] != arr[i]) {
				rememberList.add(arr[i-1]);
				index = i; 
			}
		}
		rememberList.add(arr[arr.length-1]);
		answer = new int[rememberList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = rememberList.get(i).intValue();
		}
		return answer;
	}
	public static void main(String[] args) {
		NotSameNumber nsn = new NotSameNumber();
		int [] arr = {1,1,3,3,0,1,1};
//		int [] arr = {4,4,4,3,3};
		nsn.solution(arr);
	}
}
