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

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(3)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Intake Query User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Intake Query User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=IntakeQueryUser')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeQueryUser\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Query Action', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Does this user exist?Is this user enabled?Does this user authenticate via LDAP?Does this user have the following role?Get user keyGet user roles', 
    selenium.getText('id=QueryActionSelectTriggerInput'))

assertEquals('User Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query Action\'])[1]/following::label[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'IntakeQuery')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]', 'UserId')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeQueryUser\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeWebAuthRequest')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthRequest\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Method', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Get Authorization ModeGet User IdGet User Password', selenium.getText('id=MethodSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'IntakeWebAuthRequest')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthRequest\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeWebAuthResponse')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthResponse\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Success', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::button[1]'))

assertEquals('An indicator if the auth was successful. A value of Yes, Y, True, T, or 1 is interpreted as success. Any other value is unsuccess.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::div[4]'))

assertEquals('Failure Reason', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::i[1]'))

assertEquals('If the auth was unsuccessful, this indicates the reason. This value will be passed to system level action \'loginFailure\' as a query parameter named \'reason\'.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::div[4]'))

assertEquals('Roles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::i[1]'))

assertEquals('If the auth was successful, a comma separated list of roles associated to the user. Note that no roles is not the same as an anonymous user.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::div[4]'))

assertEquals('User Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::button[1]'))

assertEquals('If the auth was successful, an optional description of the user (usually a name).', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'IntakeWebAuthResponse')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]', 
    'Failure')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]', 'Roles')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]', 
    'UserDescription')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If the auth was successful, an optional description of the user (usually a name).\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageFunctions_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'Intake Query User')

assertEquals('Intake Query User', selenium.getText('//a[@class="new-editor-open"]'))

