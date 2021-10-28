@Dev @CheckIns
Feature: ChecckIns
  I want to use this template for my feature file

  @CreateCheckIns
  Scenario: Create Check Ins
    Given I want to open the web page
    And i select group
    And i selects board
    When i click button add check ins
    And i input "Test CheckIns" as question, select day and click collecting answer
    Then checkins already created

  @AddComment
  Scenario: Add comment in the question
    Given I want to open the web page
    And i select group
    And i selects board
    When i click Question check ins
    And i input "Test Comment" as comment
    Then comment added
