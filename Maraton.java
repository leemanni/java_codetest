package com.leemanni.codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maraton {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		ArrayList<String> pList = new ArrayList<>(Arrays.asList(participant));
		ArrayList<String> cList= new ArrayList<>(Arrays.asList(completion));
		Collections.sort(pList);
		Collections.sort(cList);
		System.out.println(pList);
		System.out.println(cList);
		for (int i = 0; i < cList.size(); i++) {
			if (!pList.get(i).equals(cList.get(i))) {
				answer = pList.get(i);
				break;
			}
		}
        return answer.length()==0? pList.get(pList.size()-1): answer;
    }
	
	public static void main(String[] args) {
		String [] participant = {"leo", "kiki", "eden"};
		String [] completion = {"eden", "kiki"};
		ArrayList<String> a = new ArrayList<>();
		Maraton m = new Maraton();
		System.out.println(m.solution(participant, completion));
	}
}
