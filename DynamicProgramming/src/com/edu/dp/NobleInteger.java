package com.edu.dp;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
	public int solve(ArrayList<Integer> A) {
		Collections.sort(A);
		int j=1;
		int i=0;
		for(i =A.size()-1;i>0;i--){
			if(A.get(i)>j && A.get(i-1) <=j){
				if(Collections.binarySearch(A,j) <0)
					return j;
			}
			j++;
		}

		if(A.get(i)>j){
			if(Collections.binarySearch(A,j) <0)
				return j;

		}

		return -1;
	}
}
