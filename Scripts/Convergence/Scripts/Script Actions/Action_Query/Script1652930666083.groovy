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

selenium.typeKeys('id=scriptNameInput', 'Query Action')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Query Action')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=Query')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DB Query\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Datasource', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('id=datasourceSelect'))

selenium.click('//div[2]/div[2]/div/label')

assertEquals('SQL Statement', selenium.getText('//div[2]/div[2]/div/label'))

assertTrue(selenium.isElementPresent('//div[2]/div[2]/div/label'))

assertEquals('Variables', selenium.getText('//label[contains(text(),"Variables")]'))

assertEquals('Stop the script with an error if:', selenium.getText('//div[@class="font-weight-bold"]'))

assertTrue(selenium.isElementPresent('id=errorNoRows'))

assertEquals('No rows are returned from the query', selenium.getText('//label[contains(text(),"No rows are returned from the query")]'))

assertTrue(selenium.isElementPresent('id=errorMultipleRows'))

assertEquals('More than one row is returned from the query', selenium.getText('//label[contains(text(),"More than one row is returned from the query")]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Query')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=datasourceSelect')

selenium.select('id=datasourceSelect', 'label=configDataSource')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More than one row is returned from the query\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('id=errorNoRows')

selenium.click('id=errorMultipleRows')

selenium.click('//div[contains(text(),"Macros")]')

selenium.click('//div[contains(text(),"Collection")]')

selenium.click('//li[@class="list-group-item ng-star-inserted"]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More than one row is returned from the query\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[2]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Query Action')

assertEquals('Query Action', selenium.getText('//a[@class="new-editor-open"]'))

