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

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/a_Project Roles'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/btn_Add Roles'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/chkbox_Select All'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/txt_Search Filter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/select_102550100'), 
    0)

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/btn_Add Roles'))

WebUI.delay(3)

selenium.isElementPresent('//a[@class="tcc-grouped-dv-expand-all-link"]')

selenium.isElementPresent('//a[@class="tcc-grouped-dv-collapse-all-link"]')

assertEquals('Role', selenium.getText('//table[@id="fdv-addProjectRolesDialog-availableProjectRoles-table"]//thead//tr[@role="row"]//th[@class="sorting_disabled"][contains(text(),"Role")]'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/_Add Project Roles/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/_Add Project Roles/btn_Add Selection'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/_Add Project Roles/btn_Close'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/a_Next'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

assertEquals('Project', selenium.getText('//th[contains(text(),"Project")]'))

assertEquals('Role', selenium.getText('//th[@class="sorting"][contains(text(),"Role")]'))

assertEquals('Description', selenium.getText('//th[@class="sorting"][contains(text(),"Description")]'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/chkbox_Select All'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/btn_Remove'), 
    0)

