package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.BoardsPage;
import page_object.DashboardTeamsPage;
import page_object.HomePage;

@SuppressWarnings("deprecation")
public class BoardStep {

	private WebDriver webDriver;

	public BoardStep(WebDriver webDriver) {
		super();
		this.webDriver = Hooks.webDriver;
	}

	public BoardStep() {
		super();
		this.webDriver = Hooks.webDriver;
	}

	@Given("the user opens the web and chooses to login using a google account")
	public void openLoginPage() {

	}

	@And("the user selects the available team")
	public void selectGroup() throws InterruptedException {
		HomePage homePage = new HomePage(webDriver);
		Thread.sleep(2000);
		homePage.clickGroupC();
	}

	@And("the user selects the menu board")
	public void clickBoard() throws InterruptedException {
		DashboardTeamsPage dashBoardTeamPage = new DashboardTeamsPage(webDriver);
		Thread.sleep(3000);
		dashBoardTeamPage.clickBoard();
	}

//	AddList

	@When("the user click add list and user input \"(.*)\" as list name and user click button create")
	public void creatNewList(String listName) throws InterruptedException {
		BoardsPage boardPage = new BoardsPage(webDriver);
		Thread.sleep(5000);
		boardPage.clickAddlist();
		Thread.sleep(3000);
		boardPage.setListName(listName);
	}

	@Then("list already created")
	public void listCreataed() throws InterruptedException {
		BoardsPage boardPage = new BoardsPage(webDriver);
		Thread.sleep(2000);
		
//		String actual = boardPage.getListNameNew(4);
//	
//		Assert.assertEquals("New Test List", actual);
//		String newListName = boardPage.getListName();
//		System.out.println(newListName);

//		Assert.assertEquals("New Test List", boardPage.getNewListName());
		Assert.assertTrue(boardPage.isDisplayed());
	}

//	AddCard

	@When("the user click add card, user input \"(.*)\" as card name and user click add card")
	public void createNewCard(String cardName) throws InterruptedException {
		BoardsPage boardsPage = new BoardsPage(webDriver);
		Thread.sleep(4000);
		boardsPage.clickBtnAddNewCard();
		boardsPage.inputNewCardName(cardName);
		boardsPage.clickBtnAddCrad();
	}

	@Then("card already created")
	public void cardCreated() {
		BoardsPage boardPage = new BoardsPage(webDriver);

//		Assert.assertEquals("Test Card", boardPage.getNewCardName());
		Assert.assertTrue(boardPage.isDisplayed());
	}

//	AddCardNegative

	@When("the user do not fill in the field card name and user click add card")
	public void blankCardName() throws InterruptedException {
		BoardsPage boardsPage = new BoardsPage(webDriver);
		Thread.sleep(2000);
		boardsPage.clickBtnAddNewCard();
		boardsPage.clickBtnAddCrad();
	}

	@Then("card cannot be created")
	public void cardCannotCreated() {
		BoardsPage boardPage = new BoardsPage(webDriver);

		Assert.assertTrue(boardPage.isDisplayed());
	}

//	AddNote

	@When("the user click button add card, user input \"(.*)\" as note")
	public void userAddCardNote(String note) throws InterruptedException {
		BoardsPage boardsPage = new BoardsPage(webDriver);
		Thread.sleep(2000);
		boardsPage.clickCard();
		Thread.sleep(3000);
		boardsPage.clickBtnAddNote();
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("//div[@class='fr-element fr-view']")).clear();
		boardsPage.inputNote(note);
		boardsPage.clickBtnSaveNote();
	}

	@Then("note already edited")
	public void verifyNote() {
		BoardsPage boardPage = new BoardsPage(webDriver);
		
		Assert.assertEquals("Edit Note", boardPage.getNote());
	}

//	Delete file

	@When("the user click button delete, user click delete attachment")
	public void userClickBtnDelete() throws InterruptedException {
		BoardsPage boardsPage = new BoardsPage(webDriver);
		Thread.sleep(2000);
		boardsPage.clickCard();
		Thread.sleep(2000);
		boardsPage.clickBtnDelete();
		boardsPage.clickBtnDeleteConfirm();
	}

	@Then("file was deleted")
	public void verifyNotifDelete() {

	}

//	Add Comment

	@When("the user input \"(.*)\" comment")
	public void userInputComment(String comment) throws InterruptedException {
		BoardsPage boardsPage = new BoardsPage(webDriver);
		Thread.sleep(2000);
		boardsPage.clickCard();
		Thread.sleep(2000);
		boardsPage.clickBtnComment();
		boardsPage.inputComment(comment);
	}

	@Then("verify New comment")
	public void verifyNewCommentCard() {

	}

//	Edit List Name

	@When("the user click list name and input \"(.*)\" as list name")
	public void editListName(String listName) throws InterruptedException {
		BoardsPage boardsPage = new BoardsPage(webDriver);
		Thread.sleep(2000);
		boardsPage.clickListName();
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("//input[@class='form-control']")).clear();
		Thread.sleep(3000);
		boardsPage.inputListName(listName);
	}

	@Then("list name updated")
	public void listNameEdited() {
		BoardsPage boardPage = new BoardsPage(webDriver);
		
//		Assert.assertEquals("New List Name", boardPage.getNewListName());
		Assert.assertTrue(boardPage.isDisplayed());
	}
	
//	Add Member
	@When("the user click select card and select member")
	public void userAddMember() throws InterruptedException {
		BoardsPage boardPage = new BoardsPage(webDriver);
		Thread.sleep(3000);
		boardPage.clickCard();
		Thread.sleep(3000);
		boardPage.clickAddMember();
		boardPage.clickMember();
		boardPage.clickClose();
		
	}
	
	@Then("member already added")
	public void memberAlreadyAdded() {
		BoardsPage boardPage = new BoardsPage(webDriver);
		
		Assert.assertTrue(boardPage.isDisplayed());
	}
}
