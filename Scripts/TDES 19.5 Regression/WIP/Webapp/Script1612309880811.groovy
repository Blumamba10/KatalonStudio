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

CustomKeywords.'cutomKeywords.LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

// selenium.Put "WebApp" URL in Window("example: http://localhost:8080/webapp")
assertEquals('Login', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'webapp - Login\'])[1]/following::div[1]'))

assertEquals('Username', selenium.getText('id=fl-username'))

assertTrue(selenium.isElementPresent('id=fc-username'))

assertEquals('Password', selenium.getText('id=fl-password'))

assertTrue(selenium.isElementPresent('id=fc-password'))

assertTrue(selenium.isElementPresent('id=tdeLoginButton'))

selenium.type('id=fc-username', 'user1')

selenium.click('id=tdeLoginButton')

assertEquals('Page Not Found', selenium.getText('id=fl-pageNotFound'))

assertEquals('Page Not Found', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'webapp - Page Not Found\'])[1]/following::div[1]'))

assertEquals('No customization of WebPrototype has been done yet', selenium.getText('id=fl-message'))

assertTrue(selenium.isElementPresent('id=fl-message'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No customization of WebPrototype has been done yet\'])[1]/following::input[3]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No customization of WebPrototype has been done yet\'])[1]/following::input[4]')

assertEquals('Logged Out', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'webapp - Logged Out\'])[1]/following::div[1]'))

assertEquals('You have been successfully logged out.  Please close your browser for security reasons.', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logged Out\'])[1]/following::p[1]'))

assertEquals('If you wish to login again, please click "Return to Login".', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logged Out\'])[1]/following::p[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logged Out\'])[1]/following::input[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logged Out\'])[1]/following::input[1]')

