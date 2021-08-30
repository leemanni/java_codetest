package com.leemanni.codetest;

public class FindDecimal {
	public int solution(int n) {
		int answer = 0;
		boolean [] check = new boolean[n+1];
		check[0] = check[1] = true;
		
		// 2 ~ n의 제곱근 까지의 본인을 제외한 모든 배수를 계산 범위에서제외시킨다.
		for (int i = 2; i < Math.sqrt(n)+1; i++) {
			// 이미 체크한 것 제외
			if(check[i] == true) {
				continue;
			}
			for (int j = i+i; j <= n; j+=i) {
				check[j] = true;
			}
			
		}
		
		// 소수인것들의 개수를 구한다
		for (int i = 2; i < check.length; i++) {
			if (check[i]==false) {
				answer += 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FindDecimal f = new FindDecimal();
		System.out.println(f.solution(10));
		System.out.println(f.solution(5));
	}
}
