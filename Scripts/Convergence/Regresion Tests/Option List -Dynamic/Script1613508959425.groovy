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
import org.openqa.selenium.Keys as Keys

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Object Repository/Convergence/_NavigationLinks/Administration Console/a_Option Lists'))

WebUI.delay(2)

selenium.click('id=createListButton')

selenium.click('id=optionListName')

selenium.typeKeys('id=optionListName', 'Dynamic')

selenium.select('id=listTypeSelect', 'Dynamic')

assertEquals('Dynamic List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked List\'])[1]/following::h6[1]'))

assertEquals('As in a Linked list, options are generated from a database query, but list data is updated each time a form field using the list is clicked. Values can be passed to the query so that the list options may change as other fields in the form are updated.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dynamic List\'])[1]/following::p[1]'))

selenium.click('id=newOptionsListSubmitBtn')

selenium.typeKeys('id=optionListDescription', 'Dynamic Description')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[1]/following::div[9]', 'query')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[1]/following::pre[1]')

selenium.click('//form[@id=\'optionListDynamicFrm\']/div/div[2]/div/div/div[2]/div/div[6]')

WebUI.sendKeys(findTestObject('Convergence/Templates/OptionLists_Page/Edit Dynamic Option List_Page/textarea_Query'), 'query')

// selenium.Manual Type("//div[@class='CodeMirror-cursor']", "Query")
selenium.click('id=submitButton')

