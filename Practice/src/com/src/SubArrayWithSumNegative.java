package com.src;
import java.util.*;

public class SubArrayWithSumNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,5,3,1,8};
		int sum=9;
		int start=0, end=0,total=0;
		Map<Integer,Integer> map=new HashMap<>();
		while(end<arr.length) {
			total=total+arr[end];
			int winSum=total-sum;
			if(map.containsKey(winSum)) {
				start=map.get(winSum)+1;
				System.out.println("start Index"+" "+start+"End Index"+" "+end);
			}
			map.put(total, end);
			end++;
		}
	}

}