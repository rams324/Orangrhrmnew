package Com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class InvalidSearch {
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

	public void login() throws IOException {
		driverObj.findElement(driverTab);
	}

	public void InvalidSearchMethod() {
		driverObj.findElement(driverTab).click();
		driverObj.findElement(searchInput).sendKeys("mahendra");
		driverObj.findElement(searchButton).click();
	}

	public void close() {
		driverObj.quit();
	}
}
