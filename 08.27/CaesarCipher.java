package com.leemanni.codetest;

public class CaesarCipher {
	public String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += " ";
				continue;
			}
			char check = s.charAt(i);
			if (Character.isUpperCase(check)) { // 대문자인 경우
				check = (char) (check + n > 90 ? 65 + (check + (n-1) - 'Z') % 65 : check + n);
			} else { // 소문자인 경우
				check = (char) (check + n > 122 ? 'a' + (check + (n-1) - 'z') % 97 : (check + n));
			}
			System.out.println(check);
			answer += check;
		}
		return answer;
	}

	public static void main(String[] args) {
		CaesarCipher c = new CaesarCipher();
		c.solution("A", 1);
		c.solution("B", 25);
		c.solution("z", 1);
	}
}
