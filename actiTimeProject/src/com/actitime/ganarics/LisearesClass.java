package com.actitime.ganarics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisearesClass  extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		TakesScreenshot sh=(TakesScreenshot)driver;
		File scr=sh.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreeanShort/"+res+".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
	
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
