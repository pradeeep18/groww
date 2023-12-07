package groww1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Testing\\seleiunm\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://groww.in/");
		
		WebElement login=driver.findElement(By.xpath("(//span[@class='absolute-center'])[1]"));
		login.click();
		
//		WebElement login1=driver.findElement(By.xpath("//span[text()='Sign in with Google']"));
//		login1.click();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='login_email1']"));
		username.sendKeys("khatodepradeep7@gmail.com");
		
		WebElement continue1=driver.findElement(By.xpath("(//div[contains(@class,'absolute-center btn51')])[1]"));
		continue1.click();
		
		WebElement password=driver.findElement(By.xpath("//input[@id='login_password1']"));
		password.sendKeys("pradeep18");
		
		WebElement submit=driver.findElement(By.xpath("(//div[contains(@class,'absolute-center btn51')])[1]"));
		submit.click();
		
		WebElement cart=driver.findElement(By.xpath("(//a[@href='/user/balance/inr'])[2]"));
		submit.click();
	
	
	}

}
