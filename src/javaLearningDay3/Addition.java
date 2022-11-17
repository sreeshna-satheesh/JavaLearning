package javaLearningDay3;

import java.util.ArrayList;

import java.util.List;



public class Addition {
	public static int sumScores(List<Integer> nums) {
		int sum = 0;
		for(int i = 0; i<nums.size(); i++) {
			sum = sum + nums.get(i);
		}
		return sum;

		   

		}


	
	
	 public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(4);
		nums.add(7);
		nums.add(3);
		nums.add(6);
		
		

        int sum = sumScores(nums);

        System.out.println(sum); 
		
	}
}
