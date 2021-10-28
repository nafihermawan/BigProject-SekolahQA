@Dev @Board
Feature: Board
  I want to add list in the board

  @AddList
  Scenario: Add new list
  Given the user opens the web and chooses to login using a google account
  And the user selects the available team
  And the user selects the menu board
  When the user click add list and user input "New Test List" as list name and user click button create
  Then list already created
  
  #@AddCard
  #Scenario: User add card in the list
  #Given the user opens the web and chooses to login using a google account
  #And the user selects the available team
  #And the user selects the menu board
  #When the user click add card, user input "Test Card" as card name and user click add card
  #Then card already created
  
  #@AddCardNeative
  #Scenario: User add card in the list
  #Given the user opens the web and chooses to login using a google account
  #And the user selects the available team
  #And the user selects the menu board
  #When the user do not fill in the field card name and user click add card
  #Then card cannot be created
  
  #@AddNoteCard
  #Scenario: User add card in the list
  #Given the user opens the web and chooses to login using a google account
  #And the user selects the available team
  #And the user selects the menu board
  #When the user click button add card, user input "Edit Note" as note
  #Then note already edited
  
  #@DeleteFile
  #Scenario: User add card in the list
  #Given the user opens the web and chooses to login using a google account
  #And the user selects the available team
  #And the user selects the menu board
  #When the user click button delete, user click delete attachment
  #Then file was deleted
  
  @AddComment
  Scenario Outline: User add card in the list
  Given the user opens the web and chooses to login using a google account
  And the user selects the available team
  And the user selects the menu board
  When the user input "Test Comment" comment
  Then comment added
  
  #@AddNoteCard
  #Scenario: User add card in the list
  #Given the user opens the web and chooses to login using a google account
  #And the user selects the available team
  #And the user selects the menu board
  #When the user click select card and select member
  #Then member already added
  
  #@DeleteFile
  #Scenario: User add card in the list
  #Given the user opens the web and chooses to login using a google account
  #And the user selects the available team
  #And the user selects the menu board
  #When the user input "Test Comment" comment
  #Then comment added
  
  #@EditListName
  #Scenario: User add card in the list
    #Given the user opens the web and chooses to login using a google account
    #And the user selects the available team
    #And the user selects the menu board
    #When the user click list name and input "New List Name" as list name
    #Then list name updated

