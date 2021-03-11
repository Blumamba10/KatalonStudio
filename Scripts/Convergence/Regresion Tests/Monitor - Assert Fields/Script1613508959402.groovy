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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Monitor'))

assertEquals('Monitor live', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'live\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'live\'])[1]/following::i[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'live\'])[1]/following::i[3]'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'live\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::div[1]'))

assertEquals('Last Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[1]/following::p[1]'))

assertEquals('Next Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[1]/following::h5[1]'))

assertEquals('Configure', selenium.getText('link=Configure'))

assertTrue(selenium.isElementPresent('id=displaySubmittedLink'))

assertEquals('Hold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hold\'])[1]/following::div[1]'))

assertEquals('Last Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hold\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[2]/following::p[1]'))

assertEquals('Next Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[2]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[2]/following::p[1]'))

assertEquals('Configure', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[2]/following::a[1]'))

assertTrue(selenium.isElementPresent('id=displayHoldLink'))

assertEquals('Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View\'])[2]/following::h6[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[1]/following::div[1]'))

assertEquals('Last Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[3]/following::p[1]'))

assertEquals('Next Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[3]/following::h5[1]'))

assertTrue(selenium.isElementPresent('id=displayErrorLink'))

assertEquals('History', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View\'])[3]/following::h6[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'History\'])[1]/following::div[1]'))

assertEquals('Last Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'History\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[4]/following::p[1]'))

assertEquals('Next Run Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Run Time\'])[4]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[4]/following::p[1]'))

assertEquals('Configure', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[4]/following::a[2]'))

assertTrue(selenium.isElementPresent('id=historyQueueButton'))

WebUI.verifyElementVisible(findTestObject('Convergence/Scripts/Monitor_Page/em_ monitor live updates occur every 3 seconds'), 
    FailureHandling.STOP_ON_FAILURE)

