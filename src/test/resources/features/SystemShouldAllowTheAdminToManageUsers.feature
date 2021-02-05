Feature: US17 System should allow the Admin to manage users

  @TEST_T28-177
  Scenario: US17 System should allow the Admin to manage users
    Given User enter as Admin
    Given Go to User Management
    Given Admin can activate a role as user
    Given Admin can activate a role as employee
    Given Admin can activate a role as manager
    Given Admin can activate a role as admin
    Given Admin can view all user info (admin, manager, employee and user)
    Given Admin can edit all user info  (admin, manager, employee and user)
    Given Admin can delete all user info  (admin, manager, employee and user)
