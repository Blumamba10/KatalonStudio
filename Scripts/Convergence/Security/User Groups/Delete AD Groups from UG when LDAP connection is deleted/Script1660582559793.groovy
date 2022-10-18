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

WebUI.delay(2)

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_User Groups'))

WebUI.click(findTestObject('Convergence/Security/User Groups/btn_Add New User Group'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/_Add User Group/txt_Group Name'), 'AD Group')

WebUI.setText(findTestObject('Convergence/Security/User Groups/_Add User Group/txt_Description'), 'AD Group created by automation.')

selenium.click('//button[contains(text(),"Save")]')

WebUI.setText(findTestObject('Convergence/Security/User Groups/txt_Search Filter'), 'AD Group')

selenium.click('//a[contains(text(),"AD Group")]')

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/a_AD Groups'))

selenium.isElementPresent('//div[@id="btn-main-tabs-adGroups-header-buttons-add"]//button[text()="Add"]')

selenium.click('//div[@id="btn-main-tabs-adGroups-header-buttons-add"]//button[text()="Add"]')

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/ddl_102550100_Assigned'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/ddl_102550100_Available'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/chkbox_Select All_Assigned'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/chkbox_Select All_Available'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/txt_Search Filter_Assigned'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/txt_Search Filter_Available'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/btn_Refresh'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/div_Search Base'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/div_Search Filter'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/radiobtn_Organization Unit'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/radiobtn_User'), 
    0)

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/radiobtn_User'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/btn_Refresh'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/chkbox_Select All_Available'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/btn_Add'))

assertEquals('LDAP ID', selenium.getText('//th[contains(text(),"LDAP ID")]'))

assertEquals('LDAP Group', selenium.getText('//th[contains(text(),"LDAP Group")]'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/chkbox_Select All_Assigned'))

selenium.isElementPresent('//div[@id="btn-main-tabs-adGroups-header-buttons-delete"]//button[text()="Delete"]')

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/_AD Groups/btn_Done'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_User Group Details/btn_Back to User Groups'))

assertEquals('New User Group Complete', selenium.getText('//h1[contains(text(),"New User Group Complete")]'))

assertEquals('New user groups are disabled by default. You will need to explicitly enable this user group from the main user group page when are ready to make the group active.', 
    selenium.getText('//p[contains(text(),"New user groups are disabled by default. You will ")]'))

selenium.click('//button[contains(text(),"OK")]')

WebUI.delay(3)

assertEquals('User Groups', selenium.getText('//div[@class="tde-template-description"]'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/txt_Search Filter'), 'AD Group')

selenium.isElementPresent('//i[@class="fas fa-ban"]')

WebUI.delay(4)

WebUI.click(findTestObject('Convergence/Security/User Groups/btn_Enable Group'))

assertEquals('Confirm Status Change', selenium.getText('//h1[contains(text(),"Confirm Status Change")]'))

assertEquals('Are you sure you want to enable this group? This action will take effect immediately.', selenium.getText('//div[@class="tcc-dialog-content"]'))

WebUI.click(findTestObject('Convergence/Security/User Groups/_Confirm Status Change_popup/button_OK'))

WebUI.delay(3)

assertEquals('AD Group', selenium.getText('//a[contains(text(),"AD Group")]'))

selenium.isElementPresent('//td[@style="text-align: right;"][contains(text(),"2")]')

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Authentication'))

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_Directory Server'))

selenium.click('//i[@class="fas fa-trash-alt"]')

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/button_Delete_OK'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_User Groups'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/txt_Search Filter'), 'AD Group')

selenium.isElementPresent('//body/div[@id="tde-form"]/form[@id="tde-data-entry-form"]/table[@id="form-enclosing-table"]/tbody/tr/td/div[@id="g-main"]/table[@id="g-main:1"]/tbody/tr[@data-groupid="g-main"]/td[@class="tde-table-cell"]/table[@id="gt-main"]/tbody/tr[@data-groupid="g-main"]/td[@class="tde-grid-cell-999"]/div[@id="g-main-list"]/table[@id="g-main-list:1"]/tbody/tr[@data-groupid="g-main-list"]/td[@class="tde-table-cell"]/div[@id="fdv-main-list-userGroupList"]/div[@id="fdv-main-list-userGroupList-table_wrapper"]/table[@id="fdv-main-list-userGroupList-table"]/tbody/tr[@class="odd"]/td[4]')

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Authentication'))

WebUI.click(findTestObject('Convergence/Security/Authentication/btn_Directory Server'))

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/btn_Add AD Config'))

WebUI.setText(findTestObject('null'), 
    'ldap://pd-ldap01:389')

WebUI.setText(findTestObject('null'), 
    'ou=users,dc=adlds,dc=trinisys,dc=loc')

WebUI.setText(findTestObject('null'), 
    'adlds-test')

WebUI.setEncryptedText(findTestObject('null'), 
    'RnHw21PVgelT8HP/ztNLnXD3x8lexSesv347Yb75KYhOC5Bdp8/85w==')

WebUI.click(findTestObject('Convergence/Security/Authentication/Directory Server Authentication/button_Save'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_User Groups'))

WebUI.setText(findTestObject('Convergence/Security/User Groups/txt_Search Filter'), 'AD Group')

selenium.isElementPresent('//body/div[@id="tde-form"]/form[@id="tde-data-entry-form"]/table[@id="form-enclosing-table"]/tbody/tr/td/div[@id="g-main"]/table[@id="g-main:1"]/tbody/tr[@data-groupid="g-main"]/td[@class="tde-table-cell"]/table[@id="gt-main"]/tbody/tr[@data-groupid="g-main"]/td[@class="tde-grid-cell-999"]/div[@id="g-main-list"]/table[@id="g-main-list:1"]/tbody/tr[@data-groupid="g-main-list"]/td[@class="tde-table-cell"]/div[@id="fdv-main-list-userGroupList"]/div[@id="fdv-main-list-userGroupList-table_wrapper"]/table[@id="fdv-main-list-userGroupList-table"]/tbody/tr[@class="odd"]/td[4]')

