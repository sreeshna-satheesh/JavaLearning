package javaLearningDay2;

public class Assert {

	String actualValue="iPhone";
	
		
		public void assertEqual(String expectedValue) {
			
			if(actualValue.equalsIgnoreCase(expectedValue)) {
				System.out.println("Validation--Passed");
			}
		
			else {
				System.out.println("Validation--Failed");
			}
		
	}
		
		public void assertEqual(String actualvalue1, String expectedvalue, String errormessage) {
			
			if(actualvalue1.equalsIgnoreCase(expectedvalue)) {
				System.out.println("Validation--Passed" + actualvalue1);
			}
		
			else {
				System.out.println("Validation--Failed " + expectedvalue);
				System.out.println("Error Message " + errormessage );
			}
		}

	
		        
		        
}
