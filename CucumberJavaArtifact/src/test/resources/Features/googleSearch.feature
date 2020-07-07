# This is sample test to Login

Feature: Feature to test google search

Scenario: Verify user is able to search
	Given User is invoked google site
	When User enters search keyword
	And clicks on search button
	Then user is navigated to listing page