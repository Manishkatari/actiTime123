package com.actitime.ganarics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibClass {
	
	public String getPropertys(String key) throws IOException {
		FileInputStream file = new FileInputStream("./TestDataFolder/TestData.propartes");
		Properties p=new Properties();
		p.load(file);
		String data = p.getProperty(key);
		return data;	
	 }
	 
	public String getExclPropertys(String sheet1,int row,int cell) throws IOException {
		FileInputStream file=new FileInputStream("./TestDataFolder/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	    String exaldata = wb.getSheet(sheet1).getRow(row).getCell(cell).getStringCellValue();
	    return exaldata; 
	 }

	public void setExclPropertys(String sheet1,int row,int cell,String result) throws EncryptedDocumentException, IOException  {
		FileInputStream file=new FileInputStream("./TestDataFolder/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	     wb.getSheet(sheet1).getRow(row).getCell(cell).setCellValue(result);
	    FileOutputStream files=new FileOutputStream("./TestDataFolder/TestScript.xlsx");
	    wb.write(files);
	    wb.close();
	 }

	

}
