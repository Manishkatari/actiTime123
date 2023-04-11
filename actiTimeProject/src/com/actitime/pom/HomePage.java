package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="logoutLink")
	private WebElement loBtn;
	
	@FindBy(id="container_tasks")
	private WebElement tasksBtn;
	

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	public void setLoutBtn() {
		loBtn.click();
	}


	public void setTasksBtn() {
		tasksBtn.click();
	}
	


}
