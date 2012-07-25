package tw.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
	
	private static final String BOOKS_RESULTS_TITLE = "Books Home";
	private static final String BOOKS_RESULTS_LINK = "Books";
	private static final String RESULTS_TITLE = "allresults_info";
	private WebDriver webDriver;

	public ResultsPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	String getSearchResultTitle() {
		return webDriver.findElement(By.id(RESULTS_TITLE)).getText();
	}
	
	void navigateToBooksResults() {
		webDriver.findElement(By.partialLinkText(BOOKS_RESULTS_LINK)).click();
	}
	
	public boolean getIsBooksHomeTitleIsDiaplayed() {
		return webDriver.findElement(By.linkText(BOOKS_RESULTS_TITLE)).isDisplayed();
	}

	public void selectBook(String bookName) {
		webDriver.findElement(By.linkText(bookName)).click();
	}

	public void addItemToCart() {
		webDriver.findElement(By.id("mprod-buy-btn")).click();
	}

}
