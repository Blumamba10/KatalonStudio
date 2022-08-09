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

WebUI.delay(3)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'AutoUser')

selenium.click('//a[contains(text(),"AutoUser")]')

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/a_Project Roles'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/btn_Add Roles'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/txt_Search Filter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/select_102550100'), 
    0)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/btn_Add Roles'))

selenium.isElementPresent('//a[@class="tcc-grouped-dv-expand-all-link"]')

selenium.isElementPresent('//a[@class="tcc-grouped-dv-collapse-all-link"]')

assertEquals('Role', selenium.getText('//table[@id="fdv-projectRolesDialog-availableProjectRoles-table"]//thead//tr//th[@class="sorting_disabled"][contains(text(),"Role")]'))

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/_Add Project Roles/chkbox_Select All'))

selenium.click('//button[text()="Add Selections"]')

selenium.click('//div[@class="ui-dialog-buttonset"]//button[@type="button"][contains(text(),"Close")]')

WebUI.delay(3)

assertEquals('Project', selenium.getText('//th[@class="sorting"][contains(text(),"Project")]'))

assertEquals('Role', selenium.getText('//th[@class="sorting"][contains(text(),"Role")]'))

selenium.click('//input[@id="main.tabs.projectRoles.list.dataSelectAllCheck"]')

selenium.isElementPresent('//button[text()="Delete"]')

