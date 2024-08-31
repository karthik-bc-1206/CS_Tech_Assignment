package objectRepository;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import genericUtilityOrLib.BaseClass;

/**
 * 
 * @author Karthik BC
 *
 */
public class ScreenshotOpClass {

	public void getScreenshot() throws Exception {

		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
		String date = sdf.format(d);
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\" + date + ".png");
		Files.copy(src, dest);
	}

}
