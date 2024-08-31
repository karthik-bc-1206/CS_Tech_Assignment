package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ScreenshotCaptureUtility;
import genericUtilityOrLib.SeleniumUtility;
import objectRepository.HomePage;

/**
 * 
 * @author Karthik BC
 *
 */
public class Assignment1 extends BaseClass {

	@Test
	public void ass1() throws Exception {
		SeleniumUtility SUTIL = new SeleniumUtility();
		HomePage hp = new HomePage(driver);
		hp.getUrl1();
		ScreenshotCaptureUtility.captureScreenshot(driver, "url1");
		SUTIL.navigateBack(driver);
		hp.getUrl2();
		ScreenshotCaptureUtility.captureScreenshot(driver, "url2");
		SUTIL.navigateBack(driver);
		hp.getUrl3();
		ScreenshotCaptureUtility.captureScreenshot(driver, "url3");
		SUTIL.navigateBack(driver);
		hp.getUrl4();
		ScreenshotCaptureUtility.captureScreenshot(driver, "url4");
		SUTIL.navigateBack(driver);
		hp.getUrl5();
		ScreenshotCaptureUtility.captureScreenshot(driver, "url5");
		SUTIL.navigateBack(driver);
	}
	
}
