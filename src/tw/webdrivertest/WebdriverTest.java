package tw.webdrivertest;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;

public class WebdriverTest {
	static WebDriver driver=null;
	Homepage hp=new Homepage(driver);
	private static final String url = "http://www.flipkart.com/";
	@BeforeClass
	public static void init() throws Exception{
		driver=new FirefoxDriver(new ProfilesIni().getProfile("default"));
		driver.get(url);
		if (driver==null){
			driver = new FirefoxDriver();
			driver.get(url);
		}
		//PageFactory.initElements(driver, "HomePage");
	}


	@Test
	public void test() throws Exception {
		hp.search("Casino");   
	//	Assert.assertTrue(driver.findElement(By.id("allresults_info")).getText().contains("casino"));
	}


	@Test 
	public void verify()throws Exception{
	
		driver.findElement(By.partialLinkText("Books")).click();
	}
	
	@Test
	public void adcart()throws Exception{
		driver.findElement(By.partialLinkText("Casino")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath(".//*[@id='mprod-buy-btn']/a")).click();
	//	driver.findElement(By.class("Close and Continue Shopping")).click();	
		
	}

}
