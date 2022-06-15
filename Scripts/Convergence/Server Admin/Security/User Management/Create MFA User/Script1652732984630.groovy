import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Authentication'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Authentication/btn_Google 2 Factor Authentication'), 0)

WebUI.verifyElementText(findTestObject('Convergence/Security/Authentication/btn_Google 2 Factor Authentication'), 'Google 2 Factor Authentication')

WebUI.verifyElementText(findTestObject('Convergence/Security/Authentication/Google 2 Factor/p_Google 2 Factor Description'), 
    'Authenticate users using Google Two Factor Authentication application. This applies to the Administration Console.')

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_Google 2 Facor button'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/Security/Users/btn_Add User'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_User Name'), 'MFAUser')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Description'), 'MFA user')

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/chkbox_Internal Database'))

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/chkbox_Use 2-Factor Authentication'))

WebUI.click(findTestObject('Convergence/Security/Users/Add User Account/btn_Save'))

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_New Password'), 'Password1!')

WebUI.setText(findTestObject('Convergence/Security/Users/Add User Account/txt_Re-enter Password'), 'Password1!')

selenium.click('//body/div[11]/div[3]/div[1]/button[1]')

assertEquals('User Account Created', selenium.getText('//h1[contains(text(),"User Account Created")]'))

assertEquals('Initial user account configuration is complete.', selenium.getText('//div[@class="tcc-dialog-content"]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/a_Summary'), 0)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_admin'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_Logout'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_Return'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'MFAUser')

WebUI.setText(findTestObject('Convergence/Login/password'), 'Password1!')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Login/QR Code_Page/iframe_Convergence_qrCodeFrame'), 0)

WebUI.verifyElementText(findTestObject('Convergence/Login/QR Code_Page/h3_QR Code for 2-Step Authentication'), 'QR Code for 2-Step Authentication')

WebUI.verifyElementText(findTestObject('Convergence/Login/QR Code_Page/h4_Instructions'), 'Instructions')

WebUI.verifyElementText(findTestObject('Convergence/Login/QR Code_Page/p_If you dont already'), 'If you don\'t already have it, install the Google Authenticator app on your phone or other mobile device.')

WebUI.verifyElementText(findTestObject('Convergence/Login/QR Code_Page/h5_Get the App'), 'Get the App')

WebUI.verifyElementPresent(findTestObject('Convergence/Login/QR Code_Page/button_For Android'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Login/QR Code_Page/button_For iOS'), 0)

WebUI.verifyElementText(findTestObject('Convergence/Login/QR Code_Page/p_Once installed'), 'Once installed, run the Authenticator app and scan this QR Code.')

WebUI.verifyElementText(findTestObject('Convergence/Login/QR Code_Page/p_At your next login'), 'At your next login, when prompted, you will need to enter the 6-digit code from the Google Authenticator app into the Verification Code field.')

WebUI.verifyElementPresent(findTestObject('Convergence/Login/QR Code_Page/a_Return to Login'), 0)

WebUI.click(findTestObject('Convergence/Login/QR Code_Page/p_At your next login'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser(GlobalVariable.tdesURL)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Convergence/Login/username'), 'MFAUser')

WebUI.sendKeys(findTestObject('Convergence/Login/password'), 'Password1!')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Login/Google Verification Code_Page/input_Google Authenticator Verification Code_code'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Login/Google Verification Code_Page/a_Login'), 0)

WebUI.verifyElementText(findTestObject('Convergence/Login/Google Verification Code_Page/a_Convergence'), 'Convergence')

WebUI.click(findTestObject('Convergence/Login/Google Verification Code_Page/i_Help'))

WebUI.waitForElementPresent(findTestObject('Convergence/Login/Google Verification Code_Page/h3_What is a Google Verification Code'), 
    10)

WebUI.verifyElementText(findTestObject('Convergence/Login/Google Verification Code_Page/h3_What is a Google Verification Code'), 
    'What is a Google Verification Code?')

WebUI.verifyElementText(findTestObject('Convergence/Login/Google Verification Code_Page/p_Convergence uses a Google Verification'), 
    'Convergence uses a Google Verification Code as part of a multi-factor authentication (MFA) protocol to help ensure the security of your access to the Convergence admin console. Logging into Convergence requires a username and password as the first part of the process. To complete your login, you are asked to enter a numeric code that is sent to your phone or other mobile device after you have submitted your username and password.')

WebUI.verifyElementText(findTestObject('Convergence/Login/Google Verification Code_Page/a_Configure your mobile device'), 
    'Configure your mobile device to receive verification codes from Convergence')

WebUI.verifyElementText(findTestObject('Convergence/Login/Google Verification Code_Page/li_Get more information about Google'), 
    'Get more information about Google Verification Codes')

WebUI.click(findTestObject('Convergence/Login/Google Verification Code_Page/button_Done'))

WebUI.click(findTestObject('Convergence/Login/Google Verification Code_Page/a_Login'))

WebUI.verifyElementPresent(findTestObject('Convergence/Login/Google Verification Code_Page/p_You must enter a verification code to continue'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Login/Google Verification Code_Page/p_You must enter a verification code to continue'), 
    'You must enter a verification code to continue')

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.tdesURL)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/Access Denied_Page/a_Logout'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_Return'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'admin')

WebUI.setText(findTestObject('Convergence/Login/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.delay(2)

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'MFAUser')

WebUI.click(findTestObject('Convergence/Security/Users/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Security/Users/btn_Delete'))

WebUI.click(findTestObject('Convergence/Security/Users/btn_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_admin'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_Logout'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_Return'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'admin')

WebUI.setText(findTestObject('Convergence/Login/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Authentication'))

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_Google 2 Facor button'))

