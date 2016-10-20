Feature: As a user I want to check all sub Menus in all Main Menus of NOC Portal

Background:
 Given Open NOC application 
 And User is login to NOC portal 


@BVT
Scenario: Verify all sub menus under Main Menu of NOC Portal
 When  User clicks on Activity  Main Menu
 Then Verify Correct Sub menus get displayed  in Activity Main Menu

When  User clicks on Analysis  Main Menu
Then Verify Correct Sub menus get displayed 
 
  When  User clicks on  ITS247 Tools Main Menu
 Then Verify Correct Sub menus get displayed in ITS247Tools Main Menu
 
  When  User clicks on Management  Main Menu
 Then Verify Correct Sub menus get displayed in Management Main Menu
 
  When  User clicks on Settings  Main Menu
 Then Verify Correct Sub menus get displayed  in Settings Main Menu
 
  When  User clicks on Report  Main Menu
 Then Verify Correct Sub menus get displayed in Report Main Menu

When  User clicks on DashboardInbox  Main Menu
 Then Verify Correct Sub menus get displayed  in DashboardInbox Main Menu
 
  When  User clicks on Quick Reports  Main Menu
Then Verify Correct Sub menus get displayed in Quick Reports Main Menu