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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Projects'))

assertEquals('Manage Projects', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::span[1]'))

assertTrue(selenium.isElementPresent('name=projectListTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=selectAllCheck'))

assertEquals('Project Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Info', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Project Name\'])[1]/following::th[1]'))

selenium.click('id=selectAllCheck')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[1]')

selenium.click('id=projectName')

selenium.type('id=projectName', 'webapp')

selenium.type('id=projectDescription', 'test')

assertEquals('Project Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::label[1]'))

selenium.click('name=createApp')

selenium.select('name=createApp', 'label=Web Application')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Project Type\'])[1]/following::option[2]')

selenium.click('id=submitButton')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[4]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[5]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[1]')

assertEquals('New Project', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Project\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=projectName'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=projectDescription'))

assertEquals('Project Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]'))

selenium.click('id=projectName')

WebUI.setText(findTestObject('Convergence/Projects/New Project/projectName'), '10172018_test')

selenium.click('id=projectDescription')

selenium.type('id=projectDescription', 'Test Project Description')

selenium.click('id=submitButton')

selenium.waitForPageToLoad('30000')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    '10172018')

selenium.click('id=10172018_test')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[4]')

assertEquals('Removing a project will delete ALL of its associated templates, scripts, option lists, and style configurations. Are you sure you want to remove the selected project?', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Confirm Remove Project\'])[1]/following::p[1]'))

WebUI.delay(6)

selenium.click('id=overlayConfirmOk')

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'webapp')

WebUI.click(findTestObject('Convergence/Projects/checkbox_Select all'))

WebUI.click(findTestObject('Convergence/Projects/button_Delete'))

WebUI.click(findTestObject('Convergence/Projects/button_OK'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.setText(findTestObject('null'), 'webwebapp')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

