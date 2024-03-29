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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10)

WebUI.doubleClick(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Functions'))

WebUI.enableSmartWait()

selenium.click('//i[@class="shortcut-icon fas fa-plus-circle"]')

WebUI.switchToWindowIndex('1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'testfunc')

selenium.click('link=Save')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

WebUI.comment('Need to add Parameters')

not_run: WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input Parameters_addBtn'))

not_run: WebUI.sendKeys(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input Parameter_textarea'), 
    'in')

not_run: WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/checkBtn'))

not_run: WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input Parameters_addBtn'))

not_run: WebUI.sendKeys(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input Parameter_textarea'), 
    'my parameters')

not_run: WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/checkBtn'))

not_run: WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input File Parameters_addBtn'))

not_run: WebUI.sendKeys(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input File Parameter_textarea'), 
    'Input File')

not_run: WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/Function Editor/Input File Parameter_checkBtn'))

selenium.click('//app-actions-list-head/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/i[1]')

WebUI.delay(3)

selenium.close()

WebUI.switchToWindowIndex('0')

selenium.refresh()

selenium.waitForPageToLoad('30000')

assertEquals('testfunc', selenium.getText('//td[2]/a'))

