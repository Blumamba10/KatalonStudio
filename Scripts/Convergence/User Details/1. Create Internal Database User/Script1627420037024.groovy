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

WebUI.delay(2)

selenium.click('xpath=//strong')

WebUI.delay(2)

selenium.click('link=_convergence_console')



WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

assertEquals('manually', selenium.getText('//label[contains(text(),"manually")]'))

assertEquals('automatically', selenium.getText('//label[contains(text(),"automatically")]'))

WebUI.click(findTestObject('Convergence/Security/Users/btn_Add User'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_User Name'), 'AutoUser')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Description'), 'Automation User')

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/chkbox_Internal Database'))

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/btn_Save'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_New Password'), ')4d<{%9r~FHdX,#(46SU')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Re-enter Password'), ')4d<{%9r~FHdX,#(46SU')

selenium.click('//body/div[11]/div[3]/div[1]/button[1]')

assertEquals('User Account Created', selenium.getText('//h1[contains(text(),"User Account Created")]'))

assertEquals('Initial user account configuration is complete.', selenium.getText('//div[@class="tcc-dialog-content"]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Change Password'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Edit'), 0)

assertEquals('Description', selenium.getText('//div[@id="fl-main-tabs-summary-info-description"]'))

assertEquals('Automation User', selenium.getText('//span[contains(text(),"Automation User")]'))

assertEquals('Authentication', selenium.getText('//div[@id="fl-main-tabs-summary-info-authentication"]'))

assertEquals('Internal Database', selenium.getText('//span[contains(text(),"Internal Database")]'))

assertEquals('Created', selenium.getText('//div[@id="fl-main-tabs-summary-info-created"]'))

assertEquals('Account Enabled', selenium.getText('//div[@id="fl-main-tabs-summary-info-accountEnabled"]'))

assertEquals('Yes', selenium.getText('//span[contains(text(),"Yes")]'))

assertEquals('Last Authenticated', selenium.getText('//div[@id="fl-main-tabs-summary-info-lastAuthenticated"]'))

assertEquals('Failed Login Attempts', selenium.getText('//div[@id="fl-main-tabs-summary-info-failedLoginAttempts"]'))

assertEquals('Last Password Change', selenium.getText('//div[@id="fl-main-tabs-summary-info-lastPasswordChange"]'))

assertEquals('Require Two-Factor Authentication', selenium.getText('//div[@id="fl-main-tabs-summary-info-requireTwofactorAuthentication"]'))

assertEquals('No', selenium.getText('//div[@id="ff-main-tabs-summary-info-requireTwofactorAuthentication"]//span[contains(text(),"No")]'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Edit'))

assertEquals('Edit User Details', selenium.getText('//span[@id="ui-id-1"]'))

assertEquals('Description', selenium.getText('//div[@id="fl-editUserDialog-description"]'))

assertEquals('Enabled', selenium.getText('//label[contains(text(),"Enabled")]'))

assertEquals('Authentication Modes', selenium.getText('//div[@id="fl-editUserDialog-authenticationModes"]'))

assertEquals('Directory Server', selenium.getText('//label[contains(text(),"Directory Server")]'))

assertEquals('Internal Database', selenium.getText('//label[contains(text(),"Internal Database")]'))

assertEquals('Use 2-Factor Authentication', selenium.getText('//label[contains(text(),"Use 2-Factor Authentication")]'))

assertEquals('Save', selenium.getText('//body/div[10]/div[3]/div[1]/button[1]'))

assertEquals('Cancel', selenium.getText('//body/div[10]/div[3]/div[1]/button[2]'))

selenium.click('//body/div[10]/div[3]/div[1]/button[2]')

WebUI.waitForElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Change Password'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Change Password'))

assertEquals('Change Password', selenium.getText('//span[@id="ui-id-2"]'))

assertEquals('New Password', selenium.getText('//div[@id="fl-changePasswordDialog-enterPassword-newPassword"]'))

assertEquals('Re-enter Password', selenium.getText('//div[@id="fl-changePasswordDialog-enterPassword-reenterPassword"]'))

selenium.isElementPresent('//body[@style="cursor: auto;"]/div[11]/div[3]/div[1]/button[1]')

selenium.isElementPresent('//body[@style="cursor: auto;"]/div[11]/div[3]/div[1]/button[2]')

selenium.click('//span[@id="ui-id-2"]')

assertEquals('Password Length', selenium.getText('//strong[contains(text(),"Password Length")]'))

assertEquals('Minimum Digits', selenium.getText('//strong[contains(text(),"Minimum Digits")]'))

assertEquals('Minimum Letters', selenium.getText('//strong[contains(text(),"Minimum Letters")]'))

assertEquals('Password Symbols', selenium.getText('//strong[contains(text(),"Password Symbols")]'))

assertEquals('Generated Password', selenium.getText('//div[@id="fl-changePasswordDialog-generatePassword-control-generatedPassword"]'))

selenium.isElementPresent('//button[text()="Regen"]')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/_Change Password/btn_Cancel'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'))

WebUI.waitForElementPresent(findTestObject('Convergence/Security/Users/label_manually'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'AutoUser')

assertEquals('AutoUser', selenium.getText('//a[contains(text(),"AutoUser")]'))

