import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSample {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.mbusa.com");
		String T = driver.getTitle();
		
		System.out.println(T);
		
		
		
	}

}
