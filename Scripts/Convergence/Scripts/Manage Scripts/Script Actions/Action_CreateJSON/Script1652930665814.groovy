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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Create JSON')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=Create JSON')

assertEquals('Name', selenium.getText('//label[contains(text(),"Name")]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertTrue(selenium.isElementPresent('//div[2]/div/div/div'))

assertEquals('Editor', selenium.getText('//div[2]/div/div/div[2]/label'))

assertTrue(selenium.isElementPresent('id=creationModeBuilder'))

assertEquals('Builder', selenium.getText('//label[contains(text(),"Builder")]'))

assertEquals('JSON Editor', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'{}\'])[1]/preceding::label[1]'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'{}\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Variables\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'{}\'])[1]/following::div[9]'))

selenium.click('id=creationModeBuilder')

assertEquals('Properties/Elements', selenium.getText('//div[contains(text(),"Properties/Elements")]'))

assertEquals('Type', selenium.getText('//div[contains(text(),"Type")]'))

assertTrue(selenium.isElementPresent('link=Add property'))

assertEquals('Add property', selenium.getText('link=Add property'))

assertEquals('No properties configured', selenium.getText('//em'))

selenium.click('link=Add property')

assertEquals('Property Name', selenium.getText('//label[contains(text(),"Property Name")]'))

assertTrue(selenium.isEditable('id=propertyNameInput'))

assertEquals('Value Type', selenium.getText('//label[contains(text(),"Value Type")]'))

assertEquals('StringNumberBooleanArrayObject', selenium.getText('//select[@id="valueTypeSelect"]'))

assertEquals('Property Value', selenium.getText('//label[contains(text(),"Property Value")]'))

assertTrue(selenium.isEditable('id=propertyValueInput'))

assertEquals('When Value is Empty...', selenium.getText('//label[contains(text(),"When Value is Empty...")]'))

assertEquals('Exclude PropertyUse "null"Use Empty', selenium.getText('id=whenEmptySelect'))

assertTrue(selenium.isElementPresent('//div[2]/div[3]/button/i'))

assertTrue(selenium.isElementPresent('//div[2]/div[3]/button[2]/i'))

selenium.click('id=propertyNameInput')

selenium.typeKeys('id=propertyNameInput', 'Property Name')

selenium.select('//select[@id="valueTypeSelect"]', 'label=Number')

selenium.typeKeys('id=propertyValueInput', 'Property Value')

selenium.click('//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/app-json-property-element[1]/div[1]/app-json-property-editor[1]/div[1]/div[2]/div[3]/button[1]')

selenium.typeKeys('id=nameInput', 'createjson')

selenium.typeKeys('id=descriptionInput', 'description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Create JSON')

assertEquals('Create JSON', selenium.getText('//a[@class="new-editor-open"]'))

