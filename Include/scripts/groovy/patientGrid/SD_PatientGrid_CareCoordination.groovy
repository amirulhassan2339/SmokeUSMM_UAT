package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import internal.GlobalVariable


public class SD_PatientGrid_CareCoordination {



	@Given("I navigate to patient grid Care Coordination")
	public void I_navigate_to_patient_grid_CareCoordination() {





		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_HomePage/Obj_Enterprise'), 10)
		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_Enterprise'))

		

			WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectUSMedicalManagementACO'))
	




		//
		//		WebUI.waitForElementClickable(findTestObject('OR_HomePage/Obj_QAmhpn'), 2)
		////
		////		'Select Support Test Ent Enterprise'
		//		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectSupportTestEnt'))
		////
		//
		////		'Aprima Enterprise'
		//		WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))
		//
		//		'Select MHPN Enterprise'
		//		//WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))



		Thread.sleep(3000)
		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))
		WebUI.getUrl()

		String ActualText = WebUI.getText(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
		WebUI.verifyEqual(ActualText, 'CMR')


		WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))


		WebUI.click(findTestObject('Object Repository/OR_LandingPage/OR_CMR/Obj_SelectPatients_ForCareCoordinationOnly'))

		//		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		Thread.sleep(3000)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)




		WebUI.enableSmartWait()
		Thread.sleep(4000)

	}
}
