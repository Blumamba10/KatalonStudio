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

WebUI.callTestCase(findTestCase('Convergence/Security/Users/Create Admin User'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'AdminUser', '/3ju_$gMW]X}izW4')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Project Roles'), 0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_User Groups'), 0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Credential Management'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Project Assignment'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Users'), 0)

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Users'))

WebUI.delay(0)

WebUI.click(findTestObject('Convergence/Security/Users/btn_Add User'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_User Name'), 'Test')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Description'), 'Test User')

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/chkbox_Internal Database'))

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/btn_Save'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_New Password'), ')4d<{%9r~FHdX,#(46SU')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Re-enter Password'), ')4d<{%9r~FHdX,#(46SU')

WebUI.delay(1)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_Save pw change'))

WebUI.verifyElementText(findTestObject('Convergence/Security/Users/_User Detail/h1_User Account Created'), 'User Account Created')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/h1_User Account Created'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_OK'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Change Password'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Edit'), 0)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'))

WebUI.waitForElementPresent(findTestObject('Convergence/Security/Users/label_manually'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'Test')

WebUI.click(findTestObject('Convergence/Security/Users/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Security/Users/btn_Delete'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_OK'))

