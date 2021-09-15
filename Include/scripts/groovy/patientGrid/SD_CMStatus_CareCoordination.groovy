package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class SD_CMStatus_CareCoordination {

	WebDriver driver;

	@And("I select (.*) as cm status")

	public void selectStatus(String CM_Status) {

		Thread.sleep(5000)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Click'))

		if(CM_Status== "Eligible") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Eligible'))
		}

		if(CM_Status== "Active") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Active'))
		}


		if(CM_Status== "Completed") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Completed'))
		}
	}


	@Then("I should see patients with CM Status as (.*) on care coordination grid")
	public void I_should_see_care_cordination_LOB_filters(String CM_Status) {


		String Actual_CMStatus = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyCMStatus'))

		if(!Actual_CMStatus.is(CM_Status)) {

			WebUI.verifyEqual(CM_Status, Actual_CMStatus)
		}else {

			throw new NoSuchElementException("Can't find " + CM_Status + " in Grid");
		}
	}

	@And("I click on CM link")
	public void Click_CMStatus() {

		'Search Patient'

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), 20)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), "Xsah829, Axir829")

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), Keys.chord(Keys.ENTER))

		Thread.sleep(10000)

		'Click On Hyper Link'
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_ClickCMStatusLink'))

		Thread.sleep(18000)
	}


	@And("I click on CM link again")
	public void Click_CMStatus_again() {


		'Click On Hyper Link'
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_ClickCMStatusLink'))

		Thread.sleep(4000)
	}



	@Then("I should see popup details")
	public void I_should_see_popup_details() {


		'Verify Title'
		String Actual_Title = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyAlertTitle'))

		WebUI.verifyEqual(Actual_Title, "Notification Details")


		'Verify Name'
		String Actual_Name = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_PatientName'))

		String Expected_Name = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_Name'))

		WebUI.verifyEqual(Actual_Name, Expected_Name)

		'Verify MRN'
		String Actual_MRN = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_MRN'))

		String Expected_MRN = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_MRN'))

		WebUI.verifyEqual(Actual_MRN, Expected_MRN)


		'Verify Admitted Date'
		String Actual_AdmitDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_AdmittedDate'))

		String Expected_AdmitDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_AdmittedDate'))


		if(Expected_AdmitDate.contains(Actual_AdmitDate)) {

			WebUI.verifyEqual(Actual_AdmitDate, Expected_AdmitDate);
		}



		'Verify Dischare Date'
		String Actual_DischargeDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_DischargeDate'))

		String Expected_DischargeDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DischargeDate'))


		if(Expected_DischargeDate.contains(Actual_DischargeDate)) {

			WebUI.verifyEqual(Actual_DischargeDate, Expected_DischargeDate);
		}


		'Verify Serving Facility'
		String Actual_Facility = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_ServingFacility'))

		String Expected_Facility = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_ServingFacility'))

		WebUI.verifyEqual(Actual_Facility, Expected_Facility)


		'Verify Lace'
		String Actual_Lace = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_Lace'))

		String Expected_Lace = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_Lace'))

		WebUI.verifyEqual(Actual_Lace, Expected_Lace)
	}

	@When("I enter due date (.*) as DT")
	public void user_Enter_DueDate(String Due_Date) {

		WebUI.clearText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DueDate'))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DueDate'), Due_Date)
		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DueDate'), Due_Date)

		Thread.sleep(2000)
	}

	@When("I select CM Status")
	public void Select_CMStatus() {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_Click'))
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_SelectActive'))
	}

	@When("I select CM Status again")
	public void Select_CMStatusAgain() {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_Click'))
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_SelectEligible'))
	}

	@When("I enter care provider (.*) as CP")
	public void user_Enter_CareProvider(String CareProvider) {



		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), CareProvider)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), CareProvider)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), Keys.chord(Keys.ENTER))
	}

	@When("I enter care coordination (.*) as CC")
	public void user_Enter_CareCoordination(String CareCoordination) {


		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), CareCoordination)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), CareCoordination)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), Keys.chord(Keys.ENTER))
	}

	@When("I click on save button to save notification details")
	public void ClickOnSaveBTNTO_() {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_SaveBTN'))

		Thread.sleep(3000)
	}

	@Then("I should see this message (.*) as Notification")
	public void I_should_see_notificationSuccessMessage(String SuccessMessage) {


		'Verify Notification Message'
		String Actual_Message = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_NotificationMessage'))

		WebUI.verifyEqual(Actual_Message, SuccessMessage)

		Thread.sleep(5000)
	}

	@Then("I should see patient details including (.*) AND (.*) AND (.*) AND CM_Status after updating data from popup")
	public void I_should_see_patientDataFromPopup(String CareCoordination, String CareProvider, String Due_Date) {


		'Verify Care Coordination'


		String Expected_CareCoordination = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_CareCoordination'))


		if(!Expected_CareCoordination.contains(CareCoordination)) {

			WebUI.verifyMatch(CareCoordination, Expected_CareCoordination, true)
		}


		'Verify Care Provider'
		String Actual_CareProvider = CareProvider

		String Expected_CareProvider = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_CareProvider'))


		WebUI.verifyEqual(Actual_CareProvider, Expected_CareProvider);



		'Verify Due Date'
		String date = Due_Date.substring(0, 8)

		String actual_DueDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_DueDate'))

		String date1 = Due_Date.substring(0, 8)


		//WebUI.verifyMatch(actual_DateOfServiceDate, DateOfService_FromDate(new SimpleDateFormat("H:mm a"), false)

		WebUI.verifyMatch(date, date1, false)


		'Verify Status'
		String Actual_CM_Status = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyCMStatus'))

		String Expected_CM_Status = "Active"

		WebUI.verifyEqual(Actual_CM_Status, Expected_CM_Status)

	}
}
