package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;

import com.cengage.webassign.BaseUtils.TestSessionInitiator;

public class AssignmentPage extends TestSessionInitiator{
	private By assignmentTitle = By.cssSelector("#js-assignment-header h1");
	
	
	public boolean verifyAssignmentTitleDisplayed() {
		return waitForElementVisibility(assignmentTitle, 60).isDisplayed();
	}

}
