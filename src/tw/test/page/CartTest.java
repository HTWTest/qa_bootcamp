package tw.test.page;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import tw.test.page.*;
import tw.test1.BaseTest;

public class CartTest extends BaseTest {
	@Test
	public void verifyIsCartGetsUpdatesWithProductAddtion(){
		pageHeader.search("Casino Royale");
		resultPage.navigateToBooksResults();
		resultPage.selectBook("James Bond: Casino Royale");
		resultPage.addItemToCart();
		Assert.assertEquals(1, pageHeader.getCartCount());
	}

}
