package com.edu.dp;

import java.util.ArrayList;

public class MinJump {

	public int jump(ArrayList<Integer> A) {
		int[] jumpArray =  new int[A.size()];
		jumpArray[A.size()-1]=1;

		for(int i=A.size()-2;i>=0;i--){
			boolean flag = true;
			int temp =Integer.MAX_VALUE;
			for(int j=A.get(i);j>0;j--){
				if((i+j)<(A.size()-1) && jumpArray[i+j]>0){
					jumpArray[i]=jumpArray[i+j]+1;
					temp=Math.min(temp,jumpArray[i+j]);
				}else if((i+j)>=(A.size()-1)){
					jumpArray[i]=1;
					flag=false;
					break;
				}

			}
			if(flag) {
				if(temp == Integer.MAX_VALUE || temp == 0)
					jumpArray[i]=0;
				else {
					jumpArray[i]=temp+1;
				}
			}


		}
		if(jumpArray[0] == 0)
			return -1;
		return jumpArray[0];
	}
}


