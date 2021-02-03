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

CustomKeywords.'cutomKeywords.LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/a_Actions'))

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/h2_Actions'), 'Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/th_Name'), 'Name')

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/th_Description'), 'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_addCustomActionButton'), 
    0)

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_addCustomActionButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/h1_Select an Action'), 
    'Select an Action')

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/span_Items Per Page'), 
    'Items Per Page')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/select_Items Per Page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/input_Search Filter'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/th_Type'), 
    'Type')

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/th_Description'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/button_cancelButton'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/button_submitButton'), 
    0)

WebUI.sendKeys(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/input_Search Filter'), 
    'xmlUtils')

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/radiobtn_XmlUtlis'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Select an Action_Page/button_submitButton'))

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Action Configuration/label_ID'), 
    'ID')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Action Configuration/input_ID'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Action Configuration/label_Description'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Action Configuration/input_Description'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Action Configuration/label_Implementation'), 
    'Implementation')

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Action Configuration/btn_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/h4_Save Changes'), 'Save Changes')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_Save'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_Cancel'), 0)

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/a_Actions'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/checkbox_XmlUtils'))

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_RemoveCustomActionButton'))

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Remove Action_popup/span_Remove Actions'), 
    'Remove Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Remove Action_popup/p_Are you sure you want to remove these actions'), 
    'Are you sure you want to remove these actions?')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Remove Action_popup/btn_Cancel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Remove Action_popup/btn_OK'), 
    0)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/Remove Action_popup/btn_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/h4_Save Changes'), 'Save Changes')

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/Actions/btn_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Server/ConfigureServer_Page/a_Actions'))

assertEquals('AuthUser', selenium.getText('link=AuthUser'))

assertEquals('Provides support for authentication using Convergence users in a Web Platform application', selenium.getText(
        '//td[contains(text(),\'Provides support for authentication using Converge\')]'))

assertEquals('BatchInsert', selenium.getText('link=BatchInsert'))

assertEquals('Batch Insert Action', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[2]/td[3]'))

assertEquals('BatchPositionalInsert', selenium.getText('link=BatchPositionalInsert'))

assertEquals('Batch Positional Insert Action', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[3]/td[3]'))

assertEquals('BatchUpdate', selenium.getText('link=BatchUpdate'))

assertEquals('Batch Update Action', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[4]/td[3]'))

assertEquals('CSVImport', selenium.getText('link=CSVImport'))

assertEquals('CSV Import Actions', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[5]/td[3]'))

assertEquals('ConvertDocument', selenium.getText('link=ConvertDocument'))

assertEquals('Converts documents from one format to another.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[6]/td[3]'))

assertEquals('DateUtils', selenium.getText('link=DateUtils'))

assertEquals('Date Utility Actions', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[7]/td[3]'))

assertEquals('DmsSearch', selenium.getText('link=DmsSearch'))

assertEquals('DMS Search Actions', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[8]/td[3]'))

assertEquals('DocumentFill', selenium.getText('link=DocumentFill'))

assertEquals('Fills out a Document Template (MS Word or Adobe PDF), also known as Mail Merge', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[9]/td[3]'))

assertEquals('ExcelExport', selenium.getText('link=ExcelExport'))

assertEquals('Exports data in to an Excel format in a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[10]/td[3]'))

assertEquals('FileUtils', selenium.getText('link=FileUtils'))

assertEquals('General file system utility methods', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[11]/td[3]'))

assertEquals('GetFormFieldValues', selenium.getText('link=GetFormFieldValues'))

assertEquals('Returns the values for all fields in a specified form. The returned field names will not be available at design time.', 
    selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[12]/td[3]'))

assertEquals('GetMedia', selenium.getText('link=GetMedia'))

assertEquals('Returns a media item as a file object from the Convergence media management layer', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[13]/td[3]'))

assertEquals('HL7MessageBuilder', selenium.getText('link=HL7MessageBuilder'))

assertEquals('HL7 Message Builder Action', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[14]/td[3]'))

assertEquals('HL7MessageSender', selenium.getText('link=HL7MessageSender'))

assertEquals('HL7 Message Sender Action', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[15]/td[3]'))

assertEquals('HL7Util', selenium.getText('link=HL7Util'))

assertEquals('HL7 Util Actions', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[16]/td[3]'))

assertEquals('IntakeAuthUser', selenium.getText('link=IntakeAuthUser'))

assertEquals('Provides support for Intake Server user authentication using Convergence users.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[17]/td[3]'))

assertEquals('IntakeInit', selenium.getText('link=IntakeInit'))

assertEquals('Provides ability to the configure and initilize the Intake Server settings.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[18]/td[3]'))

assertEquals('IntakeMessageRequest', selenium.getText('link=IntakeMessageRequest'))

assertEquals('Provides access to the Intake Server request message.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[19]/td[3]'))

assertEquals('IntakeMessageResponse', selenium.getText('link=IntakeMessageResponse'))

assertEquals('Provides ablility to respond to an Intake Server message.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[20]/td[3]'))

assertEquals('IntakeQueryUser', selenium.getText('link=IntakeQueryUser'))

assertEquals('Allows Yes/No queries against user data', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[21]/td[3]'))

assertEquals('IntakeWebAuthRequest', selenium.getText('link=IntakeWebAuthRequest'))

assertEquals('Provides access to the authentication and authorization request for the Intake Server Console authentication.', 
    selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[22]/td[3]'))

assertEquals('IntakeWebAuthResponse', selenium.getText('link=IntakeWebAuthResponse'))

assertEquals('Configures an authentication and authorization response back to an Intake Server Console authentication.', 
    selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[23]/td[3]'))

assertEquals('ManageRoles', selenium.getText('link=ManageRoles'))

assertEquals('Manage Convergence Roles', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[24]/td[3]'))

assertEquals('ManageUser', selenium.getText('link=ManageUser'))

assertEquals('Manage Convergence Users', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[25]/td[3]'))

assertEquals('MathUtils', selenium.getText('link=MathUtils'))

assertEquals('Provides basic math functionality.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[26]/td[3]'))

assertEquals('MultiPageCreate', selenium.getText('link=MultiPageCreate'))

assertEquals('Creates and initializes all of the page forms for a multi-page form.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[27]/td[3]'))

assertEquals('MultiPageGetFormId', selenium.getText('link=MultiPageGetFormId'))

assertEquals('Returns the id of a specified page form.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[28]/td[3]'))

assertEquals('MultiPageMerge', selenium.getText('link=MultiPageMerge'))

assertEquals('Multipage Merge Action', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[29]/td[3]'))

assertEquals('MultipageEvent', selenium.getText('link=MultipageEvent'))

assertEquals('Provides access to multi-page specific values/attributes in a Web Platform application', selenium.getText(
        '//form[@id=\'frmPublishers\']/table/tbody/tr[30]/td[3]'))

assertEquals('MultipageResponse', selenium.getText('link=MultipageResponse'))

assertEquals('Configures a web response when moving between multi-page form pages in a Web Platform application', selenium.getText(
        '//form[@id=\'frmPublishers\']/table/tbody/tr[31]/td[3]'))

assertEquals('NavConfigurator', selenium.getText('link=NavConfigurator'))

assertEquals('Configures Site Navigation elements in a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[32]/td[3]'))

assertEquals('PasswordGenerator', selenium.getText('link=PasswordGenerator'))

assertEquals('Generates a fixed length password containing numbers and letters.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[33]/td[3]'))

assertEquals('PdfBuilder', selenium.getText('link=PdfBuilder'))

assertEquals('Custom action that takes a list of files, and concatenates them into a single pdf file', selenium.getText(
        '//form[@id=\'frmPublishers\']/table/tbody/tr[34]/td[3]'))

assertEquals('QueryUser', selenium.getText('link=QueryUser'))

assertEquals('Allows yes/no queries against user data', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[35]/td[3]'))

assertEquals('RemoveServerObject', selenium.getText('link=RemoveServerObject'))

assertEquals('Remove Server Object Actions', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[36]/td[3]'))

assertEquals('ResultSetUtils', selenium.getText('link=ResultSetUtils'))

assertEquals('Provides functionality to create arbitrary iterable result sets.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[37]/td[3]'))

assertEquals('ShaPasswordEncoder', selenium.getText('link=ShaPasswordEncoder'))

assertEquals('SHA Password Encoder Actions', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[38]/td[3]'))

assertEquals('StringUtils', selenium.getText('link=StringUtils'))

assertEquals('Provides basic string functionality.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[39]/td[3]'))

assertEquals('UpdateForm', selenium.getText('link=UpdateForm'))

assertEquals('Provides the ability to make changes to an existing form or create a new form.', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[40]/td[3]'))

assertEquals('UrlUtilAction', selenium.getText('link=UrlUtilAction'))

assertEquals('Simple action that takes a Web Platform URL and adds to its parameters a Web Platform checksum that is used to protect Web Platform application from URL tampering', 
    selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[41]/td[3]'))

assertEquals('WebAuthRequest', selenium.getText('link=WebAuthRequest'))

assertEquals('Provides access to the authentication and authorization request in a Web Platform application', selenium.getText(
        '//form[@id=\'frmPublishers\']/table/tbody/tr[42]/td[3]'))

assertEquals('WebAuthResponse', selenium.getText('link=WebAuthResponse'))

assertEquals('Configures an authentication and authorization response in a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[43]/td[3]'))

assertEquals('WebInit', selenium.getText('link=WebInit'))

assertEquals('Provides support for configuring a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[44]/td[3]'))

assertEquals('WebRequest', selenium.getText('link=WebRequest'))

assertEquals('Provides access to the web request in a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[45]/td[3]'))

assertEquals('WebResponse', selenium.getText('link=WebResponse'))

assertEquals('Configures a web response in a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[46]/td[3]'))

assertEquals('WebSession', selenium.getText('link=WebSession'))

assertEquals('Provides access to session data in a Web Platform application', selenium.getText('//form[@id=\'frmPublishers\']/table/tbody/tr[47]/td[3]'))

selenium.click('link=AuthUser')

assertEquals('AuthUser', selenium.getText('//form[@id=\'frmMain\']/div/div/div/div/h1/small'))

assertEquals('ID', selenium.getText('//form[@id=\'frmMain\']/div/div[2]/div/div/label'))

assertEquals('Description', selenium.getText('//form[@id=\'frmMain\']/div/div[2]/div/div/label[2]'))

assertEquals('Provides support for authentication using Convergence users in a Web Platform application', selenium.getText(
        'id=descriptionInput'))

assertEquals('Implementation', selenium.getText('//form[@id=\'frmMain\']/div/div[2]/div/div/label[3]'))

assertEquals('com.trinisys.tdes.swat.scripting.tdes.AuthUserAction', selenium.getText('//form[@id=\'frmMain\']/div/div[2]/div/div/div'))

assertTrue(selenium.isElementPresent('//a[@id=\'backLink\']/i'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

