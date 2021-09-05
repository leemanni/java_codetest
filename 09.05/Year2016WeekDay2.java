package com.leemanni.codetest_0905;

public class Year2016WeekDay2 {
	public String solution(int a, int b) {
		String [] WeekDays = {"THU","FRI","SAT","SUN", "MON", "TUE", "WED"};
		int [] lastDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = 0;
		
		if (a !=1) {
			for (int i = 0; i < a-1; i++) {
				days += lastDays[i];
			} 
		}
		days += b;
		System.out.println(days);
        return WeekDays[days%7];
    }
	public static void main(String[] args) {
		Year2016WeekDay2 yd = new Year2016WeekDay2();
//		System.out.println(yd.solution(1, 1));
//		System.out.println(yd.solution(1, 2));
//		System.out.println(yd.solution(1, 3));
//		System.out.println(yd.solution(1, 4));
//		System.out.println(yd.solution(1, 31));
		System.out.println(yd.solution(8, 31));
		System.out.println(yd.solution(9, 30));
		System.out.println(yd.solution(10, 31));
		System.out.println(yd.solution(11, 30));
		System.out.println(yd.solution(12, 31));
		System.out.println(yd.solution(5, 24));
	}
}
