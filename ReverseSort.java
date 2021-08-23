package com.leemanni.CodeTest;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSort {
	 public long solution(long n) {
	        ArrayList<String> sortLsit = new ArrayList<>();
	        String input= String.valueOf(n);
	        for (int i = 0; i < input.length(); i++) {
				sortLsit.add(input.charAt(i)+"");
			}
	        Collections.sort(sortLsit, Collections.reverseOrder());
	        input = "";
	        for (int i = 0; i < sortLsit.size(); i++) {
				input += sortLsit.get(i);
			}
	        return Long.parseLong(input);
	    }
	 
	 public static void main(String[] args) {
		ReverseSort r = new ReverseSort();
		long ii = r.solution(118372);
		System.out.println(ii);
	}
}
