@Dev @Login
Feature: Login
  I want to login with google account

  @tag1
  Scenario: User SignIn with google account
    Given user open the web page
    When user click sign in with google
    Then user enter the dashboard

  #@tag2
  #Scenario: User SignIn with google account
    #Given user open the web page
    #When user click sign in with google
    #Then user click notification
