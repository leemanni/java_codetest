package com.leemanni.codetest_0902;

import java.util.ArrayList;
import java.util.Collections;

public class IndexSelectionSort {
	 public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        ArrayList<String> list =new ArrayList<>();
	        
	        for (int i = 0; i < answer.length; i++) {
				list.add(strings[i].charAt(n) + strings[i]);
			}
	        Collections.sort(list);
	        
	        for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i).substring(1);
			}
	        return answer;
	    }

	public static void main(String[] args) {
		IndexSelectionSort r = new IndexSelectionSort();
		String[] strings = { "sun", "bed", "car" };
		String[] strings2 = { "abce", "abcd", "cdx" };
		System.out.println(r.solution(strings, 1));
		System.out.println("---------------------");
		System.out.println(r.solution(strings2, 2));
	}
}
