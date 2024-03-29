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

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Home'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Administration'))

WebUI.delay(2)

selenium.click('id=holdQueueLink')

assertEquals('Hold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hold\'])[1]/following::span[1]'))

assertEquals('102550100All', selenium.getText('name=submittedFormsTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::a[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[6]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::th[1]'))

assertEquals('Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form\'])[1]/following::th[1]'))

assertEquals('Last Hold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

assertEquals('Retry Eligible', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Hold\'])[1]/following::th[1]'))

assertEquals('Will Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Retry Eligible\'])[1]/following::th[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Will Error\'])[1]/following::th[1]'))

assertEquals('Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Home'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Administration'))

