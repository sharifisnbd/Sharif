package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sharif {
	WebDriver driver;
	@BeforeClass
	public void open() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

	
	
	
	@AfterClass
	public void close() {
		
		driver.close();
		
	}
	@Test
	public void sell() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();

	
	}
	
}

