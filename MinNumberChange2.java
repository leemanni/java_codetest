package com.leemanni.codetest;

public class MinNumberChange2 {
	  public int[] solution(int[] arr) {
	        int[] answer = {};
	        if(arr.length > 1) {
	        	answer = new int [arr.length-1];
	        	int min = 0;
	        	int  index = 0;
	        	boolean flag = true;
	        	// 제일 작은 수 찾기
	        	for (int i = 0; i < arr.length-1; i++) {
					min = Math.min(arr[i], arr[i+1]);
				}
	        	// 같은 수 인덱스 기억하기
	        	for (int i = 0; i < arr.length; i++) {
					if(min == arr[i]) {
						flag = false;
					}else {
						answer[i] = arr[index ++];
					}
				}
	        }else {
	        	answer = new int[1];
	        	answer[0] = -1;
	        }
	        return answer;
	    }
}
