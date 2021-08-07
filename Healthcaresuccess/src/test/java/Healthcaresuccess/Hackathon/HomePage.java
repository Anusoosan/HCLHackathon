package Healthcaresuccess.Hackathon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;

public class HomePage extends base {



	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
			driver = initializeDriver();
			driver.get("https://healthcaresuccess.com/");
			driver.manage().window().maximize();
			HomePage.screenShot(driver, "Homepage");

	}


		@Test
		public void selectMenu() throws IOException {
			LandingPage menu = new LandingPage(driver);
			Actions action = new Actions(driver);
			action.moveToElement(menu.hoverServicemenu()).perform();
			menu.clickBrandingMenu().click();
			driver.getTitle();
			

		}

	@AfterTest
	public void quitDriver() {
		driver.quit();
		}

	public static void screenShot(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("/Users/johnsgeorge/Downloads/" + name + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
