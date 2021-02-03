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

WebUI.doubleClick(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Security'))

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Users'))

assertEquals('Users', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Items Per Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Users\'])[2]/following::span[1]'))

assertEquals('102550100', selenium.getText('name=userListTable_length'))

assertTrue(selenium.isElementPresent('id=addUserButton'))

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('id=exportUsersButton'))

assertTrue(selenium.isElementPresent('id=deleteUsersButton'))

selenium.click('id=checkAllCheck')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]'))

assertEquals('User', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Processing...\'])[1]/following::th[2]'))

assertEquals('Enabled', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User\'])[1]/following::th[1]'))

assertEquals('Created', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::th[1]'))

assertEquals('Last Login', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created\'])[1]/following::th[1]'))

assertEquals('Authentication', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Login\'])[1]/following::th[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Login\'])[1]/following::th[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    'admin')

selenium.submit('id=frmUserList')

assertEquals('admin', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Authentication\'])[2]/following::a[1]'))

assertEquals('Unrestricted user', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'admin\'])[2]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unrestricted user\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unrestricted user\'])[1]/following::td[2]'))

assertEquals('Internal Database', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unrestricted user\'])[1]/following::td[4]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    '')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Authentication\'])[2]/following::a[1]')

assertEquals('User Detail admin', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'admin\'])[2]/following::h5[1]'))

assertEquals('Unrestricted user', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[1]/following::li[1]'))

assertEquals('Created', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unrestricted user\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created\'])[1]/following::li[1]'))

assertEquals('Last Authenticated', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Authenticated\'])[1]/following::li[1]'))

assertEquals('Authentication', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Last Authenticated\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Authentication\'])[2]/following::li[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'None\'])[1]/following::i[1]'))

assertEquals('Account enabled', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'None\'])[1]/following::h5[1]'))

assertTrue(selenium.isElementPresent('id=editUserButton'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Account enabled\'])[1]/i[1]'))

assertEquals('Roles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit User Account\'])[1]/following::h4[1]'))

assertEquals('Role', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::th[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Role\'])[1]/following::th[1]'))

assertEquals('ACCESS_HEAP_DUMP', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr/td'))

assertEquals('Access Heap Dump', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr/td[2]'))

assertEquals('ADD_USER', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[2]/td'))

assertEquals('Add users to Convergence security', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADD_USER\'])[1]/following::td[1]'))

assertEquals('ADMIN_CONSOLE_USER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add users to Convergence security\'])[1]/following::td[1]'))

assertEquals('Use the Convergence Administration Console', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADMIN_CONSOLE_USER\'])[1]/following::td[1]'))

assertEquals('ADMIN_FORM_DATA_LOOKUP', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Use the Convergence Administration Console\'])[1]/following::td[1]'))

assertEquals('Add/Update/Delete Form Data Lookup Queries', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADMIN_FORM_DATA_LOOKUP\'])[1]/following::td[1]'))

assertEquals('ADMIN_SCHEDULE', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[5]/td'))

assertEquals('Update the Schedule for the Monitor Queues', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADMIN_SCHEDULE\'])[1]/following::td[1]'))

assertEquals('CAN_DELETE_HISTORY', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[6]/td'))

assertEquals('Delete History', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[6]/td[2]'))

assertEquals('CONFIG_SERVER', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[7]/td'))

assertEquals('Configure Convergence Server (Administrators Only)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CONFIG_SERVER\'])[1]/following::td[1]'))

assertEquals('CONFIGURE_DATA_SOURCES_AND_HANDLERS', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[8]/td'))

assertEquals('Configure Data Sources and Handlers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CONFIGURE_DATA_SOURCES_AND_HANDLERS\'])[1]/following::td[1]'))

assertEquals('DE_USER', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[9]/td'))

assertEquals('Data enter forms', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[9]/td[2]'))

assertEquals('DELETE_FORM', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data enter forms\'])[1]/following::td[1]'))

assertEquals('Delete Forms', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DELETE_FORM\'])[1]/following::td[1]'))

assertEquals('DELETE_USER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Forms\'])[1]/following::td[1]'))

assertEquals('Delete users from Convergence security', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DELETE_USER\'])[1]/following::td[1]'))

assertEquals('DM_ADD_CONTENT', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete users from Convergence security\'])[1]/following::td[1]'))

assertEquals('Add Documents to DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_ADD_CONTENT\'])[1]/following::td[1]'))

assertEquals('DM_DELETE_CONTENT', selenium.getText('//form[@id=\'viewUserForm\']/div/div[2]/div[2]/table/tbody/tr[13]/td'))

assertEquals('Delete Documents from DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_DELETE_CONTENT\'])[1]/following::td[1]'))

assertEquals('DM_MODIFY_INDEX', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Documents from DMS\'])[1]/following::td[1]'))

assertEquals('Modify Document Fields in DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_MODIFY_INDEX\'])[1]/following::td[1]'))

assertEquals('DM_REPLACE_CONTENT', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Modify Document Fields in DMS\'])[1]/following::td[1]'))

assertEquals('Replace Documents in DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_REPLACE_CONTENT\'])[1]/following::td[1]'))

assertEquals('DM_SEARCH', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Replace Documents in DMS\'])[1]/following::td[1]'))

assertEquals('Search and View Documents in DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_SEARCH\'])[1]/following::td[1]'))

assertEquals('EDIT_AUTHENTICATION_METHODS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search and View Documents in DMS\'])[1]/following::td[1]'))

assertEquals('Edit Authentication Methods', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_AUTHENTICATION_METHODS\'])[1]/following::td[1]'))

assertEquals('Edit Log Email Settings', selenium.getText('//td[contains(text(),\'Edit Log Email Settings\')]'))

assertEquals('Edit Log Settings', selenium.getText('//td[contains(text(),\'Edit Log Settings\')]'))

assertEquals('EDIT_QUEUE_SETTINGS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Log Settings\'])[1]/following::td[1]'))

assertEquals('Edit Queue Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_QUEUE_SETTINGS\'])[1]/following::td[1]'))

assertEquals('EDIT_USERS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Queue Settings\'])[1]/following::td[1]'))

assertEquals('Edit Users', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_USERS\'])[1]/following::td[1]'))

assertEquals('MONITOR_PUBLISHER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Users\'])[1]/following::td[1]'))

assertEquals('View and administer publisher queues', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MONITOR_PUBLISHER\'])[1]/following::td[1]'))

assertEquals('MONITOR_PUBLISHER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Users\'])[1]/following::td[1]'))

assertEquals('View and administer publisher queues', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MONITOR_PUBLISHER\'])[1]/following::td[1]'))

assertEquals('PROJECTS_ADMIN', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View and administer publisher queues\'])[1]/following::td[1]'))

assertEquals('View all Projects in List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PROJECTS_ADMIN\'])[1]/following::td[1]'))

assertEquals('PROJECTS_ADMIN', selenium.getText('//td[contains(text(),\'PROJECTS_ADMIN\')]'))

assertEquals('PROJECTS_ROLES', selenium.getText('//td[contains(text(),\'PROJECTS_ROLES\')]'))

assertEquals('Create and Assign Project Roles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PROJECTS_ROLES\'])[1]/following::td[1]'))

assertEquals('UPDATE_LICENSE', selenium.getText('//td[contains(text(),\'UPDATE_LICENSE\')]'))

assertEquals('Update License Key', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UPDATE_LICENSE\'])[1]/following::td[1]'))

selenium.click('id=editUserButton')

selenium.click('name=rolesTable_length')

selenium.select('name=rolesTable_length', 'label=100')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::option[4]')

assertTrue(selenium.isElementPresent('id=selectRoleCheck-0'))

assertEquals('ACCESS_HEAP_DUMP', selenium.getText('//table[@id=\'rolesTable\']/tbody/tr/td[2]/label'))

assertEquals('Access Heap Dump', selenium.getText('//table[@id=\'rolesTable\']/tbody/tr/td[3]/label'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-1'))

assertEquals('ADD_USER', selenium.getText('//table[@id=\'rolesTable\']/tbody/tr[2]/td[2]/label'))

assertEquals('Add users to Convergence security', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADD_USER\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-2'))

assertEquals('ADMIN_CONSOLE_USER', selenium.getText('//label[contains(text(),\'ADMIN_CONSOLE_USER\')]'))

assertEquals('Use the Convergence Administration Console', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADMIN_CONSOLE_USER\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-3'))

assertEquals('ADMIN_FORM_DATA_LOOKUP', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Use the Convergence Administration Console\'])[1]/following::td[2]'))

assertEquals('Add/Update/Delete Form Data Lookup Queries', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADMIN_FORM_DATA_LOOKUP\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-4'))

assertEquals('ADMIN_SCHEDULE', selenium.getText('//label[contains(text(),\'ADMIN_SCHEDULE\')]'))

assertEquals('Update the Schedule for the Monitor Queues', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ADMIN_SCHEDULE\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-5'))

assertEquals('CAN_DELETE_HISTORY', selenium.getText('//label[contains(text(),\'CAN_DELETE_HISTORY\')]'))

assertEquals('Delete History', selenium.getText('//label[contains(text(),\'Delete History\')]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-6'))

assertEquals('CONFIG_SERVER', selenium.getText('//label[contains(text(),\'CONFIG_SERVER\')]'))

assertEquals('Configure Convergence Server (Administrators Only)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CONFIG_SERVER\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-7'))

assertEquals('CONFIGURE_DATA_SOURCES_AND_HANDLERS', selenium.getText('//label[contains(text(),\'CONFIGURE_DATA_SOURCES_AND_HANDLERS\')]'))

assertEquals('Configure Data Sources and Handlers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CONFIGURE_DATA_SOURCES_AND_HANDLERS\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-8'))

assertEquals('DE_USER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configure Data Sources and Handlers\'])[1]/following::label[1]'))

assertEquals('Data enter forms', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DE_USER\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-9'))

assertEquals('DELETE_FORM', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data enter forms\'])[1]/following::label[1]'))

assertEquals('Delete Forms', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DELETE_FORM\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-10'))

assertEquals('DELETE_USER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Forms\'])[1]/following::label[1]'))

assertEquals('Delete users from Convergence security', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DELETE_USER\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-11'))

assertEquals('DM_ADD_CONTENT', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete users from Convergence security\'])[1]/following::label[1]'))

assertEquals('Add Documents to DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_ADD_CONTENT\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-12'))

assertEquals('DM_DELETE_CONTENT', selenium.getText('//label[contains(text(),\'DM_DELETE_CONTENT\')]'))

assertEquals('Delete Documents from DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_DELETE_CONTENT\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-13'))

assertEquals('DM_MODIFY_INDEX', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delete Documents from DMS\'])[1]/following::td[2]'))

assertEquals('Modify Document Fields in DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_MODIFY_INDEX\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-14'))

assertEquals('DM_REPLACE_CONTENT', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Modify Document Fields in DMS\'])[1]/following::td[2]'))

assertEquals('Replace Documents in DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_REPLACE_CONTENT\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-15'))

assertEquals('DM_SEARCH', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Replace Documents in DMS\'])[1]/following::label[1]'))

assertEquals('Search and View Documents in DMS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DM_SEARCH\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-16'))

assertEquals('EDIT_AUTHENTICATION_METHODS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search and View Documents in DMS\'])[1]/following::label[1]'))

assertEquals('Edit Authentication Methods', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_AUTHENTICATION_METHODS\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-17'))

assertEquals('EDIT_LOG_SETTINGS', selenium.getText('//label[contains(text(),\'EDIT_LOG_SETTINGS\')]'))

assertEquals('Edit Log Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_LOG_SETTINGS\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-18'))

assertEquals('EDIT_QUEUE_SETTINGS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Log Settings\'])[1]/following::label[1]'))

assertEquals('Edit Queue Settings', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_QUEUE_SETTINGS\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-19'))

assertEquals('EDIT_USERS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Queue Settings\'])[1]/following::label[1]'))

assertEquals('Edit Users', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EDIT_USERS\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-20'))

assertEquals('MONITOR_PUBLISHER', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Edit Users\'])[1]/following::label[1]'))

assertEquals('View and administer publisher queues', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MONITOR_PUBLISHER\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-21'))

assertEquals('PROJECTS_ADMIN', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View and administer publisher queues\'])[1]/following::label[1]'))

assertEquals('View all Projects in List', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PROJECTS_ADMIN\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-22'))

assertEquals('PROJECTS_ROLES', selenium.getText('//label[contains(text(),\'PROJECTS_ROLES\')]'))

assertEquals('Create and Assign Project Roles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PROJECTS_ROLES\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-23'))

assertEquals('UPDATE_LICENSE', selenium.getText('//label[contains(text(),\'UPDATE_LICENSE\')]'))

assertEquals('Update License Key', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UPDATE_LICENSE\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=selectRoleCheck-24'))

assertEquals('VIEW_SECURITY_LOG', selenium.getText('//label[contains(text(),\'VIEW_SECURITY_LOG\')]'))

assertEquals('View Security Logs', selenium.getText('//label[contains(text(),\'View Security Logs\')]'))

assertTrue(selenium.isElementPresent('id=submitButton'))

assertTrue(selenium.isElementPresent('id=cancelButton'))

selenium.click('name=rolesTable_length')

selenium.select('name=rolesTable_length', 'label=10')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::option[1]')

assertTrue(selenium.isElementPresent('id=rolesTable_next'))

selenium.click('id=rolesTable_next')

assertTrue(selenium.isElementPresent('id=rolesTable_previous'))

selenium.click('id=rolesTable_previous')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'admin\'])[2]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'admin\'])[2]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Items Per Page\'])[1]/following::input[1]', 
    '')

selenium.submit('id=frmUserList')

selenium.click('id=addUserButton')

selenium.type('id=userNameInput', 'deleteme')

selenium.click('id=authenticateToInternalCheck')

selenium.click('id=password')

selenium.type('id=password', 'Password1!')

selenium.type('id=passwordVerify', 'Password1!')

selenium.click('name=rolesTable_length')

selenium.select('name=rolesTable_length', 'label=100')

selenium.click('//option[@value=\'100\']')

selenium.click('id=checkAllCheck')

selenium.click('id=submitButton')

selenium.click('id=addProjectRoleButton')

selenium.click('//button[@id=\'addRoleAssociationButton\']/i')

selenium.click('id=addRoleSubmitButton')

selenium.click('//a[@class=\'dropdown-toggle\'][contains(text(),\'admin\')]')

selenium.click('link=Logout')

selenium.click('link=Return')

selenium.type('id=usernameField', 'deleteme')

selenium.type('id=passwordField', 'Password1!')

selenium.submit('name=logonform')

assertTrue(selenium.isElementPresent('link=Convergence'))

selenium.click('//a[@class=\'dropdown-toggle\'][contains(text(),\'deleteme\')]')

selenium.click('link=Logout')

selenium.click('link=Return')

selenium.type('id=usernameField', 'admin')

selenium.type('id=passwordField', 'admin')

selenium.click('id=loginLink')

