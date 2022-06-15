import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Projects'))

assertEquals('Manage Projects', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::span[1]'))

assertTrue(selenium.isElementPresent('name=projectListTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=selectAllCheck'))

assertEquals('Project Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Info', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Project Name\'])[1]/following::th[1]'))

selenium.click('id=selectAllCheck')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[1]')

selenium.click('id=projectName')

selenium.type('id=projectName', 'webapp')

selenium.type('id=projectDescription', 'test')

assertEquals('Project Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::label[1]'))

selenium.click('name=createApp')

selenium.select('name=createApp', 'label=Web Application')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Project Type\'])[1]/following::option[2]')

selenium.click('id=submitButton')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[4]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[5]'))

WebUI.comment('Verify new project is in the Project Dropdown')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Convergence/_SelectProject/a_webapp'), 0)

WebUI.click(findTestObject('Convergence/_SelectProject/a_webapp'))

WebUI.comment('Verify  associatied scripts are created')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

assertEquals('Showing 1 to 7 of 7 entries', selenium.getText('//div[@id="controllerListTable_info"]'))

WebUI.comment('Verify associatied templates are created')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Templates'))

assertEquals('Showing 1 to 10 of 13 entries', selenium.getText('//div[@id="templateListTable_info"]'))

WebUI.comment('Verify User is Created')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'webwebapp')

assertEquals('Webwebapp', selenium.getText('//a[contains(text(),"Webwebapp")]'))

