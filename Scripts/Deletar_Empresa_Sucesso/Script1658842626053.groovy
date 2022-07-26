import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Logon_Portal_Neogrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Neogrid Fiscal/div_Configuraes'))

WebUI.click(findTestObject('Object Repository/Page_Neogrid Fiscal/div_Empresa'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Neogrid Fiscal/pequisa'))

WebUI.setText(findTestObject('Page_Neogrid Fiscal/pequisa'), '11581859004226')

WebUI.click(findTestObject('Page_Neogrid Fiscal/pesquisar'))

WebUI.click(findTestObject('Page_Neogrid Fiscal/Grid_position_first'))

WebUI.click(findTestObject('Page_Neogrid Fiscal/button_excluir_empresa'))

WebUI.click(findTestObject('Page_Neogrid Fiscal/button_confirme_delete_empresa'))

