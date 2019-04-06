package facebook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTestWithTestNG {
	WebDriver driver;
		
  @Test
  public void EmailAdress() throws InterruptedException {  
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcd");  
	  System.out.println("email entdered");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd1234");
	  System.out.println("password entdered");
	  Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","/Users/parves/Desktop/chromedriver");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("window maximize");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
