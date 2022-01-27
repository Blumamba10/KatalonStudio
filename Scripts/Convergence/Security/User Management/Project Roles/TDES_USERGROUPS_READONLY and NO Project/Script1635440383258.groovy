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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

assertEquals('manually', selenium.getText('//label[contains(text(),"manually")]'))

assertEquals('automatically', selenium.getText('//label[contains(text(),"automatically")]'))

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'usergroupreadonly')

assertEquals('usergroupreadonly', selenium.getText('//a[contains(text(),"usergroupreadonly")]'))

selenium.click('//a[contains(text(),"usergroupreadonly")]')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

assertEquals('ADMIN_CONSOLE_USER', selenium.getText('//td[contains(text(),"ADMIN_CONSOLE_USER")]'))

assertEquals('USERGROUPS_READONLY', selenium.getText('//td[contains(text(),"USERGROUPS_READONLY")]'))

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'usergroupreadonly', 'e7}m?8bzbYnjOo@%')

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

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Project Roles Tab/a_Project Roles'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/z_One Offs/User Group/btn_Project Roles_Delete'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/z_One Offs/User Group/btn_Project Roles_Add'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_Permissions Tab/a_Permissions'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/z_One Offs/User Group/btn_Permission_Add'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/z_One Offs/User Group/btn_Project Roles_Add'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/a_AD Groups'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/z_One Offs/User Group/btn_AD Group_Add'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/z_One Offs/User Group/btn_AD Group_Delete'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/btn_Back to User Groups'))

