package tw.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHeader {
	public WebDriver webDriver;
//	private static final String SEARCH_BUTTON = "fk-main-search-btn";
	private static final String SEARCH_BOX = "fk-top-search-box";

	@FindBy(id="fk-main-search-btn")
	public WebElement searchButton;
	
	public PageHeader(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void search(String searchString) {
		webDriver.findElement(By.id(SEARCH_BOX)).clear();
		webDriver.findElement(By.id(SEARCH_BOX)).sendKeys(searchString);
		searchButton.click();
	}

	public int getCartCount() {
		return Integer.parseInt(webDriver.findElement(By.id("item_count_in_cart_top_displayed")).getText().trim());
	}
}