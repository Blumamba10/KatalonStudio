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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Administration'))

WebUI.delay(2)

selenium.click('id=historyQueueLink')

assertEquals('History', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View All\'])[2]/following::span[1]'))

assertTrue(selenium.isElementPresent('link=View All'))

assertEquals('102550100', selenium.getText('name=submittedFormsTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::a[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Script', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script\'])[1]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form\'])[1]/following::th[1]'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::th[1]'))

assertEquals('Completed', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('Time(sec)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Completed\'])[1]/following::th[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Time(sec)\'])[1]/following::th[1]'))

assertEquals('Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

selenium.click('id=checkAllCheck')

assertEquals('Help The History Queue contains forms that have been processed successfully or that have been explicitly moved from one of the other queues.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[6]'))

assertEquals('Help The History Queue contains forms that have been processed successfully or that have been explicitly moved from one of the other queues.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[2]'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Administration'))

