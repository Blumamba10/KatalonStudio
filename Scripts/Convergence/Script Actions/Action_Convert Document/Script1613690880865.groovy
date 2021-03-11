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

selenium.typeKeys('id=scriptNameInput', 'Convert Document')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctions_Page/Script Editor_Page/Actions/a_ConvertDocument'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ConvertDocument\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('File', selenium.getText('//label[@for="FileFileInput"]'))

assertTrue(selenium.isElementPresent('//input[@id="FileFileInput"]'))

assertEquals('Expected File Extension', selenium.getText('//label[@for="ExpectedFileExtensionSelectInput"]'))

assertEquals('autodocdocmdocxhtmlpdfodtrtftext', selenium.getText('//select[@id="ExpectedFileExtensionSelectInput"]'))

assertEquals('The expected extension of the file to be converted.', selenium.getText('//div[contains(text(),"The expected extension of the file to be converted")]'))

assertEquals('Convert To', selenium.getText('//label[@for="ConvertToSelectInput"]'))

assertEquals('docdocmdocxhtmlpdfodtrtftext', selenium.getText('id=ConvertToSelectInput'))

assertEquals('The extension to convert the file to', selenium.getText('//div[contains(text(),"The extension to convert the file to")]'))

assertEquals('Stop on Error', selenium.getText('//label[@for="StoponErrorSelectInput"]'))

assertEquals('YesNo', selenium.getText('id=StoponErrorSelectInput'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'ConvertDocument')

selenium.typeKeys('id=descriptionInput', 'Action')

selenium.click('//input[@id="FileFileInput"]')

selenium.typeKeys('//input[@id="FileFileInput"]', 'File')

selenium.click('id=ExpectedFileExtensionSelectInput')

selenium.select('id=ExpectedFileExtensionSelectInput', 'label=pdf')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Expected File Extension\'])[1]/following::option[6]')

selenium.click('id=ConvertToSelectInput')

selenium.select('id=ConvertToSelectInput', 'label=html')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convert To\'])[1]/following::option[4]')

selenium.click('id=StoponErrorSelectInput')

selenium.select('id=StoponErrorSelectInput', 'label=No')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::option[3]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('//button[contains(text(),"OK")]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctions_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Convert Document')

assertEquals('Convert Document', selenium.getText('//a[@class="new-editor-open"]'))

