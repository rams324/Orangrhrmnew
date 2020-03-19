package Com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelUtility.LoginInvaliddata;

public class LoginInvalid   {
	WebDriver driver;

	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\projectall-master\\projectall-master\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void Home_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	public void loginData(int a) throws InterruptedException, IOException {
		LoginInvaliddata e=new LoginInvaliddata();
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys(e.Username(a));
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys(e.Password(a));
	}
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
}
