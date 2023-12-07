import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class iniciodesesion {
	@Given("Abrir el navegador en Katalon Cura")
	def Abrir_el_navegador_en_Katalon_Cura() {
		WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
		WebUI.maximizeWindow()
	}
	
	@When("Clickear el boton y obtener y rellenar los datos")
	def Clickear_el_boton_y_obtener_y_rellenar_los_datos() {
		WebUI.click(findTestObject('A_inicio'))
		String username = WebUI.getAttribute(findTestObject('Input_data_username'), 'value')
		String password = WebUI.getAttribute(findTestObject('Input_data_password'), 'value')
		WebUI.setText(findTestObject('Input_username'), username)
		WebUI.setText(findTestObject('Input_password'), password)
		WebUI.click(findTestObject('Boton_login'))
	}
	
	@And("Rellenar datos para pedir cita")
	def Rellenar_datos_para_pedir_cita() {
		WebUI.click(findTestObject('Select_facility'))
		WebUI.click(findTestObject('Select_facility_option'))
		WebUI.click(findTestObject('checkbox_admission'))
		WebUI.click(findTestObject('radio_program'))
		WebUI.setText(findTestObject('Input_date'), '11/11/2019')
		WebUI.setText(findTestObject('TextArea_comment'), 'feliz navidad')
	}
	
	@Then("Verificar que pidio cita satisfactoriamente")
	def Verificar_que_pidio_cita_satisfactoriamente() {
		WebUI.click(findTestObject('Button_submit'))
	}
}