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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

selenium.click('link=Project Assignment')

assertEquals('Project Assignment', selenium.getText('//form[@id=\'projectRoleForm\']/div/div/div/div/h1'))

assertTrue(selenium.isElementPresent('//form[@id=\'projectRoleForm\']/div/div/div/div/div/a/i'))

assertTrue(selenium.isElementPresent('//form[@id=\'projectRoleForm\']/div/div/div/div/div/a/i'))

assertEquals('Users', selenium.getText('//table[@id=\'projectRoleTable\']/thead/tr/th'))

assertEquals('admin', selenium.getText('//tr[@id=\'row_\']/td'))

assertEquals('deleteme', selenium.getText('link=deleteme'))

selenium.click('link=deleteme')

assertEquals('Project Role Associations deleteme', selenium.getText('//form[@id=\'deleteProjectRoleToUserForm\']/div/div/div/div/h1'))

assertTrue(selenium.isElementPresent('//form[@id=\'deleteProjectRoleToUserForm\']/div/div/div/div/h1/a/i'))

assertEquals('Items Per Page', selenium.getText('//div[@id=\'rolesTable_length\']/span'))

assertEquals('102550100', selenium.getText('name=rolesTable_length'))

assertTrue(selenium.isElementPresent('//input[@type=\'search\']'))

assertTrue(selenium.isElementPresent('id=addRoleAssociationButton'))

assertEquals('Role', selenium.getText('//table[@id=\'rolesTable\']/thead/tr/th'))

assertEquals('Actions', selenium.getText('//table[@id=\'rolesTable\']/thead/tr/th[2]'))

assertEquals('Default-Full Access', selenium.getText('//table[@id=\'rolesTable\']/tbody/tr/td'))

assertTrue(selenium.isElementPresent('id=deleteRoleButton_0'))

selenium.click('//button[@id=\'addRoleAssociationButton\']/i')

selenium.click('id=projectIdSelect')

selenium.select('id=projectIdSelect', 'label=webapp')

selenium.click('id=roleIdSelect')

selenium.select('id=roleIdSelect', 'label=Read All')

selenium.click('xpath=(//option[@value=\'1\'])[2]')

selenium.click('id=addRoleSubmitButton')

assertEquals('webapp-Read All', selenium.getText('//table[@id=\'rolesTable\']/tbody/tr[2]/td'))

selenium.click('//form[@id=\'deleteProjectRoleToUserForm\']/div/div/div/div/h1/a/i')

selenium.click('link=Users')

selenium.click('//input[@type=\'search\']')

selenium.type('//input[@type=\'search\']', 'deleteme')

selenium.click('id=selectCheck_1')

selenium.click('id=deleteUsersButton')

selenium.click('id=overlayConfirmOk')

