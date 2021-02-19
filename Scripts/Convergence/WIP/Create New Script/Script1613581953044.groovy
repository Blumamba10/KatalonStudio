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

selenium.click('link=ConvertDocument')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ConvertDocument\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[3]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::i[1]'))

assertEquals('Expected File Extension', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The file to be converted\'])[1]/following::label[1]'))

assertEquals('autodocdocmdocxhtmlpdfodtrtftext', selenium.getText('id=ExpectedFileExtensionSelectInput'))

assertEquals('The expected extension of the file to be converted.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Expected File Extension\'])[1]/following::div[1]'))

assertEquals('Convert To', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The expected extension of the file to be converted.\'])[1]/following::label[1]'))

assertEquals('docdocmdocxhtmlpdfodtrtftext', selenium.getText('id=ConvertToSelectInput'))

assertEquals('The extension to convert the file to', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convert To\'])[1]/following::div[1]'))

assertEquals('Stop on Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The extension to convert the file to\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=StoponErrorSelectInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'ConvertDocument')

selenium.type('id=descriptionInput', 'Action')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]', 'File')

selenium.click('id=ExpectedFileExtensionSelectInput')

selenium.select('id=ExpectedFileExtensionSelectInput', 'label=pdf')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Expected File Extension\'])[1]/following::option[6]')

selenium.click('id=ConvertToSelectInput')

selenium.select('id=ConvertToSelectInput', 'label=html')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convert To\'])[1]/following::option[4]')

selenium.click('id=StoponErrorSelectInput')

selenium.select('id=StoponErrorSelectInput', 'label=No')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::option[3]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ConvertDocument\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Create JSON')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create JSON\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertTrue(selenium.isElementPresent('//div[2]/div/div/div'))

assertEquals('Editor', selenium.getText('//div[2]/div/div/div[2]/label'))

assertTrue(selenium.isElementPresent('id=creationModeBuilder'))

assertEquals('Builder', selenium.getText('//div[3]/label'))

assertEquals('JSON Editor', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'{}\'])[1]/preceding::label[1]'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'{}\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Variables\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'{}\'])[1]/following::div[9]'))

selenium.click('id=creationModeBuilder')

assertEquals('Properties/Elements', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'typeKeys\'])[1]/preceding::div[1]'))

assertEquals('typeKeys', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Properties/Elements\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('link=Add property'))

assertEquals('Add property', selenium.getText('link=Add property'))

assertEquals('No properties configured', selenium.getText('//em'))

selenium.click('link=Add property')

assertEquals('Property Name', selenium.getText('//app-json-property-editor/div/div/div/label'))

assertTrue(selenium.isEditable('id=propertyNameInput'))

assertEquals('Value setText', selenium.getText('//app-json-property-editor/div/div/div[2]/label'))

assertEquals('StringNumberBooleanArrayObject', selenium.getText('id=valuesetTextSelect'))

assertEquals('Property Value', selenium.getText('//app-json-property-editor/div/div[2]/div/label'))

assertTrue(selenium.isEditable('id=propertyValueInput'))

assertTrue(selenium.isElementPresent('//app-variable-entry/div/div/div/button/i'))

assertEquals('When Value is Empty...', selenium.getText('//div[2]/div[2]/label'))

assertEquals('Exclude PropertyUse "null"Use Empty', selenium.getText('id=whenEmptySelect'))

assertTrue(selenium.isElementPresent('//div[2]/div[3]/button/i'))

assertTrue(selenium.isElementPresent('//div[2]/div[3]/button[2]/i'))

selenium.click('id=propertyNameInput')

selenium.typeKeys('id=propertyNameInput', 'Property Name')

selenium.select('id=valuesetTextSelect', 'label=Number')

selenium.typeKeys('id=propertyValueInput', 'Property Value')

selenium.click('xpath=(//button[@setText=\'button\'])[15]')

selenium.typeKeys('id=nameInput', 'createjson')

selenium.typeKeys('id=descriptionInput', 'description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create JSON\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Create XML')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create XML\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Select a mode for building your XML.', selenium.getText('//div[2]/div/div/div'))

assertEquals('Editor', selenium.getText('//div[2]/div/div/div[2]/label'))

assertEquals('File', selenium.getText('//div[3]/label'))

assertEquals('XML Editor', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Editor\'])[1]/preceding::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Editor\'])[1]/following::div[9]'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Editor\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Create_XML')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Editor\'])[1]/following::div[9]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create XML\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=DMS Index')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DMS Index\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('File', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::button[1]'))

assertEquals('Created by', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::button[1]'))

assertEquals('Document setText', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=dmsIndexDocumentsetText'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'DMS_Index')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]', 'File')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::input[1]', 
    'Createdby')

selenium.click('id=dmsIndexDocumentsetText')

selenium.select('id=dmsIndexDocumentsetText', 'label=Script Document')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document setText\'])[1]/following::option[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Index\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

assertEquals('Index Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document setText\'])[1]/following::h6[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Index\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DMS Index\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=DocumentFill')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DocumentFill\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

selenium.typeKeys('id=nameInput', 'Document_Fill')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(//button[@setText=\'button\'])[14]')

selenium.click('//div[@id=\'actionListDiv\']/app-action-list-item[9]/div/div/div/div[2]/div[3]/a/i')

selenium.click('link=Insert New Action After')

selenium.click('link=ExcelExport')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ExcelExport\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Source', selenium.getText('//ngb-modal-window[2]/div/div/div[2]/div/div/div/div/div/label'))

assertEquals('Form Data Lookup (Specified in Web Request)Query Action', selenium.getText('id=SourceSelectTriggerInput'))

assertEquals('Output File setText', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source\'])[1]/following::label[1]'))

selenium.typeKeys('id=nameInput', 'ExcelExport')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Output File setText\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ExcelExport\'])[2]/following::a[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Error')

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[3]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=description'))

assertTrue(selenium.isElementPresent('id=sendErrorEmail'))

assertEquals('Suppress error email', selenium.getText('//div[3]/div/div/label'))

assertEquals('Email Settings', selenium.getText('link=Email Settings'))

assertEquals('Message Content', selenium.getText('link=Message Content'))

assertTrue(selenium.isElementPresent('id=useCustomConfigNo'))

assertEquals('Use default configuration', selenium.getText('//div[4]/div/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('id=useCustomConfigYes'))

assertEquals('Enter custom configuration parameters', selenium.getText('//div[4]/div/div/div/div/div[2]/label'))

selenium.click('id=description')

selenium.typeKeys('id=description', 'Error Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[3]/following::div[4]')

selenium.click('id=sendErrorEmail')

Thread.sleep(NaN)

selenium.focus('//ngb-modal-window/div/div/div[3]/button')

selenium.waitForPageToLoad('30000')

selenium.click('//ngb-modal-window/div/div/div[3]/button')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Export JSON')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export JSON\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('JSON Data', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]'))

assertEquals('Export As', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=exportAsRadioText'))

assertEquals('Text', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export As\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=exportAsRadioFile'))

assertEquals('File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::label[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export JSON\'])[2]/following::div[4]')

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Export_JSON')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]', 'JSON_Data')

selenium.click('id=exportAsRadioFile')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export JSON\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Export XML')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export XML\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('XML Data', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::button[1]'))

assertEquals('Export As', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=exportAsRadioText'))

assertEquals('Text', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export As\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=exportAsRadioFile'))

assertEquals('File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'Export_XML')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::input[1]', 'XML_Data')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export XML\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ExcelExport\'])[2]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export XML\'])[1]/following::a[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=File Output')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

selenium.click('id=ini')

assertEquals('Saving in a non-custom format will save the entire form data in that format.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Windows INI File\'])[1]/following::div[3]'))

selenium.click('id=custom')

assertTrue(selenium.isElementPresent('id=csv'))

assertEquals('Comma Separated Value File (CSV)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Custom Format\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=ini'))

assertEquals('Windows INI File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data XML File\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=formxml'))

assertEquals('Native Form XML File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Comma Separated Value File (CSV)\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=custom'))

assertEquals('Custom Format', selenium.getText('//div[2]/div/div/div/label'))

assertTrue(selenium.isElementPresent('id=dataxml'))

assertEquals('Data XML File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Native Form XML File\'])[1]/following::label[1]'))

assertEquals('Custom File Output Configuration', selenium.getText('//h6[contains(text(),\'Custom File Output Configuration\')]'))

assertEquals('File Extension', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Custom File Output Configuration\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=fileOutFileExtension'))

assertEquals('File Output Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Extension\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=fileOutOutputTemplate'))

assertEquals('Field List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output Template\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'File_Output')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=fileOutFileExtension')

selenium.typeKeys('id=fileOutFileExtension', '.txt')

selenium.click('id=fileOutOutputTemplate')

selenium.typeKeys('id=fileOutOutputTemplate', 'output template')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::div[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=FileUtils')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'FileUtils\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Operation', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Copy DirectoryCopy FileCreate DirectoryCreate Temp DirectoryDelete DirectoryDelete FileDirectory ListFile ExistsFile SizeFile setTextGet File NameGet Parent PathMove DirectoryMove FileRead Text FileText to FileRename File', 
    selenium.getText('//select'))

assertEquals('Source Directory', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Copy a directory to a specified location\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source Directory\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source Directory\'])[1]/following::button[1]'))

assertEquals('Destination Directory', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Full path to source directory\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Destination Directory\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Destination Directory\'])[1]/following::button[1]'))

selenium.typeKeys('id=nameInput', 'FileUtils')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source Directory\'])[1]/following::input[1]', 
    'Source')

