package com.leemanni.codetest0911;

import java.util.Arrays;
import java.util.Comparator;

public class WeightsSort {
	public int[] solution(int[] weights, String[] head2head) {
		int[] answer = new int[weights.length];
		double [][] results = new  double [weights.length][4];
		for (int i = 0; i < weights.length; i++) {
			int size = 0;
			int winOverWeightCnt = 0; // 자기보다 무거운 사함 이긴 거 카운트
			int winCount = 0;		// 이긴 횟수 카운트
			for (int j = 0; j < weights.length; j++) {
				size = head2head[i].charAt(j) =='N'? size+=0 : (size+=1); 
				if (head2head[i].charAt(j)=='W') {
					winCount ++;
					if (weights[i] < weights[j]) {
						winOverWeightCnt++;
					}
				}
			}
			results[i][1] =  size != 0 ? (winCount*1.0) / size : 0;
			results[i][2] = winOverWeightCnt;
			results[i][3] = weights[i] ;
			results[i][0] = (i + 1);
			System.out.println(Arrays.toString(results[i]));
		}
		Arrays.sort(results, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				if(o1[1] != o2[1] ) { // 승률
					return (int)(o2[1]*100000000 - o1[1]*100000000);
				}
				if(o1[2] != o2[2] ) { // 몸무게 큰 사람 이긴 횟수
					return (int)(o2[2] - o1[2]);
				}
				if(o1[3] != o2[3] ) { // 몸무게
					return (int)(o2[3] - o1[3]);
				}
				return  (int)(o1[0]-o2[0]); // 번호순
			}
		});
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)results[i][0];
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	public static void main(String[] args) {
		WeightsSort ws = new WeightsSort();
		int[] weights = { 50, 82, 75, 120 };
//		int[] weights = { 145,92,86 };
//		int[] weights = { 60,70,60 };
		String[] head2head = { "NLWL", "WNLL", "LWNW", "WWLN" };
//		String[] head2head = { "NLW","WNL","LWN" };
//		String[] head2head = { "NNN","NNN","NNN" };
		ws.solution(weights, head2head);
	}
}
