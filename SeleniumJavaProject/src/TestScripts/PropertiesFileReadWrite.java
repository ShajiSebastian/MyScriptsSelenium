package TestScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileReadWrite {

	public static void main(String[] args) {

		read();
		write();
		read();
	}

	public static void read() {

		Properties prop1 = new Properties();	
		try {
			InputStream input = new FileInputStream("/Users/a-4600/eclipse-workspace/SeleniumJavaProject/src/config/config.properties");
			prop1.load(input);
			System.out.println(prop1.getProperty("browser"));
			System.out.println(prop1.getProperty("Application"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void write() {

		Properties prop2 = new Properties();	
		try {
			OutputStream output = new FileOutputStream("/Users/a-4600/eclipse-workspace/SeleniumJavaProject/src/config/config.properties");
			prop2.setProperty("Browser","Chrome2");
			prop2.setProperty("Application","Expedia");
			prop2.setProperty("Result","PASS");
			prop2.store(output,null);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
}

