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

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Form\'])[1]/following::strong[1]')

selenium.click('link=Default')

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Projects'))

WebUI.setText(findTestObject('Convergence/Projects/input_Search Filter'), 'webapp')

WebUI.click(findTestObject('Convergence/Projects/checkbox_Select all'))

WebUI.click(findTestObject('Convergence/Projects/btn_Tag Selected Project'))

assertEquals('Confirm Tag Project', selenium.getText('//span[@class="title"]'))

selenium.click('//button[@id="overlayConfirmOk"]')

assertEquals('Changed Since Last Export', selenium.getText('//h2[contains(text(),"Changed Since Last Export")]'))

assertEquals('Unchanged Since Last Export', selenium.getText('//h2[contains(text(),"Unchanged Since Last Export")]'))

assertEquals('Templates', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[2]/div[1]/fieldset[1]/h5[1]'))

assertEquals('Templates', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[2]/div[2]/fieldset[1]/h5[1]'))

//need to verify if templat pattern is correct


assertEquals('Scripts', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[3]/div[1]/fieldset[1]/h5[1]'))

assertEquals('Scripts', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[3]/div[2]/fieldset[1]/h5[1]'))


assertEquals('Option Lists', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[4]/div[1]/fieldset[1]/h5[1]'))

assertEquals('Option Lists', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[4]/div[2]/fieldset[1]/h5[1]'))

assertEquals('Styles', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[5]/div[1]/fieldset[1]/h5[1]'))

assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[2]/div[1]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))

assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[2]/div[2]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))

assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[3]/div[2]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))
assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[4]/div[1]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))
assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[4]/div[2]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))
assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[5]/div[1]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))
assertEquals('Name', selenium.getText('//body/form[@id="editProjectFrm"]/div[@class="container"]/div[@class="row"]/div[@class="span12"]/div[@class="content-box padded-box margin-bottom-30"]/div[5]/div[2]/fieldset[1]/table[1]/thead[1]/tr[1]/th[1]'))

selenium.typeKeys('//input[@id="tag"]', 'Test Tag')

assertTrue(selenium.isElementPresent('//label[@for="tag"]'))
assertTrue(selenium.isElementPresent('//h1[contains(text(),"View Project")]'))


selenium.click('//i[@class="shortcut-icon fas fa-check-circle"]')

