package com.cengage.webassign.BaseUtils;
import com.cengage.webassign.framework.core.WebAssignException;

import org.openqa.selenium.WebDriver;


public abstract class WebDriverFactory {
	// protected 
	// protected abstract WebDriverFactory init();

	public abstract WebDriver compose(String options, int implicitWait) throws WebAssignException;

	protected WebDriverFactory() {
		// return new WebDriver
		// init();
	}

}
