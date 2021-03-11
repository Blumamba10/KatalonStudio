import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.media.sound.SoftReverb.Delay

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject 
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class LoginLogoff  {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestSuite
	def login(){
		WebUI.openBrowser(GlobalVariable.tdesURL)
		def driver = DriverFactory.getWebDriver()
		String baseUrl = GlobalVariable.tdesURL
		WebUI.waitForPageLoad(30)
		WebUI.maximizeWindow()
		
		WebUI.sendKeys(findTestObject('Convergence/Login_Page/username'), 'admin')
		WebUI.sendKeys(findTestObject('Convergence/Login_Page/password'), 'admin')
		WebUI.click(findTestObject('Convergence/Login_Page/button_Login'))
		WebUI.delay(2)
		Boolean result = findTestObject('Convergence/SelectProject_values/Select Project')
		if (result == true){
			println("Login Successfull")
		}
		
	}
	 
	/*
	  *@BeforeTestCase
	def loginIfNotLoggedIn(){
		def driver = DriverFactory.getWebDriver()
		String baseUrl = GlobalVariable.tdesURL
		def url = WebUI.getUrl()
		//Boolean rs = WebUI.(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		//This if commnad is not being executed
		if (url == GlobalVariable.tdesURL + "/logoff.jsp"){
										
		WebUI.openBrowser(GlobalVariable.tdesURL)
		WebUI.sendKeys(findTestObject('Convergence/Login_Page/username'), 'admin')
		WebUI.sendKeys(findTestObject('Convergence/Login_Page/password'), 'admin')
		WebUI.click(findTestObject('Convergence/Login_Page/login_Btn'))
		WebUI.delay(2)
		
					
		}else if (url == GlobalVariable.tdesURL + "/login.jsp"){
		
		WebUI.openBrowser(GlobalVariable.tdesURL)
		WebUI.sendKeys(findTestObject('Convergence/Login_Page/username'), 'admin')
		WebUI.sendKeys(findTestObject('Convergence/Login_Page/password'), 'admin')
		WebUI.click(findTestObject('Convergence/Login_Page/login_Btn'))
		WebUI.delay(2)
				}
		
	}
	*/
		
	@AfterTestSuite
	def closeBrowser() {
		WebUI.closeBrowser()
 }
}