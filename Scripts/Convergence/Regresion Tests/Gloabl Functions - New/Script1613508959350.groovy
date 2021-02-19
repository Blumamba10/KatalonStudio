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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

selenium.click('link=Manage Functions')

assertEquals('Manage Functions', selenium.getText('//form[@id=\'frmControllerList\']/div/div/div/div/h1'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Functions\'])[2]/following::i[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Functions\'])[2]/following::i[1]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::h1[1]'))

assertEquals('Global functions are scripts that can be used within other Convergence scripts. You can build them in the same way you build conventional publish scripts, though they do not have direct access to form field values. Use them to minimize the need for duplicate code within a single publish script or across multiple scripts.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::div[4]')

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Functions\'])[2]/following::span[2]'))

assertEquals('102550100', selenium.getText('name=controllerListTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Template Pattern', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Last Updated', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template Pattern\'])[1]/following::th[1]'))

assertEquals('Info', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Updated\'])[1]/following::th[1]'))

assertEquals('Order', selenium.getText('//table[@id=\'controllerListTable\']/thead/tr/th[5]'))

assertEquals('Actions', selenium.getText('//table[@id=\'controllerListTable\']/thead/tr/th[6]'))

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('id=addScriptButton'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Functions\'])[2]/following::button[2]'))

assertTrue(selenium.isElementPresent('id=exportScriptsButton'))

assertTrue(selenium.isElementPresent('id=removeScriptsButton'))

assertTrue(selenium.isElementPresent('id=controllerListTable_next'))

assertTrue(selenium.isElementPresent('id=controllerListTable_previous'))

selenium.click('id=checkAllCheck')

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.close()

WebUI.switchToWindowIndex(0)

