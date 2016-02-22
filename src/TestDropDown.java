import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Latina");
		
		
		//Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		
		//select.selectByVisibleText("Latina");
		
		//select.selectByValue("hi");
		/*
		select.selectByIndex(0);
		
		List<WebElement> options = select.getOptions();
		
		System.out.println(options.size());
		
		for(int i=0;i<=options.size();i++)
		{
			
			System.out.println(options.get(i).getText());
			*/
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			
			System.out.println(list.get(i).getAttribute("href"));
			
		}
		System.out.println(list.size());
	}
}


