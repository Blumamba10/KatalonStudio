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

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_License Manager'))

WebUI.click(findTestObject('Convergence/Server/LicenseManager/btn_Update License'))

WebUI.setText(findTestObject('Convergence/Server/LicenseManager/txt_Enter License Key_key'), 'ljbhJdFJzHlBwPoxVdtZLDB1RLbe7Y8LWrBohbocRFLiDPXvxwOT7w/r4W9SkYbGRjeSwHsiLyFGN5LAeyIvIUY3ksB7Ii8hRjeSwHsiLyHR0p0IVzwazkY8iRLHlOHxauG+YOqQfENq4b5g6pB8Q2rhvmDqkHxDauG+YOqQfEObY784Q1xDOA==')

WebUI.doubleClick(findTestObject('Convergence/Server/LicenseManager/txt_Enter License Key_key'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Server/LicenseManager/btn_Enter License Key'))

WebUI.refresh()

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Logout/a_admin'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/Access Denied_Page/a_Logout'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/a_Return'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'admin')

WebUI.setText(findTestObject('Convergence/Login/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_SelectProject/a_convergence_console'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_License Manager'))

WebUI.click(findTestObject('Convergence/Server/LicenseManager/btn_Update License'))

WebUI.setText(findTestObject('Convergence/Server/LicenseManager/txt_Enter License Key_key'), 'FK0dq25Nk/vR7ErWyaqcrwqXajdNAzwFtOqMjTs1zpG2xrke/j9VY+IzBdlreKwqRjeSwHsiLyFGN5LAeyIvIUY3ksB7Ii8hRjeSwHsiLyHR0p0IVzwazkY8iRLHlOHxauG+YOqQfENq4b5g6pB8Q2rhvmDqkHxDauG+YOqQfEObY784Q1xDOA==')

WebUI.doubleClick(findTestObject('Convergence/Server/LicenseManager/txt_Enter License Key_key'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Server/LicenseManager/btn_Enter License Key'))

WebUI.refresh()

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Logout/a_admin'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/Access Denied_Page/a_Logout'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Logout/a_Return'))

WebUI.setText(findTestObject('Convergence/Login/username'), 'admin')

WebUI.setText(findTestObject('Convergence/Login/password'), 'admin')

WebUI.click(findTestObject('Convergence/Login/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/_SelectProject/a_convergence_console'), 10, FailureHandling.STOP_ON_FAILURE)

