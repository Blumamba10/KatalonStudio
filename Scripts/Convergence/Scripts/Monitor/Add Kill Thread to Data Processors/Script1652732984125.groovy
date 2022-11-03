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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.comment('Register Wait Action')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Configure Server'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/a_Actions'))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/h2_Actions'), 'Actions')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/th_Name'), 'Name')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/th_Description'), 'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/btn_addCustomActionButton'), 0)

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/btn_addCustomActionButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/h1_Select an Action'), 
    'Select an Action')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/span_Items Per Page'), 
    'Items Per Page')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/select_Items Per Page'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/input_Search Filter'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/th_Type'), 'Type')

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/th_Description'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/button_cancelButton'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/button_submitButton'), 
    0)

WebUI.sendKeys(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/input_Search Filter'), 
    'wait')

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/z_One Offs/radiobtn_Wait Action'))

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Select an Action_Page/button_submitButton'))

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_ID'), 'ID')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/input_ID'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_Description'), 
    'Description')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/input_Description'), 
    0)

WebUI.verifyElementText(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/label_Implementation'), 
    'Implementation')

WebUI.click(findTestObject('Convergence/Server/Configure Server/Actions/_Action Configuration/btn_Update'))

WebUI.delay(2)

if (selenium.isElementPresent('//button[@id="saveConfigButton"]')) {
    selenium.click('//button[@id="saveConfigButton"]')
} else {
    selenium.click('//p[@class="message"]')

    WebUI.navigateToUrl(GlobalVariable.tdesURL)

    WebUI.delay(3)
}

WebUI.comment('Create Wait Action Script')

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.OPTIONAL)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/button_Add Script'))

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(2)

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'Wait Action')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/Actions/a_Wait'))

selenium.typeKeys('//input[@id="nameInput"]', 'Wait')

selenium.typeKeys('//textarea[@id="descriptionInput"]', 'Wait Action')

selenium.typeKeys('//input[@id="MillisecondstopauseInput"]', '800000')

selenium.click('//button[contains(text(),"OK")]')

assertTrue(selenium.isElementPresent('//button[contains(text(),"Create Blank Template")]'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Wait Action')

assertEquals('Wait Action', selenium.getText('//a[contains(text(),"Wait Action")]'))

WebUI.comment('Create Wait Action Template')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Templates'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/addTemplate'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

selenium.click("//button[@id='templateTypeDefaultBtn']")

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/a_Properties'))

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Template Name'), 'Wait Action')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Template Description'), 'Description')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/Publish_btn'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Success_pop-up/span_Success'), 
    'SUCCESS')

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Success_pop-up/div_Template published to server'), 
    'Template published to server.')

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/_Template Editor/_Success_pop-up/btn_OK'))

WebUI.delay(2)

selenium.close()

WebUI.switchToWindowIndex(0)

selenium.refresh()

selenium.waitForPageToLoad('30000')

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/txt_Search Filter'), 'Wait Action')

assertEquals('Wait Action', selenium.getText('//a[contains(text(),"Wait Action")]'))

WebUI.waitForElementClickable(findTestObject('Convergence/Templates/ManageTemplates_Page/btn_fas fa-globe'), 10)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/btn_fas fa-globe'))

WebUI.switchToWindowIndex('1')

WebUI.waitForElementClickable(findTestObject('Convergence/Templates/ManageTemplates_Page/btn_Publish'), 10)

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/btn_Publish'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'), 0)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Monitor'))

WebUI.delay(5)

WebUI.comment('Validate Kill Thread button')

WebUI.click(findTestObject('Convergence/Scripts/Monitor/btn_Show Data Proccessors'))

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/Monitor/a_Kill Process'), 10)

WebUI.click(findTestObject('Convergence/Scripts/Monitor/a_Kill Process'))

WebUI.delay(5)

WebUI.click(findTestObject('Convergence/Scripts/Monitor/button_View_Error'))

String text = selenium.getText('//tbody/tr[1]/td[3]')

if (text.contains(': Process was killed by admin')) {
    println('Process was Killed by admin')
} else {
    KeywordUtil.markFailed('Message does not contain expected text.')
}

selenium.click('//input[@id="checkAllCheck"]')

selenium.click('//button[@id="moveToHistoryButton"]')

WebUI.comment('Delete Template and Script')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Templates'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Templates'))

WebUI.setText(findTestObject('Convergence/Templates/ManageTemplates_Page/txt_Search Filter'), 'Wait Action')

assertEquals('Wait Action', selenium.getText('//a[contains(text(),"Wait Action")]'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Templates/ManageTemplates_Page/btn_Delete Template'))

selenium.click('//button[@id="overlayConfirmOk"]')

selenium.click('//body[1]/form[1]/div[1]/div[3]/div[1]/div[1]/button[2]/i[1]')

WebUI.delay(1)

assertTrue(selenium.isElementPresent('//p[contains(text(),"Removed 1 templates")]'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'Wait Action')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/chkbox_Select All'))

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/btn_Delete Script'))

selenium.click('//button[@id="overlayConfirmOk"]')

WebUI.delay(1)

assertTrue(selenium.isElementPresent('//p[contains(text(),"Selected script(s) removed.")]'))

