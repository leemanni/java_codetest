package com.leemanni.codetest_0909;

public class ChangeDex {
	public int solution(int n) {
		int answer = 0;
		String change = "";
		int r = 0; // 나머지
		int m = 0; // 몫
		while (n>0) {
			m = n / 3;
			r = n % 3;
			change += r;
			n/=3;
		}
		int x = 1;
		for (int i = change.length()-1; i > -1; i--) {
			answer += Integer.parseInt(change.charAt(i)+"") * x;
			x *= 3;
		}
		return answer;
	}

	public static void main(String[] args) {
		ChangeDex cd = new ChangeDex();
//		cd.solution(125);
//		cd.solution(45);
		System.out.println(Integer.toString(125, 3));
		System.out.println(Integer.parseInt("21", 3));
	}

}
