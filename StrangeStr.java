package com.leemanni.codetest;

public class StrangeStr {
	public String solution(String s) {
        String answer = "";
        // 마지막 문자가 공백인 경우도 고려해서 limit 를 -1 로 하여 마지막으로 둔다
        String [] words = s.split(" ",-1);
        
        for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if(j % 2 == 0) { // 짝수
					answer += (words[i].charAt(j)+"").toUpperCase();
				}else { // 홀수
					answer += (words[i].charAt(j)+"").toLowerCase();
				}
			}
			if(i != words.length-1) {
				answer += " ";
			}
		}
        return answer;
    }
}
