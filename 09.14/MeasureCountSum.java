package com.leemanni.codetest_0914;

public class MeasureCountSum {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int mesasureCnt = 0;
			int index = 0; // i 의 약수를 구하기위해 i 를 나눠주는 index 변수
			while(index < i) {
				index++;
				if(i % index ==0) {
					mesasureCnt ++;
				}
			}
			System.out.println(mesasureCnt);
			// 약수의 개수 판별
			if(mesasureCnt % 2 ==0) {
				answer += i;
			}else {
				answer -= i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		MeasureCountSum mcs = new MeasureCountSum();
		mcs.solution(13, 17);
		mcs.solution(24, 27);
	}
}
