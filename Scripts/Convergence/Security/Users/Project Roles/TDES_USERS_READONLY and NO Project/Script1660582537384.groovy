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

WebUI.callTestCase(findTestCase('Convergence/Security/Users/_Create Project Role Users/Create ReadOnly User'), 
    [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'userreadonly', 'uTh_XM7fnpL_7!8H%')

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Security'))

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Project Roles'), 0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_User Groups'), 0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Credential Management'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Project Assignment'), 
    0)

WebUI.verifyElementPresent(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Users'), 0)

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Users'))

WebUI.setText(findTestObject('Convergence/Security/Users/txt_Search FIlter'), 'userreadonly')

WebUI.click(findTestObject('Convergence/z_One Offs/a_userreadonly'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Change Password'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/Users/_User Detail/Summary Tab/btn_Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/a_Roles'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/Users/_User Detail/Roles Tab/btn_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/a_Project Roles'))

WebUI.verifyElementNotVisible(findTestObject('Convergence/Security/Users/_User Detail/Project Roles Tab/btn_Add Roles'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'), 0)

WebUI.click(findTestObject('Convergence/Security/Users/_User Detail/btn_Retrun to Users'))

