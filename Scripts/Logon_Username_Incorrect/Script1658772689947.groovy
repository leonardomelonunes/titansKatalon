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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://arqlogindev.b2clogin.com/arqlogindev.onmicrosoft.com/b2c_1_ndd_dev/oauth2/v2.0/authorize?client_id=a4b61e58-0847-4061-a391-9ae3ec3e3481&redirect_uri=https%3A%2F%2Fportalmonitoramentondddev02.e-datacenter.nddigital.com.br%2Fcore%2Fauth%2Fpost-login&response_type=id_token%20token&scope=openid%20https%3A%2F%2Farqlogindev.onmicrosoft.com%2Fndd-platform-api%2Fuser_impersonation&state=0594cc148c9a48f59e56d457134691a9&nonce=3e5d553e153c48e494d7cc7d31a63e07&ui_locales=pt-BR')

WebUI.waitForElementVisible(findTestObject('Page_Neogrid - Login Success/button_Entrar'), 0)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Neogrid - Login Incorrect Username/input_Endereo de Email_Username or email address'), 
    'junior.sturm@ndd.com.b')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Neogrid - Login Incorrect Username/input_Esqueceu a senha_Senha'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Neogrid - Login Incorrect Username/button_Entrar'))

WebUI.click(findTestObject('Page_Neogrid - Login Incorrect Username/p_No estamos encontrando a sua conta'))

