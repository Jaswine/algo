package com.jaswine.offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 判断数组中的重复数字
 *
 * @author : Jaswine
 * @date : 2020-08-07 09:48
 **/
public class Offer03 {


	private void findRepeatNumber1(int[] nums){
		Map<Integer, Integer> numHash = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (numHash.get(nums[i]) != null){
				numHash.put(nums[i],Math.addExact(numHash.get(nums[i]), 1));
			}else {
				numHash.put(nums[i],0);
			}
		}

		Iterator<Map.Entry<Integer, Integer>> iterator = numHash.entrySet().iterator();

		while (iterator.hasNext()){
			Map.Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue().compareTo(0) != 0){
				System.out.println("重复数字："+entry.getKey());
			}
		}
	}

	private int findRepeatNumber2(int[] nums){
		int[] arr = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			arr[nums[i]]++;
			if(arr[nums[i]] > 1) {
				return nums[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {2, 3, 1, 0, 2, 5, 3};
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8};

		Offer03 offer03 = new Offer03();
		offer03.findRepeatNumber1(a);
		System.out.println(offer03.findRepeatNumber2(a));

	}



}
