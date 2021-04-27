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

selenium.type('id=scriptNameInput', 'File Output')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'File Output')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=File Output')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

selenium.click('id=ini')

assertEquals('Saving in a non-custom format will save the entire form data in that format.', selenium.getText('//div[@class="alert alert-warning"]'))

selenium.click('id=custom')

assertTrue(selenium.isElementPresent('id=csv'))

assertEquals('Comma Separated Value File (CSV)', selenium.getText('//label[contains(text(),"Comma Separated Value File (CSV)")]'))

assertTrue(selenium.isElementPresent('id=ini'))

assertEquals('Windows INI File', selenium.getText('//label[contains(text(),"Windows INI File")]'))

assertTrue(selenium.isElementPresent('id=formxml'))

assertEquals('Native Form XML File', selenium.getText('//label[contains(text(),"Native Form XML File")]'))

assertTrue(selenium.isElementPresent('id=custom'))

assertEquals('Custom Format', selenium.getText('//label[contains(text(),"Custom Format")]'))

assertTrue(selenium.isElementPresent('id=dataxml'))

assertEquals('Data XML File', selenium.getText('//label[contains(text(),"Data XML File")]'))

assertEquals('Custom File Output Configuration', selenium.getText('//h6[contains(text(),"Custom File Output Configuration")]'))

assertEquals('File Extension', selenium.getText('//label[@for="fileOutFileExtension"]'))

assertTrue(selenium.isElementPresent('id=fileOutFileExtension'))

assertEquals('File Output Template', selenium.getText('//label[@for="fileOutOutputTemplate"]'))

assertTrue(selenium.isElementPresent('id=fileOutOutputTemplate'))

assertEquals('Field List', selenium.getText('//label[contains(text(),"Field List")]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'File_Output')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=fileOutFileExtension')

selenium.typeKeys('id=fileOutFileExtension', '.txt')

selenium.click('id=fileOutOutputTemplate')

selenium.typeKeys('id=fileOutOutputTemplate', 'output template')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::div[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output\'])[1]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageScripts_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'File Output')

assertEquals('File Output', selenium.getText('//a[@class="new-editor-open"]'))

