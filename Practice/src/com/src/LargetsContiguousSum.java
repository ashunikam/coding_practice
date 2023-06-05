package com.src;

public class LargetsContiguousSum {
	public static void main(String[] args) {
		int[] arr= {-3,-4,4,-1,-2,1,5,-3};
		int max1=arr[0];
		int max2=arr[0];
		for(int i=1;i<arr.length;i++) {
			max1=Math.max(max1+arr[i], max2);
			max2=Math.max(max2, max1);
		}
		System.out.println(max2);
	}

}