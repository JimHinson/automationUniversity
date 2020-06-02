package com.cengage.webassign.BaseUtils;
import com.cengage.webassign.framework.core.WebAssignException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import com.cengage.webassign.framework.core.ChromeWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory  {
	protected WebDriverFactory(){
}

	public static WebDriver composeWebDriver(String browser, String properties, int implicitWait) throws WebAssignException {
		WebDriver webDriver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments(properties);
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver(options);
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
//		return driver;
//		WebDriver webDriver = null;
//			ChromeWebDriver chromeWebDriver = new ChromeWebDriver();
//			webDriver = chromeWebDriver.compose(properties, implicitWait);
		return webDriver;
	}
}