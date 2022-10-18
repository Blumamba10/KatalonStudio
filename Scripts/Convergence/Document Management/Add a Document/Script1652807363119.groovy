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

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Document Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationMenu/Document Management/a_Search'), 'Search', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationMenu/Document Management/a_Admin'), 'Admin', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Convergence/_NavigationMenu/Document Management/a_Add Document'), 'Add Document', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationMenu/Document Management/a_Add Document'))

WebUI.switchToWindowIndex('1')

WebUI.selectOptionByLabel(findTestObject('Convergence/Document Management/Add New Document/select_DocumentType'), 'Script Document', 
    false)

WebUI.enableSmartWait()

CustomKeywords.'cutomKeywords.UploadFile.uploadFile'(findTestObject('Convergence/Document Management/Add New Document/Upload Document'), 
    '"C:\\actionTestFiles\\MRI Knee.docx"')

WebUI.enableSmartWait()

selenium.click('//button[@id="addDocumentButton"]')

WebUI.enableSmartWait()

assertEquals('Document Viewer', selenium.getText('//h2[contains(text(),"Document Viewer")]'))

assertEquals('Document Type', selenium.getText('//h6[contains(text(),"Document Type")]'))

assertEquals('Created By', selenium.getText('//label[contains(text(),"Created By")]'))

assertEquals('Updated', selenium.getText('//h6[contains(text(),"Updated")]'))

assertEquals('Index Fields', selenium.getText('//h6[contains(text(),"Index Fields")]'))

assertEquals('Document Actions', selenium.getText('//h6[contains(text(),"Document Actions")]'))

assertTrue(selenium.isElementPresent('//button[@id="updateDocumentIndexButton"]'))

assertTrue(selenium.isElementPresent('//button[@id="replaceMediaButton"]'))

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

