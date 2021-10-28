package page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CheckInsPage extends BaseClass{

	public CheckInsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//span[.='Home']")
	private WebElement btnHome;
	
	@FindBy(xpath = "//span[.='Soal C']")
	private WebElement btnBack;
	
	@FindBy(css = ".CheckInPage_headerSection__1HLmL h1")
	private WebElement checkInsHeader;
	
	@FindBy(css = "div.MainLayout_MainLayout__1OYFQ.container div.row div.MainLayout_mainCol__1bT_B.col-md-10:nth-child(2) div.Paper_Paper__27gPv div.CheckInPage_headerSection__1HLmL div:nth-child(2) > button.btn.btn-primary.btn-sm")
	private WebElement btnCreateCheckIns;
	
	@FindBy(css = ".infinite-scroll-component > div:nth-of-type(1) h1")
	private WebElement newQuestion;
	
	@FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[@class='Question_mainContainer__XHyYZ']/div[.='Asking 1 people every Mon Thu  at 09:00 AM Test']")
	private WebElement checkIns;
	
	@FindBy(id = "notistack-snackbar")
	private WebElement succesInfo;
	
	public void clickBtnCreateCheckIns() {
		btnCreateCheckIns.sendKeys(Keys.ENTER);
	}
	
	public void clickCheckIns() {
		checkIns.click();
	}
	
	public void clickHome() {
		btnHome.click();
	}
	
	public void clickBackBoard() {
		btnBack.click();
	}
	
	public String getnewQuestion() {
		return newQuestion.getText();
	}
	
	public String getNotif() {
		return succesInfo.getText();
	}
	
	public boolean verifyElementCheckIns() {
		checkInsHeader.isDisplayed();
		return true;
	}

}
