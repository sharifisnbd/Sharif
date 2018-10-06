package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class patel {
static WebDriver driver;
	@Test(priority=1)
	public  void Browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\eclipse-workspace\\testNG\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		
	}
	@Test(priority=2)
	public void search() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Led TV");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		
	}
	@Test(priority=3)
	public void closeBrowser() {
		driver.close();
	}
	
	
}
