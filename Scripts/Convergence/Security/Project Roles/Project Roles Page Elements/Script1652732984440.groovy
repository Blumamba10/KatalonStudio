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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Project Roles'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/btn_Help Icon'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/chkbox_Select All'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/ddl_102550100'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/txt_Search Filter'), 0)

WebUI.click(findTestObject('Convergence/Security/Project Role/chkbox_Select All'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/btn_Export'), 0)

WebUI.click(findTestObject('Convergence/Security/Project Role/btn_Add Project Role'))

WebUI.delay(2)

assertEquals('Add Role', selenium.getText('//h3[@id="addRoleModalLabel"]'))

assertEquals('Role Name', selenium.getText('//label[@for="roleNameInput"]'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/_Add Role/btn_Add'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Role/_Add Role/btn_Cancel'), 0)

WebUI.setText(findTestObject('Convergence/Security/Project Role/_Add Role/txt_Role Name'), 'Role Test')

WebUI.click(findTestObject('Convergence/Security/Project Role/_Add Role/btn_Add'))

WebUI.setText(findTestObject('Convergence/Security/Project Role/txt_Search Filter'), 'Role Test')

assertEquals('Role Test', selenium.getText('//a[contains(text(),"Role Test")]'))

selenium.click('//i[@class="fas fa-times"]')

assertEquals('Confirm Remove Role', selenium.getText('//span[@class="title"]'))

assertTrue(selenium.isElementPresent('//button[@id="overlayConfirmOk"]'))

assertTrue(selenium.isElementPresent('//button[@id="overlayConfirmCancel"]'))

selenium.click('//button[@id="overlayConfirmOk"]')

assertFalse(selenium.isElementPresent('//a[contains(text(),"Role Test")]'))

WebUI.clearText(findTestObject('Convergence/Security/Project Role/txt_Search Filter'))

