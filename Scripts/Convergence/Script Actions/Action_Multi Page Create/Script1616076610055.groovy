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

selenium.type('id=scriptNameInput', 'Multi Page Create')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Multi Page Create')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=MultiPageCreate')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageCreate\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Group Template NameSelect pages', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('To select a group of similarly named templates, select the \'Group Template Name\' option. To select individual templates, choose \'Select Pages\'.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::div[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=TemplateSelectInput'))

assertEquals('Web Form Style', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=WebFormStyleSelectTriggerInput'))

assertEquals('The web form style to apply to the pages', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Form Style\'])[1]/following::div[1]'))

assertEquals('Multipage Form Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The web form style to apply to the pages\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[1]'))

assertEquals('Not required. Name for all pages of this multi-page form/application - can be used in SWAT publish scripts', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'MultiPageCreate')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=TemplateSelectInput')

selenium.select('id=TemplateSelectInput', 'label=Next Template')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::option[2]')

selenium.click('id=WebFormStyleSelectTriggerInput')

selenium.select('id=WebFormStyleSelectTriggerInput', 'label=Default')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]', 
    'Multipage')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageCreate\'])[2]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctions_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Multi Page Create')

assertEquals('Multi Page Create', selenium.getText('//a[@class="new-editor-open"]'))
