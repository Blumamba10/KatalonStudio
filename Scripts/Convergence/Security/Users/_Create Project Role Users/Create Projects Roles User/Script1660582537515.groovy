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

WebUI.click(findTestObject('Convergence/Security/Users/btn_Add User'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_User Name'), 'projroles')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Description'), 'Projects Roles User')

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/chkbox_Internal Database'))

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/btn_Save'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_New Password'), 'h|FU6zJ}58o5`VBYK')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Re-enter Password'), 'h|FU6zJ}58o5`VBYK')

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/button_Save_Change Password'))

assertEquals('User Account Created', selenium.getText('//h1[contains(text(),"User Account Created")]'))

assertEquals('Initial user account configuration is complete.', selenium.getText('//div[@class="tcc-dialog-content"]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/btn_Update'))

WebUI.setText(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/txt_Search Filter'), 'ADMIN_CONSOLE_USER')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/chkbox_Select All_Available'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/btn_Add Role'))

WebUI.setText(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/txt_Search Filter'), 'PROJECTS_ROLES')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/chkbox_Select All_Available'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/btn_Add Role'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/Update User Roles/button_Done'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'))

WebUI.waitForElementPresent(findTestObject('Convergence/Security/Users/label_manually'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'projroles')

assertEquals('projroles', selenium.getText('//a[contains(text(),"projroles")]'))

