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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(3)

selenium.click('id=scriptNameInput')

selenium.typeKeys('id=scriptNameInput', 'Url Util')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Url Util')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=UrlUtilAction')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Build SWAT URLBuild SWAT URL w/Token', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('Web Platform Based URL', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::button[1]'))

selenium.typeKeys('id=nameInput', 'UrlUttil')

selenium.click('id=descriptionInput')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::input[1]', 
    'Web Platform')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::button[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::button[3]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Url Util')

assertEquals('Url Util', selenium.getText('//a[@class="new-editor-open"]'))

