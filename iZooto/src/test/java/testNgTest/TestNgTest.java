package testNgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;

public class TestNgTest {

	@Test
	public void test() throws InterruptedException {
		System.out.println("testNG successfull. "); 
	

		WebDriver driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver",
					"/Users/nehasingh/Documents/chromedriver-mac-x64/chromedriver");
			
			
			//Open panel
			 driver.get("https://panel.izooto.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
	        driver.findElement(By.cssSelector(".mat-form-field-infix.ng-tns-c74-3")).click();
			 driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("dummyizmogra@gmail.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@formcontrolname='password']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Izooto@123");
			 Thread.sleep(2000);
			 driver.findElement(ByAngular.buttonText("Sign In")).click();
			 Thread.sleep(6000);
			 driver.navigate().refresh();
			 Thread.sleep(2000);
		
	}
		
		
	}
		
		
		
	

 
