package com.leemanni.codetest;

public class DivisiorSum {
	public int solution(int n) {
		int answer = 0;
//		입력받은 수가 0 인지 확인하기
		if (n != 0) {
//        입력한 수 만큼 만복해서 약수들을 구한다
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					answer += i;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		DivisiorSum d = new DivisiorSum();
		System.out.println(d.solution(5));
	}
}
