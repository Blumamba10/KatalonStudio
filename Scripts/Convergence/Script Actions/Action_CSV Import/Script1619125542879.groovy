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

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'CSVImport')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'CSVImport')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=CSVImport')

assertEquals('CSVImport', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertEquals('File', selenium.getText('//label[@for="FileFileInput"]'))

assertTrue(selenium.isEditable('//input[@id="FileFileInput"]'))

assertTrue(selenium.isElementPresent('//button[@id="FileFileInputMenuToggle"]'))

assertEquals('Delimiter', selenium.getText('//label[@for="DelimiterInput"]'))

assertTrue(selenium.isEditable('//input[@id="DelimiterInput"]'))

assertTrue(selenium.isElementPresent('//button[@id="DelimiterInputMenuToggle"]'))

assertEquals('Quote Character', selenium.getText('//label[@for="QuoteCharacterInput"]'))

assertTrue(selenium.isEditable('//input[@id="QuoteCharacterInput"]'))

assertTrue(selenium.isElementPresent('//button[@id="QuoteCharacterInputMenuToggle"]'))

assertEquals('End of Line Symbols', selenium.getText('//label[@for="EndofLineSymbolsInput"]'))

assertTrue(selenium.isEditable('//input[@id="EndofLineSymbolsInput"]'))

assertTrue(selenium.isElementPresent('//button[@id="EndofLineSymbolsInputMenuToggle"]'))

assertEquals('First Row Contains Column Headers', selenium.getText('//label[@for="FirstRowContainsColumnHeadersSelectTriggerInput"]'))

assertEquals('YesNo', selenium.getText('id=FirstRowContainsColumnHeadersSelectTriggerInput'))

assertEquals('Index After Header', selenium.getText('//label[@for="IndexAfterHeaderInput"]'))

assertTrue(selenium.isElementPresent('//button[@id="IndexAfterHeaderInputMenuToggle"]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'CSVImport')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('//input[@id="FileFileInput"]')

selenium.typeKeys('//input[@id="FileFileInput"]', 'File')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Index After Header\'])[1]/following::button[2]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctions_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'CSVImport')

assertEquals('CSVImport', selenium.getText('//a[@class="new-editor-open"]'))

