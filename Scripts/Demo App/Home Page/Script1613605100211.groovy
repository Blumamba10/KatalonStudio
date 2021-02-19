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

assertTrue(selenium.isElementPresent('link=Home'))

assertTrue(selenium.isElementPresent('link=Web Platform'))

assertTrue(selenium.isElementPresent('link=Document Processing'))

assertTrue(selenium.isElementPresent('link=Document Management'))

assertTrue(selenium.isElementPresent('link=General Scripting'))

assertTrue(selenium.isElementPresent('link=Integration'))

assertTrue(selenium.isElementPresent('link=Spreadsheet'))

assertEquals('Convergence Demo Home', selenium.getText('//tr[2]/td/div'))

assertEquals('Welcome to the Trinisys Convergence product reference site!  Here you will find sample implementations of various Web Platform and Integration features.  Use the navigation at the top of the page to browse the examples by category.  New examples will be added to the site on an ongoing basis, so check back often.', 
    selenium.getText('//div[@id=\'lbl-label\']/p'))

assertEquals('Some of the examples found on the site will have links directly to the template and/or script used in the example.   You can also log directly into the Convergence Adminstrative Console using the link below:', 
    selenium.getText('//div[@id=\'lbl-label\']/p[2]'))

assertEquals('Convergence Console', selenium.getText('//button[@type=\'button\']'))

assertEquals('Intake Server Console', selenium.getText('//td[2]/div/button'))

