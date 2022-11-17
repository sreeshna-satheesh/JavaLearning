package javaLearningDay3;

import java.util.ArrayList;

public class ArrayListLearning {
	
	public static int sumScores(ArrayList<Integer> scoreBoard) {
		int sum = 0;
		for(int i = 0; i<scoreBoard.size(); i++) {
			sum = sum + scoreBoard.get(i);
		}
		return sum;

		   

		}

}
