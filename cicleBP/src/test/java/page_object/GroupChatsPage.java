package page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class GroupChatsPage extends BaseClass {

	public GroupChatsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//h1[.='Group Chat - Soal C']")
	private WebElement heading;
	
	@FindBy(xpath = "//span[.='Home']")
	private WebElement btnHome;
	
	@FindBy(xpath = "//span[.='Soal C']")
	private WebElement btnBackToDashBoard;
	
	@FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
	private WebElement txtChatBox;

	@FindBy(css = ".ChatButton_container__3Ua3q > .MuiSvgIcon-root")
	private WebElement btnSend;

	@FindBy(xpath = "//input[1]")
	private WebElement btnAttachFile;
	
	@FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[4]//i[.='This message was deleted']")
	private WebElement msgDeleted;
	
	@FindBy(css = ".infinite-scroll-component > div:nth-of-type(1) .Message_contentMessage__2NnUS p")
	private WebElement chatText;

	public void inputTxt(String text) {
		txtChatBox.sendKeys(text);
		txtChatBox.sendKeys(Keys.CONTROL, Keys.ENTER);
	}

	public void clickAttach() {
		btnAttachFile.sendKeys(Keys.ENTER);
	}

	public void clickSend() {
		btnSend.click();
	}
	
	public void clickHome() {
		btnHome.click();
	}
	
	public String getHeadName() {
		return heading.getText();
	}
	
	public String getChatText() {
		return chatText.getText();
	}

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
