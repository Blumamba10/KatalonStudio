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
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.comment('Register PDF Signature Action')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Actions'))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/h2_Actions'), 'Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/th_Name'), 'Name')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/th_Description'), 'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/btn_addCustomActionButton'), 0)

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/btn_addCustomActionButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

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
    'PDFSignature')

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/z_One Offs/radiobtn_PdfSignature'))

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

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Update'))

if (selenium.isElementPresent('//button[@id="saveConfigButton"]')) {
    selenium.click('//button[@id="saveConfigButton"]')
} else {
    selenium.click('//p[@class="message"]')

    WebUI.navigateToUrl(GlobalVariable.tdesURL)

    WebUI.delay(3)
}

WebUI.delay(2)

WebUI.comment('Create PDF Signature Script')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/button_Add Script'))

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(2)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'PDF Signature')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Actions/a_PdfSignature'))

selenium.typeKeys('//input[@id="nameInput"]', 'PdfSignature')

selenium.typeKeys('//textarea[@id="descriptionInput"]', 'PdfSignature Action')

assertTrue(selenium.isElementPresent('//input[@id="parameterFilterInput"]'))

assertEquals('Show...', selenium.getText('//label[contains(text(),"Show...")]'))

assertEquals('All', selenium.getText('//label[contains(text(),"All")]'))

assertEquals('Empty Only', selenium.getText('//label[contains(text(),"Empty Only")]'))

assertEquals('Completed Only', selenium.getText('//label[contains(text(),"Completed Only")]'))

assertEquals('Signing Key', selenium.getText('//label[contains(text(),"Signing Key")]'))

assertEquals('Alias name of the trusted signing authority.', selenium.getText('//div[contains(text(),"Alias name of the trusted signing authority.")]'))

assertEquals('Subject DN', selenium.getText('//label[contains(text(),"Subject DN")]'))

assertEquals('Lower Left X', selenium.getText('//label[contains(text(),"Lower Left X")]'))

assertEquals('Lower Left X coordinate for the signature box.', selenium.getText('//div[contains(text(),"Lower Left X coordinate for the signature box.")]'))

assertEquals('Lower Left Y', selenium.getText('//label[contains(text(),"Lower Left Y")]'))

assertEquals('Upper Right Y coordinate for the signature box.', selenium.getText('//div[contains(text(),"Upper Right Y coordinate for the signature box.")]'))

assertEquals('Page Number', selenium.getText('//label[contains(text(),"Page Number")]'))

assertEquals('Page number upon which the signature should appear', selenium.getText('//div[contains(text(),"Page number upon which the signature should appear")]'))

assertEquals('Signing Location', selenium.getText('//label[contains(text(),"Signing Location")]'))

assertEquals('The physical location where the document was signed', selenium.getText('//div[contains(text(),"The physical location where the document was signe")]'))

assertEquals('Original File to Sign', selenium.getText('//label[contains(text(),"Original File to Sign")]'))

assertEquals('The pdf to sign.', selenium.getText('//div[contains(text(),"The pdf to sign.")]'))

assertEquals('Additional Signature', selenium.getText("//label[@for='AdditionalSignatureSelectInput']"))

assertEquals('True if this is the second (or third, or fourth...) signature added', selenium.getText("//div[contains(text(),'True if this is the second (or third, or fourth...')]"))

selenium.click('//button[contains(text(),"OK")]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'PDF Signature')

assertEquals('PDF Signature', selenium.getText('//a[contains(text(),"PDF Signature")]'))

