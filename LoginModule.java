package ApachePoi;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginModule {

	ChromeDriver driver;
	
	@BeforeMethod
	public void LunchBrowser() {
		driver=new ChromeDriver();
		driver.get("Https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
	}
	
	@DataProvider
	public Object[][] dataContainer() throws IOException {
		ReadDatafromExcel data=new ReadDatafromExcel("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
	int tr=data.getRowCount("demo");
	int tc=data.getCellCount("demo",0);
	Object[][] obj=new Object[tr][tc];
	
	    for(int i=0;i<tr;i++) {
	    	for(int j=0;j<tc;j++) {
	    		obj[i][j]=data.getCellData("demo", i, j); //hello
	    		
	    	}
	    }
	   return obj;
	
	}
	
	
	
	@Test(dataProvider="dataContainer")
	public void LoginFuction(String username,String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterMethod
	void closeBrowser() {
		driver.close();
	}
	
}