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
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert as SoftAssert
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'cutomKeywords.ClearView_LoginHelper.loginApp'(GlobalVariable.cvURL, 'cvadmin', 'cvadmin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.enableSmartWait()

// Enter your test steps below
selenium.click("link=Search")
selenium.click("link=Document Search")
assertTrue(selenium.isElementPresent("//table[@id='form-enclosing-table']/tbody/tr[2]/td/div"));
assertTrue(selenium.isElementPresent("id=fl-filter-2-facility"));
assertTrue(selenium.isElementPresent("id=fc-filter-2-facility"));
assertTrue(selenium.isElementPresent("id=fl-filter-2-encounter"));
assertTrue(selenium.isElementPresent("id=fc-filter-2-encounter"));
assertTrue(selenium.isElementPresent("id=fl-filter-2-mrn"));
assertTrue(selenium.isElementPresent("id=fc-filter-2-mrn"));
assertTrue(selenium.isElementPresent("//table[@id='g-filter-1:1']/tbody/tr/td"));
assertTrue(selenium.isElementPresent("id=fc-filter-1-lastName"));
assertTrue(selenium.isElementPresent("id=fl-filter-1-firstName"));
assertTrue(selenium.isElementPresent("id=fc-filter-1-firstName"));
assertTrue(selenium.isElementPresent("id=fc-filter-1-dob"));
assertTrue(selenium.isElementPresent("id=fl-filter-1-dob"));
assertTrue(selenium.isElementPresent("id=CA_filter-1-dob"));
assertTrue(selenium.isElementPresent("//button[@type='button']"));
assertTrue(selenium.isElementPresent("xpath=(//button[@type='button'])[2]"));
assertTrue(selenium.isElementPresent("link=Home"));
assertTrue(selenium.isElementPresent("link=Patient Search"));
assertTrue(selenium.isElementPresent("link=Records Management"));
assertTrue(selenium.isElementPresent("link=Audit"));
assertTrue(selenium.isElementPresent("link=Administration"));
assertTrue(selenium.isElementPresent("link=Logout"));
assertTrue(selenium.isElementPresent("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Document Note Types'])[1]/following::li[1]"));
assertEquals("Premium Features", selenium.getText("link=Premium Features"));
assertEquals("Blood Bank", selenium.getText("link=Blood Bank"));
