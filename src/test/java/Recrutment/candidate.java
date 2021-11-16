package Recrutment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class candidate {
  
	WebDriver driver;
	
	@Test
  public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		
		driver.findElement(By.id("addCandidate_firstName")).sendKeys("rajesh");
		
		
		driver.findElement(By.id("addCandidate_lastName")).sendKeys("jonna");
		
		
		driver.findElement(By.id("addCandidate_email")).sendKeys("rajesh@gmail.com");

		
		
		driver.findElement(By.id("btnSave")).click();
  }
}
