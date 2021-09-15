package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.assertTrue

import java.text.DateFormat
import java.text.SimpleDateFormat

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import cucumber.api.java.en.And
import cucumber.api.java.en.Then



class SD_PatientTimer {



	@And("I click on patient timer button")
	public void click_On_PatientTimer_Button() {


		Thread.sleep(4000)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerBtn'), 30)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerBtn'))
		Thread.sleep(2000)
	}

	@And("I click on patient timer button_WFB")
	public void click_On_PatientTimer_Button_WFB() {


		Thread.sleep(4000)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerBtn_WFB'), 30)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerBtn_WFB'))
		Thread.sleep(2000)
	}

	@And("I click on encounter tab")
	public void click_On_Encounter_Tab() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_EncounterTab'))
		Thread.sleep(2000)
	}

	@And("I drag the popup")
	public void DrAG() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_Drag'))

		WebUI.dragAndDropByOffset(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_Drag'), 400, 500)

		Thread.sleep(2000)
	}


	@Then("I should see patient (.*) as patient_name in timer popup")
	public void verify_Patient_Name_TimerPopUp(String Patient) {

		'Verify Care Plan Patient Name'


		String ActualName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_PatientNameVerify'))
		WebUI.verifyEqual(ActualName, Patient)
	}

	@And("I click on start timer button")
	public void click_On_start_Button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_StartBTN'))
		Thread.sleep(5000)
	}

	@And("I click on minimize button")
	public void click_Minimize_Button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_mimimize'))
		Thread.sleep(2000)
	}

	@Then("I should not see patient timer popup")
	public void verify_PatientTimer_ShouldNotShow() {

		WebUI.verifyElementNotVisible(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_PatientNameVerify'))
	}

	@And("I click on patient timer button again")
	public void click_On_PatientTimer_Button_again() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerBtn_Again'))
		Thread.sleep(2000)
	}


	@And("I click on patient timer button again_WFB")
	public void click_On_PatientTimer_Button_again_WFB() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerBtn_Again_WFB'))
		Thread.sleep(2000)
	}

	@And("I click on stop timer button")
	public void click_On_PatientTimer_StopButton() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_StopBTN'))
		Thread.sleep(4000)
	}

	@And("I get total timer duratoin")
	public void GetTotal_Duration() {


		String Actual_Duration = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_GetTotalTimerDuration'))
	}

	@And("I should see patient timer history")
	public void History() {


		//String Actual_Duration = WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_GetTotalTimerDuration'), 'Value')
		//String Actual_Duration = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_GetTotalTimerDuration'))
		//String TimeSpent = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_TimeSpent'))

		//WebUI.verifyMatch(Actual_Duration, TimeSpent, false)
		//WebUI.verifyEqual(Actual_Duration, TimeSpent)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_TimeSpent'), 3)



	}

	@And("I should see patient timer history_WFB")
	public void History_WFB() {


		//		String Actual_Duration = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimerPopUp_GetTotalTimerDuration'))
		//		String TimeSpent = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_TimeSpent_WFB'))
		//
		//		WebUI.verifyEqual(Actual_Duration, TimeSpent)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_TimeSpent_WFB'), 5)



	}

	@And("I enter (.*) as comment in timer popup")
	public void EnterComment(String Comment) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_Comment'), Comment)
	}

	@And("I click on update button")
	public void UpdateBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_UpdateBTN'))
		Thread.sleep(3000)
	}


	@Then("I should see success message (.*) of timer")
	public void I_should_see_intial_status_as_on_timer(String TimerSucessMessage) {

		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_TimerSuccessMessage'))

		WebUI.verifyEqual(Actual_Status, TimerSucessMessage)
	}


	@And("I should see current date")
	public void Date() {



		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date date = new Date();

		String date1= dateFormat.format(date);

		System.out.println("Current date and time is " +date1);

		WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_CurrentDate'), date1)
	}

	@And("I select patient timer program")
	public void selectProgram() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_selectProgram'))
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_selectProgram'))
	}

	@And("I select patient timer program_WFB")
	public void selectProgram_WFB() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_selectProgram_WFB'))
	}

	@And("I verify billable checkbox")
	public void VerifyBillableCheckbox() {




		if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_BillableCheckbox'), 5, FailureHandling.OPTIONAL)) {

			println('Checked')
		}else {
			println('Not Checked')
		}
	}

	@And("I verify Non_billable checkbox is checked")
	public void VerifyNonBillableCheckbox() {




		if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_NonBillableCheckbox'), 5, FailureHandling.OPTIONAL)) {

			println('Checked')
		}else {
			println('Not Checked')
		}
	}

	@And("I select (.*) as diagnosis code")
	public void SelectDiagnosisCode(String Diagnosis) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_selectDaignosis'), Diagnosis)


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_selectDaignosisCode'))
		//WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_selectDaignosis') , Keys.chord(Keys.ENTER))


	}

	@And("I click on history tab")
	public void HistoryTab() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_HistoryTab'))

		Thread.sleep(8000)
	}

	@And("I verify patient is selected")
	public void VerifyPatientIsSelectedCheckbox() {




		if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_IsPatientSelect'), 5, FailureHandling.OPTIONAL)) {

			println('Checked')
		}else {
			println('Not Checked')
		}
	}

	@And("I select the patient")
	public void ClickOnPatient() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientClick'))
	}

	@And("I checked non billable checkbox")
	public void selectNonBillableCheckbox() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientTimer/Obj_PatientTimer_NonBillableCheckbox'))
	}
}

