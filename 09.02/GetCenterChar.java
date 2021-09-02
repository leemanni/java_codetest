package com.leemanni.codetest_0902;

public class GetCenterChar {
	public String solution(String s) {
		int index = (int) Math.ceil(s.length() / 2);
		return s.length() % 2 == 1 ? s.substring(index, index + 1) : s.substring(--index, index + 2);
	}
}
