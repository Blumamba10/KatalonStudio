import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.comment('Setup LDAP Connection')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Authentication'))

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_Directory Server'))

assertEquals('Directory Server Authentication', selenium.getText('//div[@class="tde-template-description"]'))

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/btn_Add AD Config'))

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/input_Connection Name'), 
    'Trinisys LDPA')

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/input_LDAP URL'), 
    'ldap://trinisysdc0.trinisys.loc:389')

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/input_Search Base'), 
    'ou=Employees,dc=Trinisys,dc=loc')

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/input_User Prefix'), 
    'trinisys\\')

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/input_Bind Account Username'), 
    'njones')

WebUI.setEncryptedText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/input_Bind Account Password'), 
    'M2nxV8GkxwvA8pJxndtsDw==')

WebUI.comment('Test Connection')

selenium.click('//button[text()=\'Test Connection\']')

WebUI.delay(2)

assertEquals('Success!', selenium.getText('//h1[contains(text(),\'Success!\')]'))

selenium.click('//button[contains(text(),\'OK\')]')

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Add AD Connection/button_Save'))

WebUI.waitForElementPresent(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/btn_Add AD Config'), 
    10)

assertEquals('Trinisys LDPA', selenium.getText('//td[contains(text(),\'Trinisys LDPA\')]'))

WebUI.comment('Log out and login with AD user')

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/a_admin'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/a_Logout'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/a_Return'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'njones')

WebUI.setEncryptedText(findTestObject('Convergence/Login/password'), 'M2nxV8GkxwvA8pJxndtsDw==')

WebUI.click(findTestObject('Convergence/Login/button_Login'))

assertEquals('Login failed. Invalid security credentials.', selenium.getText('//p[contains(text(),\'Login failed. Invalid security credentials.\')]'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'admin')

WebUI.setText(findTestObject('Convergence/Login/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login/button_Login'))

WebUI.comment('Verify LDAP user is created')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Users'))

selenium.click('//input[@id=\'rc-main-list-header-displayMode-2\']')

assertEquals('njones', selenium.getText('//a[contains(text(),\'njones\')]'))

