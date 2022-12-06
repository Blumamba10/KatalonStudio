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

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Projects'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[1]')

assertEquals('New Project', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Project\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=projectName'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=projectDescription'))
assertEquals('Max FDL Query Results (0 for unlimited)', selenium.getText('//body[1]/form[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/label[3]'))
 

assertEquals('Project Type', selenium.getText('//label[contains(text(),"Project Type")]'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]'))

selenium.click('id=projectName')

WebUI.setText(findTestObject('Convergence/Projects/New Project/projectName'), 'Test_Proj')

selenium.click('id=projectDescription')

selenium.type('id=projectDescription', 'Test Project Description')

selenium.click('id=submitButton')

selenium.waitForPageToLoad('30000')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

WebUI.comment('Verify new project is in the Project Dropdown')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Convergence/_SelectProject/a_Test_Proj'), 0)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Test_Proj'))

WebUI.comment('Verify no associatied scripts are created')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

assertEquals('Showing 0 to 0 of 0 entries', selenium.getText('//div[@id="controllerListTable_info"]'))

WebUI.comment('Verify no associatied templates are created')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Templates'))

assertEquals('Showing 0 to 0 of 0 entries', selenium.getText('//div[@id="templateListTable_info"]'))

WebUI.comment('Delete the Project')

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Projects'))

WebUI.delay(2)

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'Test_Proj')

WebUI.click(findTestObject('Convergence/Projects/checkbox_Select all'))

WebUI.click(findTestObject('Convergence/Projects/button_Delete'))

assertEquals('Removing a project will delete ALL of its associated templates, scripts, option lists, and style configurations. Are you sure you want to remove the selected project?', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Confirm Remove Project\'])[1]/following::p[1]'))

WebUI.delay(6)

selenium.click('id=overlayConfirmOk')

WebUI.refresh()

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_SelectProject/a_Test_Proj'), 0)

