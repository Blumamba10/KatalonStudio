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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_License Manager'))

assertEquals('License Manager', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Company', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'License Manager\'])[2]/following::h5[1]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Trinisys Internal (Max)\'])[1]/following::h5[1]'))

assertEquals('Limits', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::h5[1]'))

assertEquals('License', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Limits\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('id=updateLicenseButton'))

assertEquals('Registered Clients', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enter License Key\'])[1]/following::h5[1]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Registered Clients\'])[1]/following::th[2]'))

assertEquals('Version', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[2]/following::th[1]'))

assertEquals('Hostname', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Version\'])[1]/following::th[1]'))

assertEquals('Address', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hostname\'])[1]/following::th[1]'))

assertEquals('Username', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Address\'])[1]/following::th[1]'))

assertEquals('Registered', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Username\'])[1]/following::th[1]'))

assertEquals('Last Accessed', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Registered\'])[1]/following::th[1]'))

assertEquals('Type', selenium.getText('//form[@id=\'updateClientsForm\']/div/div/span'))

assertEquals('Extend License', selenium.getText("//button[@id='extendLicenseButton']"))

selenium.click("//button[@id='extendLicenseButton']")
assertTrue(selenium.isElementPresent("//label[@for='licenseCodeField']"))

assertTrue(selenium.isElementPresent("//input[@id='licenseCodeField']"))

assertTrue(selenium.isElementPresent("//button[@id='cancelExtendLicenseButton']"))
assertTrue(selenium.isElementPresent("//button[@id='submitExtendLicenseButton']"))

selenium.click("//button[@id='cancelExtendLicenseButton']")

assertEquals('All Capture DataEntry FormRecognition ImageMonitor JavaClient MSClient TemplateEditor Unknown', selenium.getText("//select[@id='filterTypeSelect']"))

assertEquals('Status', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[3]/following::span[1]'))

assertEquals('Active Disabled', selenium.getText("//select[@id='filterStatusSelect']"))
assertTrue(selenium.isElementPresent("//button[@id='applyFilterButton']"))



WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Home'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Administration'))

