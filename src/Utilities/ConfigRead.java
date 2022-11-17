package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {
	static Properties prop;

	public ConfigRead() throws Exception {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Student\\eclipse-workspace\\JavaLearning\\src\\Utilities\\Config.properties");
		prop = new Properties();
		prop.load(fis);

	}

	public static String getUrl() {
		return prop.getProperty("appURL");

	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}
}