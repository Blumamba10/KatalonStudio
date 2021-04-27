import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
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

selenium.typeKeys('id=scriptNameInput', 'PDF Builder')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.typeKeys('id=scriptDescriptionInput', 'PDF Builder')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=PdfBuilder')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PdfBuilder\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Document Size', selenium.getText('//div[2]/div/div/div/div/label'))

assertEquals('11x17A0A1A2A3A4A5A6A7A8A9A10Arch AArch BArch CArch DArch EB0B1B2B3B4B5B6B7B8B9B10ExecutiveHalf LetterISO 7810 ID-1ISO 7810 ID-2ISO 7810 ID-3LedgerLegalLetterNotePostcardSmall PaperbackTabloidImage Size', 
    selenium.getText('id=DocumentSizeSelectInput'))

assertEquals('The size of the generated output document', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document Size\'])[1]/following::div[1]'))

assertEquals('Landscape', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The size of the generated output document\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=LandscapeSelectInput'))

assertEquals('Indicates if the output document should be created in landscape', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Landscape\'])[1]/following::div[1]'))

assertEquals('Preserve Form Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Indicates if the output document should be created in landscape\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=PreserveFormFieldsSelectInput'))

assertEquals('Preserve fillable form fields from source documents.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preserve Form Fields\'])[1]/following::div[1]'))

assertEquals('Number of files', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preserve fillable form fields from source documents.\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Number of files\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Number of files\'])[1]/following::button[1]'))

assertEquals('The number of input files to be combined.', selenium.getText('//div[contains(text(),"The number of input files to be combined.")]'))

assertEquals('File 1', selenium.getText('//label[@for="File1FileInput"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::button[1]'))

assertEquals('An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg', selenium.getText('//body[@class="modal-open"]/ngb-modal-window[@class="d-block fade modal show"]/div[@class="modal-dialog modal-dialog-scrollable modal-lg"]/div[@class="modal-content"]/div[@class="modal-body tse-action-dialog"]/div[6]/div[1]/div[1]/div[1]/div[2]'))

assertEquals('File 2', selenium.getText('//label[@for="File2FileInput"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::button[1]'))

assertEquals('An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg', selenium.getText('//body[@class="modal-open"]/ngb-modal-window[@class="d-block fade modal show"]/div[@class="modal-dialog modal-dialog-scrollable modal-lg"]/div[@class="modal-content"]/div[@class="modal-body tse-action-dialog"]/div[7]/div[1]/div[1]/div[1]/div[2]'))

assertEquals('Stop on Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg\'])[2]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=StoponErrorSelectInput'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'PdfBuilder')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::input[1]', 'File 1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::input[1]', 'File 2')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PdfBuilder\'])[2]/following::i[1]')

WebUI.click(findTestObject('Convergence/Scripts/ManageScripts_Page/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/ManageScripts_Page/input_Search Filter'), 'PDF Builder')

assertEquals('PDF Builder', selenium.getText('//a[@class="new-editor-open"]'))

