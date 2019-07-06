package com.edu.dp;

import com.edu.dp.DeleteDuplicate.ListNode;

public class ReOrderList {
	 public ListNode reorderList(ListNode A) {
	        if(A.next == null)
	            return A;
	        ListNode head =A;
	        ListNode initial =A;
	        ListNode lastNode = lastNodeReturn(A);
	        while(initial.next != null){
	            ListNode temp = initial.next;
	            initial.next=lastNode;
	            lastNode.next=temp;
	            initial=temp;
	            A=initial;
	            lastNode = lastNodeReturn(A);
	        }
	        if(initial != lastNode)
	        	initial.next=lastNode;
	        
	        return head;
	    }
	    
	    public ListNode lastNodeReturn(ListNode A){
	    	ListNode prev = null;
	        while(A.next!=null){
	            prev=A;
	        	A=A.next;
	            
	        }
	        if(prev!=null)
	        	prev.next=null;        
	        return A;
	    }
	    
	    

}
