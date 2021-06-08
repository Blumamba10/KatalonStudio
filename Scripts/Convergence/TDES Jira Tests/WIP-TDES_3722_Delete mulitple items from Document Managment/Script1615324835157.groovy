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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://localhost:8082/tdes'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Document Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Index Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/IndexFields/addIndexFieldButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/addNewName'), 
    'Impatient Index', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/addButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/checkAllCheckBox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/IndexFields/removeButton'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Convergence/Document Management/IndexFields/Add Index Field_pop-up/checkAllCheckBox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Index Fields'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/DocumentTypes/createDocTypeButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/addIndexFieldsButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/indexFieldIdCheckbox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/Add Index Fields_pop-up/addButton'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/removeButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Document Management/EditDocumentType/checkAll'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Document Management/EditDocumentType/name_textfield'), 'Impatient Document', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Document Management/EditDocumentType/updateButton'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Document Management/a_Add Document'))

WebUI.switchToWindowTitle('Convergence Document Viewer')

WebUI.selectOptionByValue(findTestObject('Convergence/Document Management/Add New Document/select_DocumentType'), 
    '21', false)

WebUI.click(findTestObject('Convergence/Document Management/Add New Document/span_Upload Document'))

CustomKeywords.'cutomKeywords.UploadFile.uploadFile'(findTestObject(null), GlobalVariable.uploadfile)

WebUI.click(findTestObject('Convergence/Document Management/Add New Document/button_Add Document'))

