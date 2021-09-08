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

CustomKeywords.'cutomKeywords.Convergence_LoginHelper.loginApp'(GlobalVariable.tdesURL, 'admin', 'admin')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Server'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Logging Configuration'))

assertEquals('Log Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update\'])[1]/following::h1[1]'))

selenium.click('//h1[contains(text(),"Help")]')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Log Settings\'])[1]/following::th[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

assertEquals('Level*', selenium.getText('//form[@id=\'staticLogLevelForm\']/table/thead/tr/th[3]'))

assertEquals('Convergence', selenium.getText('//form[@id=\'staticLogLevelForm\']/table/tbody/tr/td/label/strong'))

assertEquals('Logging for all handlers and Server functionality', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence\'])[2]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_1'))

assertEquals('Media Repository', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logging for all handlers and Server functionality\'])[1]/following::strong[1]'))

assertEquals('Logging for the Media Repository', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Media Repository\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_2'))

assertEquals('Convergence Web Controllers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logging for the Media Repository\'])[1]/following::strong[1]'))

assertEquals('Logging for Convergence Controllers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence Web Controllers\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_3'))

assertEquals('Persistence', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logging for Convergence Controllers\'])[1]/following::strong[1]'))

assertEquals('Logging for Convergence Database Interaction', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Persistence\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_4'))

assertEquals('Cache', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logging for Convergence Database Interaction\'])[1]/following::strong[1]'))

assertEquals('Logging for Object Cache', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Cache\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_5'))

assertEquals('Base Framework', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Logging for Object Cache\'])[1]/following::strong[1]'))

assertEquals('Convergence Bean Framework', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base Framework\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_6'))

assertEquals('MVC', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence Bean Framework\'])[1]/following::strong[1]'))

assertEquals('Convergence Model-View-Controller Framework', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MVC\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_7'))

assertEquals('Security', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence Model-View-Controller Framework\'])[1]/following::strong[1]'))

assertEquals('Web Security Framework', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Security\'])[2]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_8'))

assertEquals('Workflow', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Security Framework\'])[1]/following::strong[1]'))

assertEquals('Convergence Workflow', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Workflow\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_9'))

assertEquals('Scheduler', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Convergence Workflow\'])[1]/following::strong[1]'))

assertEquals('Publisher Scheduled Tasks', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Scheduler\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_10'))

assertEquals('Publisher', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Publisher Scheduled Tasks\'])[1]/following::strong[1]'))

assertEquals('Data Publisher', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Publisher\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_11'))

assertEquals('Form Data Lookup', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data Publisher\'])[1]/following::strong[1]'))

assertEquals('Form Data Lookup Queries', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Data Lookup\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_12'))

assertEquals('Web Forms', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Data Lookup Queries\'])[1]/following::strong[1]'))

assertEquals('Web Form Generation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Forms\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_13'))

assertEquals('Content Management', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Form Generation\'])[1]/following::strong[1]'))

assertEquals('Content Management System', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Content Management\'])[1]/following::label[1]'))

assertEquals('all debug info warn error fatal off', selenium.getText('id=logLevelSelect_13'))

assertEquals('Email Notifications', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Content Management System\'])[1]/following::h4[1]'))

assertEquals('Configure the server to send email messages for fatal issues', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Email Notifications\'])[1]/following::p[1]'))

assertEquals('SMTP Host', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Email Notifications\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=smtpHostInput'))

assertEquals('From E-mail Address', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SMTP Host\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=emailFromInput'))

assertTrue(selenium.isElementPresent('id=emailAppenderEnabledCheck'))

assertEquals('Mail FATAL errors to an administrator', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From E-mail Address\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=supportEmailAppenderEnabledCheck'))

assertEquals('Mail FATAL errors to Trinisys Support Staff', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=concat(\'Administrator\', "\'", \'s Email Address\')])[1]/following::label[1]'))

assertEquals('Advanced Options', selenium.getText('id=advancedOptionsHead'))

selenium.click('//h5[@id=\'advancedOptionsHead\']/i')

assertEquals('User name', selenium.getText('//fieldset[@id=\'advancedOptionsFieldset\']/label'))

assertTrue(selenium.isEditable('id=hostUserNameInput'))

assertEquals('Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User name\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=hostPasswordInput'))

assertEquals('Port', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=hostPortInput'))

assertTrue(selenium.isElementPresent('link=Send Test Message'))

assertTrue(selenium.isElementPresent('link=View Log'))

assertTrue(selenium.isElementPresent('id=updateEmailNotificationsBtn'))

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Home'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Administration'))

