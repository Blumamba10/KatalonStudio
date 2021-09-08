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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

selenium.click('link=Manage Templates')

assertEquals('Manage Templates', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::span[2]'))

assertTrue(selenium.isElementPresent('name=templateListTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=selectAllCheck'))

assertEquals('Template Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Last Updated', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template Name\'])[1]/following::th[1]'))

assertEquals('Info', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Updated\'])[1]/following::th[1]'))

assertEquals('FDLs', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Info\'])[1]/following::th[1]'))

assertEquals('Actions', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'FDLs\'])[1]/following::th[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

WebUI.delay(2)

selenium.click('id=selectAllCheck')

assertTrue(selenium.isElementPresent('id=addTemplateButton'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::div[5]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::button[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::button[4]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::button[5]'))

selenium.click('id=selectAllCheck')

selenium.click('id=addTemplateButton')

WebUI.switchToWindowIndex(1)

assertTrue(selenium.isElementPresent('//ul[@class=\'nav nav-tabs tte-main-tabs\']'))

selenium.close()

WebUI.switchToWindowIndex(0)

