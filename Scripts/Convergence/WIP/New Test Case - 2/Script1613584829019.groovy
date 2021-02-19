import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Destination Directory\'])[1]/following::input[1]', 
    'Destination')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Full path to destination directory\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'FileUtils\'])[2]/following::a[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=For Each Statement')

assertEquals('For Each', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ForEach Loop\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=varname'))

assertEquals('Collection', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'in\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collection\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collection\'])[1]/following::button[1]'))

selenium.click('id=varname')

selenium.type('id=varname', 'ForEach')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collection\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collection\'])[1]/following::input[1]', 'Collection')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collection\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Collection\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'For Each Statement\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=GetFormFieldValues')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GetFormFieldValues\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Form Id', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]'))

assertEquals('Returned values will only be available at runtime', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::div[4]'))

assertEquals('Prefer Labels Over Values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Returned values will only be available at runtime\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=PreferLabelsOverValuesSelectTriggerInput'))

assertEquals('When a label is present (typically with lists), return the label instead of the value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Prefer Labels Over Values\'])[1]/following::div[1]'))

assertEquals('All Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'When a label is present (typically with lists), return the label instead of the value\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=AllFieldsSelectTriggerInput'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All Fields\'])[1]/following::div[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All Fields\'])[1]/following::div[1]'))

assertEquals('Include All Multi-Val Selections', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All Fields\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=IncludeAllMulti-ValSelectionsSelectTriggerInput'))

assertEquals('Indicates if Multi-val fields should have all selections returned (default is only the first)', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include All Multi-Val Selections\'])[1]/following::div[1]'))

assertEquals('Return XML-Safe Escaped Version of the Field Values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Indicates if Multi-val fields should have all selections returned (default is only the first)\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=ReturnXML-SafeEscapedVersionoftheFieldValuesSelectInput'))

assertEquals('Returned values will be escaped for use in XML', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Return XML-Safe Escaped Version of the Field Values\'])[1]/following::div[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'GetFormField')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]', 'FormID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Returned values will be escaped for use in XML\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GetFormFieldValues\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=GetMedia')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GetMedia\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Id Type', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Media IdForm IdCMS IdFile System', selenium.getText('id=IdTypeSelectTriggerInput'))

assertEquals('Media Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Id Type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Media Id\'])[2]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Media Id\'])[2]/following::i[1]'))

assertEquals('Meta-Data Only', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Media Id\'])[2]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Meta-DataOnlySelectInput'))

assertEquals('If Yes returns only the meta-data for the media item. Media content will not be set in the media return value.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Meta-Data Only\'])[1]/following::div[1]'))

assertEquals('Detect Content Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'media\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=DetectContentTypeSelectInput'))

assertEquals('If Yes the action will try to detect the content type of the file instead of using what was given by the upload agent.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Detect Content Type\'])[1]/following::div[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'GetMedia')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Media Id\'])[2]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Media Id\'])[2]/following::input[1]', 'MediaId')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GetMedia\'])[3]/following::div[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Yes\'])[4]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GetMedia\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Hold')

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hold\'])[3]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=holddescription'))

assertEquals('Custom Hold Times (optional)', selenium.getText('//div[2]/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=retryCheck'))

assertEquals('Retry after...', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(optional)\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(optional)\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('id=errorCheck'))

assertEquals('Error after...', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Seconds\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Seconds\'])[1]/following::i[1]'))

selenium.click('id=holddescription')

selenium.type('id=holddescription', 'Hold Description')

selenium.click('id=retryCheck')

selenium.click('id=errorCheck')

assertTrue(selenium.isElementPresent('id=retryTime'))

assertEquals('Seconds', selenium.getText('//div[3]/div/div[2]/div/button'))

assertTrue(selenium.isElementPresent('id=errorTime'))

assertEquals('Seconds', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error after...\'])[1]/following::button[1]'))

selenium.click('id=retryCheck')

selenium.type('id=retryTime', '5')

selenium.click('id=errorTime')

selenium.type('id=errorTime', '5')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Seconds\'])[2]/following::div[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Seconds\'])[2]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hold\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Insert')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DB Insert\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Data Source', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('id=dataSourceSelect'))

assertEquals('SQL Statement', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Data Source\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SQL Statement\'])[1]/following::div[9]'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Insert')

selenium.click('id=descriptionInput')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=dataSourceSelect')

selenium.select('id=dataSourceSelect', 'label=configDataSource')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SQL Statement\'])[1]/following::div[9]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Insert Wizard\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Insert\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeAuthUser')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeAuthUser\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Password AuthToken AuthNTLM Auth', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('User Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[1]'))

assertEquals('Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]'))

assertEquals('Auto Create LDAP Authenticated Users', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::label[1]'))

assertEquals('Default to TDES settingTurn off Auto Create', selenium.getText('id=AutoCreateLDAPAuthenticatedUsersSelectInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeAuth')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Auto Create LDAP Authenticated Users\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeAuthUser\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeInit')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeInit\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Option', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Start ConfigurationAdd Intake PointSave Configuration', selenium.getText('id=OptionSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeInit')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Option\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeInit\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeMessageRequest')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeMessageRequest\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Method', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Get Message TextGet Message FileGet Message Mime TypeMessage Is File[\\s\\S]Get Message Local Host NameGet Message Local Host PortGet Message Remote Host NameGet Message Remote Host PortGet Message Intake Point Name', 
    selenium.getText('id=MethodSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeMessageRequest')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeMessageRequest\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeMessageResponse')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeMessageResponse\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Method', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Set Response TextSet Response File', selenium.getText('id=MethodSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeMessageResponse')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=MethodSelectTriggerInput')

selenium.select('id=MethodSelectTriggerInput', 'label=Set Response Text')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::option[1]')

assertEquals('Text', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::i[1]'))

assertEquals('Response Mime Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::label[1]'))

assertEquals('Plain TextBinaryOther', selenium.getText('id=ResponseMimeTypeSelectTriggerInput'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Text\'])[1]/following::input[1]', 'Text')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Response Mime Type\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeMessageResponse\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeQueryUser')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeQueryUser\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Query Action', selenium.getText('//div/div/div/div/div/label'))

assertTrue('^Does this user exist[\\s\\S]Is this user enabled[\\s\\S]Does this user authenticate via LDAP[\\s\\S]Does this user have the following role[\\s\\S]Get user keyGet user roles', 
    selenium.getText('id=QueryActionSelectTriggerInput'))

assertEquals('User Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query Action\'])[1]/following::label[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeQuery')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]', 'UserId')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeQueryUser\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeWebAuthRequest')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthRequest\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Method', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Get Authorization ModeGet User IdGet User Password', selenium.getText('id=MethodSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeWebAuthRequest')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthRequest\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=IntakeWebAuthResponse')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthResponse\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Success', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::button[1]'))

assertEquals('An indicator if the auth was successful. A value of Yes, Y, True, T, or 1 is interpreted as success. Any other value is unsuccess.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::div[4]'))

assertEquals('Failure Reason', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::i[1]'))

assertEquals('If the auth was unsuccessful, this indicates the reason. This value will be passed to system level action \'loginFailure\' as a query parameter named \'reason\'.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::div[4]'))

assertEquals('Roles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::i[1]'))

assertEquals('If the auth was successful, a comma separated list of roles associated to the user. Note that no roles is not the same as an anonymous user.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::div[4]'))

assertEquals('User Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::button[1]'))

assertEquals('If the auth was successful, an optional description of the user (usually a name).', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'IntakeWebAuthResponse')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]', 
    'Failure')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]', 'Roles')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]', 
    'UserDescription')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If the auth was successful, an optional description of the user (usually a name).\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'IntakeWebAuthResponse\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=ManageRoles')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ManageRoles\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Role to Add\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::button[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[10]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[10]/following::button[1]'))

assertEquals('Group', selenium.getText('//div[4]/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Group\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Group\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Manage_Roles')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::input[1]', 'Name')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[11]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[11]/following::input[1]', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Group\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Group\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Group\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ManageRoles\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=ManageUser')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ManageUser\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('User Action', selenium.getText('//div[2]/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[1]'))

assertEquals('Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Change Password is only supported for users authenticating via Internal Database\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[11]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[11]/following::button[1]'))

assertEquals('Mode', selenium.getText('//div[6]/div/div/div/div/label'))

assertEquals('FormStand Alone', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('NTLM Authentication', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=NTLMAuthenticationSelectTriggerInput'))

assertEquals('SAML Authentication', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'NTLM Authentication\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=SAMLAuthenticationSelectTriggerInput'))

assertEquals('Directory Server Authentication', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SAML Authentication\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=DirectoryServerAuthenticationSelectTriggerInput'))

assertEquals('Internal Database Authentication', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Directory Server Authentication\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=InternalDatabaseAuthenticationSelectTriggerInput'))

assertEquals('Enabled', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Internal Database Authentication\'])[1]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=EnabledSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Manage_User')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=UserActionSelectTriggerInput')

selenium.select('id=UserActionSelectTriggerInput', 'label=Update User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Action\'])[1]/following::option[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]', 'UserID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[12]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[12]/following::input[1]', 'Description')

selenium.click('id=ModeSelectTriggerInput')

selenium.select('id=ModeSelectTriggerInput', 'label=Form')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::option[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ManageUser\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MathUtils')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MathUtils\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Function', selenium.getText('//div/div/div/div/div/label'))

assertEquals('AddSubtractMultiplyDivideAbsolute ValueCeilingFloorFormatRoundEvalModulus', selenium.getText('id=FunctionSelectTriggerInput'))

assertEquals('No. of Values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Returns the sum of all specified values\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No. of Values\'])[1]/following::input[1]'))

assertEquals('Value 1', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No. of Values\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::button[1]'))

assertEquals('Value 2', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Math_Utils')

selenium.click('id=descriptionInput')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=FunctionSelectTriggerInput')

selenium.select('id=FunctionSelectTriggerInput', 'label=Multiply')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Function\'])[1]/following::option[3]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::input[1]', 'Value1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::input[1]', 'Value 2')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MathUtils\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultiPageCreate')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageCreate\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Group Template NameSelect pages', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('To select a group of similarly named templates, select the \'Group Template Name\' option. To select individual templates, choose \'Select Pages\'.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::div[1]'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=TemplateSelectInput'))

assertEquals('Web Form Style', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=WebFormStyleSelectTriggerInput'))

assertEquals('The web form style to apply to the pages', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Form Style\'])[1]/following::div[1]'))

assertEquals('Multipage Form Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The web form style to apply to the pages\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[1]'))

assertEquals('Not required. Name for all pages of this multi-page form/application - can be used in SWAT publish scripts', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultiPageCreate')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=TemplateSelectInput')

selenium.select('id=TemplateSelectInput', 'label=Next Template')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Template\'])[1]/following::option[2]')

selenium.click('id=WebFormStyleSelectTriggerInput')

selenium.select('id=WebFormStyleSelectTriggerInput', 'label=Default')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]', 
    'Multipage')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageCreate\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultipageEvent')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultipageEvent\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultipageEvent')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(//button[@type=\'button\'])[14]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultipageEvent\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultiPageGetFormId')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageGetFormId\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Page Map Mode', selenium.getText('//ngb-modal-window[2]/div/div/div[2]/div/div/div/div/div/label'))

assertEquals('Pass in the page mapLoad map from formPull map from current form', selenium.getText('id=PageMapModeSelectTriggerInput'))

assertEquals('Page Map', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map Mode\'])[1]/following::label[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::input[1]'))

assertEquals('', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::i[1]'))

assertEquals('This value should be set with the paramMap value returned from the MuliPageCreate action', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::div[4]'))

assertEquals('Page Index', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'This value should be set with the paramMap value returned from the MuliPageCreate action\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::i[1]'))

assertEquals('The 1-based index of the page form id to return', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultiPageGetFormID')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::input[1]', 'Page Map')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The 1-based index of the page form id to return\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageGetFormId\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultipageResponse')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultipageResponse\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Event', selenium.getText('//div[2]/div/div/div/div/label'))

assertEquals('NavigationSaveClose', selenium.getText('id=EventSelectTriggerInput'))

assertEquals('Read Only', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Access\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=ReadOnlySelectTriggerInput'))

assertEquals('Read Only Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Fields\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Fields\'])[1]/following::button[1]'))

assertEquals('Read Only Groups', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Fields\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Groups\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Groups\'])[1]/following::button[1]'))

assertEquals('Editable Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Groups\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Fields\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Fields\'])[1]/following::button[1]'))

assertEquals('Editable Groups', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Fields\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Groups\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Groups\'])[1]/following::button[1]'))

assertEquals('Change Defaults', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Change Navigation Default Behavior\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=ChangeDefaultsSelectTriggerInput'))

assertEquals('Change \'To\' Page', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=concat(\'Change \', "\'", \'To\', "\'", \' Page\')])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=Change\'To\'PageSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultipPage_Response')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=EventSelectTriggerInput')

selenium.select('id=EventSelectTriggerInput', 'label=Save')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Redirect URL\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Redirect URL\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Redirect URL\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultipageResponse\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=NavConfigurator')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'NavConfigurator\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//ngb-modal-window[2]/div/div/div[2]/div/div/div/div/div/label'))

assertEquals('Configure Site NavigationConfigure Navigation MenuAdd Menu Item', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('Show Advanced Options', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=ShowAdvancedOptionsSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'NavConfigurator')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=ModeSelectTriggerInput')

selenium.select('id=ModeSelectTriggerInput', 'label=Configure Navigation Menu')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Menu Item Count\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'NavConfigurator\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=PasswordGenerator')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PasswordGenerator\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'PasswordGenerator')

selenium.type('id=descriptionInput', 'Description')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[15]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Description\'])[15]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PasswordGenerator\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=PdfBuilder')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PdfBuilder\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Document Size', selenium.getText('//div[2]/div/div/div/div/label'))

assertEquals('11x17A0A1A2A3A4A5A6A7A8A9A10Arch AArch BArch CArch DArch EB0B1B2B3B4B5B6B7B8B9B10ExecutiveHalf LetterISO 7810 ID-1ISO 7810 ID-2ISO 7810 ID-3LedgerLegalLetterNotePostcardSmall PaperbackTabloidImage Size', 
    selenium.getText('id=DocumentSizeSelectInput'))

assertEquals('The size of the generated output document', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Document Size\'])[1]/following::div[1]'))

assertEquals('Landscape', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The size of the generated output document\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=LandscapeSelectInput'))

assertEquals('Indicates if the output document should be created in landscape', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Landscape\'])[1]/following::div[1]'))

assertEquals('Preserve Form Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Indicates if the output document should be created in landscape\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=PreserveFormFieldsSelectInput'))

assertEquals('Preserve fillable form fields from source documents.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preserve Form Fields\'])[1]/following::div[1]'))

assertEquals('Number of files', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preserve fillable form fields from source documents.\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Number of files\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Number of files\'])[1]/following::button[1]'))

assertEquals('The number of input files to be combined.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Number of files\'])[1]/following::div[4]'))

assertEquals('File 1', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The number of input files to be combined.\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::button[1]'))

assertEquals('An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::div[4]'))

assertEquals('File 2', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::button[1]'))

assertEquals('An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::div[4]'))

assertEquals('Stop on Error', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'An input file. Supported formats are: pdf, tif, gif, bmp, png, and jpg\'])[2]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=StoponErrorSelectInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'PdfBuilder')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::input[1]')

