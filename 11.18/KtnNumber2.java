package com.leemanni.code_test;

import java.util.Arrays;

public class KtnNumber2 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int [commands.length];
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int [] temp = new int [end - start + 1];
			int index = -1;
			for (int j = start; j <= end; j++) {
				temp[++index] = array[j];
			}
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		KtnNumber2 k = new KtnNumber2();
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(k.solution(array, commands)));
	}
}
