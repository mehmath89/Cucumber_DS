@web

  Feature: Darksky page feature

    Background:
      Given I am on darksky page

      @darksky
      Scenario: Check today's highest and lowest temprature on darksky page
        When I enter a city as Dayton into the search box on the darksky page
        And I click on search button on the darksky page
        And I got current temperature on the darksky page
        And I click Today button on the darksky page
        Then I got highest and lowest temperature and verify them on the darksky page