package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;
import com.cengage.webassign.BaseUtils.TestSessionInitiator;

public class MyAssignmentPage extends TestSessionInitiator{
	
	private By assignmentLink = By.cssSelector("[data-analytics*='student-assignment-link']");
	private By myAssignmentPageTitle = By.cssSelector("#webAssignMain h1");
	
	public String verifyMyAssignmentPage() {
		return findElement(myAssignmentPageTitle).getText();
	}
	
	public void clickAssignmentLink() {
		waitForElementEnable(assignmentLink, 60).click();
	}

}
