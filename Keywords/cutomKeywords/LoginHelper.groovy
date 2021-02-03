package cutomKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

/* Open Browser
 * Login with Valid Credentials
 * 
 * */

public class LoginHelper {

	@Keyword
	public void loginApp(String applicationURL, String username, String password){

		WebUI.openBrowser(applicationURL)
		WebUI.waitForPageLoad(5)
		WebUI.maximizeWindow()

		WebUI.waitForElementVisible(findTestObject('Object Repository/Convergence/Login_Page/login_Btn'), 0)
		WebUI.sendKeys(findTestObject('Object Repository/Convergence/Login_Page/username'), username)
		WebUI.sendKeys(findTestObject('Object Repository/Convergence/Login_Page/password'), password)
		WebUI.click(findTestObject('Object Repository/Convergence/Login_Page/login_Btn'))
		WebUI.delay(2)
	}
}
