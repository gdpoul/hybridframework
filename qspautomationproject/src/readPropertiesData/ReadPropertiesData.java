package readPropertiesData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesData {
	public static void main(String[] args) throws IOException {

		// HOW TO READ DATA FRO PROPERTY FILE

		// Take File For Read Operation
		FileInputStream fis = new FileInputStream("./data/config.properties");

		// Create the Object for Properties class to use methods
		Properties pr = new Properties();

		// Use the Methods
		pr.load(fis);
		String value = pr.getProperty("url");

		// Print the Value
		System.out.println(value);
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));

	}

}
