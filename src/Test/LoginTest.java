package Test;

import org.testng.annotations.Test;

import Page.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void testing() throws InterruptedException
	{
		LoginPage ob=new LoginPage(driver);
		Thread.sleep(4000);
		ob.sign();
		Thread.sleep(4000);
		ob.setvalues("arjunpsalim22@gmail.com", "Arjunsalim@1234");
		Thread.sleep(4000);
		ob.clickbtn();
		Thread.sleep(4000);
		ob.home();
		Thread.sleep(4000);
		ob.product();
		Thread.sleep(4000);
		ob.selectitm();
		Thread.sleep(4000);
		ob.addtocart();
		Thread.sleep(3000);
		ob.quantity("11");
		Thread.sleep(4000);
		ob.checkout();
		Thread.sleep(4000);
		ob.returntocart();
		Thread.sleep(4000);
		ob.search();
		Thread.sleep(4000);
		ob.search1();
		Thread.sleep(4000);
		ob.glove();
		Thread.sleep(4000);
		ob.swipe();
		Thread.sleep(4000);
		ob.back();
		Thread.sleep(4000);
		ob.bikeacc();
		Thread.sleep(4000);
		ob.bikemantain();
		Thread.sleep(4000);
		ob.sortby();
		Thread.sleep(4000);
		ob.spray();
		Thread.sleep(4000);
		ob.add();
		Thread.sleep(4000);
		ob.remove();
		Thread.sleep(4000);
		ob.home();
		Thread.sleep(4000);
		ob.swipee();
		Thread.sleep(4000);
		ob.sign();
		Thread.sleep(4000);
		ob.logout();
		
		
		
		
	}
	
	

}
