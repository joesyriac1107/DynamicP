package com.edu.dp;

import java.util.ArrayList;

public class PainterPartition {
	public int MOD=10000003;
    
    public Pair maxOfBoards(ArrayList<Integer> boards){
            int max=Integer.MIN_VALUE;
            long sum=0;
            
            for(Integer board : boards){
                max = Math.max(max,board);
                sum=sum+board;
            }
            
            return new Pair(max,sum);
    }
    
    public boolean isPossible(long time, int painters,ArrayList<Integer> boards){
        int count=1;
        int tempTime=0;
        for(Integer board: boards){
            tempTime=tempTime+board;
            if(tempTime>time){
                tempTime=board;
                count++;
                if(count>painters)
                    return false;
            }
        }
        
        return true;
        
    } 
    public int paint(int A, int B, ArrayList<Integer> C) {

        Pair pair = maxOfBoards(C);
        long minTime=(long)pair.max;
        long maxTime=pair.sum;
        long ans =0;
        if(minTime==maxTime)
            ans=minTime;
        while(minTime<=maxTime){
            long mid = (maxTime+minTime)/2;

            if(isPossible(mid,A,C)){
                ans=mid;
                maxTime=mid-1;
            }else{
                minTime=mid+1;
            }
            
        }
        
        return (int)(((ans%MOD)*(B%MOD))%10000003);
        
        
    }
    
    class Pair{
        int max;
        long sum;
        Pair(int max,long sum){
            this.max=max;
            this.sum=sum;
        }
    }
}


