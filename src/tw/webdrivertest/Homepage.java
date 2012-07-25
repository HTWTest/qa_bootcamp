package tw.webdrivertest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class Homepage {


	private static final String SEARCH_BOX = "fk-top-search-box";
	public WebDriver driver;
	
	public Homepage(WebDriver driver){
		this.driver=driver;
	}
	@Test
	public void search(String search){
		//WebElement element=driver.findElement(By.id(SEARCH_BOX));
		WebElement element=driver.findElement(By.id(SEARCH_BOX));
		element.sendKeys(search);
		element=driver.findElement(By.name("Search"));
		element.click();
	}

}
