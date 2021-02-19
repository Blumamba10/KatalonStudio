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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('id=appNavProjectsLink')

selenium.click('link=Default')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Document Management')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Document Management/a_Admin'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Document Types')

selenium.click('id=selectCheck_0')

selenium.click('//button[@id=\'removeDocTypesButton\']/i')

selenium.click('id=overlayConfirmOk')

selenium.click('link=Index Fields')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::td[1]')

selenium.click('name=indexFieldId')

selenium.click('id=removeButton')

selenium.click('link=Main Console')

selenium.click('link=Projects')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'webapp')

selenium.click('id=webapp')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::i[5]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[4]')

selenium.click('id=overlayConfirmOk')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Manage Templates')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'new')

selenium.click('id=idCheck_0')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::button[4]')

selenium.click('id=overlayConfirmOk')

selenium.click('name=deleteTemplateImages')

selenium.click('id=deleteForms')

selenium.click('id=deleteFormImages')

selenium.click('id=removeTemplateButton')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'next')

selenium.click('id=idCheck_0')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Templates\'])[2]/following::i[8]')

selenium.click('id=overlayConfirmOk')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Remove Form Templates\'])[1]/following::label[1]')

selenium.click('id=deleteForms')

selenium.click('id=deleteFormImages')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Remove Form Images\'])[1]/following::i[2]')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Manage Scripts')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'new')

selenium.click('id=rowSelectCheck_0')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Scripts\'])[2]/following::i[10]')

selenium.click('id=overlayConfirmOk')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Manage Functions')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'testfunc')

selenium.click('id=rowSelectCheck_0')

selenium.click('id=removeScriptsButton')

selenium.click('id=overlayConfirmOk')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Option Lists')

selenium.click('name=checkAll')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option Lists\'])[2]/following::i[7]')

selenium.click('id=overlayConfirmOk')

selenium.click('link=Web Styles')

selenium.click('id=formRenderSettingsId_1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Styles\'])[2]/following::i[6]')

selenium.click('id=overlayConfirmOk')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('link=Manage Functions')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'Global Function')

selenium.click('id=rowSelectCheck_0')

selenium.click('id=removeScriptsButton')

selenium.click('id=overlayConfirmOk')

selenium.click('link=Projects')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'Intaketest')

selenium.click('id=Intaketest')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Manage Projects\'])[1]/following::button[4]')

selenium.click('id=overlayConfirmOk')

