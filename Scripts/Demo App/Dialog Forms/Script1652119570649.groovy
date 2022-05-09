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

selenium.click('link=Dialog Forms')

assertEquals('Dialog Forms', selenium.getText('//tr[2]/td/div'))

assertEquals('This page demonstrates the usage of dialog forms.', selenium.getText('//div[@id=\'lbl-label\']/p'))

assertEquals('Simple Dialog', selenium.getText('//div/table/tbody/tr/td'))

assertEquals('First Name', selenium.getText('//td[2]/div/table/tbody/tr/td/table/tbody/tr/td/div'))

assertEquals('Last Name', selenium.getText('//td[2]/div/table/tbody/tr/td/table/tbody/tr/td[2]/div'))

assertEquals('Birthdate', selenium.getText('//td[3]/div'))

assertEquals('Home Phone', selenium.getText('//td[4]/div'))

assertEquals('Show Simple Dialog', selenium.getText('//button'))

selenium.click('//button')

selenium.selectFrame('index=0')

selenium.type('//input[@id=\'fc-firstName\']', 'Test')

selenium.type('//input[@id=\'fc-lastName\']', 'User')

selenium.type('//input[@id=\'fc-birthdate\']', '01011990')

selenium.type('//input[@id=\'fc-homePhone\']', '16151234567')

assertTrue(selenium.isElementPresent('id=tdeDlgOkButton'))

assertTrue(selenium.isElementPresent('id=tdeDlgCancelButton'))

selenium.click('id=tdeDlgOkButton')

selenium.selectFrame('relative=parent')

assertEquals('Centered Dialog', selenium.getText('//div[2]/table/tbody/tr/td'))

assertEquals('Show Centered Dialog', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div/button'))

assertEquals('Displays a dialog centered in the screen', selenium.getText('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div'))

selenium.click('//div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div/button')

selenium.selectFrame('index=0')

selenium.click('//tr[2]/td/div')

/* Katalon Studio does not support: sendKeys */
selenium.type('//tr[2]/td[2]/div/input', 'user')

selenium.type('//tr[4]/td[2]/div/input', '16159876541')

selenium.click('//input[@id=\'publish_button\']')

selenium.selectFrame('relative=parent')

assertEquals('Publishing Dialog', selenium.getText('//div[3]/table/tbody/tr/td'))

assertEquals('Display a form-based dialog whose contents will be "published" - execute a script matching the name of the form.', 
    selenium.getText('//div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/div'))

assertEquals('Show Publishing Dialog', selenium.getText('//div[3]/table/tbody/tr[2]/td/table/tbody/tr/td/div/button'))

selenium.click('//div[3]/table/tbody/tr[2]/td/table/tbody/tr/td/div/button')

selenium.click('//div[5]/div/div')

selenium.selectFrame('index=0')

selenium.click('//tr[2]/td/div')

selenium.click('//td[2]/div/input')

selenium.type('//td[2]/div/input', 'User')

selenium.type('//tr[2]/td[2]/div/input', 'Tester')

selenium.type('//tr[4]/td[2]/div/input', '19014561237')

selenium.click('//input[@id=\'publish_button\']')

selenium.selectFrame('relative=parent')

assertEquals('Source:', selenium.getText('//strong[contains(text(),\'Source:\')]'))

assertEquals('View Template', selenium.getText('//td[2]/div/button'))

selenium.click('//td[2]/div/button')

selenium.selectWindow('win_ser_1')

selenium.close()

