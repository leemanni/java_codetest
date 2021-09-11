package com.leemanni.codetest0911;

import java.util.Arrays;

public class RecommendJob {
	public String solution(String[] table, String[] languages, int[] preference) {
		// 직군들을 사전순으로 정렬
		Arrays.sort(table);
		String answer = "";
		int[] remember_point = new int[table.length]; // 직군별 점수를 기억
		int index_remember_point = -1;
		for (int i = 0; i < table.length; i++) {
			index_remember_point +=1;
			// 1. 직군별 요구 언어를 배열로 나눠줌
			String[] wantLang = table[i].split(" ");
			// 한 직군의 원하는 언어(SI...GAME) 와 선호하는 언어를 비교하는 반복
			int index_preference = -1;
			for (String language : languages) {
				index_preference = ++index_preference % preference.length;
				for (int j = 1; j < wantLang.length; j++) {
					// 선호 언어와 같은 요구 언어가 있으면 점수르 기억
					if (language.equals(wantLang[j])) {
						remember_point[index_remember_point] += (6-j) * preference[index_preference];
						continue;
					}
				}
			}
		}
		// 가장 선호도 점수가 높은 직군을 선택
		int max = remember_point[0];
		index_remember_point = 0; // 변수 재사용
		for (int i = 1; i < remember_point.length; i++) {
			if(max <  remember_point[i]) {
				max = remember_point[i];
				index_remember_point = i;
			}
		}
		return table[index_remember_point].split(" ")[0];
	}

	public static void main(String[] args) {
		RecommendJob rj = new RecommendJob();
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#",
							"CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
							"HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
							"PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
							"GAME C++ C# JAVASCRIPT C JAVA" };
//		String[] languages = { "JAVA", "JAVASCRIPT" };
		String[] languages = { "PYTHON", "C++", "SQL"};
//		int[] preference = { 7, 5 };
		int[] preference = { 7, 5, 5 };

		String result = rj.solution(table, languages, preference);
		System.out.println(result);

	}
}
