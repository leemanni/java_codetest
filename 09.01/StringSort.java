package com.leemanni.codetest_0901;

import java.util.ArrayList;
import java.util.Comparator;

public class StringSort {
	public String solution(String s) {
        String answer = "";
        char [] list = s.toCharArray();
        ArrayList<Character> upperList = new ArrayList<>();
        ArrayList<Character> lowerList = new ArrayList<>();
        
        for (int i = 0; i < list.length; i++) {
			if(list[i]<'a') { // 대문자
				upperList.add(list[i]);
			}else { // 소문자
				lowerList.add(list[i]);
			}
		}
        // 정렬
        upperList.sort(Comparator.reverseOrder());
        lowerList.sort(Comparator.reverseOrder());
        lowerList.addAll(upperList);
        for (int i = 0; i < lowerList.size(); i++) {
			answer += lowerList.get(i) + "";
		}
        return answer;
    }
	public static void main(String[] args) {
		StringSort ss = new StringSort();
		System.out.println(ss.solution("Zbcdefg"));
	}
}
