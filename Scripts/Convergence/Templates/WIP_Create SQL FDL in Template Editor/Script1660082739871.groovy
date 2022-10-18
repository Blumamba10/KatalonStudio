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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Templates'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/addTemplate'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/a_Form Data Lookup'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/btn_Create new FDL'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/input_FDL Name'), 
    'Auto SQL FDL')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/radiobtn_SQL Based'))

selenium.typeKeys('//input[@id="nameInput"]', 'Auto SQL FDL')

selenium.typeKeys('//textarea[@id="descriptionInput"]', 'Auto SQL FDL')

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/select_DataSource'), 
    'configDataSource', false)

WebUI.doubleClick(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/textarea_Query'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/textarea_Query'), 
    'SELECT userName from tdes_user')

selenium.click('//button[@id="testQueryButton"]')

selenium.click('//button[contains(text(),"Run Query")]')

assertEquals('Query Results', selenium.getText('//h4[contains(text(),"Query Results")]'))

assertEquals('userName', selenium.getText('//th[contains(text(),"userName")]'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Template Editor FDL Tab/button_Save'))

assertTrue(selenium.isElementPresent('//span[contains(text(),"Success")]'))

selenium.click('//button[@type="submit"]')

assertTrue(selenium.isElementPresent('//a[contains(text(),"Auto SQL FDL")]'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/a_Properties'))

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Template Name'), 'FDL Template')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Template Description'), 'FDL Template')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/a_Preview'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/btn_insertDataview'))

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Form Name'), 'FDL')

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/dropdown_Data (FDL)'), 
    'Auto SQL FDL', false)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Publish_btn'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Success_pop-up/span_Success'), 
    'SUCCESS')

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Success_pop-up/div_Template published to server'), 
    'Template published to server.')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Success_pop-up/btn_OK'))

WebUI.delay(2)

selenium.close()

WebUI.switchToWindowIndex(0)

selenium.refresh()

selenium.waitForPageToLoad('30000')

