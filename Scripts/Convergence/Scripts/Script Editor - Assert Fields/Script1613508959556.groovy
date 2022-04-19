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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.switchToWindowIndex('1')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[2]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[2]/following::i[2]')

assertTrue(selenium.isElementPresent('id=scriptNameInput'))

assertTrue(selenium.isElementPresent('link=Save'))

assertTrue(selenium.isElementPresent('link=Cancel'))
assertTrue(selenium.isElementPresent('//i[@class="fa fa-undo"]'))
assertTrue(selenium.isElementPresent('//i[@class="fas fa-redo"]'))


selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Script Name')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

assertTrue(selenium.isElementPresent('id=scriptDescriptionInput'))

assertTrue(selenium.isElementPresent('link=Save'))

assertTrue(selenium.isElementPresent('link=Cancel'))

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Script Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

assertEquals('Linked Templates', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Name\'])[1]/following::h6[1]'))

assertEquals('No linked templates', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked Templates\'])[1]/following::div[1]'))

assertEquals('Data SourcesAdd Data Source Variable', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No linked templates\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No linked templates\'])[1]/following::i[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No linked templates\'])[1]/following::i[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Data Source Variable\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('link=Add'))

assertTrue(selenium.isElementPresent('link=Cancel'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add\'])[1]/following::i[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Verify Script\'])[1]/preceding::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Verify Script\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collapse All\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Expand All\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Insert Before\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Insert After\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Copy\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cut\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enable\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Disable\'])[1]/following::button[1]'))

selenium.click('//app-actions-list-head/div/div/div[2]/button/i')

assertTrue(selenium.isElementPresent('id=actionSearchInput'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search Actions\'])[1]/following::button[1]'))

assertEquals('No actions configured. Click Add Action to create the first action for this script.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Clear Search\'])[1]/following::p[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

assertEquals('Select an Action or Script', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Actions', selenium.getText('id=ngb-nav-0'))

assertEquals('Scripts', selenium.getText('id=ngb-nav-1'))

assertTrue(selenium.isElementPresent('id=searchActions'))

assertEquals('AuthUser', selenium.getText('link=AuthUser'))

assertEquals('Call Script', selenium.getText('link=Call Script'))

assertEquals('Comment', selenium.getText('link=Comment'))

assertEquals('Conditional Statement', selenium.getText('link=Conditional Statement'))

assertEquals('ConvertDocument', selenium.getText('link=ConvertDocument'))

assertEquals('Create JSON', selenium.getText('link=Create JSON'))

assertEquals('Create XML', selenium.getText('link=Create XML'))

not_run: assertEquals('CSVImport', selenium.getText('link=CSVImport'))

not_run: assertEquals('DateUtils', selenium.getText('link=DateUtils'))

assertEquals('DMS Index', selenium.getText('link=DMS Index'))

not_run: assertEquals('DmsSearch', selenium.getText('link=DmsSearch'))

assertEquals('DocumentFill', selenium.getText('link=DocumentFill'))

assertEquals('Error', selenium.getText('link=Error'))

assertEquals('ExcelExport', selenium.getText('link=ExcelExport'))

assertEquals('Export JSON', selenium.getText('link=Export JSON'))

assertEquals('Export XML', selenium.getText('link=Export XML'))

assertEquals('File Output', selenium.getText('link=File Output'))

assertEquals('FileUtils', selenium.getText('link=FileUtils'))

assertEquals('For Each Statement', selenium.getText('link=For Each Statement'))

assertEquals('GetFormFieldValues', selenium.getText('link=GetFormFieldValues'))

assertEquals('GetFormFieldValues', selenium.getText('link=GetFormFieldValues'))

assertEquals('GetMedia', selenium.getText('link=GetMedia'))

not_run: assertEquals('HL7MessageBuilder', selenium.getText('link=HL7MessageBuilder'))

not_run: assertEquals('HL7MessageSender', selenium.getText('link=HL7MessageSender'))

not_run: assertEquals('HL7Util', selenium.getText('link=HL7Util'))

assertEquals('Hold', selenium.getText('link=Hold'))

assertEquals('Insert', selenium.getText('link=Insert'))

assertEquals('IntakeAuthUser', selenium.getText('link=IntakeAuthUser'))

assertEquals('IntakeInit', selenium.getText('link=IntakeInit'))

assertEquals('IntakeMessageRequest', selenium.getText('link=IntakeMessageRequest'))

assertEquals('IntakeMessageResponse', selenium.getText('link=IntakeMessageResponse'))

assertEquals('IntakeQueryUser', selenium.getText('link=IntakeQueryUser'))

assertEquals('IntakeWebAuthRequest', selenium.getText('link=IntakeWebAuthRequest'))

assertEquals('IntakeWebAuthResponse', selenium.getText('link=IntakeWebAuthResponse'))

assertEquals('ManageRoles', selenium.getText('link=ManageRoles'))

assertEquals('ManageUser', selenium.getText('link=ManageUser'))

assertEquals('MathUtils', selenium.getText('link=MathUtils'))

assertEquals('MultiPageCreate', selenium.getText('link=MultiPageCreate'))

assertEquals('MultipageEvent', selenium.getText('link=MultipageEvent'))

assertEquals('MultiPageGetFormId', selenium.getText('link=MultiPageGetFormId'))

not_run: assertEquals('MultiPageMerge', selenium.getText('link=MultiPageMerge'))

assertEquals('MultipageResponse', selenium.getText('link=MultipageResponse'))

assertEquals('NavConfigurator', selenium.getText('link=NavConfigurator'))

assertEquals('PasswordGenerator', selenium.getText('link=PasswordGenerator'))

assertEquals('PdfBuilder', selenium.getText('link=PdfBuilder'))

assertEquals('Query', selenium.getText('link=Query'))

assertEquals('Query JSON', selenium.getText('link=Query JSON'))

assertEquals('Query XML', selenium.getText('link=Query XML'))

assertEquals('QueryUser', selenium.getText('link=QueryUser'))

not_run: assertEquals('RemoveServerObject', selenium.getText('link=RemoveServerObject'))

assertEquals('ResultSetUtils', selenium.getText('link=ResultSetUtils'))

assertEquals('Save Point', selenium.getText('link=Save Point'))

assertEquals('Send Email', selenium.getText('link=Send Email'))

assertEquals('Set Variable', selenium.getText('link=Set Variable'))

not_run: assertEquals('ShaPasswordEncoder', selenium.getText('link=ShaPasswordEncoder'))

assertEquals('Stored Procedure', selenium.getText('link=Stored Procedure'))

assertEquals('Stored Procedure with Results', selenium.getText('link=Stored Procedure with Results'))

assertEquals('StringUtils', selenium.getText('link=StringUtils'))

assertEquals('Transform XML', selenium.getText('link=Transform XML'))

assertEquals('Update', selenium.getText('link=Update'))

assertEquals('Update JSON', selenium.getText('link=Update JSON'))

assertEquals('UpdateForm', selenium.getText('link=UpdateForm'))

assertEquals('UrlUtilAction', selenium.getText('link=UrlUtilAction'))

assertEquals('WebAuthRequest', selenium.getText('link=WebAuthRequest'))

assertEquals('WebAuthResponse', selenium.getText('link=WebAuthResponse'))

assertEquals('WebInit', selenium.getText('link=WebInit'))

assertEquals('WebRequest', selenium.getText('link=WebRequest'))

assertEquals('WebResponse', selenium.getText('link=WebResponse'))

assertEquals('WebSession', selenium.getText('link=WebSession'))

assertEquals('Scripts', selenium.getText('link=Scripts'))

selenium.click('link=Scripts')

assertEquals('Click a script name to make a selection', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search\'])[1]/following::div[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Click a script name to make a selection\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Click a script name to make a selection\'])[1]/following::button[1]')

selenium.close()

WebUI.switchToWindowIndex('0')

