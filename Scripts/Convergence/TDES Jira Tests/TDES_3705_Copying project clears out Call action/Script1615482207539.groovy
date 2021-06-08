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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Projects'))

WebUI.click(findTestObject('Convergence/Projects/button_Add New Project'))

WebUI.setText(findTestObject('Convergence/Projects/New Project/projectName'), 'NewProject')

WebUI.setText(findTestObject('Convergence/Projects/New Project/projectDescription'), 'New Project (No Prototype)')

WebUI.selectOptionByLabel(findTestObject('Convergence/Projects/New Project/Project Type_dropdown'), 'No Prototype', 
    false)

WebUI.click(findTestObject('Convergence/Projects/New Project/button_Submit'))

WebUI.delay(10)

WebUI.refresh()

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_NewProject'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_NewProject'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

selenium.click('link=Manage Functions')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/Manage Functions/button_addScriptButton'), 0)

WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/button_addScriptButton'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Convergence Script Editor')

WebUI.delay(2)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'TestFunction')

selenium.click('link=Save')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Input Parameters_addBtn'))

WebUI.sendKeys(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Input Parameter_textarea'), 'in')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/checkBtn'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Input Parameters_addBtn'))

WebUI.sendKeys(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Input Parameter_textarea'), 'my parameters')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/checkBtn'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Output Parameters_add_Btn'))

WebUI.sendKeys(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Output Parameter_textarea'), 
    'out')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/checkBtn'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save Script'))

WebUI.delay(3)

selenium.close()

WebUI.switchToWindowIndex('0')

selenium.refresh()

selenium.waitForPageToLoad('30000')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Functions/input_Search Filter'), 'TestFunction')

assertEquals('TestFunction', selenium.getText('//a[@class="new-editor-open"]'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

WebUI.delay(2)

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowTitle('Convergence Script Editor')

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Test Script')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=Call Script')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Script Name', selenium.getText('//label[@for="scriptNamesSelect"]'))

selenium.typeKeys('id=nameInput', 'Call_Script')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=scriptNamesSelect')

selenium.select('id=scriptNamesSelect', 'label=TestFunction')

assertEquals('Input Parameters', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Name\'])[1]/following::p[1]'))

assertEquals('in', selenium.getText('//label[@for="ininput"]'))

assertTrue(selenium.isElementPresent('//input[@id="ininput"]'))

assertEquals('my parameters', selenium.getText('//label[@for="my parametersinput"]'))

assertTrue(selenium.isElementPresent('//label[@for="my parametersinput"]'))

assertTrue(selenium.isElementPresent('//label[@for="my parametersinput"]'))

selenium.click('//input[@id="ininput"]')

selenium.typeKeys('//input[@id="ininput"]', 'in')

selenium.click('//input[@id="my parametersinput"]')

selenium.typeKeys('//input[@id="my parametersinput"]', 'myParameter')

selenium.click('//button[contains(text(),"OK")]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Test Script')

assertEquals('Test Script', selenium.getText('//a[@class="new-editor-open"]'))

selenium.click('link=Projects')

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'NewProject')

selenium.click('//button[@id="copyProjectBtn_3"]')

selenium.typeKeys('//input[@id="copyProjectNameInput"]', 'NewProject-copied')

selenium.click('//button[@id="copyProjectSubmitButton"]')

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'NewProject-copied')

WebUI.delay(2)

selenium.click('//a[@class=\'dropdown-toggle\'][contains(text(),\'admin\')]')

WebUI.click(findTestObject('Convergence/_NavigationLinks/Logout/a_admin'))

selenium.click('link=Logout')

WebUI.delay(2)

selenium.click('link=Return')

WebUI.delay(2)

selenium.type('id=usernameField', 'admin')

selenium.type('id=passwordField', 'admin')

selenium.submit('name=logonform')

assertTrue(selenium.isElementPresent('link=Convergence'))

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_NewProject-copied'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_NewProject-copied'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Test Script')

selenium.click('link=Test Script')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.click('//div[@class="tse-action-name ng-tns-c78-4 ng-star-inserted"]')

selenium.click('id=scriptNamesSelect')

selenium.select('id=scriptNamesSelect', 'label=TestFunction')

selenium.click('//button[contains(text(),"OK")]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

selenium.click('link=Manage Functions')

WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/checkbox_CheckAll'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Functions/button_Delete'))

selenium.click('//button[@id="overlayConfirmOk"]')

WebUI.delay(2)

selenium.click('link=Projects')

WebUI.delay(2)

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'New')

WebUI.click(findTestObject('Convergence/Projects/checkbox_Select all'))

WebUI.click(findTestObject('Convergence/Projects/button_Delete'))

selenium.click('//button[@id="overlayConfirmOk"]')

