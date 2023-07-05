package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSheetAuto {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myFile = new FileInputStream("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\DataSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int rowCount = mySheet.getLastRowNum();
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		System.out.println("RowCount is "+rowCount);
		System.out.println("Cell Count is "+lastCellNum);
		
		int totalRowNum = rowCount;
		int totalCellNum = lastCellNum-1;
		
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<=totalCellNum;j++) {
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
