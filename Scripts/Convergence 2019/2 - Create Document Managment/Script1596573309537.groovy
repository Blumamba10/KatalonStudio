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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('link=Home')

selenium.click('link=Document Management')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Document\'])[1]/following::strong[1]')

selenium.click('link=Default')

assertEquals('Document Search', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Main Console', selenium.getText('link=Main Console'))

assertEquals('Document Management', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Main Console\'])[1]/following::strong[1]'))

assertEquals('Search', selenium.getText('link=Search'))

assertEquals('Admin', selenium.getText('link=Admin'))

assertEquals('Add Document', selenium.getText('link=Add Document'))

assertTrue(selenium.isElementPresent('id=searchButton'))

assertTrue(selenium.isElementPresent('id=clearButton'))

assertEquals('Document Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document Search\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=doctype-selector'))

assertEquals('Created By', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document Type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=createdByInput'))

assertEquals('Created', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created By\'])[1]/following::label[1]'))

assertEquals('on before after between', selenium.getText('id=opCreatedSelect'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created\'])[1]/following::span[1]'))

assertTrue(selenium.isElementPresent('id=createdAfter'))

assertEquals('on before after between', selenium.getText('id=opUpdatedSelect'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Updated\'])[1]/following::span[1]'))

assertTrue(selenium.isElementPresent('id=updatedAfter'))

assertEquals('Field Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'and\'])[2]/following::th[1]'))

assertEquals('Operator', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Field Name\'])[1]/following::th[1]'))

assertEquals('Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Operator\'])[1]/following::th[1]'))

assertEquals('Please select a Document Type to view Index Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::td[1]'))

selenium.click('link=Admin')

selenium.click('link=Index Fields')

assertEquals('Index Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Field Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Index Fields\'])[2]/following::th[2]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Field Name\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('id=addIndexFieldButton'))

selenium.click('id=addIndexFieldButton')

assertEquals('Add Index Field', selenium.getText('id=myModalLabel2'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Index Field\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=add_new_name'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::label[1]'))

assertEquals('Text Date Number', selenium.getText('id=add_new_value'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[3]/following::button[1]'))

assertTrue(selenium.isElementPresent('id=addIndexFields'))

selenium.click('id=add_new_name')

selenium.type('id=add_new_name', 'Script Index')

selenium.click('id=addIndexFields')

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('id=removeButton'))

selenium.click('id=checkAllCheck')

selenium.click('link=Admin')

selenium.click('link=Document Types')

assertEquals('Document Types', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::div[4]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Document Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document Types\'])[2]/following::th[2]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document Type\'])[1]/following::th[1]'))

assertEquals('Created', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('id=createDocTypeButton'))

selenium.click('id=createDocTypeButton')

assertEquals('Edit Document Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Document Type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description (optional)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertEquals('Index Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(optional)\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=addIndexFieldsButton'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Field Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Index Fields\'])[2]/following::th[2]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Field Name\'])[1]/following::th[1]'))

assertEquals('No fields assigned to document type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::em[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No fields assigned to document type\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('id=addIndexFieldsButton')

assertEquals('Add Index Fields', selenium.getText('id=myModalLabel'))

assertEquals('Select the index fields from the list below that should be added to the document type.', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add\'])[1]/following::p[1]'))

assertEquals('Field Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add\'])[1]/following::th[2]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Field Name\'])[2]/following::th[1]'))

assertTrue(selenium.isElementPresent('id=selectCheck_0'))

assertEquals('Script Index', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[2]/following::td[2]'))

assertEquals('Text', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Index\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[2]/following::button[1]'))

assertTrue(selenium.isElementPresent('id=addIndexField'))

selenium.click('id=selectCheck_0')

selenium.click('id=addIndexField')

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('id=removeButton'))

selenium.click('id=checkAllCheck')

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Script Document')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::i[2]')

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('id=exportTypeButton'))

assertTrue(selenium.isElementPresent('id=copyDocTypeButton'))

assertTrue(selenium.isElementPresent('id=moveDocTypeButton'))

assertTrue(selenium.isElementPresent('id=removeDocTypesButton'))

selenium.click('id=checkAllCheck')

selenium.click('link=Main Console')

