package bankofamerica;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankofAmc {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","/Users/parves/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com");
		driver.manage().window().maximize();
		System.out.println("window maximize");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='onlineId1']")).sendKeys("Online ID");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='passcode1']")).sendKeys("az");
		
		driver.findElement(By.xpath("//input[@id='saveOnlineId']")).click();
		
		driver.findElement(By.xpath("//button[@class='spa-btn spa-btn--primary spa-btn--block spa-btn--medium']")).click();
		//driver.quit();
	}

}
