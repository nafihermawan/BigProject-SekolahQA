package page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CheckInCreatePage extends BaseClass{

	public CheckInCreatePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//span[.='Home']")
	private WebElement btnHome;
	
	@FindBy(xpath = "//span[.='Soal C']")
	private WebElement btnBackGroup;
	
	@FindBy(xpath = "//span[.='Check-Ins']")
	private WebElement btnBackCheckIns;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement txtQuestion;
	
	@FindBy(xpath = "//div[.='Mon']")
	private WebElement btnMon;
	
	@FindBy(xpath = "//div[.='Tue']")
	private WebElement btnTue;
	
	@FindBy(xpath = "//div[.='Wed']")
	private WebElement btnWed;
	
	@FindBy(xpath = "//div[.='Thu']")
	private WebElement btnThu;
	
	@FindBy(xpath = "//div[.='Fri']")
	private WebElement btnFri;
	
	@FindBy(xpath = "//div[.='Sat']")
	private WebElement btnSat;
	
	@FindBy(xpath = "//div[.='Sun']")
	private WebElement btnSun;
	
	@FindBy(css = ".CreateQuestionPage_plusButton__1v-rb > .MuiSvgIcon-root")
	private WebElement addAsk;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	private WebElement btnCollectingAnswer;
	
	@FindBy(xpath = "//div[.='Cancel']")
	private WebElement btnCancel;
	
	public void inputQuestion(String question) {
		txtQuestion.sendKeys(question);
	}
	
	public void setMon() {
		btnMon.click();	
	}
	
	public void setTue() {
		btnTue.click();	
	}
	
	public void setWed() {
		btnWed.click();	
	}
	
	public void setThu() {
		btnThu.click();	
	}
	
	public void setFri() {
		btnFri.click();	
	}
	
	public void setSat() {
		btnSat.click();	
	}
	
	public void setSun() {
		btnSun.click();	
	}
	
	public void clickBtnStartCollecting() {
		btnCollectingAnswer.sendKeys(Keys.ENTER);
	}
}
