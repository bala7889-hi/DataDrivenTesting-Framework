package ApachePoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class advanceddataproviders2 {
	WebDriver driver;
	@Test(dataProviderClass=advanceddataproviders.class,dataProvider="data")
	public void login(String mail, String password) {
		driver=new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"login\"]")).click();
	}
	@Test(dataProviderClass=advanceddataproviders.class,dataProvider="data")
	public void one(String mail, String password) {
		driver=new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	}
	@AfterMethod
	void close() {
		driver.close();
	}
}
