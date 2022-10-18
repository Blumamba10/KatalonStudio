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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Templates'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/addTemplate'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

assertEquals('Default', selenium.getText('//button[@id="templateTypeDefaultBtn"]'))

assertEquals('View', selenium.getText('//button[@id="templateTypeViewBtn"]'))

selenium.click('//button[@id="templateTypeDefaultBtn"]')


assertEquals('Edit SQL-Based Query', selenium.getText('//strong[contains(text(),"Edit SQL-Based Query")]'))

assertEquals('Form Data Lookups', selenium.getText('//strong[contains(text(),"Form Data Lookups")]'))
assertEquals('Name', selenium.getText('//th[contains(text(),"Name")]'))
assertEquals('Description', selenium.getText('//th[contains(text(),"Description")]'))
assertEquals('Description', selenium.getText('//th[contains(text(),"Description")]'))
assertEquals('Description', selenium.getText('//th[contains(text(),"Description")]'))
