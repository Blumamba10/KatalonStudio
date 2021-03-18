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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Web Styles'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

assertEquals('Web Styles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('id=checkAll'))

assertEquals('Style', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Styles\'])[2]/following::th[2]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Style\'])[1]/following::th[1]'))

selenium.click('id=checkAll')

assertTrue(selenium.isElementPresent('id=addNewStyleButton'))

assertTrue(selenium.isElementPresent('id=previewStyleButton'))

assertTrue(selenium.isElementPresent('id=moveStylesButton'))

assertTrue(selenium.isElementPresent('id=exportStylesButton'))

assertTrue(selenium.isElementPresent('id=deleteStylesButton'))

selenium.click('id=checkAll')

selenium.click('id=addNewStyleButton')

assertEquals('General', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Web Form Styles\'])[1]/following::h4[1]'))

assertEquals('Style Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'General\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=idInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Style Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Edit Form Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=editFormNoteOn'))

assertEquals('On', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Form Note\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=editFormNoteOff'))

assertEquals('Off', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'On\'])[1]/following::label[1]'))

assertEquals('HTML 5 Support', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Off\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=htmlFiveSupportOn'))

assertEquals('On', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HTML 5 Support\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=htmlFiveSupportOff'))

assertEquals('Off', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'On\'])[2]/following::label[1]'))

assertEquals('ASCII Character Set', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Off\'])[2]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=asciiCharacterSetUTF8'))

assertEquals('UTF-8', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ASCII Character Set\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=asciiCharacterSetISO'))

assertEquals('ISO-8859-1', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UTF-8\'])[1]/following::label[1]'))

assertEquals('Render Version', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ISO-8859-1\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=renderVersionSelect'))

assertEquals('Appearance', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Render Version\'])[1]/following::h4[1]'))

assertEquals('Display Template Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Appearance\'])[1]/following::div[3]'))

assertTrue(selenium.isElementPresent('id=displayTemplateNameOn'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Display Template Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=displayTemplateNameOff'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[1]/following::label[1]'))

assertEquals('Display Template Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=displayTemplateDescriptionOn'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Display Template Description\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=displayTemplateDescriptionOff'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[2]/following::label[1]'))

assertEquals('Number of Columns', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[2]/following::label[1]'))

assertEquals('1 2 3 4 5 6', selenium.getText('id=columnsSelect'))

assertEquals('Field Label Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Number of Columns\'])[1]/following::label[1]'))

assertEquals('Field Name Field Description Field Name + Description', selenium.getText('id=fieldLabelSelect'))

assertEquals('Field Label Placement', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Field Label Value\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=labelPlacementLeft'))

assertEquals('Left', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Field Label Placement\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=labelPlacementTop'))

assertEquals('Top', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Left\'])[1]/following::label[1]'))

assertEquals('Blank Row Between Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Top\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=blankRowBetweenFieldsOn'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Blank Row Between Fields\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=blankRowBetweenFieldsOff'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[3]/following::label[1]'))

assertEquals('Blank Row After Groups', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[3]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=blankRowAfterGroupOn'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Blank Row After Groups\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=blankRowAfterGroupOff'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[4]/following::label[1]'))

assertEquals('Mark Required Fields with an Asterisk', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[4]/following::div[2]'))

assertTrue(selenium.isElementPresent('id=appendAsteriskToRequiredFieldsOn'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mark Required Fields with an Asterisk\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=appendAsteriskToRequiredFieldsOff'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[5]/following::label[1]'))

assertEquals('Style Sheet', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[5]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=styleSheetSelect'))

assertEquals('Errors', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Style Sheet\'])[1]/following::h4[1]'))

assertEquals('Inline Error Placement', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Errors\'])[1]/following::label[1]'))

assertEquals('Left Right Bottom Off', selenium.getText('id=inlineErrorsSelect'))

assertEquals('Invalid Form Message', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Inline Error Placement\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=invalidFormMessageInput'))

assertEquals('Form is invalid. Please review the indicated fields below.', selenium.getText('id=invalidFormMessageInput'))

assertEquals('Errors List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Invalid Form Message\'])[1]/following::div[2]'))

assertEquals('On', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Errors List\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=errorListOff'))

assertEquals('Off', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'On\'])[3]/following::label[1]'))

assertEquals('Save & Publish Options', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Off\'])[4]/following::h4[1]'))

assertEquals('Permitted Form Action', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save & Publish Options\'])[1]/following::label[1]'))

assertEquals('Publish Save Save or Publish', selenium.getText('id=savePublishSelect'))

assertEquals('Save Button Label', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Permitted Form Action\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=saveButtonLabelInput'))

assertEquals('Publish Button Label', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save Button Label\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=publishButtonLabelInput'))

assertEquals('Success Redirect', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Publish Button Label\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=successUrlInput'))

assertEquals('Save Options', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success Redirect\'])[1]/following::label[1]'))

assertEquals('Save to computer via a cookie Send email with link to form No save option', selenium.getText('id=postSaveOptionsSelect'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('id=idInput')

selenium.type('id=idInput', 'Style Name')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=submitButton')

WebUI.delay(3)

WebUI.refresh()

selenium.click('//input[@id="formRenderSettingsId_1"]')

selenium.click('//i[@class="shortcut-icon fas fa-trash-alt"]')

selenium.click('//button[@id="overlayConfirmOk"]')

