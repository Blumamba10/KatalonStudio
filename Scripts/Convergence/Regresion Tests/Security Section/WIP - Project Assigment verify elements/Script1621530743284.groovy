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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Project Assignment'))

assertEquals('Project Assignment', selenium.getText('//div[@class="tde-template-description"]'))

WebUI.verifyElementText(findTestObject('Convergence/Security/Project Assignment/Users_Tab/a_Users'), 'Users')

assertEquals('Show Assignments for', selenium.getText('//div[@id="fl-main-tabs-users-header-projects"]'))

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Assignment/Users_Tab/btn_Add'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Assignment/Users_Tab/btn_Delete'), 0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Assignment/Users_Tab/ddl_Select Project'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Project Assignment/Users_Tab/txt_Search Filter'), 0)

WebUI.click(findTestObject('Convergence/Security/Project Assignment/btn_Help Icon'))

not_run: assertEquals('Project Assignment', selenium.getText('//h1[contains(text(),"Project Assigment")]'))

assertEquals('Here you can view project role assignments by project. Select "All Projects" from Show Assignments for to see all project role assignments grouped by project, or select a project to see assignments just for that selection.', 
    selenium.getText('//p[contains(text(),"Here you can view project role assignments by proj")]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.verifyElementText(findTestObject('null'), 'ID')

WebUI.verifyElementText(findTestObject('null'), 'Project')

WebUI.verifyElementText(findTestObject('null'), 'User')

WebUI.verifyElementText(findTestObject('null'), 'Role')

