package com.cengage.webassign.BaseUtils;

// import java.util.concurrent.TimeUnit;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.firefox.FirefoxDriver;

// import com.cengage.webassign.Utils.PropfileReader;

// import io.github.bonigarcia.wdm.WebDriverManager;

	
	// private final int implicitWait = 60;
public class TestSessionInitiator {
	protected void launchBrowser() {
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
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
	}

	protected void launchUrl(String url) {
		// driver.get(url);
	}
	
	protected String getCurrentPageUrl() {
		// return driver.getCurrentUrl();
		return "";
	}
	
	protected void closeCurrentBrowser() {
		// driver.quit();
	}
}
