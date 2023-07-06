package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	By osettings=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[1]");
	By oemail=By.xpath("//*[@id=\"CustomerEmail\"]");
	By opass=By.xpath("//*[@id=\"CustomerPassword\"]");
	By osigin=By.xpath("//*[@id=\"customer_login\"]/div/input");
	By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
	By oproduct=By.xpath("//*[@id=\"shopify-section-featured-collections\"]/div/ul/li[6]/div/a");
	By oselect=By.xpath("//*[@id=\"SingleOptionSelector-0\"]");
	By oaddtocart=By.xpath("//*[@id=\"product_form_6551701225570\"]/div[3]/button");
	By q=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/table/tbody/tr[1]/td[4]/div");
	By oquantity=By.xpath("//*[@id=\"updates_large_39296762511458:0e845284cdb35fbfc9e256ce1c1a272e\"]");
	By ocheckout=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/div/div/div/div[3]/input[2]");
	By oreturn=By.xpath("//*[@id=\"Form0\"]/div[1]/div/div[2]/div[2]/div[2]/a");
	By osearch=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/button[1]");
	By osearching=By.xpath("//*[@id=\"SearchDrawer\"]/div/div[1]/form/input");
	By oglove=By.xpath("//*[@id=\"MainContent\"]/ul[1]/li[8]/div/a");
	By ogloves=By.xpath("//*[@id=\"ProductSection-product-template\"]/div/div[1]/div[3]/ul/li[2]/a/img");
	By obike=By.xpath("//*[@id=\"SiteNav\"]/li[3]/button/span");
	By obikemaintain=By.xpath("//*[@id=\"SiteNavLabel-bike-accessories\"]/ul/li[6]/a/span");
	By osortby=By.xpath("//*[@id=\"SortBy\"]");
	By ospray=By.xpath("//*[@id=\"Collection\"]/ul/li[10]/div/a");
	By oadd=By.xpath("//*[@id=\"product_form_3802788593716\"]/div[2]/button");
	By oremove=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/table/tbody/tr[1]/td[2]/p/a");
	By oswipe=By.xpath("//*[@id=\"SlideshowWrapper-slideshow\"]/div[2]/div/button[2]");
	By ologout=By.xpath("//*[@id=\"customer_logout_link\"]");
public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
public void sign()
{
	driver.findElement(osettings).click();
	
}

public void setvalues(String email, String pass)
{
	driver.findElement(oemail).sendKeys(email);
	driver.findElement(opass).sendKeys(pass);
}
public void clickbtn()
{
	driver.findElement(osigin).click();
}
public void home()
{
	driver.findElement(ohome).click();;
}
public void product()
{
	WebElement element=driver.findElement(oproduct);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	element.click();
}
public void selectitm()
{
	WebElement bb=driver.findElement(oselect);
	Select s= new Select(bb);
	s.selectByIndex(12);
}
public void addtocart()
{
	driver.findElement(oaddtocart).click();
}
public void quantity(String s)
{
	Actions act=new Actions(driver);
	WebElement f=driver.findElement(q);
	act.moveToElement(f).perform();
	f.click();
	WebElement e=driver.findElement(oquantity);
	e.clear();
	e.sendKeys(s);
}
public void checkout()
{
	driver.findElement(ocheckout).click();
}
public void returntocart()
{
	driver.findElement(oreturn).click();
}
public void search()
{
 driver.findElement(osearch).click();}
public void search1()
{
WebElement f=driver.findElement(osearching);
f.sendKeys("gloves");
f.sendKeys(Keys.RETURN);
}
public void glove()
{
	WebElement g=driver.findElement(oglove);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", g);
	g.click();
	
}
public void swipe()
{
	WebElement e=driver.findElement(ogloves);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e);
	e.click();
}
public void back()
{
	driver.navigate().back();
	WebElement h=driver.findElement(ohome);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", h);
	h.click();
	
}
public void bikeacc()
{
	driver.findElement(obike).click();
}
public void bikemantain()
{
	driver.findElement(obikemaintain).click();
}
public void sortby()
{
	WebElement r=driver.findElement(osortby);
	Select l=new Select(r);
	l.selectByIndex(4);
}
public void spray()
{
	WebElement j=driver.findElement(ospray);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", j);
	j.click();
	
}
public void add()
{
	driver.findElement(oadd).click();
}
public void remove()
{
	driver.findElement(oremove).click();
}
public void swipee()
{
	driver.findElement(oswipe).click();
}
public void logout()
{
	driver.findElement(ologout).click();
}

}
