package com.cengage.webassign.BaseUtils;
import com.cengage.webassign.framework.core.WebAssignException;
import org.openqa.selenium.WebDriver;
import com.cengage.webassign.framework.core.ChromeWebDriver;

public class WebDriverFactory  {
	protected WebDriverFactory(){
}

	public static WebDriver composeWebDriver(String browser, String properties, int implicitWait) throws WebAssignException {
		WebDriver webDriver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeWebDriver chromeWebDriver = new ChromeWebDriver();
			webDriver = chromeWebDriver.compose(properties, implicitWait);
		}
		return webDriver;
	}
}