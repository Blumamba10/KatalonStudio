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

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.click(findTestObject('Convergence/Security/Users_Page/btn_addUser'))

WebUI.sendKeys(findTestObject('Convergence/Security/Users_Page/Add User_Page/input_User Name'), 'testUser')

WebUI.click(findTestObject('Convergence/Security/Users_Page/Add User_Page/checkbox_Internal Database'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Convergence/Security/Users_Page/Add User_Page/input_Enter Password'), 'Password!1')

WebUI.sendKeys(findTestObject('Convergence/Security/Users_Page/Add User_Page/input_Re-Enter Password'), 'Password!1')

WebUI.click(findTestObject('Convergence/Security/Users_Page/Add User_Page/button_Next'))

WebUI.click(findTestObject('Convergence/Security/Users_Page/Add User_Page/button_Configure Project Access'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '2', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Default-Full Access', selenium.getText('//td[contains(text(),\'Default-Full Access\')]'))

selenium.click('//div/div[2]')

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '2', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('IntakePrototype-Full Access', selenium.getText('//td[contains(text(),\'IntakePrototype-Full Access\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '2', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Demo-Full Access', selenium.getText('//td[contains(text(),\'Demo-Full Access\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '1', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Default-Read All', selenium.getText('//td[contains(text(),\'Default-Read All\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '3', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Default-Web Application', selenium.getText('//td[contains(text(),\'Default-Web Application\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '1', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('IntakePrototype-Read All', selenium.getText('//td[contains(text(),\'IntakePrototype-Read All\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '3', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('IntakePrototype-Web Application', selenium.getText('//td[contains(text(),\'IntakePrototype-Web Application\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '1', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Demo-Read All', selenium.getText('//td[contains(text(),\'Demo-Read All\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '3', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Demo-Web Application', selenium.getText('//td[contains(text(),\'Demo-Web Application\')]'))

assertEquals('Showing 1 to 9 of 9 entries', selenium.getText('//div[@id=\'rolesTable_info\']'))

selenium.click('//button[@id=\'deleteRoleButton_8\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_7\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_6\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_5\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_4\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_3\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_2\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_1\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_0\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

assertEquals('Showing 0 to 0 of 0 entries', selenium.getText('//div[@id=\'rolesTable_info\']'))

selenium.click('//div/ul/li[6]/a')

selenium.click('//li[6]/ul/li[4]/a')

selenium.click('//tr[3]/td/a')

assertEquals('Showing 0 to 0 of 0 entries', selenium.getText('//div[@id=\'rolesTable_info\']'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '2', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Default-Full Access', selenium.getText('//td[contains(text(),\'Default-Full Access\')]'))

selenium.click('//div/div[2]')

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '2', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('IntakePrototype-Full Access', selenium.getText('//td[contains(text(),\'IntakePrototype-Full Access\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '2', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Demo-Full Access', selenium.getText('//td[contains(text(),\'Demo-Full Access\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '1', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Default-Read All', selenium.getText('//td[contains(text(),\'Default-Read All\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '3', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Default-Web Application', selenium.getText('//td[contains(text(),\'Default-Web Application\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '1', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('IntakePrototype-Read All', selenium.getText('//td[contains(text(),\'IntakePrototype-Read All\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '2', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '3', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('IntakePrototype-Web Application', selenium.getText('//td[contains(text(),\'IntakePrototype-Web Application\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '1', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Demo-Read All', selenium.getText('//td[contains(text(),\'Demo-Read All\')]'))

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/button_addRoleAssociation'))

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project'), 
    '4', false)

WebUI.selectOptionByValue(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/dropdown_Project Role to Add'), 
    '3', false)

WebUI.click(findTestObject('Convergence/Security/ProjectAssignment_Page/Add Project Role_popup/button_Add'))

assertEquals('Demo-Web Application', selenium.getText('//td[contains(text(),\'Demo-Web Application\')]'))

assertEquals('Showing 1 to 9 of 9 entries', selenium.getText('//div[@id=\'rolesTable_info\']'))

selenium.click('//button[@id=\'deleteRoleButton_8\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_7\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_6\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_5\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_4\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_3\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_2\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_1\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

selenium.click('//button[@id=\'deleteRoleButton_0\']')

selenium.click('//button[@id=\'overlayConfirmOk\']')

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

WebUI.sendKeys(findTestObject('Convergence/Security/Users_Page/input_Search Filter'), 'testUser')

WebUI.click(findTestObject('Convergence/Security/Users_Page/checkbox_Check All'))

WebUI.click(findTestObject('Convergence/Security/Users_Page/delete'))

WebUI.click(findTestObject('Convergence/Security/Users_Page/button_OK'))

