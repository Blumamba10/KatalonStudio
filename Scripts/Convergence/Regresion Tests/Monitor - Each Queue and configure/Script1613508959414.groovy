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

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('Convergence/SelectProject_values/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/SelectProject_values/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/SelectProject_values/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Scripts'))

selenium.click('link=Monitor')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/a_Configure_History'), 10)

selenium.click('link=Configure')

assertEquals('Configure Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Submitted\'])[1]/following::a[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Submitted\'])[1]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Submitted\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::h1[1]'))

assertEquals('The Submitted Poller checks for Submitted forms and starts the appropriate Script for the form.', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::div[5]')

assertEquals('Error Email Settings Enabled', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Submitted\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=enableErrorEmailCheck'))

assertEquals('Data Processor Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::h4[1]'))

assertEquals('Auto unlock after...', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data Processor Settings\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=autoUnlock'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('id=enableErrorEmailCheck')

assertEquals('Mail Host', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=mailHostInput'))

assertEquals('From Address', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To Address(es)\'])[1]/following::label[1]'))

assertEquals('To Address(es)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::label[1]'))

assertEquals('Email Subject', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From Address\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=errorSubjectInput'))

assertTrue(selenium.isElementPresent('id=advancedOptions'))

assertEquals('Enable advanced options', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Email Subject\'])[1]/following::label[1]'))

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/Configure Submitted_page/checkbox_Enable advanced options'))

assertEquals('Username', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enable advanced options\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=hostUserNameInput'))

assertEquals('Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Username\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=hostPasswordInput'))

assertEquals('Port', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::label[1]'))

selenium.click('id=hostUserNameInput')

selenium.type('id=hostUserNameInput', 'username')

selenium.click('id=toAddressesInput')

selenium.type('id=toAddressesInput', 'username@trinisys.com')

selenium.click('id=hostPasswordInput')

selenium.type('id=hostPasswordInput', 'password')

selenium.click('id=hostPortInput')

selenium.type('id=hostPortInput', '808')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::button[2]')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/a_Configure_Submitted'), 10)

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/a_Configure_Submitted'))

selenium.click('id=autoUnlock')

assertTrue(selenium.isEditable('id=hostPortInput'))

assertEquals('Data Processor Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=lockTime'))

assertEquals('Minutes Hours Days', selenium.getText('id=lockTimeIncrement'))

selenium.click('id=lockTime')

selenium.typeKeys('id=lockTime', '15')

selenium.click('id=lockTimeIncrement')

selenium.select('id=lockTimeIncrement', 'label=Hours')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::option[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::button[2]')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/a_Configure_Submitted'), 10)

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/a_Configure_Submitted'))

selenium.click('id=autoUnlock')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'after...\'])[1]/following::button[2]')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/button_View_Submited'), 10)

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/button_View_Submited'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::a[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::h1[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[2]')

assertEquals('The Submitted Queue contains forms that have not yet been processed or that have been resubmitted from either the Hold or Error queues.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::span[1]'))

assertEquals('102550100', selenium.getText('name=submittedFormsTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[2]/following::th[1]'))

assertEquals('Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form\'])[1]/following::th[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

assertEquals('Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[2]/following::a[1]')

assertEquals('Configure Hold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Retry After', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Hold\'])[1]/following::h5[1]'))

assertEquals('This is the time period that a item must wait in the Hold queue before being eligible to be reprocessed. This setting can be overridden by the individual Hold action in a script. The item may not be reprocessed immediately due to the schedule specified for the Submitted Items', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Retry After\'])[1]/following::p[1]'))

assertEquals('Error After', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Retry After\'])[1]/following::h5[1]'))

assertEquals('This is the total amount of time an item can remain in the hold queue before being moved to the error queue instead of being reprocessed.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::p[1]'))

assertTrue(selenium.isEditable('name=holdBeforeRetryEligible'))

assertEquals('Seconds Minutes Hours Days', selenium.getText('name=holdBeforeRetryEligibleDescriptor'))

assertTrue(selenium.isEditable('name=totalHoldBeforeError'))

assertEquals('Seconds Minutes Hours Days', selenium.getText('name=totalHoldBeforeErrorDescriptor'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Hold\'])[1]/following::a[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Hold\'])[1]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Hold\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::h1[1]'))

assertEquals('The Hold Queue allows the processing of submitted forms to be suspended for a given period of time. Forms are sent to the Hold Queue by calls to the Hold action from within a publish script. Unless specified otherwise in the specific Hold actions, the settings below will dictate the hold behavior for items sent to the queue.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::div[9]')

selenium.click('name=holdBeforeRetryEligible')

selenium.type('name=holdBeforeRetryEligible', '15')

selenium.click('name=holdBeforeRetryEligibleDescriptor')

selenium.select('name=holdBeforeRetryEligibleDescriptor', 'label=Days')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::option[4]')

selenium.click('name=totalHoldBeforeError')

selenium.type('name=totalHoldBeforeError', '15')

selenium.click('name=totalHoldBeforeErrorDescriptor')

selenium.select('name=totalHoldBeforeErrorDescriptor', 'label=Seconds')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::option[5]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[2]/following::a[1]')

selenium.click('name=holdBeforeRetryEligible')

selenium.type('name=holdBeforeRetryEligible', '5')

selenium.click('name=holdBeforeRetryEligibleDescriptor')

selenium.select('name=holdBeforeRetryEligibleDescriptor', 'label=Minutes')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::option[2]')

selenium.click('name=totalHoldBeforeError')

selenium.type('name=totalHoldBeforeError', '25')

selenium.click('name=totalHoldBeforeErrorDescriptor')

selenium.select('name=totalHoldBeforeErrorDescriptor', 'label=Minutes')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::option[6]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error After\'])[1]/following::button[2]')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/button_View_Hold'), 10)

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/button_View_Hold'))

assertEquals('Hold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::a[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::h1[1]'))

assertEquals('The Hold Queue contains submitted forms that are being held until a time/date configuration or other condition is met and they are processed again.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[2]')

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hold\'])[1]/following::span[1]'))

assertEquals('102550100', selenium.getText('name=submittedFormsTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::th[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form\'])[1]/following::th[1]'))

assertEquals('Last Hold', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

assertEquals('Retry Eligible', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Hold\'])[1]/following::th[1]'))

assertEquals('Will Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Retry Eligible\'])[1]/following::th[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Will Error\'])[1]/following::th[1]'))

assertEquals('Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/button_View_Error'), 10)

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/button_View_Error'))

assertEquals('Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::h1[1]'))

assertEquals('The Error Queue contains submitted forms that could not be processed due to an error.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[2]')

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[1]/following::span[1]'))

assertEquals('102550100', selenium.getText('name=submittedFormsTable_length'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Attempted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Attempted\'])[1]/following::th[1]'))

assertEquals('Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[2]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form\'])[1]/following::th[1]'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::th[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[4]/following::a[2]')

assertEquals('Configure History', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Delete history over...', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure History\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=daysOldInput'))

assertEquals('days old', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete history over...\'])[1]/following::span[1]'))

assertEquals('Delete Forms', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'days old\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=removeFormsYes'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Forms\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=removeFormsNo'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[1]/following::label[1]'))

assertEquals('Delete Images', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=removeImagesYes'))

assertEquals('Yes', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Images\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=removeImagesNo'))

assertEquals('No', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[2]/following::button[2]'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('id=daysOldInput')

selenium.type('id=daysOldInput', '59')

selenium.click('id=removeFormsNo')

selenium.click('id=removeImagesNo')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[2]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next Run Time\'])[4]/following::a[2]')

selenium.click('id=daysOldInput')

selenium.type('id=daysOldInput', '60')

selenium.click('id=removeFormsYes')

selenium.click('id=removeImagesYes')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No\'])[2]/following::button[2]')

WebUI.waitForElementPresent(findTestObject('Convergence/Scripts/MonitorPage/button_View_History'), 10)

WebUI.click(findTestObject('Convergence/Scripts/MonitorPage/button_View_History'))

assertEquals('History', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::a[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::h1[1]'))

assertEquals('The History Queue contains forms that have been processed successfully or that have been explicitly moved from one of the other queues.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::div[2]')

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View All\'])[2]/following::span[1]'))

assertEquals('102550100', selenium.getText('name=submittedFormsTable_length'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('id=checkAllCheck'))

assertEquals('Script', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script\'])[1]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form\'])[1]/following::th[1]'))

assertEquals('Submitted', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted\'])[1]/following::th[1]'))

assertEquals('Completed', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('Time(sec)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Completed\'])[1]/following::th[1]'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Time(sec)\'])[1]/following::th[1]'))

assertEquals('Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::th[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::a[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'live\'])[1]/following::i[2]')

assertEquals('Data Processors', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'* monitor live updates occur every 3 seconds\'])[1]/following::h2[1]'))

assertEquals('Start Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data Processors\'])[1]/following::th[1]'))

assertEquals('Status', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start Time\'])[1]/following::th[1]'))

assertEquals('Form ID', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Status\'])[1]/following::th[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form ID\'])[1]/following::th[1]'))

assertEquals('Action', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::th[1]'))

selenium.click('id=editHistoryFilter')

assertEquals('Submitted Date', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Ending\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=submittedDateFrom'))

assertEquals('Completed Date', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted Date\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('id=completedDateFrom'))

assertEquals('Submitted By', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Completed Date\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=publishedByUser'))

assertEquals('Script', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Submitted By\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=publishNameSelect'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=templateNameSelect'))

assertEquals('Form Name', selenium.getText('//form[@id=\'frmHistoryFilter\']/div/div[2]/div/div/table/tbody/tr[6]/td/label'))

assertTrue(selenium.isElementPresent('id=formNameLikeSelect'))

assertEquals('Form Note', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=formNoteLikeSelect'))

assertTrue(selenium.isEditable('id=submittedDateTo'))

assertTrue(selenium.isEditable('id=completedDateTo'))

assertTrue(selenium.isEditable('name=formName'))

assertTrue(selenium.isEditable('name=formNote'))

assertEquals('Beginning', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'History Filter\'])[1]/following::th[2]'))

assertEquals('Ending', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Beginning\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Note\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('//form[@id=\'frmHistoryFilter\']/div/div/div/div/div/a/i')

