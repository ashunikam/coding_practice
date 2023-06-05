package com.src;
import java.util.*;
public class GetMaximumOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,5,8,4,1,7,9};
		int k=3;
		Deque<Integer> q1=new LinkedList<>();
		for(int i=0;i<k;i++) {
			while((!q1.isEmpty()) && arr[i]>arr[q1.peekLast()]) {
				q1.removeLast();
			}
			q1.addLast(i);
		}
		for(int i=k;i<arr.length;i++) {
			System.out.println(arr[q1.peekFirst()]);
			while((!q1.isEmpty()) && i-k>=q1.peekFirst()) {
				q1.removeFirst();
			}
			while((!q1.isEmpty()) && arr[i]>arr[q1.peekLast()]) {
				q1.removeLast();
			}
			q1.addLast(i);
		}
		System.out.println(arr[q1.peekFirst()]);

	}

}