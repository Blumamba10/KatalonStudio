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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Schema Compare'))

assertEquals('Schema Compare', selenium.getText("//div[@class='tde-template-description']"))

selenium.isElementPresent("//button[text()='Run']")

selenium.isElementPresent("//button[text()='Delete']")
selenium.isElementPresent("//button[text()='Refresh Schema']")
selenium.isElementPresent("//select[@name='fdv-main-list-querylist-table_length']")
selenium.isElementPresent("//input[@id='main.list.querylistSelectAllCheck']")
selenium.isElementPresent("//input[@type='search']")


assertEquals('ID', selenium.getText("//th[@class='tde-dataview-numeric-cell sorting']"))
assertEquals('VERSION', selenium.getText("//th[contains(text(),'VERSION')]"))
assertEquals('QUERY', selenium.getText("//th[contains(text(),'QUERY')]"))
assertEquals('CREATEDDATE', selenium.getText("//th[contains(text(),'CREATEDDATE')]"))
assertEquals('RUNDATE', selenium.getText("//th[contains(text(),'RUNDATE')]"))
assertEquals('RUNSTATUS', selenium.getText("//th[contains(text(),'RUNSTATUS')]"))








