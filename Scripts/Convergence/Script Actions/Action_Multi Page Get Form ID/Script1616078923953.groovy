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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(3)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Multi Page Get Form ID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Multi Page Get Form ID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=MultiPageGetFormId')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageGetFormId\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Page Map Mode', selenium.getText('//label[@for="PageMapModeSelectTriggerInput"]'))

assertEquals('Pass in the page mapLoad map from formPull map from current form', selenium.getText('id=PageMapModeSelectTriggerInput'))

assertEquals('Page Map', selenium.getText('//label[@for="PageMapInput"]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::input[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::i[1]'))

assertEquals('This value should be set with the paramMap value returned from the MuliPageCreate action', selenium.getText(
        '//div[contains(text(),"This value should be set with the paramMap value r")]'))

assertEquals('Page Index', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'This value should be set with the paramMap value returned from the MuliPageCreate action\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::i[1]'))

assertEquals('The 1-based index of the page form id to return', selenium.getText('//div[contains(text(),"The 1-based index of the page form id to return")]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'MultiPageGetFormID')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::input[1]', 'Page Map')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The 1-based index of the page form id to return\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageGetFormId\'])[1]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageScripts_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Multi Page Get Form ID')

assertEquals('Multi Page Get Form ID', selenium.getText('//a[@class="new-editor-open"]'))

