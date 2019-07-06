package com.edu.dp;

public class DeleteDuplicate {

	public ListNode deleteDuplicates(ListNode A) {
		if(A.next == null)
			return A;
		ListNode head =A;
		ListNode prev=null;
		ListNode current = A;
		ListNode prevDeleted = null;

		while(current!=null){
			if(current.next != null && current.val == current.next.val){
				prevDeleted=current;
				current=current.next;
			}else if(current.next == null){
				if(prev==null)
					return null;
				if(prevDeleted != null) {
					current=current.next;
					prev.next=current;
				}
				
				current=current.next;
					
			}else{
				if(prevDeleted!=null){
					current=current.next;
					prevDeleted=null;
					if(prev==null)
						head=current;
					else
						prev.next=current;

				}else{
					prev=current;
					current=current.next;
				}

			}


		}

		return head;
	}

	public static class ListNode {
		public int val;
		public ListNode next;
		ListNode(int x) { val = x; next = null; }
	}

}
