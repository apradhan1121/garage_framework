Feature: Automate Drawing a Rectangle in Microsoft Paint

  Scenario: Draw a Rectangle on the Canvas
    Given I open Microsoft Paint
    When I select the 'Shapes' tool
    And I choose the 'Rectangle' shape from the shapes menu
    And I draw a rectangle on the canvas by clicking and dragging from one point to another
    Then I should see a rectangle on the canvas