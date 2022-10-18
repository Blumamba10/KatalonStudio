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

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Handlers'))

assertEquals('Handlers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Provides access to session data in a Web Platform application\'])[1]/following::h2[1]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Handlers\'])[2]/following::th[1]'))

assertEquals('Implementation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::th[1]'))

assertEquals('Image Handler', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Implementation\'])[1]/following::strong[1]'))

assertEquals('No-op Validation Handler', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Validation Handler\'])[1]/following::p[1]'))

assertEquals('The Validation Handler is used to validate business rules for the data entered', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::p[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::button[1]'))

selenium.click('//body/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box"]/div[@id="tabWrapper"]/div[@id="handlers"]/div[@class="row-fluid"]/div[@class="span12"]/form[@id="handlerForm"]/table[@class="table table-striped table-hover"]/tbody/tr[1]/td[3]/button[1]')

assertEquals('ID', selenium.getText('//label[@for="handlerIdInput"]'))

assertTrue(selenium.isElementPresent('//span[@class="input-block-level uneditable-input"]'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Implementation', selenium.getText('//label[contains(text(),"Implementation")]'))

assertTrue(selenium.isElementPresent('//div[@class="label label-info margin-bottom-20"]'))

assertEquals('Root File Path', selenium.getText('//label[@for="rootFilePathInput"]'))

assertEquals('Change Handler Implementation', selenium.getText('//h5[contains(text(),"Change Handler Implementation")]'))

assertEquals('Handler Implementations', selenium.getText('//th[contains(text(),"Handler Implementations")]'))

assertTrue(selenium.isElementPresent('id=icRadio-0'))

assertEquals('Convergence BLOB Media Repository', selenium.getText('//strong[contains(text(),"Convergence BLOB Media Repository")]'))

assertTrue(selenium.isElementPresent('//body/form[@id="frmMain"]/div[@class="container"]/div[@class="row"]/div[@class="span6"]/div[@class="content-box padded-box"]/table[@class="table table-striped table-hover"]/tbody/tr[1]/td[2]/p[1]'))

assertTrue(selenium.isElementPresent('id=icRadio-1'))

assertEquals('Convergence FileSystem Media Repository', selenium.getText('//strong[contains(text(),"Convergence FileSystem Media Repository")]'))

assertTrue(selenium.isElementPresent('//em[contains(text(),"Manages images using a Database for Meta Data, and")]'))

assertEquals('Changing the handler implementation will cause the server to restart. After you confirm the change on this screen, you will be returned to the Configure Server screen where you can save or cancel the new configuration. If you click Save, you should see a message indicating that your change was applied. The server will then restart. Note that the page displayed may not change, but the web server will remain unresponsive for a minute or more, and you will need to log in again in order to continue.', 
    selenium.getText('id=handlerUpdateAlert'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

assertTrue(selenium.isElementPresent('id=backLink'))

selenium.click('id=icRadio-0')

assertTrue(selenium.isElementPresent('//div[@id="handlerUpdateAlert"]'))

selenium.click('id=submitButton')

assertEquals('Save Changes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=saveConfigButton'))

assertTrue(selenium.isElementPresent('id=discardConfigButton'))

WebUI.delay(5)

selenium.click('id=saveConfigButton')

WebUI.delay(75)

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Handlers'))

WebUI.delay(3)

selenium.click('//body/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box"]/div[@id="tabWrapper"]/div[@id="handlers"]/div[@class="row-fluid"]/div[@class="span12"]/form[@id="handlerForm"]/table[@class="table table-striped table-hover"]/tbody/tr[1]/td[3]/button[1]')

selenium.click('//input[@id="icRadio-1"]')

selenium.click('id=submitButton')

WebUI.delay(3)

selenium.click('id=saveConfigButton')

WebUI.delay(75)

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Configure Server'))

not_run: WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Handlers'))

not_run: selenium.click('xpath=//tr[2]/td[3]/button')

not_run: assertEquals('ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::label[1]'))

not_run: assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ID\'])[1]/following::span[1]'))

not_run: assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'validationHandler\'])[1]/following::label[1]'))

not_run: assertTrue(selenium.isElementPresent('id=descriptionInput'))

not_run: assertEquals('Implementation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::label[1]'))

not_run: assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Implementation\'])[1]/following::div[1]'))

not_run: assertEquals('Changing the handler implementation will cause the server to restart. After you confirm the change on this screen, you will be returned to the Configure Server screen where you can save or cancel the new configuration. If you click Save, you should see a message indicating that your change was applied. The server will then restart. Note that the page displayed may not change, but the web server will remain unresponsive for a minute or more, and you will need to log in again in order to continue.', 
    selenium.getText('id=handlerUpdateAlert'))

not_run: assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No-op Validation Handler\'])[1]/following::i[1]'))

not_run: assertTrue(selenium.isElementPresent('id=submitButton'))

not_run: assertTrue(selenium.isElementPresent('id=cancelButton'))

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save\'])[1]/following::i[2]')

not_run: assertEquals('Save Changes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[1]/following::h4[1]'))

not_run: assertTrue(selenium.isElementPresent('id=saveConfigButton'))

not_run: assertTrue(selenium.isElementPresent('id=discardConfigButton'))

not_run: selenium.click('id=saveConfigButton')

not_run: WebUI.waitForPageLoad(30)

