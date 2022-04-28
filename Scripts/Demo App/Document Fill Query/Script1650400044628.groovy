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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod

CustomKeywords.'cutomKeywords.Demo_LoginHelper.login'(GlobalVariable.demoappURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('//a[contains(text(),"Document Processing")]')

selenium.click('link=Document Fill from Query')

assertEquals('Generate Document from Query', selenium.getText('//tr[2]/td/div'))

assertEquals('Show 102550100 items', selenium.getText('//label'))

assertEquals('102550100', selenium.getText('//select'))

assertEquals('Filter:', selenium.getText('//div[2]/label'))

assertEquals('Policy Detail', selenium.getText('//th'))

assertEquals('Policy Number', selenium.getText('//th[2]'))

assertEquals('Premium Mode', selenium.getText('//th[3]'))

assertEquals('Coverage Amount', selenium.getText('//th[4]'))

assertEquals('Premium Amount', selenium.getText('//th[5]'))

assertEquals('Status', selenium.getText('//th[6]'))

assertEquals('Insured Last Name', selenium.getText('//th[7]'))

assertEquals('Insured First Name', selenium.getText('//th[8]'))

assertEquals('Insured ID', selenium.getText('//th[9]'))

assertEquals('Coverages', selenium.getText('//th[10]'))

assertEquals('Previous', selenium.getText('//div[4]/a'))

assertEquals('Next', selenium.getText('//a[2]'))

