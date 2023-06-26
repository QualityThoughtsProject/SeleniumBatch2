Feature: Login


  Scenario Outline: Open card featues
    Given User is launch the application
    When User select the "<Option>"
    Then pc and mac details should be displayed

    Examples: 
      | Option  |
      | Desktops |
      | Test    |


  #Scenario Outline: Login Application
    #Given User is launch the application
    #When user enter the correct "<UserName>" and "<Password>"
    #Then User is able to login to the application
#
    #Examples: 
      #| UserName | Password |
      #| Test     | Test123  |
      #| Test1    | Test124  |
      #| Test2    | Test125  |
      #| Test3    | Test126  |
      #| Test4    | Test127  |
