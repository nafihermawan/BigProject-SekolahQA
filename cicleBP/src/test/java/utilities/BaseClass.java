package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver webDriver;

	public BaseClass(WebDriver webDriver) {
		BaseClass.webDriver = webDriver;
	}
	
	public void click(WebElement webElement) {
		webElement.click();
	}
	
	public void input(WebElement webElement) {
		webElement.clear();
		webElement.sendKeys();
	}
	
	public void selectValue(WebElement webElement, String value) {
		Select select = new Select(webElement);
		select.selectByValue(value);
	}
	
	public void hover() {
		Actions action = new Actions(webDriver);
		action.moveToElement(null).perform();
	}

}
