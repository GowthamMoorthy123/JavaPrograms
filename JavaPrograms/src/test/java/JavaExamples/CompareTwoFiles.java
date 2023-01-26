package JavaExamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CompareTwoFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		FileInputStream file1 = new FileInputStream(path + "\\Data\\A.properties");
		FileInputStream file2 = new FileInputStream(path + "\\Data\\B.properties");

		Properties properties1 = new Properties();
		Properties properties2 = new Properties();

		properties1.load(file1);
		properties2.load(file2);
		
		System.out.println(properties1.toString());
		System.out.println(properties2.toString());

		if (properties1.toString().equals(properties2.toString())) {
			System.out.println("Both files are equal");
		} else {
			System.out.println("Both files are not equal");
		}
	}

}
