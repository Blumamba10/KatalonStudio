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

WebUI.delay(3)

selenium.click('id=scriptNameInput')

selenium.typeKeys('id=scriptNameInput', 'Manage User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Manage User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=ManageUser')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ManageUser\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('User Action', selenium.getText('//div[2]/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[1]'))

assertEquals('Password', selenium.getText('//label[@for="PasswordInput"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]'))

assertEquals('Description', selenium.getText('//label[@for="DescriptionInput"]'))

assertTrue(selenium.isElementPresent('//input[@id="DescriptionInput"]'))

assertEquals('Mode', selenium.getText('//label[@for="ModeSelectTriggerInput"]'))

assertEquals('FormStand Alone', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('NTLM Authentication', selenium.getText('//label[@for="NTLMAuthenticationSelectTriggerInput"]'))

assertEquals('NoYes', selenium.getText('id=NTLMAuthenticationSelectTriggerInput'))

assertEquals('SAML Authentication', selenium.getText('//label[@for="SAMLAuthenticationSelectTriggerInput"]'))

assertEquals('NoYes', selenium.getText('id=SAMLAuthenticationSelectTriggerInput'))

assertEquals('Directory Server Authentication', selenium.getText('//label[@for="DirectoryServerAuthenticationSelectTriggerInput"]'))

assertEquals('NoYes', selenium.getText('id=DirectoryServerAuthenticationSelectTriggerInput'))

assertEquals('Internal Database Authentication', selenium.getText('//label[@for="InternalDatabaseAuthenticationSelectTriggerInput"]'))

assertEquals('NoYes', selenium.getText('id=InternalDatabaseAuthenticationSelectTriggerInput'))

assertEquals('Enabled', selenium.getText('//label[@for="EnabledSelectTriggerInput"]'))

assertEquals('NoYes', selenium.getText('id=EnabledSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Manage_User')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=UserActionSelectTriggerInput')

selenium.select('id=UserActionSelectTriggerInput', 'label=Update User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Action\'])[1]/following::option[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]', 'UserID')

selenium.typeKeys('//input[@id="DescriptionInput"]', 'Description')

selenium.click('id=ModeSelectTriggerInput')

selenium.select('id=ModeSelectTriggerInput', 'label=Form')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::option[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::button[2]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Manage User')

assertEquals('Manage User', selenium.getText('//a[@class="new-editor-open"]'))

