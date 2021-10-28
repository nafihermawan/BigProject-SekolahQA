package page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class QuestionPage extends BaseClass {

	public QuestionPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/input[1]")
	private WebElement btnAddNewComment;

	@FindBy(xpath = "//div[@class='fr-element fr-view']")
	private WebElement txtInputComment;
	
	@FindBy(css = ".infinite-scroll-component div:nth-of-type(3) .CommentItem_commentTextContainer__8Gd1V p")
	private WebElement textNewComment;
	//	xpath = "//p[.='a']"
	
	@FindBy(css = ".infinite-scroll-component > div:nth-of-type(1) h1")
	private WebElement newComment;
	
	@FindBy(id = "notistack-snackbar")
	private WebElement succesInfo;

	public void clickBtnNewComment() {
		btnAddNewComment.click();
	}
	
	public void inputComment(String comment) {
		txtInputComment.sendKeys(comment);
		txtInputComment.sendKeys(Keys.CONTROL, Keys.ENTER);
	}
	
	public String getNewCommentTxt() {
		return textNewComment.getText();
	}
	
	public String getNewQuestion() {
		return newComment.getText();
	}
	
	public String getNotif() {
		return succesInfo.getText();
	}
}
