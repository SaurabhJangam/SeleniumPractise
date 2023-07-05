package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelExample2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//create object of FileInputStream class
		FileInputStream myFile = new FileInputStream("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\DataSheet.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		Row row = mySheet.getRow(0);
		Cell myCell = row.getCell(1);
		CellType myCellType = myCell.getCellType();
		System.out.println("Data Type Is "+ myCellType);
		
	}

}
