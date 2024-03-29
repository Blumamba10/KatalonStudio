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

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Option Lists'))

WebUI.delay(2)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

selenium.click('id=createListButton')

selenium.click('id=listTypeSelect')

selenium.click('id=optionListName')

selenium.typeKeys('id=optionListName', 'Linked')

selenium.select('id=listTypeSelect', 'Linked')

assertEquals('Linked List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Static List\'])[1]/following::h6[1]'))

assertEquals('List field options are generated from a database query that runs when the form containing the field is opened in a browser.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked List\'])[1]/following::p[1]'))

selenium.click('id=newOptionsListSubmitBtn')

assertEquals('Edit Linked Option List Linked', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked\'])[1]/following::i[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked\'])[1]/following::i[1]'))

assertEquals('Configuration', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Linked\'])[1]/following::h4[1]'))

assertEquals('Query', selenium.getText('//h4[contains(text(),"Query")]'))

assertEquals('Data Source', selenium.getText('//label[contains(text(),"Data Source")]'))

assertEquals('Description (optional)', selenium.getText('//label[contains(text(),"Description")]'))

assertTrue(selenium.isElementPresent('id=optionListDescription'))

assertTrue(selenium.isElementPresent('//div[@style="position: relative;"]//pre'))

assertEquals('Options', selenium.getText('//h4[contains(text(),"Options")]'))

assertEquals('Name', selenium.getText('//th[contains(text(),"Name")]'))

assertEquals('Value', selenium.getText('//th[contains(text(),"Value")]'))

assertTrue(selenium.isElementPresent('id=showListButton'))

assertEquals('Press F11 for fullscreen editor', selenium.getText('id=hintDiv'))

assertTrue(selenium.isElementPresent('id=queryWizardButton'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.doubleClick('id=queryWizardButton')

WebUI.verifyElementText(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/label_database'), 
    'Database')

WebUI.verifyElementPresent(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/select_Database'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/label_Table'), 
    'Table')

WebUI.verifyElementPresent(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/select_Table'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/label_Name Column'), 
    'Name Column')

WebUI.verifyElementPresent(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/select_Name Column'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/label_Value Column'), 
    'Value Column')

WebUI.verifyElementPresent(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/select_Value Column'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/button_Update'), 
    0)

WebUI.verifyElementNotClickable(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/button_Update'))

WebUI.click(findTestObject('Convergence/Templates/OptionLists_Page/_OptionListQueryBuilder_Page/button_Back'))

assertTrue(selenium.isElementPresent('//span[@class="title"]'))

selenium.click('//span[@class="title"]')



