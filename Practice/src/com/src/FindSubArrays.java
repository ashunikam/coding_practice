package com.src;
import java.util.*;

public class FindSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,5,3,6};
		int num=45;
		int start=0, end=0,mul=1;
		List<List<Integer>> ans=new ArrayList<>();
		for(end=0;end<arr.length;end++) {
			mul=mul*arr[end];
			while(mul>=num) {
				mul=mul/arr[start++];
			}
			List<Integer> l1=new ArrayList<>();
			for(int i=end;i>=start;i--) {
					l1.add(0,arr[i]);
					ans.add(new ArrayList(l1));
			}
			
		}
		System.out.println(ans);
	}
}