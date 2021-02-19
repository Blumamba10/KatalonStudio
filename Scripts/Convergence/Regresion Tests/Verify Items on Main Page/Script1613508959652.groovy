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

selenium.doubleClick('link=Home')

selenium.click('link=Administration')

assertTrue(selenium.isElementPresent('link=Convergence'))

assertTrue(selenium.isElementPresent('id=versionInfoLink'))

assertEquals('Documentation', selenium.getText('link=Documentation'))

assertEquals('Dashboard', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dashboard\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('id=submittedQueueLink'))

assertEquals('Holds', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('id=holdQueueLink'))

assertEquals('Errors', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Holds\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('id=errorQueueLink'))

assertEquals('History', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Errors\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('id=historyQueueLink'))

assertEquals('Updated Scripts', selenium.getText('link=Updated Scripts'))

assertEquals('Updated Templates', selenium.getText('link=Updated Templates'))

assertEquals('Projects', selenium.getText('xpath=(//a[contains(text(),\'Projects\')])[2]'))

assertEquals('Server', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebPrototype\'])[2]/following::a[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server\'])[2]/following::i[1]'))

assertTrue(selenium.isElementPresent('id=versionInfoLink'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server\'])[2]/following::td[3]'))

assertEquals('Company', selenium.getText('link=Company'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Company\'])[1]/following::td[1]'))

assertEquals('Type', selenium.getText('link=Type'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::td[1]'))

assertEquals('Host', selenium.getText('link=Host'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Host\'])[1]/following::td[1]'))

assertEquals('Server Up Time', selenium.getText('link=Server Up Time'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server Up Time\'])[1]/following::td[1]'))

assertEquals('Tomcat Server', selenium.getText('link=Tomcat Server'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Tomcat Server\'])[1]/following::td[1]'))

assertEquals('Java Version', selenium.getText('link=Java Version'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Java Version\'])[1]/following::td[1]'))

assertEquals('Operating System', selenium.getText('link=Operating System'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Operating System\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('link=Home'))

assertTrue(selenium.isElementPresent('link=Administration'))

assertTrue(selenium.isElementPresent('link=Document Management'))

assertTrue(selenium.isElementPresent('link=Projects'))

assertTrue(selenium.isElementPresent('link=Templates'))

assertTrue(selenium.isElementPresent('link=Manage Templates'))

assertTrue(selenium.isElementPresent('link=Option Lists'))

assertTrue(selenium.isElementPresent('link=Web Styles'))

assertTrue(selenium.isElementPresent('link=Scripts'))

assertTrue(selenium.isElementPresent('link=Manage Scripts'))

assertTrue(selenium.isElementPresent('link=Monitor'))

assertTrue(selenium.isElementPresent('link=Environment Variables'))

assertTrue(selenium.isElementPresent('link=Server'))

assertTrue(selenium.isElementPresent('link=Configure Server'))

assertTrue(selenium.isElementPresent('link=License Manager'))

assertTrue(selenium.isElementPresent('link=Usage'))

assertTrue(selenium.isElementPresent('link=Standard Log Viewer'))

assertTrue(selenium.isElementPresent('link=Security Log Viewer'))

assertTrue(selenium.isElementPresent('link=Logging Configuration'))

assertTrue(selenium.isElementPresent('link=Diagnostics'))

assertTrue(selenium.isElementPresent('link=Security'))

assertTrue(selenium.isElementPresent('link=Authentication'))

assertTrue(selenium.isElementPresent('link=Users'))

assertTrue(selenium.isElementPresent('link=Utilities'))

assertTrue(selenium.isElementPresent('link=Import Components'))

assertTrue(selenium.isElementPresent('link=View Form'))

assertTrue(selenium.isElementPresent('link=Delete Form'))

