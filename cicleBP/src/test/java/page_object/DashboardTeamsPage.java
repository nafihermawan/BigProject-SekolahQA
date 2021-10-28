package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardTeamsPage extends BaseClass {

	public DashboardTeamsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//h1[.='Soal C']")
	private WebElement teamsNameBoard;
	
	@FindBy(xpath = "//div[.='Group Chat']")
	private WebElement cardTitleGroupChat;
	
	@FindBy(xpath = "//div[.='Blast!']")
	private WebElement cardTitleBlast;
	
	@FindBy(xpath = "//div[.='Schedule']")
	private WebElement cardTitleSchedule;
	
	@FindBy(xpath = "//div[.='Board']")
	private WebElement cardTitleBoard;
	
	@FindBy(xpath = "//div[.='Check-Ins']")
	private WebElement cardTitleCheckIns;
	
	@FindBy(xpath = "//div[.='Docs & Files']")
	private WebElement cardTitleDocFile;

	@FindBy(xpath = "//span[.='Home']")
	private WebElement btnHome;

	@FindBy(xpath = "//div[@class='ShowLimitMembers_plusButton__8k3vj']")
	private WebElement btnAddMember;

	@FindBy(xpath = "//a[@href='/group-chats/615e9f94d3cd857df93ca51a']//div[@class='card-body']")
	private WebElement cardGroupChat;

	@FindBy(xpath = "//a[@href='/blasts/615e9f94d3cd855fa23ca51c']//div[@class='card-body']")
	private WebElement cardBlast;

	@FindBy(xpath = "//a[@href='/schedules/615e9f94d3cd851d5b3ca520']//div[@class='card-body']")
	private WebElement cardSchedule;

	@FindBy(xpath = "//div[.='Board']")
	private WebElement cardBoard;

	@FindBy(css = ".TeamPage_colBox__1rz7F:nth-child(5) .card-title")
	private WebElement cardCheckIns;

	@FindBy(xpath = "//a[@href='/boards/615e9f94d3cd8553573ca518']//div[@class='card-body']")
	private WebElement cardDocsAndFile;

//	@FindBy( = "")
//	private WebElement ;

	public void clickHome() {
		btnHome.click();
	}

	public void clickAddMember() {
		btnAddMember.click();
	}

	public void clickGoupChat() {
		cardGroupChat.click();
	}

	public void clickBlast() {
		cardBlast.click();
	}

	public void clickSchedule() {
		cardSchedule.click();
	}

	public void clickBoard() {
		cardBoard.click();
	}

	public void clickChekIns() {
		cardCheckIns.click();
	}
	
	public void click() {
		cardDocsAndFile.click();
	}
	
	public String getTeamsNameBoard() {
		return teamsNameBoard.getText();
	}
	
	public boolean verifyElementTeams() {
		cardTitleBlast.isDisplayed();
		cardTitleBoard.isDisplayed();
		cardTitleCheckIns.isDisplayed();
		cardTitleGroupChat.isDisplayed();
		cardTitleSchedule.isDisplayed();
		cardTitleDocFile.isDisplayed();
		return true;
	}
}
