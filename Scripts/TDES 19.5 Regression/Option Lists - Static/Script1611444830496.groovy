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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Option Lists'))

assertEquals('Option Lists', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option Lists\'])[2]/following::span[2]'))

assertTrue(selenium.isElementPresent('name=optionListTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=createListButton'))

selenium.click('id=createListButton')

assertEquals('Create New Option List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::h3[1]'))

assertEquals('Option List Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create New Option List\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=optionListName'))

assertEquals('Option List Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option List Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option List Type\'])[1]/following::td[1]'))

assertEquals('Static List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option List Type\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Static List\'])[1]/following::p[1]'))

assertTrue(selenium.isElementPresent('id=listTypeSelect'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dynamic\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dynamic\'])[1]/following::button[2]'))

selenium.click('id=optionListName')

selenium.typeKeys('id=optionListName', 'List Two')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Dynamic\'])[1]/following::button[1]')

assertEquals('Option List Detail List Two', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'List Two\'])[1]/following::i[1]'))

assertEquals('List Description (optional)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'List Two\'])[1]/following::h4[1]'))

assertEquals('Options', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(optional)\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=addButton'))

assertTrue(selenium.isElementPresent('id=optionListDescription'))

assertEquals('Option', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Options\'])[1]/following::th[2]'))

assertEquals('Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option\'])[1]/following::th[1]'))

assertEquals('No list options defined. Click the button to create a new option item.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::p[1]'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('id=addButton')

assertEquals('Add New Option', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No list options defined.\'])[1]/following::h3[1]'))

assertEquals('Text', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add New Option\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=addNewName'))

assertEquals('Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=addNewValue'))

assertTrue(selenium.isElementPresent('id=cancelNewOptionListBtn'))

assertTrue(selenium.isElementPresent('id=addOptionListItemBtn'))

selenium.click('id=cancelNewOptionListBtn')

selenium.click('id=addButton')

selenium.click('id=addNewName')

selenium.typeKeys('id=addNewName', 'Option One')

WebUI.clearText(findTestObject('Convergence/Templates/OptionLists_Page/OptionListDetail_Page/Add New Option_Page/textarea_Value_addNewValue'))

WebUI.sendKeys(findTestObject('Convergence/Templates/OptionLists_Page/OptionListDetail_Page/Add New Option_Page/textarea_Value_addNewValue'), 
    'One Option Value')

selenium.click('id=addOptionListItemBtn')

assertTrue(selenium.isElementPresent('id=checkAll'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/OptionLists_Page/OptionListDetail_Page/a_Option One'), 'Option One')

WebUI.verifyElementText(findTestObject('Convergence/Templates/OptionLists_Page/OptionListDetail_Page/td_Option One Value'), 
    'One Option Value')

selenium.click('id=addButton')

selenium.typeKeys('id=addNewName', 'Option Two')

selenium.typeKeys('id=addNewValue', 'Option Two Value')

selenium.click('id=addOptionListItemBtn')

selenium.click('id=addButton')

selenium.typeKeys('id=addNewName', 'Option Three')

selenium.typeKeys('id=addNewValue', 'Option Three Value')

selenium.click('id=addOptionListItemBtn')

WebUI.delay(1)

selenium.click('id=submitButton')

