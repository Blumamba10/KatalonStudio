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

String baseUrl = 'http://localhost:8082/tdes'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Option Lists'))

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/createListButton'))

WebUI.sendKeys(findTestObject('Convergence/Templates/OptionLists_Page/_CreateNewOptionList_popup/Option List Name_name'), 
    'List')

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_CreateNewOptionList_popup/Continue_btn'))

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListDetail_Page/add_btn'))

WebUI.sendKeys(findTestObject('Convergence/Templates/OptionLists_Page/_AddNewOption_Page/Text'), 'One')

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_AddNewOption_Page/Add Option_btn'))

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListDetail_Page/add_btn'))

WebUI.sendKeys(findTestObject('Convergence/Templates/OptionLists_Page/_AddNewOption_Page/Text'), 'Two')

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_AddNewOption_Page/Add Option_btn'))

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListDetail_Page/add_btn'))

WebUI.sendKeys(findTestObject('Convergence/Templates/OptionLists_Page/_AddNewOption_Page/Text'), 'Three')

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_AddNewOption_Page/Add Option_btn'))

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListDetail_Page/submitButton'))

