import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\kumar\\eclipse-workspace\\CoreJava\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		prop.setProperty("browser1", "firefox");
		prop.setProperty("website", "https://youtube.com");
		System.out.println(prop.getProperty("browser1"));
		System.out.println(prop.getProperty("website"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kumar\\eclipse-workspace\\CoreJava\\src\\data.properties");
		prop.store(fos, null);
		

	}

}
