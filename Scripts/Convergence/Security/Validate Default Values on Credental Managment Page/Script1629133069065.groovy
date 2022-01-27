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

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Credential Management'))

WebUI.verifyElementText(findTestObject('Convergence/Security/Credential Management/_Admin Users Tab/a_Admin Users'), 'Admin Users')

WebUI.click(findTestObject('Convergence/Security/Credential Management/_Admin Users Tab/a_Admin Users'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/_Admin Users Tab/txt_Expiration Days'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/_Admin Users Tab/txt_Password History'), 
    0)

assertEquals('Credential Management', selenium.getText('//h1[contains(text(),"Credential Management")]'))

assertEquals('Admin Users Password Policy', selenium.getText('//h4[contains(text(),"Admin Users Password Policy")]'))

assertEquals('Password Length', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group max-length margin-top-20"]//div[@class="span3"]//label[contains(text(),"Password Length")]'))

assertEquals('Minimum Digits', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-digits"]//div[@class="span3"]//label[contains(text(),"Minimum Digits")]'))

assertEquals('Minimum Letters', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-letters"]//div[@class="span3"]//label[contains(text(),"Minimum Letters")]'))

assertEquals('Minimum Symbols', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-symbols"]//div[@class="span3"]//label[contains(text(),"Minimum Symbols")]'))

assertEquals('15', selenium.getText('//span[@id="adminPasswordLengthText"]'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/btn_Save'), 0)

WebUI.click(findTestObject('Convergence/Security/Credential Management/_General Users Tab/a_General Users'))

WebUI.verifyElementText(findTestObject('Convergence/Security/Credential Management/_General Users Tab/a_General Users'), 
    'General Users')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/_General Users Tab/txt_Expiration Days'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/_General Users Tab/txt_Password History'), 
    0)

assertEquals('Credential Management', selenium.getText('//h1[contains(text(),"Credential Management")]'))

assertEquals('Admin Users Password Policy', selenium.getText('//h4[contains(text(),"Admin Users Password Policy")]'))

assertEquals('Password Length', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group max-length margin-top-20"]//div[@class="span3"]//label[contains(text(),"Password Length")]'))

assertEquals('Minimum Digits', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-digits"]//div[@class="span3"]//label[contains(text(),"Minimum Digits")]'))

assertEquals('Minimum Letters', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-letters"]//div[@class="span3"]//label[contains(text(),"Minimum Letters")]'))

assertEquals('Minimum Symbols', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-symbols"]//div[@class="span3"]//label[contains(text(),"Minimum Symbols")]'))

assertEquals('9', selenium.getText('//span[@id="userPasswordLengthText"]'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/btn_Save'), 0)

WebUI.click(findTestObject('Convergence/Security/Credential Management/_Service Accounts Tab/a_Service Accounts'))

WebUI.verifyElementText(findTestObject('Convergence/Security/Credential Management/_Service Accounts Tab/a_Service Accounts'), 
    'Service Accounts')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/_Service Accounts Tab/txt_Expiration Days'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/_Service Accounts Tab/txt_Password History'), 
    0)

assertEquals('Credential Management', selenium.getText('//h1[contains(text(),"Credential Management")]'))

assertEquals('Admin Users Password Policy', selenium.getText('//h4[contains(text(),"Admin Users Password Policy")]'))

assertEquals('Password Length', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group max-length margin-top-20"]//div[@class="span3"]//label[contains(text(),"Password Length")]'))

assertEquals('Minimum Digits', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-digits"]//div[@class="span3"]//label[contains(text(),"Minimum Digits")]'))

assertEquals('Minimum Letters', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-letters"]//div[@class="span3"]//label[contains(text(),"Minimum Letters")]'))

assertEquals('Minimum Symbols', selenium.getText('//div[@id="adminPolicy"]//div[@class="row-fluid tcc-slider-group min-symbols"]//div[@class="span3"]//label[contains(text(),"Minimum Symbols")]'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Credential Management/btn_Save'), 0)

