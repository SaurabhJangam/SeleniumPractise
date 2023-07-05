package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelExample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//create object of FileInputStream class
		FileInputStream myFile = new FileInputStream("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\DataSheet.xlsx");
		
		
//		String Value
		String svalue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(svalue);
		
		
//		Numeric Value 
//		double numValue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(3).getNumericCellValue();
//		System.out.println(numValue);
		
//		Boolean Value
//		boolean boolValue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(4).getBooleanCellValue();
//		System.out.println(boolValue);

	}

}
