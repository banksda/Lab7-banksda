import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class Task7 extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.rose-hulman.edu/");
		selenium.start();
	}

	@Test
	public void testTask7() throws Exception {
		selenium.open("/");
		selenium.click("link=Current Students");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[@id='gateway-content']/div/table/tbody/tr/td[2]/a[5]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[@id='mainReg']/div[1]/ul/li[2]/ul/li[6]/a/span");
		selenium.waitForPageToLoad("30000");
		selenium.click("//a[contains(text(),'Check\nyour schedule')]");
		selenium.waitForPageToLoad("30000");
		selenium.type("id1", "banksda");
		selenium.click("bt1");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CSSE376-01"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
