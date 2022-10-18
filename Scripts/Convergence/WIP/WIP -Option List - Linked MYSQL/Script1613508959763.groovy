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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginConvergence'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Option Lists'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

selenium.click('id=createListButton')

selenium.select('id=listTypeSelect', 'Linked')

selenium.click('id=optionListName')

selenium.typeKeys('id=optionListName', 'Linked')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dynamic\'])[1]/following::button[1]')

assertEquals('Edit Linked Option List Linked', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked\'])[1]/following::i[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked\'])[1]/following::i[1]'))

assertEquals('Configuration', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked\'])[1]/following::h4[1]'))

assertEquals('Query', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No Options Available\'])[1]/following::h4[1]'))

assertEquals('Data Source', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configuration\'])[1]/following::label[1]'))

assertEquals('Description (optional)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data Source\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=optionListDescription'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[1]/following::div[9]'))

assertEquals('Options', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(optional)\'])[1]/following::h5[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Options\'])[1]/following::th[1]'))

assertEquals('Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('id=showListButton'))

assertEquals('Press F11 for fullscreen editor', selenium.getText('id=hintDiv'))

assertTrue(selenium.isElementPresent('id=queryWizardButton'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('id=queryWizardButton')

assertEquals('Option List Query Builder app', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals("database", selenium.getText("//form[@id='frmQueryBuilder']/fieldset/label"));

assertTrue(selenium.isElementPresent('id=catalogSelect'))

assertEquals('Table', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'database\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=tableSelect'))

assertEquals('Name Column', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Table\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameColumnSelect'))

assertEquals('Value Column', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name Column\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=valueColumnSelect'))

assertTrue(selenium.isElementPresent('id=updateButton'))

selenium.click('id=catalogSelect')

selenium.select('id=catalogSelect', '_donotdelete')

selenium.click('id=tableSelect')

selenium.select('id=tableSelect', 'label=tdes_action_controller')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Table\'])[1]/following::option[2]')

selenium.click('id=nameColumnSelect')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name Column\'])[1]/following::option[1]')

selenium.click('id=updateButton')

assertEquals('41', selenium.getText('//div[2]/div/div/div/div/div/table/tbody/tr[2]/td'))

assertEquals('41', selenium.getText('//div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]'))

selenium.click('id=submitButton')

assertTrue(selenium.isElementPresent('name=checkAll'))

assertTrue(selenium.isElementPresent('id=selectCheck_0'))

assertEquals('Linked', selenium.getText('link=Linked'))

