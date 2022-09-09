package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
//method to take screenshot when test case fail
	public static void  caputreScreenshot (WebDriver driver , String ScreenshotName ) {
		
	Path destination =Paths.get("./ScreenShots",ScreenshotName+".png");	 
		try {
			Files.createDirectories(destination.getParent());
			FileOutputStream out = new FileOutputStream(destination.toString());
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close(); 
		} catch (IOException e) {
			
			System.out.print("Exception while taking S.S  :"+e.getMessage());
		}
	}
}
