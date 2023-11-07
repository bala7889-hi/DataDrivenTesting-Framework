package ApachePoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidermethod2 {

	WebDriver driver;

	@DataProvider(name="data")
	public Object[][] multipledata(){
		Object[][] obj=new Object[4][2] ;
		obj[0][0]="xyz@gmail.com";
		obj[0][1]="18791";

		obj[1][0]="abc@gmail.com";
		obj[1][1]="17983";

		obj[2][0]="skjh@gmail.com";
		obj[2][1]="87892";

		obj[3][0]="qudgi@gmail.com";
		obj[3][1]="99373";


		return obj;
	};

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
