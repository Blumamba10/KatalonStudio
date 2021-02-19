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

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Templates'))

selenium.click('link=Manage Templates')

selenium.click('id=addTemplateButton')

WebUI.switchToWindowIndex('1')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[7]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::li[6]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[5]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[4]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::li[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[1]'))

assertEquals('Preview', selenium.getText('link=Preview'))

assertEquals('Script', selenium.getText('link=Script'))

assertEquals('Rules', selenium.getText('link=Rules'))

assertEquals('Properties', selenium.getText('link=Properties'))

assertEquals('User Preferences', selenium.getText('link=User Preferences'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Preferences\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Print\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Refresh\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Refresh\'])[1]/following::label[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Style:\'])[1]/following::div[2]'))

assertEquals('Style:', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=webStyleList'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/preceding::i[4]')

assertEquals('PROPERTIES', selenium.getText('link=PROPERTIES'))

assertEquals('APPEARANCE', selenium.getText('link=APPEARANCE'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'APPEARANCE\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=fc-name'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::div[2]'))

assertEquals('ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=controlId'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ID\'])[1]/following::div[2]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ID\'])[1]/following::label[1]'))

assertEquals('DateFile UploadHiddenListMulti-Value ListNumberTextText Mask', selenium.getText('id=controlType'))

assertEquals('Character Set', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::label[1]'))

assertEquals('Allow AllAlphaNumericAlpha-NumericCustom Only', selenium.getText('id=controlCharacterSet'))

assertEquals('Case', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Character Set\'])[1]/following::label[1]'))

assertEquals('MixedUppercaseLowercase', selenium.getText('id=controlCase'))

assertEquals('Content Length', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Case\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=minLen'))

assertEquals('MIN.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Content Length\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=maxLen'))

assertEquals('MAX.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MIN.\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=ctReq'))

assertTrue(selenium.isElementPresent('id=cMult'))

assertTrue(selenium.isElementPresent('id=ctProt'))

assertEquals('Required', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MAX.\'])[1]/following::label[1]'))

assertEquals('Multi-Line', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MAX.\'])[1]/following::label[2]'))

assertEquals('Protect', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/preceding::label[1]'))

assertTrue(selenium.isElementPresent('id=propertiesSaveBtn'))

assertTrue(selenium.isElementPresent('id=propertiesCancelBtn'))

assertTrue(selenium.isElementPresent('id=propertiesApplyBtn'))

assertTrue(selenium.isElementPresent('id=previewApplyBtn'))

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'First Name')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('link=APPEARANCE')

assertEquals('Style Mode', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview\'])[1]/following::label[1]'))

assertEquals('SimpleAdvanced', selenium.getText('id=styleMode'))

assertEquals('Filter', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Style Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=styFilter'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Filter\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('id=valOnly'))

assertEquals('Show only items with values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Filter\'])[1]/following::label[1]'))

assertEquals('Clear Styles', selenium.getText('id=styleClearButton'))

assertEquals('Label', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Clear Styles\'])[1]/following::h4[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Clear Styles\'])[1]/following::h4[1]')

assertEquals('Color', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Label\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Color\'])[1]/following::input[1]'))

assertEquals('Display', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Color\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Label.display'))

assertEquals('Size', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Display\'])[1]/following::label[1]'))

assertEquals('SmallerLargerXX-SmallX-SmallSmallMediumLargeX-LargeXX-Large', selenium.getText('id=Label.font-size'))

assertEquals('Italic', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Size\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Label.font-style'))

assertEquals('Bold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Italic\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Label.font-weight'))

assertEquals('Height', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Bold\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=Label.height'))

assertEquals('Alignment', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Height\'])[1]/following::label[1]'))

assertEquals('LeftCenterRight', selenium.getText('id=Label.text-align'))

assertEquals('Width', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Alignment\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=Label.width'))

assertEquals('Control', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Width\'])[1]/following::h4[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Width\'])[1]/following::h4[1]')

assertEquals('Background Color', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Control\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Background Color\'])[1]/following::input[1]'))

assertEquals('Color', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Background Color\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Color\'])[2]/following::input[1]'))

assertEquals('Display', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Color\'])[2]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Control.display'))

assertEquals('Size', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Display\'])[2]/following::label[1]'))

assertEquals('SmallerLargerXX-SmallX-SmallSmallMediumLargeX-LargeXX-Large', selenium.getText('id=Control.font-size'))

assertEquals('Italic', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Size\'])[2]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Control.font-style'))

assertEquals('Bold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Italic\'])[2]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Control.font-weight'))

assertEquals('Height', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Bold\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=Control.height'))

assertEquals('Alignment', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Height\'])[2]/following::label[1]'))

assertEquals('LeftCenterRight', selenium.getText('id=Control.text-align'))

assertEquals('Width', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Alignment\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=Control.width'))

assertEquals('Other', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Width\'])[2]/following::h4[1]'))

assertEquals('Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Other\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Other.Password'))

selenium.click('link=PROPERTIES')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Last Name')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Date')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[1]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Date')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=File Upload')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[2]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'File Upload')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Hidden')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[3]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Hidden')

assertEquals('Default Value (optional)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=hiddenDefaultValue'))

selenium.click('id=hiddenDefaultValue')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=List')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[4]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'List')

selenium.click('id=listIdStatic')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option List\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option Lists\'])[1]/following::button[1]')

WebUI.selectOptionByLabel(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/select_AvailableOption'), 
    'Linked', false)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Available Option Lists\'])[1]/following::option[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create a dynamic link to the selected list\'])[1]/following::button[1]')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Multi-Value List')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[5]')

selenium.type('id=fc-name', 'Multi-Value List')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Multi-Value List')

selenium.click('id=fc-name')

selenium.click('id=listIdMultiValStatic')

selenium.select('id=listIdMultiValStatic', 'label=List')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option List\'])[1]/following::option[1]')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Number')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[6]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Number')

assertEquals('Precision', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=numPrec'))

assertEquals('Value Range', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Precision\'])[1]/following::label[1]'))

assertEquals('min', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value Range\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=numMinVal'))

assertEquals('max', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'min\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=numMaxVal'))

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Text Mask')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[8]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'Phone Number')

selenium.click('id=propertiesSaveBtn')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[6]')

selenium.click('id=controlType')

selenium.select('id=controlType', 'label=Text Mask')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::option[8]')

selenium.click('id=selMask')

selenium.select('id=selMask', 'label=Social Security Number')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Input Mask\'])[1]/following::option[2]')

selenium.click('id=fc-name')

WebUI.sendKeys(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Form Name'), 'SSN')

selenium.click('id=propertiesSaveBtn')

selenium.click('link=Script')

assertTrue(selenium.isElementPresent('id=selectJavaScriptIncludesButton'))

assertTrue(selenium.isElementPresent('id=showAPIButton'))

selenium.click('link=Rules')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Preferences\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Preferences\'])[1]/following::button[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Create New Rule\'])[1]/following::div[6]'))

assertEquals('Condition Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::div[1]'))

assertEquals('Action Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Condition Fields\'])[1]/following::div[1]'))

assertEquals('New Rule Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Creating New Rule\'])[1]/following::strong[1]'))

assertTrue(selenium.isElementPresent('id=ruleName'))

assertEquals('Conditions', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Rule Name\'])[1]/following::strong[1]'))

assertEquals('Add a Condition', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Conditions\'])[1]/following::strong[1]'))

assertEquals('If', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add a Condition\'])[1]/following::span[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::input[1]'))

assertEquals('Is BlankIs Not BlankEqualsDoes Not EqualEquals (Case Sensitive)Does Not Equal (Case Sensitive)ContainsDoes Not ContainContains (Case Sensitive)Does Not Contain (Case Sensitive)', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::select[1]'))

assertEquals('ValueValue Of', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::select[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::input[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add\'])[1]/following::button[1]'))

assertEquals('Actions', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[1]/following::strong[1]'))

assertEquals('Add an Action', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Actions\'])[1]/following::strong[1]'))

assertEquals('RequireSetDisplayData ViewScript', selenium.getText('id=actionType'))

assertEquals('Run Rule When...', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[2]/following::strong[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Run Rule When...\'])[1]/following::input[1]'))

assertEquals('Web Form opens', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Run Rule When...\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Run Rule When...\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save Rule\'])[1]/following::button[1]'))

selenium.click('id=ruleName')

selenium.type('id=ruleName', 'New Rule')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Conditions\'])[1]/following::div[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::input[1]', 'firstName')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::input[2]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::input[2]', 'Deana')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If\'])[1]/following::button[2]')

selenium.click('id=actionType')

selenium.select('id=actionType', 'label=Set')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::option[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::input[1]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::input[1]', 
    'lastName')

selenium.click('id=setOrClearSelect')

selenium.select('id=setOrClearSelect', 'label=to...')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::option[6]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::input[2]')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::input[2]', 
    'McCormick')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action Type\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cancel\'])[3]/preceding::button[1]')

selenium.click('link=Properties')

selenium.click('link=Preview')

selenium.click('link=Properties')

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/Template Properties_header'), 
    'TEMPLATE PROPERTIES')

assertTrue(selenium.isElementPresent('id=templateName'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/label_Description'), 
    'Description')

assertTrue(selenium.isElementPresent('id=templateDescription'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/label_Category'), 'Category')

assertTrue(selenium.isElementPresent('id=templateCategory'))

WebUI.verifyElementText(findTestObject('Convergence/Templates/ManageTemplates_Page/Template Editor/label_Form Name'), 'Form Name')

assertTrue(selenium.isElementPresent('id=formName'))

selenium.click('id=templateName')

selenium.typeKeys('id=templateName', 'New Template')

selenium.click('id=templateDescription')

selenium.typeKeys('id=templateDescription', 'New Template Description\n\nSecond Line\n\nThird Line')

selenium.click('link=User Preferences')

assertEquals('Code Editor Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Name\'])[1]/following::strong[1]'))

assertEquals('Theme', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Code Editor Settings\'])[1]/following::label[1]'))

assertEquals('Default3024 Day3024 NightABCDEFAmbianceBase16 DarkBase16 LightBespinBlackboardCobaltColorforthDraculaDuotone DarkDuotone LightEclipseElegantErlang DarkHopscotchIcecoderIsotopeLesser DarkLiquibyteMaterialMBOMDN-likeMidnightMonokaiNeatNeoNightPanda SyntaxParaiso DarkParaiso LightPastel on DarkRailscastsRubyBlueSETISolarizedThe MatrixTomorrow Night BrightTomorrow Night EightiesTTCNTwilightVibrant InkXQ DarkXQ LightYetiZenburn', 
    selenium.getText('id=theme'))

assertEquals('Font Size', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Theme\'])[1]/following::label[1]'))

assertEquals('121416202430', selenium.getText('id=codeFontSize'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Name\'])[1]/preceding::i[9]')

assertEquals('Success', selenium.getText('//span[contains(text(),\'Success\')]'))

assertEquals('Template saved to server.', selenium.getText('//div[@class=\'tte-modal-dialog-content\']'))

selenium.click('//button[contains(text(),\'OK\')]')

selenium.close()

WebUI.switchToWindowIndex(0)

selenium.refresh()

selenium.waitForPageToLoad('30000')

selenium.typeKeys('//input[@placeholder=\'Search Filter\']', 'New')

assertEquals('New Template', selenium.getText('//a[contains(text(),\'New Template\')]'))

