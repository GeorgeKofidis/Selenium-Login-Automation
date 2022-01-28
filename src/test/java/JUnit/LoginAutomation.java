package JUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginAutomation {

	@Test
	void test() {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium_Project\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();

		//open browser with desried URL
		//driver.get("http://ict.ihu.gr/");
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement username = driver.findElement(By.id("user_email_login"));
		WebElement password = driver.findElement(By.id("user_password"));
		WebElement cookies = driver.findElement(By.id("accept-cookie-notification-cross-icon"));
		WebElement login = driver.findElement(By.id("user_submit"));
		
		username.sendKeys("testingselenium2000@gmail.com");
		password.sendKeys("testingSelenium$2022gk");
		cookies.click();
		login.click();
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = driver.getCurrentUrl();
		Assertions.assertEquals(expectedUrl,actualUrl);
		//closing the browser
		//driver.quit();

	}

}
