package com.cengage.webassign.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cengage.webassign.framework.core.BasePageFactory;

public class MyAssignmentsPage extends BasePageFactory{
	private By assignmentLink = By.linkText("assignment with need help");
	private By myAssignmentPageTitle = By.cssSelector("#webAssignMain h1");

	public MyAssignmentsPage(WebDriver driver) {
		super(driver);
	}
	
	public String verifyMyAssignmentPage() {
		return findElement(myAssignmentPageTitle).getText();
	}
	
	public AssignmentPage clickAssignmentLink() {
		waitForElementEnable(assignmentLink, 60).click();
		return new AssignmentPage(driver);
	}
}