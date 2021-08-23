package com.leemanni.CodeTest;

public class IntRoot {
	  public long solution(long n) {
	        long answer = 0;
	        if(  Math.sqrt(n) % (long)Math.sqrt(n) <=0) {
	        	answer = (long) Math.pow((long)Math.sqrt(n) + 1, 2);
	        }else {
	        	answer = -1;
	        }
	        return answer;
	    }
	  
	  public static void main(String[] args) {
		  IntRoot i = new IntRoot();
		  System.out.println(i.solution(121));
		  System.out.println(i.solution(0));
		  System.out.println(i.solution(3));
		  System.out.println(i.solution(1111));
		  System.out.println(Math.sqrt(1111));
		  System.out.println(i.solution(13));
		  System.out.println(i.solution(196));
	}
}
