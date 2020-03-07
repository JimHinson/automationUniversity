package com.cengage.webassign.framework.core;

import com.cengage.webassign.BaseUtils.*;
import com.cengage.webassign.Utils.*;
import java.util.concurrent.TimeUnit;
// import com.cengage.
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.cengage.webassign.framework.core.*;

public class FirefoxWebDriver extends WebDriverFactory {

  public WebDriver compose(String properties, int implicitWait) throws WebAssignException {

    WebDriver driver;
    // driver = WebDriverManager.chromedriver()
    ChromeOptions options = new ChromeOptions();
    options.addArguments(properties);
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
		// String browser = PropfileReader.getSetting("Browser");
		// if (browser.equalsIgnoreCase("chrome")) {
		// 	ChromeOptions options = new ChromeOptions();
		// 	options.addArguments("--disable-logging");
		// 	WebDriverManager.chromedriver().setup();
		// 	driver = new ChromeDriver(options);
		// } else if (browser.equalsIgnoreCase("firefox")) {
		// 	WebDriverManager.firefoxdriver().setup();
		// 	driver = new FirefoxDriver();
		// }
		driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    return driver;

  }
}
    
