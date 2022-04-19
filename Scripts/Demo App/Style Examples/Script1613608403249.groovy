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

selenium.click('link=Web Platform')

selenium.click('link=Style Examples')

assertEquals('Style Examples', selenium.getText('//table[@id=\'form-enclosing-table\']/tbody/tr[2]/td/div'))

assertTrue(selenium.isElementPresent('//div[@id=\'lbl-label\']'))

assertEquals('Applicant', selenium.getText('id=gl-applicant-identity:1'))

assertEquals('First Name *', selenium.getText('//div[@id=\'fl-applicant-identity-firstName\']/span'))

assertEquals('Last Name *', selenium.getText('//div[@id=\'fl-applicant-identity-lastName\']/span'))

assertEquals('SSN', selenium.getText('id=fl-applicant-identity-ssn'))

assertEquals('Date of Birth *', selenium.getText('//div[@id=\'fl-applicant-identity-dateofBirth\']/span'))

assertEquals('Home Phone *', selenium.getText('//div[@id=\'fl-applicant-contact-homePhone\']/span'))

assertEquals('Office Phone', selenium.getText('id=fl-applicant-contact-officePhone'))

assertEquals('Email', selenium.getText('id=fl-applicant-contact-email'))

assertEquals('Box Styles', selenium.getText('id=fl-groupStyle'))

assertTrue(selenium.isElementPresent('id=fc-groupStyle'))

assertEquals('Favorite States', selenium.getText('//td/div[2]/table/tbody/tr/td'))

assertEquals('Select your favorite 3 states:', selenium.getText('id=fl-favoriteStates-state'))

assertEquals('List Style', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div'))

assertTrue(selenium.isElementPresent('//div[2]/textarea'))

assertEquals('Addresses', selenium.getText('//div[3]/table/tbody/tr/td'))

assertEquals('Street', selenium.getText('//th[2]'))

assertEquals('City', selenium.getText('//th[3]'))

assertEquals('State', selenium.getText('//th[4]'))

assertEquals('Zipcode', selenium.getText('//th[5]'))

assertEquals('Home', selenium.getText('//td/table/tbody/tr[2]/td'))

assertEquals('Office', selenium.getText('//td/table/tbody/tr[3]/td'))

assertEquals('Please answer the following:', selenium.getText('//div[4]/table/tbody/tr/td'))

assertEquals('(Select Social Media and then Other)', selenium.getText('//i'))

selenium.click('//div[4]/table/tbody/tr[2]/td[2]/div/input')

assertEquals('Which service? *', selenium.getText('//tr[3]/td/div/span'))

selenium.click('//td[2]/div/input[4]')

assertEquals('Please specify *', selenium.getText('//tr[4]/td/div/span'))

selenium.click('//tr[5]/td[2]/div/input')

assertTrue(selenium.isVisible('//tr[6]/td/div/span'))

assertTrue(selenium.isVisible('//tr[6]/td[2]/div/textarea'))

selenium.click('//tr[5]/td[2]/div/input[2]')

assertEquals('Label Style', selenium.getText('//div[4]/div/table/tbody/tr/td/div'))

assertTrue(selenium.isElementPresent('//div[4]/div/table/tbody/tr/td[2]/div/textarea'))

assertEquals('Attachments', selenium.getText('//div[5]/table/tbody/tr/td'))

selenium.click('//span/a')

assertTrue(selenium.isVisible('//div[5]/div/div'))

selenium.selectFrame('index=0')

assertEquals('Upload', selenium.getText('//button'))

assertEquals('Cancel', selenium.getText('//button[2]'))

selenium.click('//button[2]')

