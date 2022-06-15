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

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/_SelectProject/a_webapp'), 0)

WebUI.click(findTestObject('Convergence/_SelectProject/a_webapp'))

WebUI.comment('Delete Scripts and Templates')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/btn_Delete Script'))

selenium.click('//button[@id="overlayConfirmOk"]')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Templates'))

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/select_102550100'), '100', false)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/btn_Delete Template'))

selenium.click('//button[@id="overlayConfirmOk"]')

selenium.click('//body[1]/form[1]/div[1]/div[3]/div[1]/div[1]/button[2]/i[1]')

WebUI.delay(1)

WebUI.comment('Delete Project')

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Projects'))

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'webapp')

WebUI.click(findTestObject('Convergence/Projects/checkbox_Select all'))

WebUI.click(findTestObject('Convergence/Projects/button_Delete'))

WebUI.click(findTestObject('Convergence/Projects/button_OK'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/Users/select_102550100'), '100', false)

assertEquals('Webwebapp', selenium.getText('//a[contains(text(),"Webwebapp")]'))

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'webwebapp')

WebUI.click(findTestObject('Convergence/Security/Users/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Security/Users/btn_Delete'))

WebUI.delay(2)

selenium.click('//button[contains(text(),"OK")]')

