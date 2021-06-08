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

String baseUrl = 'http://localhost:8082/tdes'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Document Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationLinks/Document Management/a_Search'), 'Search', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), 'Admin', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationLinks/Document Management/a_Add Document'), 'Add Document', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/searchButton'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/btnClear'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/Document Type'), 'Document Type', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/selectDocumentType'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/CreatedBy'), 'Created By', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/CreatedDate'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/th_Created'), 'Created', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/dropdown_Created'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/Updated_header'), 'Updated', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/updated_dropdown'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/CreatedDate'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentSearch/UpdatedDate'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/Field Name'), 'Field Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/Operator'), 'Operator', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentSearch/Value'), 'Value', FailureHandling.STOP_ON_FAILURE)

assertEquals('Please select a Document Type to view Index Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::td[1]'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Index Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/IndexFields/Index Fields'), 'Index Fields', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/IndexFields/Field Name'), 'Field Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/IndexFields/Type'), 'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/IndexFields/addIndexFieldButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/IndexFields/addIndexFieldButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/Add Index Field'), 
    'Add Index Field', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/label_Name'), 
    'Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/label_Type'), 
    'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/addNewName'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/selectType'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/addNewName'), 'Script Index', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/addButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/checkAllCheckBox'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/IndexFields/removeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/checkAllCheckBox'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Document Types'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentTypes/Document Types_header'), 'Document Types', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentTypes/Document Type'), 'Document Type', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentTypes/Description'), 'Description', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/DocumentTypes/Created'), 'Created', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentTypes/createDocTypeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/DocumentTypes/createDocTypeButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Edit Document Type'), 'Edit Document Type', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/label_Name'), 'Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/label_Description (optional)'), 
    'Description (optional)', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/name_textfield'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/description_textfield'), 0, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Index Fields'), 'Index Fields', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Field Name'), 'Field Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Type'), 'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/cancelButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/updateButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/addIndexFieldsButton'), 0, FailureHandling.STOP_ON_FAILURE)

assertEquals('No fields assigned to document type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::em[1]'))

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/addIndexFieldsButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/p_Select the index_'), 
    'Select the index fields from the list below that should be added to the document type.')

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/Add Index Fields'), 
    'Add Index Fields', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/Field Name'), 
    'Field Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/Type'), 
    'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/fieldNameRowValue'), 
    'Script Index', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/typeRowValue'), 
    'Text', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/indexFieldIdCheckbox'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/indexFieldIdCheckbox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/addButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Document Management/EditDocumentType/name_textfield'), 'Script Document', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/updateButton'))

WebUI.click(findTestObject('Convergence/Document Management/DocumentTypes/checkAll'))

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentTypes/button_copyDocType'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentTypes/createDocTypeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentTypes/exportTypeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentTypes/moveDocTypeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/DocumentTypes/removeDocTypesButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Main Console'), FailureHandling.STOP_ON_FAILURE)

