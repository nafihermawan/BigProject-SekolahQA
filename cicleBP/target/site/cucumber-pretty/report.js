$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Board.feature");
formatter.feature({
  "line": 2,
  "name": "Board",
  "description": "I want to add list in the board",
  "id": "board",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dev"
    },
    {
      "line": 1,
      "name": "@Board"
    }
  ]
});
formatter.before({
  "duration": 11801005992,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add new list",
  "description": "",
  "id": "board;add-new-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@AddList"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user opens the web and chooses to login using a google account",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user selects the available team",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user selects the menu board",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user click add list and user input \"New Test List\" as list name and user click button create",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "list already created",
  "keyword": "Then "
});
formatter.match({
  "location": "BoardStep.openLoginPage()"
});
formatter.result({
  "duration": 1447592950,
  "status": "passed"
});
formatter.match({
  "location": "BoardStep.selectGroup()"
});
formatter.result({
  "duration": 2827065014,
  "status": "passed"
});
formatter.match({
  "location": "BoardStep.clickBoard()"
});
formatter.result({
  "duration": 3281718191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Test List",
      "offset": 40
    }
  ],
  "location": "BoardStep.creatNewList(String)"
});
formatter.result({
  "duration": 9589132922,
  "status": "passed"
});
formatter.match({
  "location": "BoardStep.listCreataed()"
});
formatter.result({
  "duration": 2233018296,
  "status": "passed"
});
formatter.after({
  "duration": 6264762262,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 13,
      "value": "#@AddCard"
    },
    {
      "line": 14,
      "value": "#Scenario: User add card in the list"
    },
    {
      "line": 15,
      "value": "#Given the user opens the web and chooses to login using a google account"
    },
    {
      "line": 16,
      "value": "#And the user selects the available team"
    },
    {
      "line": 17,
      "value": "#And the user selects the menu board"
    },
    {
      "line": 18,
      "value": "#When the user click add card, user input \"Test Card\" as card name and user click add card"
    },
    {
      "line": 19,
      "value": "#Then card already created"
    },
    {
      "line": 21,
      "value": "#@AddCardNeative"
    },
    {
      "line": 22,
      "value": "#Scenario: User add card in the list"
    },
    {
      "line": 23,
      "value": "#Given the user opens the web and chooses to login using a google account"
    },
    {
      "line": 24,
      "value": "#And the user selects the available team"
    },
    {
      "line": 25,
      "value": "#And the user selects the menu board"
    },
    {
      "line": 26,
      "value": "#When the user do not fill in the field card name and user click add card"
    },
    {
      "line": 27,
      "value": "#Then card cannot be created"
    },
    {
      "line": 29,
      "value": "#@AddNoteCard"
    },
    {
      "line": 30,
      "value": "#Scenario: User add card in the list"
    },
    {
      "line": 31,
      "value": "#Given the user opens the web and chooses to login using a google account"
    },
    {
      "line": 32,
      "value": "#And the user selects the available team"
    },
    {
      "line": 33,
      "value": "#And the user selects the menu board"
    },
    {
      "line": 34,
      "value": "#When the user click button add card, user input \"Edit Note\" as note"
    },
    {
      "line": 35,
      "value": "#Then note already edited"
    },
    {
      "line": 37,
      "value": "#@DeleteFile"
    },
    {
      "line": 38,
      "value": "#Scenario: User add card in the list"
    },
    {
      "line": 39,
      "value": "#Given the user opens the web and chooses to login using a google account"
    },
    {
      "line": 40,
      "value": "#And the user selects the available team"
    },
    {
      "line": 41,
      "value": "#And the user selects the menu board"
    },
    {
      "line": 42,
      "value": "#When the user click button delete, user click delete attachment"
    },
    {
      "line": 43,
      "value": "#Then file was deleted"
    }
  ],
  "line": 46,
  "name": "User add card in the list",
  "description": "",
  "id": "board;user-add-card-in-the-list",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 45,
      "name": "@AddComment"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "the user opens the web and chooses to login using a google account",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "the user selects the available team",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "the user selects the menu board",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "the user input \"Test Comment\" comment",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "comment added",
  "keyword": "Then "
});
formatter.uri("features/CheckIns.feature");
formatter.feature({
  "line": 2,
  "name": "ChecckIns",
  "description": "I want to use this template for my feature file",
  "id": "checckins",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dev"
    },
    {
      "line": 1,
      "name": "@CheckIns"
    }
  ]
});
formatter.before({
  "duration": 4437154692,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Create Check Ins",
  "description": "",
  "id": "checckins;create-check-ins",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@CreateCheckIns"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want to open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i select group",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i selects board",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i click button add check ins",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "i input \"Test CheckIns\" as question, select day and click collecting answer",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "checkins already created",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckInsStep.userOpenPage()"
});
formatter.result({
  "duration": 151151,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.and()"
});
formatter.result({
  "duration": 2158046648,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.and2()"
});
formatter.result({
  "duration": 2173528858,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.clickAddCheckIns()"
});
formatter.result({
  "duration": 2496255990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test CheckIns",
      "offset": 9
    }
  ],
  "location": "CheckInsStep.setCheckIns(String)"
});
formatter.result({
  "duration": 4623242582,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.checkInsCreated()"
});
formatter.result({
  "duration": 2260919583,
  "status": "passed"
});
formatter.after({
  "duration": 733527030,
  "status": "passed"
});
formatter.before({
  "duration": 4220539971,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Add comment in the question",
  "description": "",
  "id": "checckins;add-comment-in-the-question",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@AddComment"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I want to open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "i select group",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "i selects board",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "i click Question check ins",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "i input \"Test Comment\" as comment",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "comment added",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckInsStep.userOpenPage()"
});
formatter.result({
  "duration": 148819,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.and()"
});
formatter.result({
  "duration": 2231966306,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.and2()"
});
formatter.result({
  "duration": 2241428149,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.clickQuestionCheckIns()"
});
formatter.result({
  "duration": 2206602857,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Comment",
      "offset": 9
    }
  ],
  "location": "CheckInsStep.inputComment(String)"
});
formatter.result({
  "duration": 5005319196,
  "status": "passed"
});
formatter.match({
  "location": "CheckInsStep.commentAdded()"
});
formatter.result({
  "duration": 56236900,
  "status": "passed"
});
formatter.after({
  "duration": 6099249519,
  "status": "passed"
});
formatter.uri("features/GroupChat.feature");
formatter.feature({
  "line": 2,
  "name": "Group Chat",
  "description": "I want to send messages in the group chat",
  "id": "group-chat",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dev"
    },
    {
      "line": 1,
      "name": "@GroupChat"
    }
  ]
});
formatter.before({
  "duration": 4135464090,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Groupchat funcionality",
  "description": "",
  "id": "group-chat;groupchat-funcionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i open the web page and user click sign in with google",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i select teams",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i click group chat",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i Input \"Test Hallo\" in the chat field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "messages sent",
  "keyword": "Then "
});
formatter.match({
  "location": "GroupChatStep.openLoginPage()"
});
formatter.result({
  "duration": 21510975,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatStep.clickGroup()"
});
formatter.result({
  "duration": 5193527860,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatStep.clickGroupChat()"
});
formatter.result({
  "duration": 2270759303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Hallo",
      "offset": 9
    }
  ],
  "location": "GroupChatStep.test(String)"
});
formatter.result({
  "duration": 2425194198,
  "status": "passed"
});
formatter.match({
  "location": "GroupChatStep.messageSent()"
});
formatter.result({
  "duration": 40120,
  "status": "passed"
});
formatter.after({
  "duration": 6098127552,
  "status": "passed"
});
formatter.uri("features/SignIn.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "I want to login with google account",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dev"
    },
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 4441569783,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User SignIn with google account",
  "description": "",
  "id": "login;user-signin-with-google-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user click sign in with google",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStep.openLoginPage()"
});
formatter.result({
  "duration": 183806,
  "status": "passed"
});
formatter.match({
  "location": "SignInStep.signInGoogle()"
});
formatter.result({
  "duration": 37788,
  "status": "passed"
});
formatter.match({
  "location": "SignInStep.signInSucces()"
});
formatter.result({
  "duration": 5357900909,
  "status": "passed"
});
formatter.after({
  "duration": 6090387146,
  "status": "passed"
});
});