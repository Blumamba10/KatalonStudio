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

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10)

WebUI.doubleClick(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Functions'))

WebUI.delay(2)

selenium.click('id=addScriptButton')

WebUI.switchToWindowIndex('1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'testfunc')

selenium.click('link=Save')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Input Parameters_addBtn'))

WebUI.sendKeys(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Input Parameter_textarea'), 
    'in')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/checkBtn'))

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Input Parameters_addBtn'))

WebUI.sendKeys(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Input Parameter_textarea'), 
    'my parameters')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/checkBtn'))

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Output Parameters_add_Btn'))

WebUI.sendKeys(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Output Parameter_textarea'), 
    'out')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/checkBtn'))

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctionsPage/Script Editor_Page/Save Script_Btn'))

WebUI.delay(3)

selenium.close()

WebUI.switchToWindowIndex('0')

selenium.refresh()

selenium.waitForPageToLoad('30000')

assertEquals('testfunc', selenium.getText('//td[2]/a'))
