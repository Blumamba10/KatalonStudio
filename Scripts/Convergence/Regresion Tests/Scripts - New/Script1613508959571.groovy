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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

assertEquals('Manage Scripts', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::h1[1]'))

assertEquals('When a form is published, the first script in the ordered list below whose template name pattern matches the template name pattern of the form will be executed. The template name associated with a script may contain wildcards(*).', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::div[3]')

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::span[2]'))

assertEquals('102550100', selenium.getText('name=controllerListTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Template Pattern', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Last Updated', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template Pattern\'])[1]/following::th[1]'))

assertEquals('Info', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Updated\'])[1]/following::th[1]'))

assertEquals('Order', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Info\'])[1]/following::th[1]'))

assertEquals('Actions', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Order\'])[1]/following::th[1]'))

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('id=addScriptButton'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::button[2]'))

assertTrue(selenium.isElementPresent('id=exportScriptsButton'))

assertTrue(selenium.isElementPresent('id=removeScriptsButton'))

assertTrue(selenium.isElementPresent('id=controllerListTable_next'))

assertTrue(selenium.isElementPresent('id=controllerListTable_previous'))

selenium.click('id=checkAllCheck')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::i[3]')

WebUI.switchToWindowIndex('1')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.close()

WebUI.switchToWindowIndex('0')

