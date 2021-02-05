@TEST_T28-177
Feature: US17 System should allow the Admin to manage

  Background:
    Given User enter as Admin
    Given Go to User Management

  Scenario: US17 System should allow the Admin to manage users
    Given Admin can activate a role as user

  Scenario: US17 System should allow the Admin to manage employee
    Given Admin can activate a role as employee

  Scenario: US17 System should allow the Admin to manage manager
    Given Admin can activate a role as manager

  Scenario: US17 System should allow the Admin to manage admin
    Given Admin can activate a role as admin

  Scenario: US17 System should allow the Admin to view
    Given Admin can view all user info (admin, manager, employee and user)

  Scenario: US17 System should allow the Admin to edit
    Given Admin can edit all user info  (admin, manager, employee and user)

  Scenario: US17 System should allow the Admin to delete
    Given Admin can delete all user info  (admin, manager, employee and user)
