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

CustomKeywords.'cutomKeywords.Demo_LoginHelper.login'(GlobalVariable.demoappURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.enableSmartWait()

selenium.click('link=Web Platform')

selenium.click('link=Multi-Page Forms')

WebUI.comment('Demographics & Emplyment Page')

assertEquals('Patient Registration', selenium.getText('//tr[2]/td/div'))

assertEquals('This form is here to demonstrate multi-page functionality.  The Patient Information section will be copied to each page.', 
    selenium.getText('//p'))

assertEquals('Patient Information', selenium.getText('//div/table/tbody/tr/td'))

assertEquals('First Name *', selenium.getText('//th'))

assertEquals('Last Name *', selenium.getText('//th[2]'))

assertEquals('SSN *', selenium.getText('//th[3]'))

assertEquals('Date of Birth *', selenium.getText('//th[4]'))

assertEquals('Patient - Addresses', selenium.getText('//div[2]/table/tbody/tr/td'))

assertEquals('Street *', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/th[2]'))

assertEquals('City *', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/th[3]'))

assertEquals('State *', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/th[4]'))

assertEquals('Zipcode *', selenium.getText('//th[5]'))

assertEquals('Home', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td'))

assertEquals('Mailing (if different)', selenium.getText('//td/table/tbody/tr[3]/td'))

assertEquals('Patient Detail', selenium.getText('//div[3]/table/tbody/tr/td'))

assertEquals('Daytime Phone', selenium.getText('//div/table/tbody/tr/td/div'))

assertEquals('Evening Phone', selenium.getText('//div/table/tbody/tr[2]/td/div'))

assertEquals('Email Address', selenium.getText('//div/table/tbody/tr[3]/td/div'))

assertEquals('Sex *', selenium.getText('xpath=//div[@id=\'fl-patient-detail-2-sex\']/span'))

assertEquals('MaleFemale', selenium.getText('//td[2]/div/select'))

assertEquals('Marital Status *', selenium.getText('//tr[2]/td/div/span'))

assertEquals('SingleMarriedWidowedDivorcedSeparated', selenium.getText('//tr[2]/td[2]/div/select'))

assertEquals('Healthcare Proxy', selenium.getText('//tr[4]/td/div'))

assertEquals('YesNo', selenium.getText('//tr[4]/td[2]/div/select'))

assertEquals('Referring Physician', selenium.getText('//div[4]/table/tbody/tr/td'))

assertEquals('Name', selenium.getText('//div[4]/table/tbody/tr[2]/td/table/tbody/tr/th'))

assertEquals('Street', selenium.getText('//div[4]/table/tbody/tr[2]/td/table/tbody/tr/th[2]'))

assertEquals('City', selenium.getText('//div[4]/table/tbody/tr[2]/td/table/tbody/tr/th[3]'))

assertEquals('State', selenium.getText('//div[4]/table/tbody/tr[2]/td/table/tbody/tr/th[4]'))

assertEquals('Zipcode', selenium.getText('//div[4]/table/tbody/tr[2]/td/table/tbody/tr/th[5]'))

assertEquals('Employment Information (Parent\'s employer if minor)', selenium.getText('//td/div[2]/table/tbody/tr/td'))

assertEquals('Employed *', selenium.getText('//div[2]/table/tbody/tr[2]/td/div/span'))

assertEquals('YesNo', selenium.getText('//div[2]/table/tbody/tr[2]/td[2]/div/select'))

assertTrue(selenium.isElementPresent('//input[@id=\'btn-Next\']'))

assertTrue(selenium.isElementPresent('//input[@value=\'Close\']'))

selenium.type('id=fc-patient-identity-firstName', 'test')

selenium.type('id=fc-patient-identity-lastName', 'user')

selenium.type('//td[5]/div/input', '37076')

selenium.click('//form[@id=\'tde-data-entry-form\']')

selenium.waitForPageToLoad('30000')

selenium.click('id=btn-Next')

selenium.click('id=btn-Next')

selenium.click('id=publish_button')

WebUI.enableSmartWait()

assertEquals('Field Required', selenium.getText('//td[3]/span'))

assertEquals('Field Required', selenium.getText('//td[4]/span'))

assertEquals('Field Required', selenium.getText('//td[2]/span'))

assertEquals('Field Required', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]/span'))

assertEquals('Field Required', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/span'))

assertEquals('Field Required', selenium.getText('//div/table/tbody/tr/td[3]/span'))

assertEquals('Field Required', selenium.getText('//div/table/tbody/tr[2]/td[3]/span'))

assertEquals('Field Required', selenium.getText('//div[2]/table/tbody/tr[2]/td[3]/span'))

selenium.type('id=fc-patient-identity-firstName', 'Lebron')

selenium.type('id=fc-patient-identity-lastName', 'James')

selenium.type('id=fc-patient-addresses-home-street', '123 Test')

selenium.type('id=fc-patient-addresses-home-city', 'Hermitage')

selenium.select('id=fc-patient-addresses-home-state', 'label=TN')

selenium.click('xpath=//option[@value=\'TN\']')

selenium.type('id=fc-patient-addresses-home-zipcode', '37211')

selenium.type('id=fc-patient-detail-1-email', 'test@gmail.com')

selenium.select('id=fc-patient-detail-2-sex', 'label=Male')

selenium.click('xpath=//option[@value=\'Male\']')

selenium.select('id=fc-patient-detail-2-maritalStatus', 'label=Single')

selenium.click('id=fc-patient-detail-2-healthcareProxy')

selenium.select('id=fc-patient-detail-2-healthcareProxy', 'label=No')

selenium.type('id=fc-patient-referringPhysician-name', 'Tim')

selenium.type('id=fc-patient-referringPhysician-street', 'Jones')

selenium.type('id=fc-patient-referringPhysician-city', 'Brentwood')

selenium.select('id=fc-patient-referringPhysician-state', 'label=TN')

selenium.click('xpath=//select[@id=\'fc-patient-referringPhysician-state\']/option[44]')

selenium.type('id=fc-patient-referringPhysician-zipcode', '37888')

selenium.select('id=fc-employment-employed', 'label=Yes')

selenium.click('id=fc-employment-employer')

selenium.type('id=fc-employment-employer', 'VGT')

selenium.click('id=fc-employment-occupation')

selenium.type('id=fc-employment-occupation', 'Sales')

selenium.click('id=fc-employment-address-street')

selenium.type('id=fc-employment-address-street', '888 Gaming')

selenium.click('id=fc-employment-address-city')

selenium.type('id=fc-employment-address-city', 'Orlando')

selenium.click('id=fc-employment-address-state')

selenium.select('id=fc-employment-address-state', 'label=FL')

selenium.click('xpath=//select[@id=\'fc-employment-address-state\']/option[11]')

selenium.click('id=fc-employment-address-zipcode')

selenium.type('id=fc-employment-address-zipcode', '88845')

selenium.click('id=fc-employment-address-phone')

selenium.type('//input[@id="fc-patient-identity-ssn"]', '445165889')

selenium.type('//input[@id="fc-patient-identity-dateOfBirth"]', '06/06/1980')

selenium.click('id=btn-Next')

selenium.click("id=pagenav-yes-button");