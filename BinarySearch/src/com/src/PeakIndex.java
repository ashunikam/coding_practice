package com.src;

public class PeakIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,2, 1,0};
		int start=0, end=arr.length-1, mid=0;
		while(start<end) {
			 mid=(end+start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		System.out.println(arr[end]);

	}

}