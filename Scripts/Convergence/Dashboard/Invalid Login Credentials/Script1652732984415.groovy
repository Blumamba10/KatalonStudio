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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(GlobalVariable.tdesURL)

def driver = DriverFactory.getWebDriver()

String baseUrl = GlobalVariable.tdesURL

selenium = new WebDriverBackedSelenium(driver, baseUrl)



WebUI.maximizeWindow()

TestData invalidLogin = findTestData('Invalid Login')

System.out.println("[Row Count] : " + invalidLogin.getRowNumbers())

for(int i = 1; i<= invalidLogin.getRowNumbers(); i++) {
	

WebUI.sendKeys(findTestObject('Convergence/Login/username'), findTestData('Invalid Login').getValue("Username", i))

WebUI.sendKeys(findTestObject('Convergence/Login/password'), findTestData('Invalid Login').getValue("Password", i))

WebUI.click(findTestObject('Convergence/Login/button_Login'))

assertEquals('Login failed. Invalid security credentials.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence\'])[1]/following::p[1]'))

}
WebUI.sendKeys(findTestObject('Convergence/Login/username'), 'admin')

WebUI.sendKeys(findTestObject('Convergence/Login/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

assertTrue(selenium.isElementPresent('link=Convergence'))

