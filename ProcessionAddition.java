package com.leemanni.codeTest;

public class ProcessionAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	int[][] answer = new int[arr1.length] [arr1[0].length];
        if(arr1.length <= 500 && arr1[0].length <=500 && arr2.length <= 500 && arr2[0].length <= 500) {
        	for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < answer[i].length; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
        }
        
        return answer;
    }
}
