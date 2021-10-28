@Dev @GroupChat
Feature: Group Chat
  I want to send messages in the group chat

  @PositiveCase
  Scenario: Groupchat funcionality
    Given i open the web page and user click sign in with google
    And i select teams
    And i click group chat
    When i Input "Test Hallo" in the chat field
    Then messages sent
  
  #@NegativeCase
  #Scenario Outline: Title of your scenario outline
    #Given i open the web page and user click sign in with google
    #And i select teams
    #And i click group chat
    #When i click button attach file and select file <filepath>
    #Then file sent
#
    #Examples: 
      #| filepath                                                         |
      #| C:\\Users\nafih_000\\Desktop\\SekolahQA.postman_environment.json |
