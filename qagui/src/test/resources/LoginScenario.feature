@BDD
Feature: User Login
  @Login @Wordpress @userpanel
  Scenario: login
  Given User starts on main page
  When user logs to the user panel
  Then User can modify user profile