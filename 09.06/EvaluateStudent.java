package com.leemanni.codetest_0906;

public class EvaluateStudent {
	public String solution(int[][] scores) {
		String answer = "";
		double [] means = new double [scores.length]; 
		for (int i = 0; i < scores.length; i++) {
			boolean check = true;
			int myScore = scores[i][i]; // 본인이 매긴 점수
			int max = 0;
			int min = 100;
			for (int j = 0; j < scores[i].length; j++) {
				// 같은 점수가 있는 지 확인
				if(i != j && myScore == scores[j][i]) {
					check =false;
				}else if(means.length != 1){
					max = Math.max(max, scores[j][i]);
					min = Math.min(min, scores[j][i]);
				}
				means[i] += scores[j][i];
			}
			int len = scores.length;
//			같은 수가 없고 해당수가 유일한 최대값 최소값인경우
			if( scores.length!=1 &&check && (myScore ==max || myScore == min)) {
				len -= 1;
				means[i] -= myScore;
			}
			means[i] = means[i] / len;
			switch ((int)means[i]/10) {
				case 9:
					answer +="A";
					break;
				case 8:
					answer +="B";
					break;
				case 7:
					answer +="C";
					break;
				case 5: case 6:
					answer +="D";
					break;
				default:
					answer +="F";
					break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		EvaluateStudent es = new EvaluateStudent();
//		int[][] scores = {{50,90},{50,87}};
//		int[][] scores = {{70,49,90},{68,50,38},{73,31,100}};
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		System.out.println(es.solution(scores));
	}
}
