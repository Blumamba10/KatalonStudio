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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Authentication'))

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_Directory Server'))

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/btn_Add AD Config'))

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/input_LDAP URL'), 'ldap://pd-ldap01:389')

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/input_Search Base'), 'ou=users,dc=adlds,dc=trinisys,dc=loc')

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/btn_Test Connection'))

assertEquals('Bind username and and password are required for Active Directory configurations.', selenium.getText('//p[contains(text(),"Bind username and and password are required for Ac")]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.setText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/input_Bind Account Name'), 
    'adlds-test')

WebUI.setEncryptedText(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/input_Bind Account Password'), 
    'JfebiVdhitkNjV6czE05lxlN8Emdeu2V1Htf/KdC1eyYDhxjk/sMdg==')

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/btn_Test Connection'))

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/button_OK'))

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/button_Save'))

assertEquals('Directory Server Authentication', selenium.getText('//div[@class="tde-template-description"]'))

assertEquals('Connection Name', selenium.getText('//th[contains(text(),"Connection Name")]'))

assertEquals('URL', selenium.getText('//th[contains(text(),"URL")]'))

assertEquals('User Prefix', selenium.getText('//th[contains(text(),"User Prefix")]'))

assertEquals('Bind Username', selenium.getText('//th[contains(text(),"Bind Username")]'))

assertEquals('Updated', selenium.getText('//th[contains(text(),"Updated")]'))

selenium.isElementPresent('//i[@class="fas fa-check-circle tcc-text-success"]')

selenium.isElementPresent('//td[@style="text-align: right;"]//button[@type="button"]')

selenium.isElementPresent('//td[contains(text(),"adlds-test")]//button[@type="button"]')

selenium.click('//tbody/tr[1]/td[4]/button[1]')

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/Edit Bind Account/btn_edit_Test Credentials'))

assertEquals('Bind username and and password are required for Active Directory configurations.', selenium.getText('//p[contains(text(),"Bind username and and password are required for Ac")]'))

selenium.click('//button[contains(text(),"OK")]')

