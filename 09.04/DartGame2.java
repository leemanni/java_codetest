package com.leemanni.codetest_0904;

public class DartGame2 {
	public int solution(String dartResult) {
		char[] results = dartResult.toCharArray();  //들어온 점수를 문자 배열로 반환해줌
		int index = 0; // 기회 순서를 기억함
		int[] points = new int[3]; // 점수만 저장
		points[0] = Integer.parseInt(results[0]+"");
		
		for (int i = 0 ; i < results.length ; i ++) {
			if ( i!=0 && results[i] >= 48 && results[i] <= 57) {
				if(points[index] == 1 && results[i]=='0') {
					points[index] *= 10;
				}else {
					index = ++index > 4 ? 3 : index;
					points[index] = Integer.parseInt(results[i]+"");
				}
			} else {
				switch (results[i]) {
					case 'S':
						points[index] = (int) Math.pow(points[index], 1);
						break;
					case 'D':
						points[index] = (int) Math.pow(points[index], 2);
						break;
					case 'T':
						points[index] = (int) Math.pow(points[index], 3);
						break;
					case '*':
						points[index] *= 2;
						if(index != 0) {
							points[index-1]  *= 2;
						}
						break;
					case '#':
						points[index] *= -1;
						break;
				}
			}
		}
		return points[0] + points[1] + points[2];
	}
}
