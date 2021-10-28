package page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//h1[.='Soal C']")
	private WebElement cardGroupC;
	
	@FindBy(xpath = "//button[@class='dropdown-toggle dropdown-toggle-split btn btn-dark btn-sm']")
	private WebElement btnCompanySetting;
	
	@FindBy(css = ".DashboardPage_leftCol__addCompany__2juoZ")
	private WebElement btnAddCompany;
	
	@FindBy(xpath = "//div[contains(@Class,'UserProfile_menu')]/div/p")
	private WebElement userProfilName;
	
	@FindBy(xpath = "//div[@class='NavHeader_navMemberSection__ApwJH']//img[@src='https://lh3.googleusercontent.com/a-/AOh14GhM9m0S176XX-aOLrdcU88FWwZR0zg0XXRzNLOX8g=s96-c']")
	private WebElement profile;
	
	@FindBy(xpath = "//h1[.='Soal C']")
	private WebElement teamsName;
	
	@FindBy(xpath = "//h1[.='SQA']")
	private WebElement companyName;
	
	@FindBy(xpath = "//div[@class='NavHeader_navIconSection__2A2RJ']/div[.='1']")
	private WebElement notif;
	
	@FindBy(xpath = "//button[@class='btn btn-light btn-block']")
	private WebElement viewAllNotif;
	
	public void clickGroupC() {
		cardGroupC.click();
	}
	public void clickCompanySetting() {
		btnCompanySetting.click();
	}
	
	public void clickProfile() {
		profile.click();
	}
	
	public void clickNotif() {
		notif.click();
	}
	
	public void clickViewAllNotif() {
		viewAllNotif.click();
	}
	
	public String getProfileName() {
		return userProfilName.getText();
	}
	
	public String getTeamsName() {
		return teamsName.getText();
	}
	
	public String getCompanyName() {
		return companyName.getText();
	}
	
}
