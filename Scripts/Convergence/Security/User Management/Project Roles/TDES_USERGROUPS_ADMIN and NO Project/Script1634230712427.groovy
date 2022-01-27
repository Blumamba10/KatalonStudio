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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

assertEquals('manually', selenium.getText('//label[contains(text(),"manually")]'))

assertEquals('automatically', selenium.getText('//label[contains(text(),"automatically")]'))

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'Usergroupadmin')

assertEquals('Usergroupadmin', selenium.getText('//a[contains(text(),"Usergroupadmin")]'))

selenium.click('//a[contains(text(),"Usergroupadmin")]')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

assertEquals('ADMIN_CONSOLE_USER', selenium.getText('//td[contains(text(),"ADMIN_CONSOLE_USER")]'))

assertEquals('USERGROUPS_ADMIN', selenium.getText('//td[contains(text(),"USERGROUPS_ADMIN")]'))

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'usergroupadmin', 'xW_XM7fnpL_7!8H%')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Project Roles'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_User Groups'), 0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Credential Management'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Project Assignment'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'), 0)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_User Groups'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/txt_Search Filter'), 'Internal User Group')

WebUI.click(findTestObject('Convergence/z_One Offs/a_Internal User Group'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/a_Permissions'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/txt_Search Filters'), 
    0)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/select_102550100'), 
    '100', false)

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/chkbox_Select All'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/btn_Disable'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/btn_Enabled'), 
    0)

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/btn_Enabled'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/a_Project Roles'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/btn_Add Roles'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/btn_Remove'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/chkbox_Select All'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/txt_Search Filter'), 
    0)

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/select_102550100'), 
    FailureHandling.STOP_ON_FAILURE)

