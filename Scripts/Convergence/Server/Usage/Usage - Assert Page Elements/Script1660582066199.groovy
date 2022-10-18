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

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Usage'))

assertEquals('Usage', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Report Parameters', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Usage\'])[2]/following::h5[1]'))

assertEquals('Category', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Report Parameters\'])[1]/following::label[1]'))

assertEquals('Data Processor Web Processor', selenium.getText('id=usageReportCategorySelect'))

assertEquals('Period', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Category\'])[1]/following::label[1]'))

assertEquals('Last 5 Minutes Last 5 Hours Last 5 Days Custom', selenium.getText('id=usageReportPeriodSelect'))

assertEquals('Hour', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Current browser does not support HTML 5 Canvas.\'])[1]/following::th[1]'))

assertEquals('Time Used', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hour\'])[1]/following::th[1]'))

assertEquals('Available Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Time Used\'])[1]/following::th[1]'))

assertEquals('Utilization', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Available Time\'])[1]/following::th[1]'))

selenium.click('id=usageReportPeriodSelect')

selenium.select('id=usageReportPeriodSelect', 'label=Last 5 Minutes')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Period\'])[1]/following::option[1]')

selenium.click('id=usageReportPeriodSelect')

selenium.select('id=usageReportPeriodSelect', 'label=Last 5 Days')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Period\'])[1]/following::option[3]')

selenium.click('id=usageReportPeriodSelect')

selenium.select('id=usageReportPeriodSelect', 'label=Custom')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Period\'])[1]/following::option[4]')

assertEquals('Show', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Period\'])[1]/following::label[1]'))

assertEquals('1 2 3 4 5 6 7 8 9 10', selenium.getText('id=usageReportCustomAmountSelect'))

assertEquals('Minutes Hours Days', selenium.getText('id=usageReportCustomPeriod'))

assertEquals('Starting From', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Show\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Starting From\'])[1]/following::span[1]'))

assertTrue(selenium.isEditable('id=usageReportCustomDate'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Starting From\'])[1]/following::i[2]'))

assertTrue(selenium.isEditable('id=usageReportCustomTime'))

assertTrue(selenium.isElementPresent('id=viewButton'))

selenium.click('id=usageReportCategorySelect')

selenium.select('id=usageReportCategorySelect', 'label=Web Processor')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Category\'])[1]/following::option[2]')

