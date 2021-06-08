import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(3)

selenium.click('id=scriptNameInput')

selenium.typeKeys('id=scriptNameInput', 'Send Email')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'Send Email')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=Send Email')

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Standard Options', selenium.getText('link=Standard Options'))

assertEquals('Mail Host', selenium.getText('//label[@for="mailHost"]'))

assertTrue(selenium.isElementPresent('//input[@id="mailHost"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::button[1]'))

assertEquals('From', selenium.getText('//label[@for="fromAddress"]'))

assertTrue(selenium.isElementPresent('//input[@id="fromAddress"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From\'])[1]/following::button[1]'))

assertEquals('To', selenium.getText('//label[@for="toAddress"]'))

assertTrue(selenium.isElementPresent('//input[@id="toAddress"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::button[1]'))

assertEquals('CC', selenium.getText('//label[@for="ccAddress"]'))

assertEquals('Additional Options', selenium.getText('link=Additional Options'))

selenium.click('link=Additional Options')

assertEquals('Sender', selenium.getText('//label[@for="senderAddress"]'))

assertTrue(selenium.isElementPresent('//input[@id="senderAddress"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sender\'])[1]/following::button[1]'))

assertEquals('Reply To', selenium.getText('//label[@for="replyToAddress"]'))

assertTrue(selenium.isElementPresent('//input[@id="replyToAddress"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::button[1]'))

assertEquals('BCC', selenium.getText('//label[@for="bccAddress"]'))

assertTrue(selenium.isElementPresent('//input[@id="bccAddress"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::button[1]'))

assertEquals('User Name', selenium.getText('//label[@for="username"]'))

assertTrue(selenium.isElementPresent('//input[@id="username"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::button[1]'))

assertEquals('Password', selenium.getText('//label[@for="password"]'))

assertTrue(selenium.isElementPresent('//input[@id="password"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]'))

assertEquals('Port', selenium.getText('//label[@for="port"]'))

assertTrue(selenium.isElementPresent('//input[@id="port"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::button[1]'))

assertEquals('File Attachments', selenium.getText('link=File Attachments'))

selenium.click('link=File Attachments')

assertEquals('Include', selenium.getText('//div[@class="col-1"]//strong[contains(text(),"Include")]'))

assertEquals('File', selenium.getText('//strong[contains(text(),"File")]'))

assertTrue(selenium.isElementPresent('//input[@id="Form ImageenableCheck"]'))

assertEquals('Form as HTML', selenium.getText('//label[@for="Form as HTMLenableCheck"]'))

assertTrue(selenium.isElementPresent('//input[@id="Form as HTMLenableCheck"]'))

assertTrue(selenium.isElementPresent('link=Message Content'))

selenium.click('link=Message Content')

assertEquals('Subject', selenium.getText('//div[2]/div/div[4]/div/div/label'))

assertTrue(selenium.isEditable('id=subject'))

assertEquals('Content', selenium.getText('//ngb-modal-window/div/div/div[2]/div[2]/div/label'))

assertTrue(selenium.isElementPresent('//a/div'))

assertTrue(selenium.isElementPresent('//a[2]/div'))

assertTrue(selenium.isElementPresent('//a[3]/div'))

assertTrue(selenium.isElementPresent('//a[4]/div'))

assertTrue(selenium.isElementPresent('//a[5]/div'))

assertTrue(selenium.isElementPresent('//a[6]/div'))

assertTrue(selenium.isElementPresent('//div[2]/a/div'))

assertTrue(selenium.isElementPresent('//div[2]/a[2]/div'))

assertTrue(selenium.isElementPresent('//div[2]/a[3]/div'))

assertTrue(selenium.isElementPresent('//div[2]/a[4]/div'))

assertTrue(selenium.isElementPresent('//div[3]/a/div'))

assertTrue(selenium.isElementPresent('//div[3]/a[2]/div'))

assertTrue(selenium.isElementPresent('//div[3]/a[3]/div'))

assertTrue(selenium.isElementPresent('link=Remove Formatting'))

assertTrue(selenium.isElementPresent('//div[5]/a/div'))

assertTrue(selenium.isElementPresent('link=Code'))

assertTrue(selenium.isElementPresent('link=Insert a Quote'))

assertTrue(selenium.isElementPresent('link=Insert a link'))

assertTrue(selenium.isElementPresent('//div[7]/a[3]/div'))

assertTrue(selenium.isElementPresent('//div[8]/a/div'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View source\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Send_Email')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('link=Standard Options')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::input[1]', 'Mail Host')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::input[1]', 'To')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CC\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CC\'])[1]/following::input[1]', 'Copy')

selenium.click('link=Additional Options')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sender\'])[1]/following::input[1]', 'Sender')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::input[1]', 'ReplyTo')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::input[1]', 'BCC')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::input[1]', 'UserName')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]', 'Password')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::input[1]', 'Port')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Send Email')

assertEquals('Send Email', selenium.getText('//a[@class="new-editor-open"]'))

