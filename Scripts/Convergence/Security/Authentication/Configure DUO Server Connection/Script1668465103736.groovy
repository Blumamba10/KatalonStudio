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
import org.testng.Assert as Assert
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Authentication'))

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_DUO Server Authentication'))

WebUI.waitForElementPresent(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/btn_Add DUO Server'), 
    15)

assertEquals('DUO', selenium.getText('//body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]'))

assertEquals('ID', selenium.getText('//th[contains(text(),\'ID\')]'))

assertEquals('Name', selenium.getText('//th[contains(text(),\'Name\')]'))

assertEquals('API Host', selenium.getText('//th[contains(text(),\'API Host\')]'))

assertEquals('Integration Key', selenium.getText('//th[contains(text(),\'Integration Key\')]'))

assertEquals('Actions', selenium.getText('//th[contains(text(),\'Actions\')]'))

assertEquals('Last Updated', selenium.getText('//th[contains(text(),\'Last Updated\')]'))

assertEquals('Add DUO Server', selenium.getText('//span[@id=\'ui-id-1\']'))

WebUI.click(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/btn_Add DUO Server'))

WebUI.sendKeys(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/txt _Duo Name'), 
    'Trinisys DUO Test')

WebUI.sendKeys(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/txt_API Host'), 
    'api-71b49296.duosecurity.com')

WebUI.sendKeys(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/txt_Integration Key'), 
    'DI224EVB3R9ZDHU5CBZO')

WebUI.sendKeys(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/txt_Secret'), 
    'BCY3zCXVUu1bGVjUrf8Aj7M6IjKi1FDd0zbBHHwa')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/btn_Cancel'), 
    0)

WebUI.click(findTestObject('Convergence/Security/Authentication/Page_Convergence - DUO/Add DUO Connection/btn_Save'))

assertEquals('Trinisys DUO Test', selenium.getText('//a[contains(text(),\'Trinisys DUO Test\')]'))

assertEquals('api-71b49296.duosecurity.com', selenium.getText('//td[contains(text(),\'api-71b49296.duosecurity.com\')]'))

assertEquals('DI224EVB3R9ZDHU5CBZO', selenium.getText('//td[contains(text(),\'DI224EVB3R9ZDHU5CBZO\')]'))

selenium.isElementPresent('//tbody/tr[1]/td[6]/div[1]/button[1]')

selenium.isElementPresent('//tbody/tr[1]/td[6]/div[1]/button[2]')

selenium.click('//tbody/tr[1]/td[6]/div[1]/button[1]')

//Test DUO Connection popup
selenium.isElementPresent('//div[@id=\'fl-credentialsDialog-duoName\']')

selenium.isElementPresent('//input[@id=\'fc-credentialsDialog-serviceUsername\']')

selenium.isElementPresent('//select[@id=\'fc-credentialsDialog-serviceFactor\']')

selenium.select('id=fc-credentialsDialog-serviceFactor', 'label=Passcode')

selenium.isElementPresent('//div[@id=\'fl-credentialsDialog-servicePassword\']')

selenium.isElementPresent('//button[contains(text(),\'Test Credentials\')]')

selenium.isElementPresent('//button[contains(text(),\'Done\')]')

selenium.click('//button[contains(text(),\'Done\')]')

selenium.click('//tbody/tr[1]/td[6]/div[1]/button[2]')

assertEquals('Confirm Delete', selenium.getText('//h1[contains(text(),\'Confirm Delete\')]'))

selenium.click('//button[contains(text(),\'OK\')]')

assertEquals('Success!', selenium.getText('//h1[contains(text(),\'Success!\')]'))

selenium.click('//body/div[13]/div[11]/div[1]/button[1]')

WebUI.comment('verify the Connection is no longer displayed')


driver.findElements(By.xpath('//a[contains(text(),\'Trinisys DUO Test\')]')).size() < 1

