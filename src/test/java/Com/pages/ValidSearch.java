package Com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ValidSearch {
	protected WebDriver driverObj;
	By driverTab = By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b");
	By searchInput = By.xpath("//*[@id=\"searchDirectory_emp_name_empName\"]");
	By searchButton = By.xpath("//*[@id=\"searchBtn\"]");
	

	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\projectall-master\\projectall-master\\drivers\\chromedriver.exe");
		driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverObj.get("www.google.com");
	}

	public void homePage(String url) {
		driverObj.get(url);
	}

	public void login() throws IOException, InterruptedException {
		driverObj.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driverObj.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
		driverObj.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		Thread.sleep(3000);
		
	}

	public void ValidSearchMethod() {
		driverObj.findElement(driverTab).click();
		driverObj.findElement(searchInput).sendKeys("Linda Anderson");
		driverObj.findElement(searchButton).click();
	}

	public void close() {
		driverObj.quit();
	}
}
