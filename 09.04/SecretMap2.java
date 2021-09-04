package com.leemanni.codetest_0904;

public class SecretMap2 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String [] map1 = new String[n];
		String [] map2 = new String[n];
		// 진법 변환
		for (int i = 0; i < n; i++) {
			answer[i] = "";
			map1[i] = Integer.toBinaryString(arr1[i]).toString();
			map2[i] = Integer.toBinaryString(arr2[i]).toString();
			int len = map1[i].length();
			if(len != n) {
				String temp = map1[i];
				map1[i] = "";
				for (int j = 0; j < n-len; j++) {
					map1[i] += "0";
				}
				map1[i] += temp;
			}
			len = map2[i].length();
			
			if(len != n) {
				String temp = map2[i];
				map2[i] = "";
				for (int j = 0; j < n-len; j++) {
					map2[i] += "0";
				}
				map2[i] += temp;
			}
			for (int j = 0; j < n; j++) {
				if (map1[i].charAt(j)=='0' && map2[i].charAt(j)=='0') {
					answer[i] += " ";
				} else {
					answer[i] += "#";
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		SecretMap2 sm = new SecretMap2();
		int [] map1 = {9, 20, 28, 18, 11};
		int [] map2 = {30, 1, 21, 17, 28};
		sm.solution(5, map1, map2);
	}

}
