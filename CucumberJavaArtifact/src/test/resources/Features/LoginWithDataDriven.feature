# This is sample test to Login

Feature: Feature to test login functionality

Scenario Outline: Verify user is able to Login with datadriven
	Given User is on Login page1
	When User enters <Username> and <Password>


Examples:
| Username | Password |
| User1 | Pass1 |
| User2 | Pass2 |
| User3 | Pass3 |