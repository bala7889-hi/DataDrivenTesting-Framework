package ApachePoi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
        @BeforeTest
        public void launchbrowser() {
         driver=new ChromeDriver();
         driver.get("https://practice.automationtesting.in/my-account/");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
        	
        }
        @DataProvider(name="input")
        public Object[][] method() throws IOException {
        	ReadDataFromExcel2 rd=new ReadDataFromExcel2("C:\\Users\\Saira\\OneDrive\\Documents\\LoginData.xlsx");
        	int rcount=rd.getrowcount("demo");
        	int ccount=rd. cellcount("demo",0);
        	
        	Object[][] obj=new Object[rcount][ccount];
        	
        	for(int i=0;i<rcount;i++) {
        		for(int j=0;j<ccount;j++) {
        			obj[i][j]=rd.value("demo",i,j);
        		}
        	}
        	
			return obj;
       
        }
        
        @Test(dataProvider = "input")
        public void login(String mail, String password) {
        	driver.findElement(By.id("username")).sendKeys(mail);
        	driver.findElement(By.xpath("(//input[@name=\"password\"])[1]")).sendKeys(password);
        	driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
        	driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
        }
        @AfterTest
        void close() {
        	driver.close();
        }
}
