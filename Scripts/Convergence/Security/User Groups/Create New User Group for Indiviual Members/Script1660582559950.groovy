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

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_User Groups'))

WebUI.click(findTestObject('Convergence/Security/User Groups/btn_Add New User Group'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/_Add User Group/txt_Group Name'), 'Internal User Group')

WebUI.setText(findTestObject('Convergence/Security/User Groups/_Add User Group/txt_Description'), 'Internal User Group')

WebUI.click(findTestObject('Convergence/Security/User Groups/_Add User Group/btn_Save'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/txt_Search Filter'), 'Internal User Group')

selenium.click('//a[contains(text(),"Internal User Group")]')

assertEquals('Allow individual members', selenium.getText('//label[contains(text(),"Allow individual members")]'))

WebUI.verifyElementText(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/a_Members'), 'Members')

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/chkbox_Allow individual members'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/btn_Add Member'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/select_102550100_Group Members'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/select_102550100_User Accounts'), 
    0)

WebUI.setText(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/txt_Search Filter_User Accounts'), 
    'UGUser')

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/chkbox_Select All_User Accounts'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/btn_Add Member'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/chkbox_Select All_Group Members'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/btn_Remove Member'), 
    0)

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/_Add Members/button_Done'), 
    FailureHandling.STOP_ON_FAILURE)

assertEquals('ID', selenium.getText("//th[@class='tde-dataview-numeric-cell sorting']"))

assertEquals('Username', selenium.getText('//th[@class="sorting"][contains(text(),"Username")]'))

assertEquals('Name', selenium.getText('//th[@class="sorting"][contains(text(),"Name")]'))

assertEquals('Last Login', selenium.getText('//th[contains(text(),"Last Login")]'))

assertEquals('UGUser', selenium.getText('//table[@id="fdv-main-tabs-members-individualMembers-data-table"]//tbody//tr[@class="odd"]//td[contains(text(),"UGUser")]'))

assertEquals('User Group User', selenium.getText('//table[@id="fdv-main-tabs-members-individualMembers-data-table"]//tbody//tr[@class="odd"]//td[contains(text(),"User Group User")]'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/chkbox_Select All'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Members Tab/btn_Delete Member'), 
    0)

