package misctopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class commonMethods {

	public static void implicitWait(WebDriver driver,long waitTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}

	
	public static void captureScreenshot(WebDriver driver,String scName ) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\screenShots\\myScreenShot_"+scName+".png");
        FileHandler.copy(source, dest);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
	}
	
	public static String raedExcelData(int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream myFile= new FileInputStream("D:\\SAURABH\\Software Testing\\Automation notes\\Selenium\\DatFile.xlsx");
		String svalue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(rowNum).getCell(colNum).getStringCellValue();
		return svalue;
	}

}
