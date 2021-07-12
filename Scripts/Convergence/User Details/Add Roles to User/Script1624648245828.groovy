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

WebUI.delay(3)

selenium.click('xpath=//strong')

WebUI.delay(3)

selenium.click('link=_convergence_console')

not_run: WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a__convergence_console'), 10, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Convergence/_SelectProject/a__convergence_console'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a__convergence_console'), 10, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Convergence/_SelectProject/a__convergence_console'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'AutoUser')

selenium.click('//a[contains(text(),"AutoUser")]')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'), 0)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/select_102550100'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/btn_Update'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/txt_Search Filter'), 0)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/btn_Update'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/select_5102550100_Available'), 
    '100', false)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/chkbox_Select All_Available'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/btn_Add Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/button_Done'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/select_102550100'), '100', false)

WebUI.delay(2)

assertEquals('Role', selenium.getText('//th[@class="sorting"][contains(text(),"Role")]'))

assertEquals('Description', selenium.getText('//th[@class="sorting"][contains(text(),"Description")]'))

assertEquals('ACCESS_HEAP_DUMP', selenium.getText('//td[contains(text(),"ACCESS_HEAP_DUMP")]'))

assertEquals('ADD_USER', selenium.getText('//td[contains(text(),"ADD_USER")]'))

assertEquals('ADMIN_CONSOLE_USER', selenium.getText('//td[contains(text(),"ADMIN_CONSOLE_USER")]'))

assertEquals('ADMIN_FORM_DATA_LOOKUP', selenium.getText('//td[contains(text(),"ADMIN_FORM_DATA_LOOKUP")]'))

assertEquals('ADMIN_SCHEDULE', selenium.getText('//td[contains(text(),"ADMIN_SCHEDULE")]'))

assertEquals('CAN_DELETE_HISTORY', selenium.getText('//td[contains(text(),"CAN_DELETE_HISTORY")]'))

assertEquals('CONFIG_SERVER', selenium.getText('//td[contains(text(),"CONFIG_SERVER")]'))

assertEquals('CONFIGURE_DATA_SOURCES_AND_HANDLERS', selenium.getText('//td[contains(text(),"CONFIGURE_DATA_SOURCES_AND_HANDLERS")]'))

assertEquals('DE_USER', selenium.getText('//td[contains(text(),"DE_USER")]'))

assertEquals('DELETE_FORM', selenium.getText('//td[contains(text(),"DELETE_FORM")]'))

assertEquals('DELETE_USER', selenium.getText('//td[contains(text(),"DELETE_USER")]'))

assertEquals('DM_ADD_CONTENT', selenium.getText('//td[contains(text(),"DM_ADD_CONTENT")]'))

assertEquals('DM_DELETE_CONTENT', selenium.getText('//td[contains(text(),"DM_DELETE_CONTENT")]'))

assertEquals('DM_MODIFY_INDEX', selenium.getText('//td[contains(text(),"DM_MODIFY_INDEX")]'))

assertEquals('DM_REPLACE_CONTENT', selenium.getText('//td[contains(text(),"DM_REPLACE_CONTENT")]'))

assertEquals('DM_SEARCH', selenium.getText('//td[contains(text(),"DM_SEARCH")]'))

assertEquals('EDIT_AUTHENTICATION_METHODS', selenium.getText('//td[contains(text(),"EDIT_AUTHENTICATION_METHODS")]'))

assertEquals('EDIT_LOG_EMAIL_SETTINGS', selenium.getText('//td[contains(text(),"EDIT_LOG_EMAIL_SETTINGS")]'))

assertEquals('EDIT_LOG_SETTINGS', selenium.getText('//td[contains(text(),"EDIT_LOG_SETTINGS")]'))

assertEquals('EDIT_QUEUE_SETTINGS', selenium.getText('//td[contains(text(),"EDIT_QUEUE_SETTINGS")]'))

assertEquals('EDIT_USERS', selenium.getText('//td[contains(text(),"EDIT_USERS")]'))

assertEquals('MONITOR_PUBLISHER', selenium.getText('//td[contains(text(),"MONITOR_PUBLISHER")]'))

assertEquals('PROJECTS_ADMIN', selenium.getText('//td[contains(text(),"PROJECTS_ADMIN")]'))

assertEquals('PROJECTS_ROLES', selenium.getText('//td[contains(text(),"PROJECTS_ROLES")]'))

assertEquals('UPDATE_LICENSE', selenium.getText('//td[contains(text(),"UPDATE_LICENSE")]'))

assertEquals('VIEW_SECURITY_LOG', selenium.getText('//td[contains(text(),"VIEW_SECURITY_LOG")]'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/btn_Update'))

selenium.typeKeys('//div[@id="fdv-updatePermissionsDialog-lists-assigned-table_filter"]//label[contains(text(),"Filter:")]//input[@type="search"]', 
    'DM_MODIFY_INDEX')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/ckkbox_Select All_Assigned'))

selenium.click('//div[@id="btn-updatePermissionsDialog-lists-buttons-removeButton"]//button[text()="-"]')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/button_Done'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/select_102550100'), '100', false)

