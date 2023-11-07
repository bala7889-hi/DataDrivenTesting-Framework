package ApachePoi;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class advanceddataproviders {
	@DataProvider(name="data")
	public Object[][] multipledata(Method m){
		
		if(m.getName().equals("login")) {
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
		}
		if(m.getName().equals("one")) {
			
		}
 Object[][] obj=new Object[2][2] ;
			obj[0][0]="xyz@gmail.com";
            obj[0][1]="18791";
            
            obj[1][0]="abc@gmail.com";
            obj[1][1]="17983";
            
            
            
            
		return obj;
	};
}
