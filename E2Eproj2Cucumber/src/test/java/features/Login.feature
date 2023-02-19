Feature:HomePageInheritenceTest

Scenario Outline:Login Page 
Given browser is invoked
And link is provided
And pop-up is handled
And login is clicked
When <username> and <password> are entered and clicked login
Then login is false and browser is closed
 Examples:  
 |username					|password |
 |govind@gmail.com  |password |
 |maddala@gmail.com |passwordd|