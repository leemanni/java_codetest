package com.leemanni.codetest_0905;

import java.util.Date;

public class Year2016WeekDay {
	public String solution(int a, int b) {
		String [] weekDays = {"SUN","MON", "TUE", "WED","THU","FRI","SAT"};
		Date date = new Date(116, a-1, b);
		
        return weekDays[date.getDay()];
    }
	public static void main(String[] args) {
		Year2016WeekDay yd = new Year2016WeekDay();
		System.out.println(yd.solution(1, 1));
		System.out.println(yd.solution(5, 24));
	}
}
