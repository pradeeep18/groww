package groww1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Testing\\seleiunm\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File test = new File("C:\\Testing\\ScreenShot\\test"+dtf.format(now)+".PNG");
		FileHandler.copy(src, test);
			
	}

}
