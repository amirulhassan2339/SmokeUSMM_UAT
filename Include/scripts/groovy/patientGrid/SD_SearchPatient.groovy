package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SD_SearchPatient {

	@When("I search (.*) using global search")
	public void search_Patient(String Patient) {

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))



		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 20)

		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

		WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Patient)
		
		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Keys.chord(Keys.ENTER))
		

//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'), 10)
//
//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))
		Thread.sleep(5000)
	}




	@Then("I should see (.*) as patient with (.*) as MRN and (.*) as DOB and (.*) as Status on patient grid")
	public void Patient_should_be_verified(String Patient_Name, String MRN, String DOB, String Patient_Status) {

		String Actual_FirstLastName = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'))
		WebUI.verifyEqual(Actual_FirstLastName, Patient_Name)



		//		String Actual_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'))
		//		WebUI.verifyEqual(Actual_MRN, MRN)
		//
		//
		//		String Actual_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'))
		//		WebUI.verifyEqual(Actual_DOB, DOB)
		//
		//		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Status/Obj_PatientStatus'))
		//		WebUI.verifyEqual(Actual_Status, Patient_Status)
	}


	@Then("I should see (.*) as patient Name")
	public void PatientName_should_be_verified(String Patient_Name) {

		String Actual_FirstLastName = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'))
		WebUI.verifyEqual(Actual_FirstLastName, Patient_Name)



		//		String Actual_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'))
		//		WebUI.verifyEqual(Actual_MRN, MRN)
		//
		//
		//		String Actual_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'))
		//		WebUI.verifyEqual(Actual_DOB, DOB)
		//
		//		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Status/Obj_PatientStatus'))
		//		WebUI.verifyEqual(Actual_Status, Patient_Status)
	}
}

