package tw.test1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tw.test.page.BookSearch;
import tw.test.page.CartTest;

@RunWith(Suite.class)
@SuiteClasses({ BookSearch.class, CartTest.class })
public class AllTests {

}
