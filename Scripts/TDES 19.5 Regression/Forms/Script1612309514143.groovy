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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/Default Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Utilities'))

selenium.click('link=View Form')

assertEquals('View Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Enter Form ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View Form\'])[2]/following::h4[1]'))

assertEquals('Enter the numeric ID form you wish to view.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enter Form ID\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=formId'))

assertTrue(selenium.isElementPresent('id=readOnlyCheck'))

assertEquals('Display form in read-only mode', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enter the numeric ID form you wish to view.\'])[1]/following::label[1]'))

assertEquals('View Form', selenium.getText('id=submitButton'))

selenium.click('link=Administration')

selenium.click('link=Delete Form')

assertEquals('Delete Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Enter Form ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[2]/following::h4[1]'))

assertEquals('Enter the numeric ID of the form you wish to delete.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enter Form ID\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=formId'))

assertTrue(selenium.isElementPresent('id=deleteImageCheck'))

assertEquals('Delete image', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enter the numeric ID of the form you wish to delete.\'])[1]/following::label[1]'))

assertEquals('Delete Form', selenium.getText('id=submitButton'))

