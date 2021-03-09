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

selenium.click('link=File Output')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

selenium.click('id=ini')

assertEquals('Saving in a non-custom format will save the entire form data in that format.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Windows INI File\'])[1]/following::div[3]'))

selenium.click('id=custom')

assertTrue(selenium.isElementPresent('id=csv'))

assertEquals('Comma Separated Value File (CSV)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Custom Format\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=ini'))

assertEquals('Windows INI File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data XML File\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=formxml'))

assertEquals('Native Form XML File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Comma Separated Value File (CSV)\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=custom'))

assertEquals('Custom Format', selenium.getText('//div[2]/div/div/div/label'))

assertTrue(selenium.isElementPresent('id=dataxml'))

assertEquals('Data XML File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Native Form XML File\'])[1]/following::label[1]'))

assertEquals('Custom File Output Configuration', selenium.getText('//h6[contains(text(),\'Custom File Output Configuration\')]'))

assertEquals('File Extension', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Custom File Output Configuration\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=fileOutFileExtension'))

assertEquals('File Output Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Extension\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=fileOutOutputTemplate'))

assertEquals('Field List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output Template\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'File_Output')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=fileOutFileExtension')

selenium.typeKeys('id=fileOutFileExtension', '.txt')

selenium.click('id=fileOutOutputTemplate')

selenium.typeKeys('id=fileOutOutputTemplate', 'output template')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::div[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Output\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=FileUtils')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'FileUtils\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Operation', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Copy DirectoryCopy FileCreate DirectoryCreate Temp DirectoryDelete DirectoryDelete FileDirectory ListFile ExistsFile SizeFile setTextGet File NameGet Parent PathMove DirectoryMove FileRead Text FileText to FileRename File', 
    selenium.getText('//select'))

assertEquals('Source Directory', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Copy a directory to a specified location\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source Directory\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source Directory\'])[1]/following::button[1]'))

assertEquals('Destination Directory', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Full path to source directory\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Destination Directory\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Destination Directory\'])[1]/following::button[1]'))

selenium.typeKeys('id=nameInput', 'FileUtils')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.typeKeys('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Source Directory\'])[1]/following::input[1]', 
    'Source')

