Feature:Login Action

Scenario Outline:Successful Login with Valid Credentials
Given User opens the application
When User clicks on login link
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
|username                    | password       |
|arvind.guggilla57@gmail.com | arvind         |
|aravinkumargugilla@gmail.com| Arvind@123     |