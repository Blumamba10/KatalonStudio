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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8089/tdes')

WebUI.setText(findTestObject('Object Repository/oneoff/Page_Convergence Administration Console/input_Login_j_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/oneoff/Page_Convergence Administration Console/input_Login_j_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('oneoff/Page_Convergence Administration Console/button_Login'))

for (def index : (0..30)) {
    WebUI.click(findTestObject('Object Repository/oneoff/Page_Convergence Administration Console/a_Templates'))

    WebUI.click(findTestObject('Object Repository/oneoff/Page_Convergence Administration Console/a_Templates'))

    WebUI.click(findTestObject('Object Repository/oneoff/Page_Convergence Administration Console/a_Manage Templates'))

    WebUI.setText(findTestObject('Object Repository/oneoff/Page_Convergence Administration Console/input'), '3433')

    WebUI.click(findTestObject('oneoff/Page_Convergence Administration Console/a_Last Updated on Server_btn (1)'))

    WebUI.switchToWindowTitle('')

    WebUI.setText(findTestObject('Object Repository/oneoff/Page_/input_guid_FF_guid'), '2')

    WebUI.click(findTestObject('Object Repository/oneoff/Page_/input_guid_publish_button'))
}

WebUI.closeBrowser()

