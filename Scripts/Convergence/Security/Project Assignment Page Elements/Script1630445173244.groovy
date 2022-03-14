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

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10)

WebUI.doubleClick(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Project Assignment'))

assertEquals('Project Assignment', selenium.getText('//div[@class="tde-template-description"]'))

assertEquals('Users', selenium.getText('//a[@href="#"][contains(text(),"Users")]'))

assertEquals('User Groups', selenium.getText('//a[@href="#"][contains(text(),"User Groups")]'))

assertEquals('Show Assignments for', selenium.getText('//div[@id="fl-main-tabs-users-header-projects"]'))

assertTrue(selenium.isElementPresent('//select[@id="fc-main-tabs-users-header-projects"]'))

assertTrue(selenium.isElementPresent('//a[@class="tcc-grouped-dv-expand-all-link"]'))

assertTrue(selenium.isElementPresent('//a[@class="tcc-grouped-dv-collapse-all-link"]'))

assertEquals('User', selenium.getText('//th[@class="sorting"][contains(text(),"User")]'))

assertEquals('Role', selenium.getText('//th[@class="sorting"][contains(text(),"Role")]'))

selenium.click('//input[@id="main.tabs.users.allProjects.dataSelectAllCheck"]')

assertTrue(selenium.isElementPresent('//div[@id="btn-main-tabs-users-header-buttons-delete"]//button[text()="Delete"]'))

assertTrue(selenium.isElementPresent('//div[@id="btn-main-tabs-users-header-buttons-add"]//button[text()="Add"]'))

selenium.click('//div[@id="btn-main-tabs-users-header-buttons-add"]//button[text()="Add"]')

assertEquals('Add Assignments', selenium.getText('//span[@id="ui-id-1"]'))

assertEquals('Select User Accounts', selenium.getText('//h5[contains(text(),"Select User Accounts")]'))

assertEquals('Username', selenium.getText('//th[contains(text(),"Username")]'))

assertEquals('Description', selenium.getText('//th[@class="sorting"][contains(text(),"Description")]'))

selenium.click('//input[@id="updateDialog.step1.usersSelectAllCheck"]')

selenium.click('//div[@id="btn-updateDialog-step1-header-continue"]//button[text()="Continue"]')

assertTrue(selenium.isElementPresent('//select[@id="fc-updateDialog-step2-header-project"]'))

assertEquals('Set Project Role Assocations for the Selected Users', selenium.getText('//div[@id="lbl-updateDialog-step2-header-sub-instructions"]//h5[contains(text(),"Set Project Role Assocations for the Selected User")]'))

assertEquals('Available Roles', selenium.getText('//div[@id="lbl-updateDialog-step2-lists-availableHeading"]//h5[contains(text(),"Available Roles")]'))

assertEquals('Select User Accounts', selenium.getText('//h5[contains(text(),"Select User Accounts")]'))

assertEquals('Assigned Roles', selenium.getText('//div[@id="lbl-updateDialog-step2-lists-assignedHeading"]//h5[contains(text(),"Assigned Roles")]'))

assertEquals('User', selenium.getText('//table[@id="fdv-updateDialog-step2-lists-assigned-table"]//thead//tr[@role="row"]//th[@class="sorting"][contains(text(),"User")]'))

assertEquals('Role', selenium.getText('//table[@id="fdv-updateDialog-step2-lists-assigned-table"]//thead//tr[@role="row"]//th[@class="sorting"][contains(text(),"Role")]'))

WebUI.click(findTestObject('Convergence/Security/Project Assignment/Add Assignment/button_Done'))

WebUI.delay(3)

selenium.click('//a[@href="#"][contains(text(),"User Groups")]')

assertTrue(selenium.isElementPresent('//select[@id="fc-main-tabs-userGroups-header-projects"]'))

assertTrue(selenium.isElementPresent('//div[@id="fdv-main-tabs-userGroups-allProjects-data-table_wrapper"]//div[@class="tcc-grouped-dv-controls"]//a[@class="tcc-grouped-dv-expand-all-link"][contains(text(),"+")]'))

assertTrue(selenium.isElementPresent('//div[@id="fdv-main-tabs-userGroups-allProjects-data-table_wrapper"]//div[@class="tcc-grouped-dv-controls"]//a[@class="tcc-grouped-dv-collapse-all-link"][contains(text(),"-")]'))

assertTrue(selenium.isElementPresent('//select[@id="fc-main-tabs-userGroups-header-projects"]'))

assertTrue(selenium.isElementPresent('//div[@id="fdv-main-tabs-userGroups-allProjects-data-table_filter"]//label[contains(text(),"Filter:")]//input[@type="search"]'))

selenium.click('//div[@id="btn-main-tabs-userGroups-header-buttons-add"]//button[text()="Add"]')

assertEquals('Add Assignments', selenium.getText('//span[@id="ui-id-2"]'))

assertEquals('Select User Accounts', selenium.getText('//h5[contains(text(),"Select User Accounts")]'))

assertEquals('Username', selenium.getText('//th[contains(text(),"Username")]'))

assertEquals('Description', selenium.getText('//th[@class="sorting"][contains(text(),"Description")]'))

selenium.click('//body/div[11]/div[3]/div[1]/button[1]')

