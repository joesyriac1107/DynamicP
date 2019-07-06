package com.edu.dp;

import java.util.ArrayList;
import java.util.Arrays;

import com.edu.dp.DeleteDuplicate.ListNode;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
//		ClimbingStairs cs = new ClimbingStairs();
//		System.out.println(cs.stairs(3));

//		MinJump mj =new MinJump();
//		Integer[] arr = {33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28};
//		ArrayList<Integer> list = new ArnoderayList<Integer>(Arrays.asList(arr));
//		System.out.println(mj.jump(list));
//		
//		
//		Integer[] arr = {2 ,3 , 8 ,8 , 10 , 11 };
//		DeleteDuplicate.ListNode head = new DeleteDuplicate.ListNode(2);
//		DeleteDuplicate.ListNode node = head; 
//		for(int i=1;i<arr.length;i++) {
//			node.next = new DeleteDuplicate.ListNode(arr[i]);
//			node=node.next;
//			
//			
//		}
//		ReOrderList ro = new ReOrderList();
//		ro.reorderList(head);
		
		Integer[] arr = {1, 2, 7, 0, 9, 3, 6, 0, 6};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		NobleInteger ni = new NobleInteger();
		ni.solve(list);

		
	}

}
