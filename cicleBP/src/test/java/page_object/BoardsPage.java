package page_object;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class BoardsPage extends BaseClass {

	public BoardsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//span[.='Home']")
	private WebElement btnHome;

	@FindBy(xpath = "//span[.='Soal C']")
	private WebElement btnGroup;

	@FindBy(css = ".Button_container__1WNuB")
	private WebElement btnAddList;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement txtListName;

	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnCreateList;

//	@FindBy(css = "[data-rbd-draggable-id='61610f0fb37d9a7d26e985dc'] .ListContainer_ListContainer__noMargin__uGZef h1")
//	private WebElement listName;

	@FindBy(id = "notistack-snackbar")
	private WebElement succesInfo;

	@FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[3]//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI']")
	private WebElement btnAddNewCard;

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement txtCardName;

	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnAddCard;

	@FindBy(css = "[data-rbd-draggable-id='617267255fe2ffe69c2ec727'] > div:nth-of-type(3)")
	private WebElement newCardName;

	@FindBy(xpath = "//a[@href='/cards/61610811b37d9a3fece97c61']")
	private WebElement card1;

	@FindBy(xpath = "//div[@class='ManageDesc_editIcon__1I0bY']")
	private WebElement btnAddNote;

	@FindBy(xpath = "//div[@class='fr-element fr-view']")
	private WebElement txtNote;

	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnSaveNote;

	@FindBy(css = ".ManageDesc_sectionDesc__3SwZN p")
	private WebElement newNote;

	@FindBy(xpath = "//div[@class='CardDetailContainer_box__3ALFs']/div[@class='CardDetailContainer_CardDetailContainer__mediumSectionContainer__SDDWa']/div[1]//div[.='Delete']")
	private WebElement btnDelete;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-block btn-sm']")
	private WebElement btnDeleteConfirm;

	@FindBy(xpath = "//input[@class='CreateCommentForm_formInitial__3AVVg form-control']")
	private WebElement btnInputComment;

	@FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
	private WebElement txtInputComment;

	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement btnSaveCommenet;

	@FindBy(css = "[data-rbd-draggable-id='616107e5b37d9acca4e97c4e'] .ListContainer_ListContainer__noMargin__uGZef h1")
	private WebElement listName;

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement txtEditListName;

	@FindBy(xpath = "//h1[.='New List Name']")
	private WebElement newListName;

	@FindBy(xpath = "//div[@class='Members_plusButton__26WlU']")
	private WebElement btnAddMember;

	@FindBy(xpath = "//p[.='Wira Putrawan Pakpahan']")
	private WebElement member1;

	@FindBy(css = ".ManageMembersContainer_ManageMembersContainer__Header__6nfM8 > .MuiSvgIcon-root")
	private WebElement closeMember;

	@FindBy(xpath = "//div[@class='ListContainer_ListContainer__noMargin__uGZef ListContainer_headerSection__1imwD row']")
	private List<WebElement> listNameNew;
	
	public String getListNameNew(int index) {
		return listNameNew.get(index).getText();
	}

	public void clickCard() {
		card1.click();
	}

	public void clickBtnAddNote() {
		btnAddNote.click();
	}

	public void inputNote(String note) {
		txtNote.sendKeys(note);
		txtNote.sendKeys(Keys.CONTROL, Keys.ENTER);
	}

	public void clickBtnSaveNote() {
		btnSaveNote.click();
	}

	public void clickHome() {
		btnHome.click();
	}

	public void clickGroup() {
		btnGroup.click();
	}

	public void clickAddlist() {
		btnAddList.click();
	}

	public void setListName(String listName) {
		txtListName.sendKeys(listName);
		txtListName.sendKeys(Keys.ENTER);
	}

	public void clickCreateList() {
		btnCreateList.click();
	}

	public void clickBtnAddNewCard() {
//		WebDriverWait wait = new WebDriverWait(webDriver,2000);
//		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewCard));

//		Actions action = new Actions(webDriver);
//		action.moveToElement(btnAddCard).click().perform();
		btnAddNewCard.click();

		// JavascriptExecutor jsExecutor = new JavascriptExecutor();
		// ((JavascriptExecutor) webDriver).executeScript("argumnets[0].click",
		// btnAddNewCard);

//		btnAddNewCard.sendKeys(Keys.ENTER);

//		btnAddNewCard.submit();

	}

	public void inputNewCardName(String cardName) {
		txtCardName.sendKeys(cardName);
	}

	public void clickBtnAddCrad() {
		btnAddCard.click();
	}

	public void clickBtnDelete() {
		btnDelete.sendKeys(Keys.ENTER);
	}

	public void clickBtnDeleteConfirm() {
		btnDeleteConfirm.sendKeys(Keys.ENTER);
	}

	public void clickBtnComment() {
		btnInputComment.click();
	}

	public void inputComment(String comment) {
		txtInputComment.sendKeys(comment);
		txtInputComment.sendKeys(Keys.CONTROL, Keys.ENTER);
	}

	public void clickListName() {
		listName.click();
	}

	public void inputListName(String newListName) {
		txtEditListName.sendKeys(newListName);
		txtEditListName.sendKeys(Keys.ENTER);
	}

	public String getListName() {
		return listName.getText();
	}

	public boolean isDisplayed() {
		return succesInfo.isDisplayed();
	}

	public String getNewCardName() {
		return newCardName.getText();
	}

	public String getNewListName() {
		return newListName.getText();
	}

	public String getNote() {
		return newNote.getText();
	}

	public void clickAddMember() {
		btnAddMember.click();
	}

	public void clickMember() {
		member1.click();
	}

	public void clickClose() {
		closeMember.click();
	}

}
