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

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Users'))

WebUI.setText(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/txt_Search Filter'), 'admin')

selenium.click('//tbody/tr[1]/td[2]/a[1]')

WebUI.waitForElementVisible(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'), 0)

WebUI.comment('Verify Project Roles')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/select_102550100'), '100', false)

selenium.isElementPresent('//td[contains(text(),\'ACCESS_HEAP_DUMP\')]')

selenium.isElementPresent('//td[contains(text(),\'ADMIN_CONSOLE_USER\')]')

selenium.isElementPresent('//td[contains(text(),\'ADMIN_FORM_DATA_LOOKUP\')]')

selenium.isElementPresent('//td[contains(text(),\'ADMIN_SCHEDULE\')]')

selenium.isElementPresent('//td[contains(text(),\'CAN_DELETE_HISTORY\')]')

selenium.isElementPresent('//td[contains(text(),\'CAN_RESUBMIT_HISTORY\')]')

selenium.isElementPresent('//td[contains(text(),\'CONFIGURE_DATA_SOURCES_AND_HANDLERS\')]')

selenium.isElementPresent('//td[contains(text(),\'CONFIG_SERVER\')]')

selenium.isElementPresent('//td[contains(text(),\'CREATE_WEB_APPS\')]')

selenium.isElementPresent('//td[contains(text(),\'DELETE_FORM\')]')

selenium.isElementPresent('//td[contains(text(),\'DE_USER\')]')

selenium.isElementPresent('//td[contains(text(),\'DM_ADD_CONTENT\')]')

selenium.isElementPresent('//td[contains(text(),\'DM_DELETE_CONTENT\')]')

selenium.isElementPresent('//td[contains(text(),\'DM_MODIFY_INDEX\')]')

selenium.isElementPresent('//td[contains(text(),\'DM_REPLACE_CONTENT\')]')

selenium.isElementPresent('//td[contains(text(),\'DM_SEARCH\')]')

selenium.isElementPresent('//td[contains(text(),\'EDIT_AUTHENTICATION_METHODS\')]')

selenium.isElementPresent('//td[contains(text(),\'EDIT_LOG_EMAIL_SETTINGS\')]')

selenium.isElementPresent('//td[contains(text(),\'EDIT_LOG_SETTINGS\')]')

selenium.isElementPresent('//td[contains(text(),\'EDIT_QUEUE_SETTINGS\')]')

selenium.isElementPresent('//td[contains(text(),\'MONITOR_PUBLISHER\')]')

selenium.isElementPresent('//td[contains(text(),\'PROJECTS_ADMIN\')]')

selenium.isElementPresent('//td[contains(text(),\'PROJECTS_ASSIGNMENT\')]')

selenium.isElementPresent('//td[contains(text(),\'PROJECTS_ROLES\')]')

selenium.isElementPresent('//td[contains(text(),\'UPDATE_LICENSE\')]')

selenium.isElementPresent('//td[contains(text(),\'USERGROUPS_ADMIN\')]')

selenium.isElementPresent('//td[contains(text(),\'USERGROUPS_READONLY\')]')

selenium.isElementPresent('//td[contains(text(),\'USERS_ADMIN\')]')

selenium.isElementPresent('//td[contains(text(),\'USERS_READONLY\')]')

selenium.isElementPresent('//td[contains(text(),\'VIEW_SECURITY_LOG\')]')

