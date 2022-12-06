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

WebUI.callTestCase(findTestCase('_Helper Functions/CreateInternalUser'), [('userName') : 'AdminUser', ('password') : 'asd354*&(saf'], 
    FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//a[contains(text(),"AdminConsoleUser")]')

WebUI.comment('Add Project Role')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/btn_Update'))

WebUI.setText(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/txt_Search Filter'), 'ADMIN_CONSOLE_USER')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/chkbox_Select All_Available'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/btn_Add Role'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/button_Done'))

WebUI.comment('Add Project Access')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/a_Project Roles'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/btn_Add Roles'))

WebUI.sendKeys(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/_Add Project Roles/txt_Search Filter'), 
    'Default')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/_Add Project Roles/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/_Add Project Roles/btn_Add Selections'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/_Add Project Roles/btn_Close'))

WebUI.comment('Log out and login with Admin Console User')

CustomKeywords.'cutomKeywords.Convergence_LogoutLogin.LogoutLogin'('AdminConsoleUser', 'asd354*&(saf')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.OPTIONAL)

WebUI.comment('Verify access to Home page')

