package tc_Repositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ScreenshotCaptureUtility;
import genericUtilityOrLib.SeleniumUtility;
import objectRepository.BulkImportPage;
import objectRepository.HomePage;
import objectRepository.RobotClass;

/**
 * 
 * @author Karthik BC
 *
 */
public class Assignment extends BaseClass {

	@Test
	public void ass() throws Exception {

		SeleniumUtility sutil = new SeleniumUtility();
		HomePage hp = new HomePage(driver);
		hp.clickonOrderDash();
		hp.clickonOrder();
		hp.clickonAddBulkOrders();
		BulkImportPage bp = new BulkImportPage(driver);
		bp.clickonChooseFile();
		bp.clickonImportFile();
		bp.clickonValidateData();
		Thread.sleep(2500);
		sutil.acceptAlert(driver);
		RobotClass rc = new RobotClass();
		rc.getZoomOut();
		Thread.sleep(3000);
		ScreenshotCaptureUtility.captureScreenshot(driver, "SS1");
		WebElement ele = driver.findElement(By.xpath("(//td[contains(@class, 'MuiTableCell')])[34]"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		Thread.sleep(3000);
		ScreenshotCaptureUtility.captureScreenshot(driver, "SS2");
		Thread.sleep(3000);

	}
}
