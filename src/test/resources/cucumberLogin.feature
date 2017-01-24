Feature: To Check if Register Page of Amazon works effctively


 
 
Scenario: check the Register Page  by entering data
    
  
Given the following RegUsers exist:
  | Aslak  | aslak@cucumber.io  | asdqwe           |asdqwe        |
  | Julien | julien@cucumber.io | dfgert           |dfgert        |
  
 
 
 When Ente the userDetails in the RegisterPage
 Then the user shud get registered successfully