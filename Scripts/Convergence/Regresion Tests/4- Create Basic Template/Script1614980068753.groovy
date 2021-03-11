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

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Templates'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/addTemplate'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'First Name')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Last Name')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'SSN')

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/dropdown_Form Type'), 
    'text-mask', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/dropdown_Input Mask'), 
    'ssn', false)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Phone Number')

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/dropdown_Form Type'), 
    'number', false)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/a_Properties'))

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Template Name'), 'Next Template')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Template Description'), 'Description')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Publish_btn'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/_Success_pop-up/span_Success'), 
    'SUCCESS')

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/_Success_pop-up/div_Template published to server'), 
    'Template published to server.')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/_Success_pop-up/btn_OK'))

WebUI.delay(2)

selenium.close()

WebUI.switchToWindowIndex(0)

selenium.refresh()

selenium.waitForPageToLoad('30000')

assertEquals('Next Template', selenium.getText('//td[2]/a'))

