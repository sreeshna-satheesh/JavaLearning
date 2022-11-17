package javaLearningDay3;

import java.util.ArrayList;
import java.util.List;

public class Average {
	public static int average(List<Integer> nums) {
		int sum = 0;
		int avg=0;
		for(int i = 0; i<nums.size(); i++) {
			sum = sum + nums.get(i);
		}
		avg=sum/(nums.size());
		return avg;
		   

		}

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(4);
		nums.add(7);
		nums.add(3);
		nums.add(6);
		
		

        int avg = average(nums);

        System.out.println(avg);

	}

}
