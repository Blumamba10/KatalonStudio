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

CustomKeywords.'cutomKeywords.Demo_LoginHelper.login'(GlobalVariable.demoappURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('DemoApp/_Navigation Links/a_Web Platform'))

selenium.click('link=Custom Menus')

assertEquals('Custom Menus', selenium.getText('//div[@class=\'tde-template-description\']'))

assertEquals('Red Menu Item', selenium.getText('link=Red Menu Item'))

selenium.click('//div[3]/div/ul/li/a')

assertEquals('This page demonstrates including a custom menu in a page.', selenium.getText('//p'))

assertEquals('The menu above was included using the following call:', selenium.getText('//p[2]'))

assertEquals('swat.siteNav.includeMenu("Colors");', selenium.getText('//font'))

assertEquals('The menu below was included used the second optional parent parameter to position the menu inside the Layout -> Nav group.', 
    selenium.getText('//p[3]'))

assertTrue(selenium.isElementPresent('//div[@id=\'btn-layout-nav-addMenuItem\']/button'))

assertEquals('Add/Enable Menu Item', selenium.getText('//button'))

assertTrue(selenium.isElementPresent('//tr[2]/td/div/button'))

assertEquals('Disable Menu Item', selenium.getText('//tr[2]/td/div/button'))

assertTrue(selenium.isElementPresent('link=Nav Item 1'))

assertTrue(selenium.isElementPresent('link=Nav Item 2'))

assertTrue(selenium.isElementPresent('link=Nav Item 3'))

selenium.click('//button')

assertTrue(selenium.isVisible('link=Optional Menu Item'))

selenium.click('//tr[2]/td/div/button')

assertTrue(selenium.isVisible('link=Optional Menu Item'))

assertEquals('First Name', selenium.getText('id=fl-layout-content-firstName'))

assertEquals('Last Name', selenium.getText('id=fl-layout-content-lastName'))

assertEquals('Date of Birth', selenium.getText('//div/table/tbody/tr[3]/td/div'))

assertEquals('Source:', selenium.getText('//font/strong'))

assertEquals('View Template', selenium.getText('//div[@id=\'btn-source-viewTemplate\']/button'))

selenium.click('link=Green Menu Item')

selenium.click('//div[3]/div/ul/li/a')

assertEquals('This page demonstrates including a custom menu in a page.', selenium.getText('//p'))

assertEquals('The menu above was included using the following call:', selenium.getText('//p[2]'))

assertEquals('swat.siteNav.includeMenu("Colors");', selenium.getText('//font'))

assertEquals('The menu below was included used the second optional parent parameter to position the menu inside the Layout -> Nav group.', 
    selenium.getText('//p[3]'))

assertTrue(selenium.isElementPresent('//div[@id=\'btn-layout-nav-addMenuItem\']/button'))

assertEquals('Add/Enable Menu Item', selenium.getText('//button'))

assertTrue(selenium.isElementPresent('//tr[2]/td/div/button'))

assertEquals('Disable Menu Item', selenium.getText('//tr[2]/td/div/button'))

assertTrue(selenium.isElementPresent('link=Nav Item 1'))

assertTrue(selenium.isElementPresent('link=Nav Item 2'))

assertTrue(selenium.isElementPresent('link=Nav Item 3'))

assertEquals('Optional Menu Item', selenium.getText('//div/div/ul/li[4]/a'))

assertEquals('First Name', selenium.getText('id=fl-layout-content-firstName'))

assertEquals('Last Name', selenium.getText('id=fl-layout-content-lastName'))

assertEquals('Date of Birth', selenium.getText('//div/table/tbody/tr[3]/td/div'))

assertEquals('Source:', selenium.getText('//font/strong'))

assertEquals('View Template', selenium.getText('//div[@id=\'btn-source-viewTemplate\']/button'))

selenium.click('link=Blue Menu Item')

selenium.click('//div[3]/div/ul/li/a')

assertEquals('This page demonstrates including a custom menu in a page.', selenium.getText('//p'))

assertEquals('The menu above was included using the following call:', selenium.getText('//p[2]'))

assertEquals('swat.siteNav.includeMenu("Colors");', selenium.getText('//font'))

assertEquals('The menu below was included used the second optional parent parameter to position the menu inside the Layout -> Nav group.', 
    selenium.getText('//p[3]'))

assertTrue(selenium.isElementPresent('//div[@id=\'btn-layout-nav-addMenuItem\']/button'))

assertEquals('Add/Enable Menu Item', selenium.getText('//button'))

assertTrue(selenium.isElementPresent('//tr[2]/td/div/button'))

assertEquals('Disable Menu Item', selenium.getText('//tr[2]/td/div/button'))

assertTrue(selenium.isElementPresent('link=Nav Item 1'))

assertTrue(selenium.isElementPresent('link=Nav Item 2'))

assertTrue(selenium.isElementPresent('link=Nav Item 3'))

assertEquals('Optional Menu Item', selenium.getText('//div/div/ul/li[4]/a'))

assertEquals('First Name', selenium.getText('id=fl-layout-content-firstName'))

assertEquals('Last Name', selenium.getText('id=fl-layout-content-lastName'))

assertEquals('Date of Birth', selenium.getText('//div/table/tbody/tr[3]/td/div'))

assertEquals('Source:', selenium.getText('//font/strong'))

assertEquals('View Template', selenium.getText('//div[@id=\'btn-source-viewTemplate\']/button'))

