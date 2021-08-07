package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	public WebDriver driver;

	By serviceMenu = By.xpath("//span[contains(text(),'Services')]");
	By serviceBrandingMenu = By.xpath("//span[contains(text(),'Branding')]");

	// span[normalize-space()='Branding']
	// span[contains(text(),'Branding')]

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement hoverServicemenu() {
		return driver.findElement(serviceMenu);
	}

	public WebElement clickBrandingMenu() {
		return driver.findElement(serviceBrandingMenu);
	}


}
