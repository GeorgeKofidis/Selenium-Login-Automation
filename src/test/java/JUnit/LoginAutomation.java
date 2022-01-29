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
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium_Project\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

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
		//driver.quit();

	}

}
