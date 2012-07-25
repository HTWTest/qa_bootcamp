 package tw.test1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import tw.test.page.PageHeader;
import tw.test.page.ResultsPage;


public class BaseTest {

	private static final String URL = "http://flipkart.com";
	public WebDriver webDriver;
	protected PageHeader pageHeader;
	protected ResultsPage resultPage;

	@After
	public void closeApp() {
		webDriver.close();
	}

	@Before
	public void launchApp() {
		if(webDriver==null)
		webDriver = new FirefoxDriver();
		webDriver.get(URL);
		pageHeader =  new PageHeader(webDriver);
		PageFactory.initElements(webDriver, pageHeader);
		
		resultPage = new ResultsPage(webDriver);
		
	}

}
