package seleniumPracticeOct20;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.testng.Assert;
import seleniumPracticeOct19.*;

public class AlertPractice extends BaseTest {

	@Test
	public void AlertTry() throws InterruptedException {
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();

		Thread.sleep(2000);

		Alert a = driver.switchTo().alert();

		String actualAlertText = a.getText();

		System.out.println("Alert Text: " + actualAlertText);

		Assert.assertEquals("Hi.. This is alert message!", actualAlertText);

		Assert.assertTrue(actualAlertText.contains("alert message"));

		a.accept();

	}

	@Test
	public void confirmAlert() throws Exception {

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();

		// handle Alert

		// Alert / Window / Frame -------- swtchTo()

		// Alert

		// accept/dismiss/getText/sendKeys

		Alert confirmAlert = driver.switchTo().alert();

		// get text of Alert

		String actualAlertText = confirmAlert.getText();

		// validation step

		System.out.println("Alert Text: " + actualAlertText);

		Assert.assertEquals(actualAlertText, "Press 'OK' or 'Cancel' button!");

		Assert.assertTrue(actualAlertText.contains("'OK' or 'Cancel'"));

		// accept/dismiss

		// accept ----- click on Ok button

		// dismiss ----- click on cancel button

		Thread.sleep(4000);

		// simpleAlert.accept();

		confirmAlert.dismiss();

		Thread.sleep(4000);

		// validation step

		String actualCancelLabel = driver.findElement(By.cssSelector("#demo")).getText();

		System.out.println("Label: " + actualCancelLabel);

		Assert.assertTrue(actualCancelLabel.contains("Cancel"));

	}

}
