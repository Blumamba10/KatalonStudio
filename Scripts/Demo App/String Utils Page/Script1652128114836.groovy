import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

CustomKeywords.'cutomKeywords.Demo_LoginHelper.login'(GlobalVariable.demoappURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('link=General Scripting')

selenium.click('link=String Utils')

assertEquals('String Utils Test Page', selenium.getText('//tr[2]/td/div'))

assertEquals('Contains', selenium.getText('//div/table/tbody/tr/td'))

selenium.click('//div/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//th'))

assertEquals('Search Value', selenium.getText('//th[2]'))

assertEquals('Ignore Case', selenium.getText('//th[3]'))

assertEquals('Result', selenium.getText('//th[5]'))

assertEquals('YESNO', selenium.getText('//select'))

assertEquals('Test', selenium.getText('//button'))

assertEquals('Count Matches', selenium.getText('//div[2]/table/tbody/tr/td'))

selenium.click('//div[2]/table/tbody/tr/td')

selenium.click('//div[2]/table/tbody/tr[2]/td/div/table/tbody/tr/th')

selenium.click('//div[2]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]')

selenium.click('//div[2]/table/tbody/tr[2]/td/div/table/tbody/tr/th[4]')

selenium.click('//td[3]/div/button')

assertEquals('Ends With', selenium.getText('//div[3]/table/tbody/tr/td'))

selenium.click('//div[3]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Suffix', selenium.getText('//div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Ignore Case', selenium.getText('//div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Result', selenium.getText('//div[3]/table/tbody/tr[2]/td/div/table/tbody/tr/th[5]'))

assertEquals('YESNO', selenium.getText('//div[3]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/div/select'))

assertEquals('Test', selenium.getText('//div[3]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/button'))

assertEquals('Index Of', selenium.getText('//div[4]/table/tbody/tr/td'))

selenium.click('//div[4]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[4]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Search Value', selenium.getText('//div[4]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Start Index', selenium.getText('//div[4]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Ignore Case', selenium.getText('//div[4]/table/tbody/tr[2]/td/div/table/tbody/tr/th[4]'))

assertEquals('Result', selenium.getText('//th[6]'))

assertEquals('YESNO', selenium.getText('//td[4]/div/select'))

assertEquals('Test', selenium.getText('//td[5]/div/button'))

assertEquals('Join', selenium.getText('//div[5]/table/tbody/tr/td'))

selenium.click('//div[5]/table/tbody/tr/td')

assertEquals('Value 1', selenium.getText('//div[5]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Value 2', selenium.getText('//div[5]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Delimiter', selenium.getText('//div[5]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Result', selenium.getText('//div[5]/table/tbody/tr[2]/td/div/table/tbody/tr/th[5]'))

assertEquals('Test', selenium.getText('//div[5]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/button'))

assertEquals('Last Index Of', selenium.getText('//div[6]/table/tbody/tr/td'))

selenium.click('//div[6]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Search Value', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Start Index', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Ignore Case', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr/th[4]'))

assertEquals('Result', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr/th[6]'))

assertEquals('YESNO', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/select'))

assertEquals('Test', selenium.getText('//div[6]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[5]/div/button'))

assertEquals('Length', selenium.getText('//div[7]/table/tbody/tr/td'))

selenium.click('//div[7]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[7]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Result', selenium.getText('//div[7]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Test', selenium.getText('//td[2]/div/button'))

assertEquals('Lowercase', selenium.getText('//div[8]/table/tbody/tr/td'))

selenium.click('//div[8]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[8]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Result', selenium.getText('//div[8]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Test', selenium.getText('//div[8]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]/div/button'))

assertEquals('Padding', selenium.getText('//div[9]/table/tbody/tr/td'))

selenium.click('//div[9]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Padding Value', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Padding Size', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Padding Type', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr/th[4]'))

assertEquals('Result', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr/th[6]'))

assertEquals('Pad LeftPad Right', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/select'))

assertEquals('Test', selenium.getText('//div[9]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[5]/div/button'))

assertEquals('Remove', selenium.getText('//div[10]/table/tbody/tr/td'))

selenium.click('//div[10]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[10]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Parse Value', selenium.getText('//div[10]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Result', selenium.getText('//div[10]/table/tbody/tr[2]/td/div/table/tbody/tr/th[4]'))

assertEquals('Test', selenium.getText('//div[10]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/div/button'))

assertEquals('Replace', selenium.getText('//div[11]/table/tbody/tr/td'))

selenium.click('//div[11]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[11]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Search Value', selenium.getText('//div[11]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Replacement Value', selenium.getText('//div[11]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Result', selenium.getText('//div[11]/table/tbody/tr[2]/td/div/table/tbody/tr/th[5]'))

assertEquals('Test', selenium.getText('//div[11]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/button'))

assertEquals('Starts With', selenium.getText('//div[12]/table/tbody/tr/td'))

selenium.click('//div[12]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[12]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Prefix', selenium.getText('//div[12]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Ignore Case', selenium.getText('//div[12]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Result', selenium.getText('//div[12]/table/tbody/tr[2]/td/div/table/tbody/tr/th[5]'))

assertEquals('YESNO', selenium.getText('//div[12]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/div/select'))

assertEquals('Test', selenium.getText('//div[12]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/button'))

assertEquals('Split', selenium.getText('//div[13]/table/tbody/tr/td'))

selenium.click('//div[13]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[13]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Delimiter', selenium.getText('//div[13]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('Include Empty Values', selenium.getText('//div[13]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Result', selenium.getText('//div[13]/table/tbody/tr[2]/td/div/table/tbody/tr/th[5]'))

assertEquals('YESNO', selenium.getText('//div[13]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[3]/div/select'))

assertEquals('Test', selenium.getText('//div[13]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/button'))

assertEquals('SubString', selenium.getText('//div[14]/table/tbody/tr/td'))

selenium.click('//div[14]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[14]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Start Value', selenium.getText('//div[14]/table/tbody/tr[2]/td/div/table/tbody/tr/th[2]'))

assertEquals('End Value', selenium.getText('//div[14]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Result', selenium.getText('//div[14]/table/tbody/tr[2]/td/div/table/tbody/tr/th[5]'))

assertEquals('Test', selenium.getText('//div[14]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/button'))

assertEquals('Trim', selenium.getText('//div[15]/table/tbody/tr/td'))

selenium.click('//div[15]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[15]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Result', selenium.getText('//div[15]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Test', selenium.getText('//div[15]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]/div/button'))

assertEquals('Uppercase', selenium.getText('//div[16]/table/tbody/tr/td'))

selenium.click('//div[16]/table/tbody/tr/td')

assertEquals('Input Value', selenium.getText('//div[16]/table/tbody/tr[2]/td/div/table/tbody/tr/th'))

assertEquals('Result', selenium.getText('//div[16]/table/tbody/tr[2]/td/div/table/tbody/tr/th[3]'))

assertEquals('Test', selenium.getText('//div[16]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[2]/div/button'))

