#us12
  Feature: manage customer
    Background:
      Given login as an employee
      Given user clicks my operation on employee page
      Given user clicks Manage Customer on employee page

    Scenario: see manage customer module populating informations of customers
      Given verify customers info populated

    Scenario: user click View button and see all info of customer and see Edit button
      Given user clicks view option to see customer's all info on customer page
      Given verify Edit button is displayed

    Scenario: there should be an Edit option where customer all info populated
      Given user clicks Edit option to see customer's all info on customer page

    Scenario:user can update or create customer info on Edit portal
      Given user clicks Edit option to see customer's all info on customer page
      Given user can update or create customer info on Edit portal

    Scenario: user can delete customer by clicking delete button but should see message if user sure about deletion
      Given user should clicks delete button
      Given user should see message if user sure about deletion



