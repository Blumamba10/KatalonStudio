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

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a__convergence_console'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a__convergence_console'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_User Groups'))

WebUI.verifyElementVisible(findTestObject('Convergence/Security/User Groups/btn_Add New User Group'))

WebUI.verifyElementVisible(findTestObject('Convergence/Security/User Groups/select_102550100'))

WebUI.click(findTestObject('Convergence/Security/User Groups/checkbox_Select All'))

WebUI.verifyElementVisible(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/btn_Delete Member'))

assertEquals('ID', selenium.getText('//th[contains(text(),"ID")]'))

assertEquals('Group', selenium.getText('//body/div[@id="tde-form"]/form[@id="tde-data-entry-form"]/table[@id="form-enclosing-table"]/tbody/tr/td/div[@id="g-main"]/table[@id="g-main:1"]/tbody/tr[@data-groupid="g-main"]/td[@class="tde-table-cell"]/table[@id="gt-main"]/tbody/tr[@data-groupid="g-main"]/td[@class="tde-grid-cell-999"]/div[@id="g-main-list"]/table[@id="g-main-list:1"]/tbody/tr[@data-groupid="g-main-list"]/td[@class="tde-table-cell"]/div[@id="fdv-main-list-userGroupList"]/div[@id="fdv-main-list-userGroupList-table_wrapper"]/table[@id="fdv-main-list-userGroupList-table"]/thead/tr[@role="row"]/th[3]'))

assertEquals('AD Groups', selenium.getText('//th[contains(text(),"AD Groups")]'))

assertEquals('Members', selenium.getText('//th[contains(text(),"Members")]'))

assertEquals('Last Updated', selenium.getText('//th[contains(text(),"Last Updated")]'))

assertEquals('User Groups', selenium.getText('//div[@class="tde-template-description"]'))

WebUI.verifyElementVisible(findTestObject('Convergence/Security/User Groups/btn_Help Icon'))

WebUI.click(findTestObject('Convergence/Security/User Groups/btn_Add New User Group'))

assertEquals('Add User Group', selenium.getText('//span[@id="ui-id-1"]'))

assertEquals('Group Name', selenium.getText('//div[@id="fl-editDialog-groupName"]'))

assertEquals('Description', selenium.getText('//div[@id="fl-editDialog-description"]'))

assertEquals('Save', selenium.getText('//button[contains(text(),"Save")]'))

assertEquals('Cancel', selenium.getText('//button[contains(text(),"Cancel")]'))

selenium.click('//button[contains(text(),"Cancel")]')

