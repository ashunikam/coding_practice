package com.src;

public class RemoveduplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,4,4,4,5,6,7,7,8};
		int index=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[index]=arr[i+1];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}