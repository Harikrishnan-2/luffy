package dzxc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class insta {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver..chrome.driver", "C:\\Users\\Digital\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType .FILE);
		FileHandler.copy(screen, new File("C:\\Users\\Digital\\Desktop\\Hari\\hri.jpeg"));
	}

}
