package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeRowAndColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream myFile = new FileInputStream("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\DataSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
//		ṛead whole row
		for(int i=0;i<3;i++) {
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
			
		}
		
		
//		ṛead whole Column
		for(int i=0;i<5;i++) {
			String value = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
		}
	}

}
