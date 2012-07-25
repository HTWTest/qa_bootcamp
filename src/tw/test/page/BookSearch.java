package tw.test.page;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import tw.test.page.*;
import tw.test1.BaseTest;

public class BookSearch extends BaseTest {

	
	@Test
	public void verifyTheSearchResultTitle() {
		String searchString = "Casino Royale";
		pageHeader.search( searchString);
		String searchTitle = resultPage.getSearchResultTitle();
		Assert.assertTrue(searchTitle.contains(searchString));
	}
	
	@Test
	public void verifyLandingToBooksPageFromSearch(){
		String searchString = "Casino Royale";
		pageHeader.search( searchString);
		resultPage.navigateToBooksResults();
		Assert.assertTrue(resultPage.getIsBooksHomeTitleIsDiaplayed());	
	}

}
