package javaLearningDay2;

import org.junit.Test;

public class AssertMethod {

	@Test
	public void AssertMethodJunit() {
	
	Assert AssertMethodObj = new Assert();
	AssertMethodObj.assertEqual("Google", "Pixel", "Verification Failed");
}
}

