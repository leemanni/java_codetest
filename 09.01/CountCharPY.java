package com.leemanni.codetest_0901;

public class CountCharPY {
	boolean solution(String s) {
		int pCnt = 0;
		int yCnt = 0;
		for (int i = 0; i < s.length(); i++) {
			String check = s.charAt(i) + "";
			if (check.equalsIgnoreCase("p")) {
				pCnt += 1;
			} else if (check.equalsIgnoreCase("y")) {
				yCnt += 1;
			}
		}
		return pCnt == yCnt ? true : false;
	}
}
