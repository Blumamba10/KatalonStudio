import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
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

selenium.type('id=scriptNameInput', 'Get Form Field Values')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Get Form Field Values')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=GetFormFieldValues')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GetFormFieldValues\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Form Id', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]'))

assertEquals('Returned values will only be available at runtime', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::div[4]'))

assertEquals('Prefer Labels Over Values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Returned values will only be available at runtime\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=PreferLabelsOverValuesSelectTriggerInput'))

assertEquals('When a label is present (typically with lists), return the label instead of the value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Prefer Labels Over Values\'])[1]/following::div[1]'))

assertEquals('All Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'When a label is present (typically with lists), return the label instead of the value\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=AllFieldsSelectTriggerInput'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All Fields\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All Fields\'])[1]/following::div[1]'))

assertEquals('Include All Multi-Val Selections', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All Fields\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=IncludeAllMulti-ValSelectionsSelectTriggerInput'))

assertEquals('Indicates if Multi-val fields should have all selections returned (default is only the first)', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include All Multi-Val Selections\'])[1]/following::div[1]'))

assertEquals('Return XML-Safe Escaped Version of the Field Values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Indicates if Multi-val fields should have all selections returned (default is only the first)\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=ReturnXML-SafeEscapedVersionoftheFieldValuesSelectInput'))

assertEquals('Returned values will be escaped for use in XML', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Return XML-Safe Escaped Version of the Field Values\'])[1]/following::div[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'GetFormField')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]', 'FormID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Returned values will be escaped for use in XML\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctions_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Get Form Field Values')

assertEquals('Get Form Field Values', selenium.getText('//a[@class="new-editor-open"]'))

