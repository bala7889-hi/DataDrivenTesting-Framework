package ApachePoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertoprovidedata {

	WebDriver driver;
	
	@DataProvider(name="data")
	public Object[][] multipledata(){
		return new Object[][] {
			{"xyz@gmail.com","126893"},
			{"tyr@gmail.com","20180"},
			{"kio@gmail.com","10273"},
			{"abcc@gmail.com","19872"}
		};
	}

	@Test(dataProvider="data")
	public void login(String mail, String password) {
		driver=new ChromeDriver();
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
         driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(mail);
         driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
         driver.findElement(By.xpath("//input[@value=\"login\"]")).click();

	}
	@AfterMethod
	
	public void close() {
		driver.close();
	}

}
