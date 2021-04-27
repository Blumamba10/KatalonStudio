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

selenium.typeKeys('id=scriptNameInput', 'Save File')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Save File')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=Save File')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('File', selenium.getText('//label[@for="file"]'))

assertTrue(selenium.isElementPresent('//input[@id="file"]'))

assertEquals('Base Directory', selenium.getText('//label[@for="baseDirectory"]'))

assertTrue(selenium.isElementPresent('//input[@id="baseDirectory"]'))

assertEquals('Date-Based Sub-Directory Name', selenium.getText('//label[@for="dateFormat"]'))

assertEquals('YYYY\\MM\\DDYY\\MM\\DDYYYYMMDDYYMMDD', selenium.getText('id=dateFormat'))

assertEquals('File Name', selenium.getText('//label[@for="fileName"]'))

assertTrue(selenium.isElementPresent('//input[@id="fileName"]'))

assertEquals('Extension', selenium.getText('//label[@for="extension"]'))

assertTrue(selenium.isElementPresent('//input[@id="extension"]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Save')

selenium.typeKeys('id=descriptionInput', 'File')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]', 'Desc')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base Directory\'])[1]/following::input[1]', 
    'Base')

selenium.click('id=dateFormat')

selenium.select('id=dateFormat', 'label=YY\\MM\\DD')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::input[1]', 'FileName')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::input[1]', '.txt')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save File\'])[1]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageScripts_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Save File')

assertEquals('Save File', selenium.getText('//a[@class="new-editor-open"]'))

