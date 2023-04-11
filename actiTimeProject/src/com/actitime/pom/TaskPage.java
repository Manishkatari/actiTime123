package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
   //New Customer popup
	
   @FindBy(xpath="//div[text()='Add New']")
   private  WebElement  addnew;
   
   @FindBy(xpath="//div[text()='+ New Customer']")
   private  WebElement   newcustomer ;
   
   @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
   private  WebElement  customername;
   
   @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
   private  WebElement  custamerdescription;
   
   @FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
   private  WebElement  selectcustomer;
   
   @FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
   private  WebElement  ourcompany;
   
   
   @FindBy(xpath="//div[text()='Create Customer']")
   private  WebElement  createCustomer;
 
   
   @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
    	
   
   //New Project Popup
   
   @FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement createNewProject;
   
  
   @FindBy(xpath="//div[@class='sectionDetails']/input")
    private WebElement enterProjectName;
   
   
   @FindBy(xpath="//div[@class='emptySelection']")
   private WebElement custamer;
   
   
   @FindBy(xpath="(//div[text()='Our company' and @class='itemRow cpItemRow '])[2]")
   private WebElement ourcompanyinproject;
   
   @FindBy(xpath="//div[@class='projectDescriptionField' ]/div[2]/div[1]/div[1]/textarea")
   private WebElement projectdescription;
   
   
   @FindBy(xpath="//div[.='Create Project']")
   private WebElement createProject;
   
   @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
   private WebElement projectname;

   
   
	public TaskPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getAddnew() {
		return addnew;
	}



	public WebElement getNewcustomer() {
		return newcustomer;
	}



	public WebElement getCustomername() {
		return customername;
	}



	public WebElement getCustamerdescription() {
		return custamerdescription;
	}



	public WebElement getSelectcustomer() {
		return selectcustomer;
	}



	public WebElement getOurcompany() {
		return ourcompany;
	}



	public WebElement getCreateCustomer() {
		return createCustomer;
	}



	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}



	public WebElement getCreateNewProject() {
		return createNewProject;
	}



	public WebElement getEnterProjectName() {
		return enterProjectName;
	}



	public WebElement getCustamer() {
		return custamer;
	}



	public WebElement getprojectdescription() {
		return projectdescription;
	}



	public WebElement getOurcompanyinproject() {
		return ourcompanyinproject;
	}

	public WebElement getCreateProject() {
		return createProject;
	}

	public WebElement getprojectname() {
		return createProject;
	}


	
	
}
