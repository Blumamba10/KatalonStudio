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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('link=Templates')

selenium.click('link=Manage Templates')

selenium.click('id=addTemplateButton')

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[4]')

WebUI.delay(1)

WebUI.setText(findTestObject('Convergence Administration Console/Template/Template Editor/input_Name_fc-name'), 'First Name')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

WebUI.sendKeys(findTestObject('Convergence Administration Console/Template/Template Editor/input_Name_fc-name'), 'Last Name')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

WebUI.sendKeys(findTestObject('Convergence Administration Console/Template/Template Editor/input_Name_fc-name'), 'Phone Number')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Text Mask')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[8]')

selenium.click('id=propertiesSaveBtn')

selenium.click('link=Properties')

selenium.click('id=templateName')

WebUI.sendKeys(findTestObject('Convergence Administration Console/Template/Template Editor/input_Name_templateName'), 'Next Template')

WebUI.sendKeys(findTestObject('Convergence Administration Console/Template/Template Editor/textarea_Description_templateDescription'), 
    'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[8]')

assertEquals('Success', selenium.getText('//span[contains(text(),\'Success\')]'))

assertEquals('Template published to server.', selenium.getText('//div[@class=\'tte-modal-dialog-content\']'))

selenium.click('//button[contains(text(),\'OK\')]')

selenium.close()

WebUI.switchToWindowIndex(0)

selenium.refresh()

selenium.waitForPageToLoad('30000')

assertEquals('Next Template', selenium.getText('//td[2]/a'))

