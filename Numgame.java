package com.leemanni.exer;

public class Numgame {
	public static void main(String[] args) {
		Numgame s = new Numgame();
	}
	public int solution(String s) {
		String [] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int answer = 0;
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
			if(s.contains(numbers[i])) {
				s = s.replaceAll(numbers[i], i+"");
			}
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
