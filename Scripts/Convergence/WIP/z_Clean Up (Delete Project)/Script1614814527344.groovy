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

selenium.click('id=appNavProjectsLink')

selenium.click('link=Default')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Administration'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Projects'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.clearText(findTestObject('Convergence/Projects/input_Search Filter'))

WebUI.sendKeys(findTestObject('Convergence/Projects/input_Search Filter'), 'Default')

WebUI.click(findTestObject('Convergence/Projects/checkbox_Select all'))

WebUI.click(findTestObject('Convergence/Projects/button_Delete'))

WebUI.click(findTestObject('Convergence/Projects/button_OK'))

WebUI.click(findTestObject('Convergence/Projects/button_Add New Project'))

WebUI.sendKeys(findTestObject('Convergence/Projects/New Project/projectName'), 'Default')

WebUI.sendKeys(findTestObject('Convergence/Projects/New Project/projectDescription'), 'Default Project')

WebUI.selectOptionByValue(findTestObject('Convergence/Projects/New Project/Project Type_dropdown'), 'NA', false)

WebUI.click(findTestObject('Convergence/Projects/New Project/button_Submit'))

WebUI.clearText(findTestObject('Convergence/Projects/input_Search Filter'))

WebUI.sendKeys(findTestObject('Convergence/Projects/input_Search Filter'), 'Default')

WebUI.verifyElementText(findTestObject('Convergence/Projects/a_Default'), 'Default')

