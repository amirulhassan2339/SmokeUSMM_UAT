@LeftFilters
Feature: Left Filters

	Background: 
		Given I navigate to patient grid

	@Facility
	Scenario Outline: Applying Facility Filters
		 And I click on reset button
		When I enter facility <Facility>
		 And I click on apply button
		Then I should see <Facility> as Facility

		Examples: 
			| Facility                                       |
			| VPA Specialty Programs |
  @Program
  Scenario Outline: Applying Program Filters
    And I click on reset button
    When I select program
    And I click on apply button
    Then I should see <Program> as Program

    Examples: 
      | Program |
      | VPA-Behavioral-Health-Social-Work     |

  @Enrollment
  Scenario Outline: Applying Enrollment Filters
    And I click on reset button
    When I select enrollment
    And I click on apply button
    Then I should see <Enrollment> as Enrollment

    Examples: 
      | Enrollment |
      | Pending Patient Consent (VPA-Behavioral-Health-Social-Work)     |
