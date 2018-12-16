package jenkinsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 {

	public static WebDriver driver;
	@Test
	public void method1()
	{
		System.out.println("class2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRIVINOTHKUMAR S\\Desktop\\project\\GitConnectedWorkspace\\VinothScripts\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("browser opened");
		driver.close();
		System.out.println("browser closed");
		
	}
	
}
