Feature: As a user status I want to create ticket on NOC with different status

Background:
 Given Open NOC application 
 And User is login to NOC portal 

@BVTTest
Scenario Outline: Verify ticket created in NOC
 When  User is able to create ticket in NOC portal for "<Member>", "<Site>","<Resource>" with status in "<Status>"
 Then Verify ticket created in Database 

  
Examples: 
 |Member      |Site    |Status|
 |CMSPL32     |Georgia |New|