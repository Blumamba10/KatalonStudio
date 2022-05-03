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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Undo/Redo button in Script Editor')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Comment')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Comment')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Actions/a_Comment'))

assertEquals('Comment', selenium.getText('//h4[@class="modal-title"]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Comment\'])[2]/following::div[7]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Bold\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Italic\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Underline\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Strikethrough\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('link=Superscript'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Superscript\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('link=Align right'))

assertTrue(selenium.isElementPresent('link=Center'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Center\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Justify\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Font Name\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Font Color\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Remove Formatting\'])[1]/following::div[2]'))

assertTrue(selenium.isElementPresent('link=Bullet list'))

assertTrue(selenium.isElementPresent('link=Numbered list'))

assertTrue(selenium.isElementPresent('link=Insert a table'))

assertTrue(selenium.isElementPresent('link=Code'))

assertTrue(selenium.isElementPresent('link=Insert a Quote'))

assertTrue(selenium.isElementPresent('link=Insert a horizontal rule'))

//assertTrue(selenium.isElementPresent('//body'))
assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Insert a horizontal rule\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/action_Comment/body_Comment'))

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/action_Comment/body_Comment'), 'This is a comment!')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Insert a horizontal rule\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Comment\'])[1]/following::i[1]')

assertTrue(selenium.isElementPresent('//app-actions-list-head/div[1]/div[1]/div[1]/div[1]/div[5]/button[1]/i[1]'))

WebUI.click(findTestObject('Convergence/z_One Offs/chkbox_comment'))

selenium.click('//app-actions-list-head/div[1]/div[1]/div[1]/div[1]/div[8]/button[6]/i[1]')

WebUI.verifyElementNotPresent(findTestObject('Convergence/z_One Offs/chkbox_comment'), 0)

WebUI.delay(5)

selenium.click('//app-actions-list-head/div[1]/div[1]/div[1]/div[1]/div[5]/button[1]/i[1]')

WebUI.verifyElementPresent(findTestObject('Convergence/z_One Offs/chkbox_comment'), 0)

WebUI.delay(5)

selenium.click('//app-actions-list-head/div[1]/div[1]/div[1]/div[1]/div[5]/button[2]/i[1]')

WebUI.verifyElementNotPresent(findTestObject('Convergence/z_One Offs/chkbox_comment'), 0)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.comment('Undo/Redo button in Template Editor')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Manage Templates'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/addTemplate'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Form Name'), 'First Name')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Form Name'), 'Last Name')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/button_OK'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/InsertFormField_btn'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Form Name'), 'SSN')

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/dropdown_Form Type'), 
    'text-mask', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/dropdown_Input Mask'), 
    'ssn', false)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/button_OK'))

WebUI.verifyElementPresent(findTestObject('Convergence/z_One Offs/div_SSN'), 0)

assertTrue(selenium.isElementPresent('//sidebar-header/div[1]/ul[1]/li[3]/a[1]/i[1]'))

selenium.click('//sidebar-header/div[1]/ul[1]/li[3]/a[1]/i[1]')

WebUI.delay(5)

WebUI.verifyElementNotPresent(findTestObject('Convergence/z_One Offs/div_SSN'), 0)

