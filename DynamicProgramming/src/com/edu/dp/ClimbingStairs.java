package com.edu.dp;

public class ClimbingStairs {
	
	public int stairs(int finalStair) {
		int[] stairs = new int[finalStair];
		stairs[0]=1;
		stairs[1]=2;
		for(int i=2;i<finalStair;i++) {
			stairs[i]=stairs[i-1]+stairs[i-2];
		}
		
		return stairs[finalStair-1];
	}

}
