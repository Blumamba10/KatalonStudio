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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://localhost:8082/tdes'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Document Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationLinks/Document Management/a_Search'), 'Search', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), 'Admin', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationLinks/Document Management/a_Add Document'), 'Add Document', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/searchButton'), 1, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/btnClear'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/Document Type'), 'Document Type', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/selectDocumentType'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/CreatedBy'), 'Created By', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/CreatedDate'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/th_Created'), 'Created', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/dropdown_Created'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/Updated_header'), 'Updated', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/updated_dropdown'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/CreatedDate'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/UpdatedDate'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/Field Name'), 'Field Name', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/Operator'), 'Operator', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentSearch_Page/Value'), 'Value', FailureHandling.STOP_ON_FAILURE)

assertEquals('Please select a Document Type to view Index Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::td[1]'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Index Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Index Fields'), 'Index Fields', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Field Name'), 'Field Name', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Type'), 'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/addIndexFieldButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/addIndexFieldButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/Add Index Field'), 
    'Add Index Field', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/label_Name'), 
    'Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/label_Type'), 
    'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/addNewName'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/selectType'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/addNewName'), 
    'Script Index', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/addButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/checkAllCheckBox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/removeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Convergence/Document Management_Pages/IndexFields_Page/Add Index Field_pop-up/checkAllCheckBox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Document Types'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/Document Types_header'), 
    'Document Types', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/Document Type'), 'Document Type', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/Description'), 'Description', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/Created'), 'Created', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/createDocTypeButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/createDocTypeButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Edit Document Type'), 
    'Edit Document Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/label_Name'), 'Name', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/label_Description (optional)'), 
    'Description (optional)', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/name_textfield'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/description_textfield'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Index Fields'), 'Index Fields', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Field Name'), 'Field Name', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Type'), 'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/cancelButton'), 0, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/updateButton'), 0, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/addIndexFieldsButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

assertEquals('No fields assigned to document type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::em[1]'))

WebUI.click(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/addIndexFieldsButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/p_Select the index_'), 
    'Select the index fields from the list below that should be added to the document type.')

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/Add Index Fields'), 
    'Add Index Fields', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/Field Name'), 
    'Field Name', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/Type'), 
    'Type', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/fieldNameRowValue'), 
    'Script Index', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/typeRowValue'), 
    'Text', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/indexFieldIdCheckbox'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/indexFieldIdCheckbox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/Add Index Fields_pop-up/addButton'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/name_textfield'), 'Script Document', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management_Pages/EditDocumentType_Page/updateButton'))

WebUI.click(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/checkAll'))

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/button_copyDocType'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/createDocTypeButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/exportTypeButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/moveDocTypeButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management_Pages/DocumentTypes_Page/removeDocTypesButton'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Main Console'), FailureHandling.STOP_ON_FAILURE)

