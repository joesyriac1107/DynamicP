package com.edu.dp;

import java.util.ArrayList;

public class AllocateBooks {
	  public Pair maxOfBoards(ArrayList<Integer> pagesList){
          int max=Integer.MIN_VALUE;
          long sum=0;
          
          for(Integer pages: pagesList){
              max = Math.max(max,pages);
              sum=sum+pages;
          }
          
          return new Pair(max,sum);
  }
  
  public boolean isPossible(long pagesMax, int students,ArrayList<Integer> pagesList){
      int count=1;
      int tempPages=0;
      for(Integer pages: pagesList){
          tempPages=tempPages+pages;
          if(tempPages>pagesMax){
              tempPages=pages;
              count++;
              if(count>students)
                  return false;
          }
      }
      
      return true;
      
  } 
  public int books(ArrayList<Integer> A, int B) {
      if(B>A.size())
          return -1;
      Pair pair = maxOfBoards(A);
      long minTime=(long)pair.max;
      long maxTime=pair.sum;
      long ans =0;
      if(minTime==maxTime)
          ans=minTime;
      while(minTime<=maxTime){
          long mid = (maxTime+minTime)/2;

          if(isPossible(mid,B,A)){
              ans=mid;
              maxTime=mid-1;
          }else{
              minTime=mid+1;
          }
          
      }
      
      return (int)ans;
   
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
