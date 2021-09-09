package com.leemanni.codetest_0909;

public class ChangeDex2 {
	public int solution(int n) {
		StringBuilder change = new StringBuilder(Integer.toString(n, 3)) ;
		change.reverse();
		return Integer.parseInt(change.toString(), 3);
	}

	public static void main(String[] args) {
		ChangeDex2 cd = new ChangeDex2();
		cd.solution(125);
//		cd.solution(45);
//		System.out.println(Integer.toString(125, 3));
//		System.out.println(Integer.parseInt("21", 3));
	}

}
