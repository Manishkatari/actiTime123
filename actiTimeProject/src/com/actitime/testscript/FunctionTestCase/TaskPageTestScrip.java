package com.actitime.testscript.FunctionTestCase;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.ganarics.BaseClass;
import com.actitime.ganarics.FileLibClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;

@Listeners(com.actitime.ganarics.LisearesClass.class)
public class TaskPageTestScrip extends BaseClass {

  @Test 
   public void testCereatcustermar() throws IOException, InterruptedException {
	  HomePage h=new HomePage(driver);
	  h.setTasksBtn();
	  TaskPage t=new TaskPage(driver);
	  t.getAddnew().click();
	  t.getNewcustomer().click();
	  FileLibClass f=new FileLibClass();
	  String cuname = f.getExclPropertys("CreateCustomer", 1, 3);
	  String cudes = f.getExclPropertys("CreateCustomer", 1, 4);
	  t.getCustomername().sendKeys(cuname);
	  t.getCustamerdescription().sendKeys(cudes);
	  t.getSelectcustomer().click();
	  t.getOurcompany().click();
	  t.getCreateCustomer().click();
//	  WebDriverWait w=new WebDriverWait(driver,10);
//	  w.until(ExpectedCondestionVisibilityOfElementLocated(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")));
	  Thread.sleep(2000);
	  String actualcu = t.getActualCustomerCreated().getText();
	  Assert.assertEquals(cuname, actualcu);  
    }
  @Test
  public void  testCreatProject() throws InterruptedException {
	  HomePage h=new HomePage(driver);
	  h.setTasksBtn();
	  TaskPage t=new TaskPage(driver);
	  t.getAddnew().click();
	  t.getCreateNewProject().click();
	  t.getEnterProjectName().sendKeys("manish");
	  t.getCustamer().click();
	//  t.getprojectdescription().sendKeys("manish");
	  t.getCreateProject().click();
	  Thread.sleep(2000);
	  String rprojname = t.getprojectname().getText();
	  Assert.assertEquals("manish",rprojname );
	
  }
  


	  
	
	
}
