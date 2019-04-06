package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktest {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/parves/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("window maximize");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("paparves11@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("parves11");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_2')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'u_0_k')]")).click();
	Thread.sleep(3000);
	
	

	}

}
