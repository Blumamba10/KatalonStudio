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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

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

selenium.typeKeys('id=scriptNameInput', 'Query XML')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Query XML')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=Query XML')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('XML Data Source', selenium.getText('//label[@for="xmlDataInput"]'))

assertTrue(selenium.isElementPresent('//input[@id="xmlDataInput"]'))

assertEquals('Query For', selenium.getText('//label[@for="operationSelect"]'))

assertEquals('Has ValueValue Is EmptyGet ValueGet XML DataGet Element ValuesGet Element Count', selenium.getText('id=operationSelect'))

assertEquals('Select a mode for creating the query.', selenium.getText('//div[@class="text-muted text-sm-left"]'))

assertEquals('Builder', selenium.getText('//label[contains(text(),"Builder")]'))

assertEquals('XPath', selenium.getText('//label[contains(text(),"XPath")]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/preceding::div[4]'))

assertEquals('Hover over items to see options to add a new element or remove the current element. Click an item to edit it. “Root” is not editable.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::small[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'QueryXML')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data Source\'])[1]/following::input[1]', 
    'XML_Data_Souirce')

selenium.click('id=operationSelect')

selenium.select('id=operationSelect', 'label=Get Value')

selenium.click('id=creationModeFile')

selenium.click('id=xPathInput')

selenium.typeKeys('id=xPathInput', 'XPath')

selenium.click('id=xPathNamespacesInput')

selenium.typeKeys('id=xPathNamespacesInput', 'Namespaces')

assertEquals('XPath', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(format: prefix1=sampleuri1;prefix2=sampleuri2)\'])[1]/preceding::label[1]'))

assertTrue(selenium.isElementPresent('id=xPathInput'))

assertEquals('Optional Namespaces (format: prefix1=sampleuri1;prefix2=sampleuri2)', selenium.getText('//div[3]/div/label'))

assertTrue(selenium.isElementPresent('id=xPathNamespacesInput'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(format: prefix1=sampleuri1;prefix2=sampleuri2)\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(format: prefix1=sampleuri1;prefix2=sampleuri2)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query XML\'])[1]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageScripts_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Query XML')

assertEquals('Query XML', selenium.getText('//a[@class="new-editor-open"]'))

