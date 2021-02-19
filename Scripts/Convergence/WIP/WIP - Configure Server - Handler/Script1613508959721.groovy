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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/a_Handlers'))

assertEquals('Handlers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Provides access to session data in a Web Platform application\'])[1]/following::h2[1]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Handlers\'])[2]/following::th[1]'))

assertEquals('Implementation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::th[1]'))

assertEquals('Image Handler', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Implementation\'])[1]/following::strong[1]'))

assertEquals('Convergence BLOB Media Repository', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Image Handler\'])[1]/following::strong[1]'))

assertEquals('The Image Handler component is responsible for storing and retrieving image files', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence BLOB Media Repository\'])[1]/following::p[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence BLOB Media Repository\'])[1]/following::button[1]'))

assertEquals('Validation Handler', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit\'])[1]/following::strong[1]'))

assertEquals('No-op Validation Handler', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Validation Handler\'])[1]/following::p[1]'))

assertEquals('The Validation Handler is used to validate business rules for the data entered', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::p[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence BLOB Media Repository\'])[1]/following::button[1]')

assertEquals('ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence BLOB Media Repository\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ID\'])[1]/following::span[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'imageHandler\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Implementation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manages images in a Database using a BLOB Database type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Implementation\'])[1]/following::div[1]'))

assertEquals('Change Handler Implementation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'com.trinisys.tdes.handlers.mediamanager.BlobMediaManager\'])[1]/following::h5[1]'))

assertEquals('Handler Implementations', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Change Handler Implementation\'])[1]/following::th[2]'))

assertTrue(selenium.isElementPresent('id=icRadio-0'))

assertEquals('Convergence BLOB Media Repository', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Handler Implementations\'])[1]/following::strong[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence BLOB Media Repository\'])[2]/following::em[1]'))

assertTrue(selenium.isElementPresent('id=icRadio-1'))

assertEquals('Convergence FileSystem Media Repository', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence BLOB Media Repository\'])[2]/following::strong[1]'))


assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence FileSystem Media Repository\'])[1]/following::em[1]'))

assertEquals('Changing the handler implementation will cause the server to restart. After you confirm the change on this screen, you will be returned to the Configure Server screen where you can save or cancel the new configuration. If you click Save, you should see a message indicating that your change was applied. The server will then restart. Note that the page displayed may not change, but the web server will remain unresponsive for a minute or more, and you will need to log in again in order to continue.', 
    selenium.getText('id=handlerUpdateAlert'))

assertEquals('', selenium.getText('id=submitButton'))

assertEquals('', selenium.getText('id=cancelButton'))

assertTrue(selenium.isElementPresent('id=backLink'))

selenium.click('id=icRadio-1')

selenium.click('id=submitButton')

assertEquals('Save Changes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=saveConfigButton'))

assertTrue(selenium.isElementPresent('id=discardConfigButton'))

selenium.click('id=saveConfigButton')

WebUI.delay(60)

WebUI.enableSmartWait()

WebUI.sendKeys(findTestObject('Convergence/Login_Page/username'), 'admin')

WebUI.sendKeys(findTestObject('Convergence/Login_Page/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login_Page/login_Btn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/a_Handlers'))


assertEquals('Convergence FileSystem Media Repository', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Image Handler\'])[1]/following::strong[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'configDataSourceSessionFactory\'])[1]/following::button[1]')

selenium.click('id=icRadio-0')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save\'])[1]/following::i[2]')

selenium.click('id=saveConfigButton')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/a_Handlers'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::button[1]')

assertEquals('ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ID\'])[1]/following::span[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'validationHandler\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Implementation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Implementation\'])[1]/following::div[1]'))

assertEquals('Changing the handler implementation will cause the server to restart. After you confirm the change on this screen, you will be returned to the Configure Server screen where you can save or cancel the new configuration. If you click Save, you should see a message indicating that your change was applied. The server will then restart. Note that the page displayed may not change, but the web server will remain unresponsive for a minute or more, and you will need to log in again in order to continue.', 
    selenium.getText('id=handlerUpdateAlert'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save\'])[1]/following::i[2]')

assertEquals('Save Changes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=saveConfigButton'))

assertTrue(selenium.isElementPresent('id=discardConfigButton'))

selenium.click('id=saveConfigButton')

WebUI.waitForPageLoad(30)

