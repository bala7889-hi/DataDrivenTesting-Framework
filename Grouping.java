package ApachePoi;

import org.testng.annotations.Test;

public class Grouping {
         @Test(priority=-1,groups={"first"})
         public void login() {
        	 System.out.println("trying to login");
         }
         @Test(priority=0,groups={"second"})
         public void bookticket() {
        	 System.out.println("trying to book the ticket");
         }
         @Test(priority=1,groups={"first","second"})
         public void waiting() {
        	 System.out.println("ticket is in waiting list");
         }
         @Test(groups="third")
         public void confirm() {
        	 System.out.println("ticket confirmed");
         }
}
