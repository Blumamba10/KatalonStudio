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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'
selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Actions'))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/h2_Actions'), 'Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/th_Name'), 'Name')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/th_Description'), 'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/btn_addCustomActionButton'), 0)

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/btn_addCustomActionButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/h1_Select an Action'), 
    'Select an Action')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/span_Items Per Page'), 
    'Items Per Page')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/select_Items Per Page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/input_Search Filter'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/th_Type'), 'Type')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/th_Description'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/button_cancelButton'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/button_submitButton'), 
    0)

WebUI.sendKeys(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/input_Search Filter'), 
    'xmlUtils')

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/radiobtn_XmlUtils'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/button_submitButton'))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_ID'), 'ID')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/input_ID'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_Description'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/input_Description'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_Implementation'), 
    'Implementation')

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Cancel'))

not_run: selenium.click('//i[@class="shortcut-icon fas fa-times-circle"]')

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Actions'))

selenium.click("//a[contains(text(),'Assert')]")


WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/input_Description'), 
    'Logs warning to script or errors based on if production license.')

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Cancel'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Actions'))

WebUI.enableSmartWait()

assertTrue(selenium.isElementPresent("//a[contains(text(),'Assert')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Logs warning to script or errors based on if produ')]"))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_AuthUser'), 'AuthUser')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_AuthUserDescription'), 'Provides support for authentication using Convergence users in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_CSVImport'), 'CSVImport')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_CSVImportDescription'), 'CSV Import Actions')
assertTrue(selenium.isElementPresent("//a[contains(text(),'CodeGenerator')]"))

assertTrue(selenium.isElementPresent("//td[contains(text(),'Code Generator Operations')]"))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_ConvertDocument'), 'ConvertDocument')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_ConvertsDocumentDescription'), 'Converts documents from one format to another.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_DateUtils'), 'DateUtils')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_DateUtilityDescription'), 'Date Utility Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_DmsSearch'), 'DmsSearch')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_DMSSearchDescription'), 'DMS Search Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_DocumentFill'), 'DocumentFill')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_DocumentFillDescription'), 'Fills out a Document Template (MS Word or Adobe PDF), also known as Mail Merge')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_ExcelExport'), 'ExcelExport')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_ExcelExportDescription'), 'Exports data in to an Excel format in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_FileUtils'), 'FileUtils')

assertTrue(selenium.isElementPresent("//a[contains(text(),'ForEachBreak')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Stops a For Each Action')]"))

assertTrue(selenium.isElementPresent("//a[contains(text(),'ForEachContinue')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Continues a For Each Action')]"))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_FileUtilsDescription'), 'General file system utility methods')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_GetFormFieldValues'), 'GetFormFieldValues')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_GetFormFieldValuesDescription'), 
    'Returns the values for all fields in a specified form. The returned field names will not be available at design time.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_GetMedia'), 'GetMedia')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_GetMediaDescription'), 'Returns a media item as a file object from the Convergence media management layer')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_HL7MessageBuilder'), 'HL7MessageBuilder')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_HL7MessageBuilderDescription'), 'HL7 Message Builder Action')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_HL7MessageSender'), 'HL7MessageSender')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_HL7MessageSenderDescription'), 'HL7 Message Sender Action')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_HL7Util'), 'HL7Util')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_HL7UtilsDescription'), 'HL7 Util Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeAuthUser'), 'IntakeAuthUser')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeAuthUserDescription'), 'Provides support for Intake Server user authentication using Convergence users.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeInit'), 'IntakeInit')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeInitDescription'), 'Provides ability to the configure and initilize the Intake Server settings.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeMessageRequest'), 'IntakeMessageRequest')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeMessageRequestDescription'), 
    'Provides access to the Intake Server request message.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeMessageResponse'), 'IntakeMessageResponse')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeMessageResponseDescription'), 
    'Provides ablility to respond to an Intake Server message.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeQueryUser'), 'IntakeQueryUser')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeQueryUserDescription'), 'Allows Yes/No queries against user data')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeWebAuthRequest'), 'IntakeWebAuthRequest')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeWebAuthRequestDescription'), 
    'Provides access to the authentication and authorization request for the Intake Server Console authentication.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_IntakeWebAuthResponse'), 'IntakeWebAuthResponse')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_IntakeWebAuthResponseDescription'), 
    'Configures an authentication and authorization response back to an Intake Server Console authentication.')

assertTrue(selenium.isElementPresent("//a[@class='custom_action_link'][contains(text(),'List')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'List Operations')]"))

assertTrue(selenium.isElementPresent("//a[@class='custom_action_link'][contains(text(),'Log')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Logs messages to server log.')]"))

assertTrue(selenium.isElementPresent("//a[contains(text(),'Map')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Map Operations')]"))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_ManageRoles'), 'ManageRoles')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_ManageRoleDescription'), 'Manage Convergence Roles')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_ManageUser'), 'ManageUser')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_ManageUserDescription'), 'Manage Convergence Users')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_MathUtils'), 'MathUtils')

assertTrue(selenium.isElementPresent("//a[contains(text(),'NumberResults')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Returns numbers to be used by For Each Action')]"))


WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_MathUtilsDescription'), 'Provides basic math functionality.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_MultiPageCreate'), 'MultiPageCreate')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_MultiPageCreateDescription'), 'Creates and initializes all of the page forms for a multi-page form.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_MultiPageGetFormId'), 'MultiPageGetFormId')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_MultiPageGetFormIdDescription'), 
    'Returns the id of a specified page form.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_MultiPageMerge'), 'MultiPageMerge')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_MultipageMergeDescription'), 'Multipage Merge Action')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_MultipageEvent'), 'MultipageEvent')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_MultipageEventDescription'), 'Provides access to multi-page specific values/attributes in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_MultipageResponse'), 'MultipageResponse')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_MultipageResponseDescription'), 'Configures a web response when moving between multi-page form pages in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_NavConfigurator'), 'NavConfigurator')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_NavConfiguratorDescription'), 'Configures Site Navigation elements in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_PasswordGenerator'), 'PasswordGenerator')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_PasswordGeneratorDescription'), 'Generates a fixed length password containing numbers and letters.')

assertTrue(selenium.isElementPresent("//a[contains(text(),'ProjectLicense')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'License Operations')]"))


WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_PdfBuilder'), 'PdfBuilder')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_PdfBuilderDescription'), 'Custom action that takes a list of files, and concatenates them into a single pdf file')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_QueryUser'), 'QueryUser')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_QueryUserDescription'), 'Allows yes/no queries against user data')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_RemoveServerObject'), 'RemoveServerObject')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_RemoveServerObjectDescription'), 
    'Remove Server Object Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_ResultSetUtils'), 'ResultSetUtils')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_ResultSetUtilsDescription'), 'Provides functionality to create arbitrary iterable result sets.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_ShaPasswordEncoder'), 'ShaPasswordEncoder')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_ShaPasswordEncoderDescription'), 
    'SHA Password Encoder Actions')

assertTrue(selenium.isElementPresent("//a[contains(text(),'Sleep')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Pauses execution for a specified time')]"))


assertTrue(selenium.isElementPresent("//a[contains(text(),'StringBuilder')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'String Builder Operations')]"))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_StringUtils'), 'StringUtils')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_StringUtilsDescription'), 'Provides basic string functionality.')

assertTrue(selenium.isElementPresent("//a[contains(text(),'TableMetaData')]"))
assertTrue(selenium.isElementPresent("//td[contains(text(),'Database MetaData Operations')]"))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_UpdateForm'), 'UpdateForm')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_UpdateFormDescription'), 'Provides the ability to make changes to an existing form or create a new form.')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_UrlUtilAction'), 'UrlUtilAction')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_UrlUtilActionDescription'), 'Simple action that takes a Web Platform URL and adds to its parameters a Web Platform checksum that is used to protect Web Platform application from URL tampering')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_WebAuthRequest'), 'WebAuthRequest')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_WebAuthRequestDescription'), 'Provides access to the authentication and authorization request in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_WebAuthResponse'), 'WebAuthResponse')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_WebAuthResponseDescription'), 'Configures an authentication and authorization response in a Web Platform application')

not_run: WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_WebInit'), 'WebInit')

not_run: WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_WebInitDescription'), 'Provides support for configuring a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_WebRequest'), 'WebRequest')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_WebRequestDescription'), 'Provides access to the web request in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_WebResponse'), 'WebResponse')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_WebResponseDescription'), 'Configures a web response in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/a_WebSession'), 'WebSession')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/td_WebSessionDescription'), 'Provides access to session data in a Web Platform application')

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/a_AuthUser'))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/span_AuthUser'), 
    'AuthUser')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_ID'), 'ID')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_Description'), 
    'Description')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/input_Description'), 
    'Provides support for authentication using Convergence users in a Web Platform application')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_Implementation'), 
    'Implementation')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/implementationDescription'), 
    'com.trinisys.tdes.swat.scripting.tdes.AuthUserAction')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Back'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Cancel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Update'), 
    0)

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Cancel'), FailureHandling.STOP_ON_FAILURE)

