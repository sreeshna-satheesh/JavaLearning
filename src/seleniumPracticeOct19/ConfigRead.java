package seleniumPracticeOct19;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class ConfigRead {
	static Properties prop;

	public ConfigRead() throws Exception {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Student\\eclipse-workspace\\JavaLearning\\src\\seleniumPracticeOct19\\Config.properties");
		prop = new Properties();
		prop.load(fis);

	}

	public static String getappURL_sample() {
		return prop.getProperty("appURL_sample");

	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}
}

