package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cengage.webassign.framework.core.BasePageFactory;


public class AssignmentPage extends BasePageFactory {
	private By assignmentTitle = By.cssSelector("#js-assignment-header h1");

	public AssignmentPage(WebDriver driver) {
		super(driver);	
	}
	
	
	public boolean verifyAssignmentTitleDisplayed() {
		return waitForElementVisibility(assignmentTitle, 60).isDisplayed();
	}

}
