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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Multi Page Merge')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Multi Page Merge')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=MultiPageMerge')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertEquals('Template', selenium.getText('//label[@for="TemplateSelectTriggerInput"]'))

assertTrue(selenium.isElementPresent('id=TemplateSelectTriggerInput'))

assertEquals('The template for the final merged form (not an individual page template)', selenium.getText('//div[contains(text(),"The template for the final merged form (not an ind")]'))

assertEquals('Web Form Style', selenium.getText('//label[@for="WebFormStyleSelectTriggerInput"]'))

assertTrue(selenium.isElementPresent('id=WebFormStyleSelectTriggerInput'))

assertEquals('The web form style to apply to the final merged form', selenium.getText('//div[contains(text(),"The web form style to apply to the final merged fo")]'))

assertEquals('Page Form Id', selenium.getText('//label[@for="PageFormIdInput"]'))

assertEquals('The form id of any page of the multipage form (the rest of the ids are automatically inferred)', selenium.getText(
        '//div[contains(text(),"The form id of any page of the multipage form (the")]'))

assertEquals('Save Method', selenium.getText('//label[@for="SaveMethodSelectTriggerInput"]'))

assertEquals('SavePublish', selenium.getText('id=SaveMethodSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'MultiPageMerge')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=TemplateSelectTriggerInput')

selenium.select('id=TemplateSelectTriggerInput', 'label=Next Template')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::input[1]', 
    'PageFormID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save Method\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Multi Page Merge')

assertEquals('Multi Page Merge', selenium.getText('//a[@class="new-editor-open"]'))

