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

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 1\'])[1]/following::input[1]', 'File 1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File 2\'])[1]/following::input[1]', 'File 2')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop on Error\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PdfBuilder\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Query')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DB Query\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Datasource', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('id=datasourceSelect'))

selenium.click('//div[2]/div[2]/div/label')

assertEquals('SQL Statement', selenium.getText('//div[2]/div[2]/div/label'))

assertTrue(selenium.isElementPresent('//div[2]/div[2]/div/label'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)])[1]/following::label[1]'))

assertEquals('Stop the script with an error if:', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'F11\'])[1]/following::div[3]'))

assertTrue(selenium.isElementPresent('id=errorNoRows'))

assertEquals('No rows are returned from the query', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop the script with an error if:\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=errorMultipleRows'))

assertEquals('More than one row is returned from the query', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No rows are returned from the query\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Query')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=datasourceSelect')

selenium.select('id=datasourceSelect', 'label=configDataSource')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More than one row is returned from the query\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('id=errorNoRows')

selenium.click('id=errorMultipleRows')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More than one row is returned from the query\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Query JSON')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query JSON\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('JSON Data', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::i[1]'))

assertEquals('Query', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::label[1]'))

assertEquals('Has ValueValue Is EmptyValue Is ArrayValue Is ObjectGet ValueGet JSON DataGet Element ValuesGet Element ObjectsGet Element Count', 
    selenium.getText('id=queryOperationSelect'))

assertEquals('Location', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[3]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Location\'])[1]/following::div[6]'))

assertEquals('Hover over items to see options to add a new element or remove the current element. Click an item to edit it. “Root” is not editable.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::small[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'QueryJSON')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]', 'JSONData')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query JSON\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Query XML')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query XML\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('XML Data Source', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data Source\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data Source\'])[1]/following::button[1]'))

assertEquals('Query For', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data Source\'])[1]/following::label[1]'))

assertEquals('Has ValueValue Is EmptyGet ValueGet XML DataGet Element ValuesGet Element Count', selenium.getText('id=operationSelect'))

assertEquals('Select a mode for creating the query.', selenium.getText('//div[2]/div[2]/div/div/div/div/div/div'))

assertEquals('Builder', selenium.getText('//div/div/div/div/div/div[2]/label'))

assertEquals('XPath', selenium.getText('//div[3]/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/preceding::div[4]'))

assertEquals('Hover over items to see options to add a new element or remove the current element. Click an item to edit it. “Root” is not editable.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::small[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'QueryXML')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data Source\'])[1]/following::input[1]', 
    'XML_Data_Souirce')

selenium.click('id=operationSelect')

selenium.select('id=operationSelect', 'label=Get Value')

selenium.click('id=creationModeFile')

selenium.click('id=xPathInput')

selenium.type('id=xPathInput', 'XPath')

selenium.click('id=xPathNamespacesInput')

selenium.type('id=xPathNamespacesInput', 'Namespaces')

assertEquals('XPath', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(format: prefix1=sampleuri1;prefix2=sampleuri2)\'])[1]/preceding::label[1]'))

assertTrue(selenium.isElementPresent('id=xPathInput'))

assertEquals('Optional Namespaces (format: prefix1=sampleuri1;prefix2=sampleuri2)', selenium.getText('//div[3]/div/label'))

assertTrue(selenium.isElementPresent('id=xPathNamespacesInput'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(format: prefix1=sampleuri1;prefix2=sampleuri2)\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(format: prefix1=sampleuri1;prefix2=sampleuri2)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query XML\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=QueryUser')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'QueryUser\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Query Action', selenium.getText('//div/div/div/div/div/label'))

assertTrue('^Does this user exist[\\s\\S]Is this user enabled[\\s\\S]Does this user authenticate via LDAP[\\s\\S]Does this user have the following role[\\s\\S]Get User Key', 
    selenium.getText('id=QueryActionSelectTriggerInput'))

assertEquals('User Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query Action\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Query_User')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=QueryActionSelectTriggerInput')

selenium.select('id=QueryActionSelectTriggerInput', 'label=Is this user enabled?')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::input[1]', 'UserID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Id\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'QueryUser\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=ResultSetUtils')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ResultSetUtils\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Operation', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Intialize New ResultsRelease ResultsAdd Row To ResultGet The ResultsJoin Results', selenium.getText('id=OperationSelectTriggerInput'))

assertEquals('Result Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Initialize a new result with a unique name and define columns.\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Result Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Result Name\'])[1]/following::button[1]'))

assertEquals('Column Count', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unique result name handle.\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=ColumnCountTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'ResultsSetUtils')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=OperationSelectTriggerInput')

selenium.select('id=OperationSelectTriggerInput', 'label=Get The Results')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Result Name\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Result Name\'])[1]/following::input[1]', 'Result Name')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unique result name from init step (e.g. #{initResult.resultName})\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Unique result name from init step (e.g. #{initResult.resultName})\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ResultSetUtils\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Save File')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save File\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('File', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::button[1]'))

assertEquals('Base Directory', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base Directory\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base Directory\'])[1]/following::button[1]'))

assertEquals('Date-Based Sub-Directory Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base Directory\'])[1]/following::label[1]'))

assertEquals('YYYY\\MM\\DDYY\\MM\\DDYYYYMMDDYYMMDD', selenium.getText('id=dateFormat'))

assertEquals('File Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date-Based Sub-Directory Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::button[1]'))

assertEquals('Extension', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Save')

selenium.type('id=descriptionInput', 'File')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]', 'Desc')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base Directory\'])[1]/following::input[1]', 
    'Base')

selenium.click('id=dateFormat')

selenium.select('id=dateFormat', 'label=YY\\MM\\DD')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Name\'])[1]/following::input[1]', 'FileName')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::input[1]', '.txt')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Extension\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save File\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Save Point')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save Point\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Send Email')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Send Email\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Standard Options', selenium.getText('link=Standard Options'))

assertEquals('Mail Host', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From\'])[1]/preceding::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::button[1]'))

assertEquals('From', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From\'])[1]/following::button[1]'))

assertEquals('To', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'From\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::button[1]'))

assertEquals('CC', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::label[1]'))

assertEquals('Additional Options', selenium.getText('link=Additional Options'))

selenium.click('link=Additional Options')

assertEquals('Sender', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/preceding::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sender\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sender\'])[1]/following::button[1]'))

assertEquals('Reply To', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sender\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::button[1]'))

assertEquals('BCC', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::button[1]'))

assertEquals('User Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::button[1]'))

assertEquals('Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]'))

assertEquals('Port', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::button[1]'))

assertEquals('File Attachments', selenium.getText('link=File Attachments'))

selenium.click('link=File Attachments')

assertEquals('Include', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/preceding::strong[1]'))

assertEquals('File', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include\'])[1]/following::strong[1]'))

assertTrue(selenium.isElementPresent('id=File_Output..txtenableCheck'))

assertEquals('Form as HTML', selenium.getText('//div[3]/div/div/div/div[2]/div[2]/div[2]/label'))

assertTrue(selenium.isElementPresent('id=ConvertDocument.convertedenableCheck'))

assertEquals('ConvertDocument.converted', selenium.getText('//div[3]/div/div/div/div[2]/div[3]/div[2]/label'))

assertTrue(selenium.isElementPresent('id=Document_Fill.resultFileenableCheck'))

assertEquals('Document_Fill.resultFile', selenium.getText('//div[4]/div[2]/label'))

assertTrue(selenium.isElementPresent('link=Message Content'))

selenium.click('link=Message Content')

assertEquals('Subject', selenium.getText('//div[2]/div/div[4]/div/div/label'))

assertTrue(selenium.isEditable('id=subject'))

assertEquals('Content', selenium.getText('//ngb-modal-window/div/div/div[2]/div[2]/div/label'))

assertTrue(selenium.isElementPresent('//a/div'))

assertTrue(selenium.isElementPresent('//a[2]/div'))

assertTrue(selenium.isElementPresent('//a[3]/div'))

assertTrue(selenium.isElementPresent('//a[4]/div'))

assertTrue(selenium.isElementPresent('//a[5]/div'))

assertTrue(selenium.isElementPresent('//a[6]/div'))

assertTrue(selenium.isElementPresent('//div[2]/a/div'))

assertTrue(selenium.isElementPresent('//div[2]/a[2]/div'))

assertTrue(selenium.isElementPresent('//div[2]/a[3]/div'))

assertTrue(selenium.isElementPresent('//div[2]/a[4]/div'))

assertTrue(selenium.isElementPresent('//div[3]/a/div'))

assertTrue(selenium.isElementPresent('//div[3]/a[2]/div'))

assertTrue(selenium.isElementPresent('//div[3]/a[3]/div'))

assertTrue(selenium.isElementPresent('link=Remove Formatting'))

assertTrue(selenium.isElementPresent('//div[5]/a/div'))

assertTrue(selenium.isElementPresent('link=Code'))

assertTrue(selenium.isElementPresent('link=Insert a Quote'))

assertTrue(selenium.isElementPresent('link=Insert a link'))

assertTrue(selenium.isElementPresent('//div[7]/a[3]/div'))

assertTrue(selenium.isElementPresent('//div[8]/a/div'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View source\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Send_Email')

selenium.type('id=descriptionInput', 'Description')

selenium.click('link=Standard Options')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mail Host\'])[1]/following::input[1]', 'Mail Host')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'To\'])[1]/following::input[1]', 'To')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CC\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CC\'])[1]/following::input[1]', 'Copy')

selenium.click('link=Additional Options')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sender\'])[1]/following::input[1]', 'Sender')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Reply To\'])[1]/following::input[1]', 'ReplyTo')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'BCC\'])[1]/following::input[1]', 'BCC')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Name\'])[1]/following::input[1]', 'UserName')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::input[1]', 'Password')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::input[1]', 'Port')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Send Email\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Set Variable')

assertEquals('Name', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::button[1]'))

assertEquals('Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('id=isFileVariable'))

assertEquals('File Variable', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=multiline'))

assertEquals('Multi-Line', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Variable\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=advanced'))

assertEquals('Allow Nested Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multi-Line\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multi-Line\'])[1]/following::i[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::input[1]', 'Variable')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::input[1]', 'Value')

selenium.click('id=isFileVariable')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Variable\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File Variable\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Set Variable\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Stored Procedure')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stored Procedure\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Datasource', selenium.getText('//div[2]/div/div/label'))

selenium.type('id=nameInput', 'StoredProcedure')

selenium.type('id=descriptionInput', 'Description')

selenium.select('id=datasourceSelect', 'label=configDataSource')

selenium.click('id=catalogSelect')

selenium.select('id=catalogSelect', 'label=_DoNotDelete')

selenium.select('id=storedProcedureSelect', 'label=sp_MSadd_publication')

assertEquals('@publisher', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stored Procedure\'])[3]/following::label[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'@allow_initialize_from_backup\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Set Variable\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Stored Procedure with Results')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stored Procedure with Result\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Datasource', selenium.getText('//div[2]/div/div/label'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stored Procedure with Result\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Datasource', selenium.getText('//div[2]/div/div/label'))

selenium.type('id=nameInput', 'Name')

selenium.type('id=descriptionInput', 'Description')

selenium.select('id=datasourceSelect', 'label=configDataSource')

selenium.select('id=catalogSelect', 'label=_DoNotDelete')

selenium.select('id=storedProcedureSelect', 'label=sp_MSadd_publication')

assertEquals('@publisher', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stored Procedure\'])[2]/following::label[1]'))

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'@publisher\'])[1]/following::input[1]', 'publisher')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'@allow_initialize_from_backup\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Set Variable\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=StringUtils')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'StringUtils\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Operation', selenium.getText('//div/div/div/div/div/label'))

assertEquals('ContainsCountMatchesDisplayCaseEndsWithIndexOfJoinLastIndexOfLengthLowercasePaddingRemoveReplaceSplitStartsWithSubStringBeforeSubStringAfterSubStringTrimUppercase', 
    selenium.getText('id=OperationSelectTriggerInput'))

assertEquals('Input Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'<CR>\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Input Value\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Input Value\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Input Value\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search Value\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search Value\'])[1]/following::button[1]'))

assertEquals('Ignore Case', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Search Value\'])[1]/following::label[1]'))

assertEquals('NOYES', selenium.getText('id=IgnoreCaseSelectInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'StringUtils')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=OperationSelectTriggerInput')

selenium.select('id=OperationSelectTriggerInput', 'label=Join')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delimeter\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delimeter\'])[1]/following::input[1]', 'Delimeter')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 1\'])[1]/following::input[1]', 'value 1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value 2\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'StringUtils\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Transform XML')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Transform XML\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('XML Data', selenium.getText('//ngb-modal-window/div/div/div[2]/div/div'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::button[1]'))

assertEquals('XSLT Data', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XSLT Data\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XSLT Data\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Transform_XML')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XML Data\'])[1]/following::input[1]', 'XML')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XSLT Data\'])[1]/following::input[1]', 'XSLT')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XSLT Data\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Transform XML\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Update')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DB Update\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Datasource', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('id=datasourceSelect'))

assertEquals('SQL Statement', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Datasource\'])[1]/following::label[1]'))

assertEquals('Variables', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SQL Statement\'])[1]/following::div[9]'))

assertEquals('Stop the script with an error if:', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'(11)\'])[1]/following::h6[1]'))

assertTrue(selenium.isElementPresent('id=errorNoRowsCheck'))

assertEquals('No rows are affected by the update', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stop the script with an error if:\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=errorOneRowCheck'))

assertEquals('Only one row is affected by the update', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No rows are affected by the update\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=errorMultipleRowsCheck'))

assertEquals('More than one row is affected by the update', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Only one row is affected by the update\'])[1]/following::label[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Update')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=datasourceSelect')

selenium.select('id=datasourceSelect', 'label=configDataSource')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More than one row is affected by the update\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'More than one row is affected by the update\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=Update JSON')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('JSON Data', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::button[1]'))

assertEquals('Operation', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::label[1]'))

assertEquals('Add PropertyUpdate Property NameUpdate Property ValueAdd ElementAdd Element AfterAdd Element BeforeUpdate ElementDelete', 
    selenium.getText('id=updateOperationSelect'))

assertEquals('Location (Must be a JSON object or object property with value of JSON object)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Operation\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Operation\'])[1]/following::span[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::i[1]'))

assertEquals('Hover over items to see options to add a new element or remove the current element. Click an item to edit it. “Root” is not editable.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::small[1]'))

assertEquals('New Property Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Property Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Property Name\'])[1]/following::button[1]'))

assertEquals('New Property Value Configuration', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Property Name\'])[1]/following::label[1]'))

assertEquals('Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Property Value Configuration\'])[1]/following::label[1]'))

assertEquals('StringNumberBooleanJSON Data', selenium.getText('id=updatePropertyValueTypeSelect'))

assertEquals('Value', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Type\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::button[1]'))

assertEquals('When Value is Empty...', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Value\'])[1]/following::label[1]'))

assertEquals('ExcludeUse "null"Use Empty', selenium.getText('id=updateValueEmptyMode'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'Update_JSON')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JSON Data\'])[1]/following::input[1]', 'JSON Data')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Property Name\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root\'])[1]/following::label[1]', 'New Property Name')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'New Property Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'When Value is Empty...\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=UpdateForm')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UpdateForm\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Template', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Template\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=TemplateSelectTriggerInput'))

assertEquals('Action', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Action\'])[1]/following::label[1]'))

assertEquals('CreateUpdate', selenium.getText('id=ActionSelectTriggerInput'))

assertEquals('Associate Image', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Action\'])[2]/following::label[1]'))

assertEquals('NoYes', selenium.getText('id=AssociateImageSelectTriggerInput'))

assertEquals('Save Method', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Associate Image\'])[1]/following::label[1]'))

assertEquals('SavePublish', selenium.getText('id=SaveMethodSelectTriggerInput'))

assertEquals('Web Form Style', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Style\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=WebFormStyleSelectTriggerInput'))

assertEquals('Attribute Count', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Attributes\'])[1]/following::label[1]'))

selenium.type('id=nameInput', 'Update Form')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=UrlUtilAction')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UrlUtilAction\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Build SWAT URLBuild SWAT URL w/Token', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('Web Platform Based URL', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::button[1]'))

selenium.type('id=nameInput', 'UrlUttil')

selenium.click('id=descriptionInput')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::input[1]', 
    'Web Platform')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::button[3]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'UrlUtilAction\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Platform Based URL\'])[1]/following::button[3]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update JSON\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=WebAuthRequest')

assertEquals('Name', selenium.getText('//app-name-description-entry/div/div/div/label'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Method', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Get Authorization ModeGet User IdGet User PasswordGet User Attribute', selenium.getText('id=MethodSelectTriggerInput'))

selenium.type('id=nameInput', 'WebAuthRequest')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=MethodSelectTriggerInput')

selenium.select('id=MethodSelectTriggerInput', 'label=Get User Password')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebAuthRequest\'])[2]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebAuthRequest\'])[2]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebAuthRequest\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=WebAuthResponse')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebAuthResponse\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Success', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::button[1]'))

assertEquals('Failure Reason', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Success\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::button[1]'))

assertEquals('Roles', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::button[1]'))

assertEquals('User Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::button[1]'))

selenium.type('id=nameInput', 'WebAuthRespose')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Failure Reason\'])[1]/following::input[1]', 
    'Failure Reason')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Roles\'])[1]/following::input[1]', 'Roles')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Description\'])[1]/following::input[1]', 
    'User')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'If the auth was successful, an optional description of the user (usually a name).\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebAuthResponse\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=WebInit')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebInit\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Mode', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'not\'])[1]/following::label[1]'))

assertEquals('Configure Web View SecurityConfigure Convergence Web Form StylesConfigure General SettingsConfigure Administration Console SettingsConfigure NTLMConfigure SAMLConfigure Token AuthenticationConfigure OAuth Authentication', 
    selenium.getText('id=ModeSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'WebInit')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=ModeSelectTriggerInput')

selenium.select('id=ModeSelectTriggerInput', 'label=Configure NTLM')

assertEquals('NTLM Enabled', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'NTLM\'])[1]/following::label[1]'))

assertEquals('truefalse', selenium.getText('id=NTLMEnabledSelectTriggerInput'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'NTLM Enabled\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'NTLM Enabled\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebInit\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=WebRequest')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebRequest\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('//app-name-description-entry/div/div[2]/div/label'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Request Part', selenium.getText('//div/div/div/div/div/label'))

assertEquals('^Get ActionGet User IdGet User DescriptionGet ValueGet ValuesHas Role[\\s\\S]Body is File[\\s\\S]Get BodyGet PathGet Header ValueGet Header ValuesGet MethodGet Request Values', 
    selenium.getText('id=RequestPartSelectTriggerInput'))

selenium.type('id=nameInput', 'WebRequest')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Request Part\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebRequest\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=WebResponse')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebResponse\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Response Type', selenium.getText('//div[2]/div/div/div/div/label'))

assertEquals('FormMultipage FormRedirectTextJSONXMLFile', selenium.getText('id=ResponseTypeSelectTriggerInput'))

assertEquals('Existing Form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Response Type\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=ExistingFormSelectTriggerInput'))

assertTrue(selenium.isElementPresent('id=FormTemplateSelectTriggerInput'))

assertEquals('Use Default Style', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Style\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=UseDefaultStyleSelectTriggerInput'))

assertEquals('Read Only', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Access\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=ReadOnlySelectTriggerInput'))

assertEquals('Read Only Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Fields\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Fields\'])[1]/following::button[1]'))

assertEquals('Read Only Groups', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Fields\'])[1]/following::label[1]'))

assertEquals('Editable Fields', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Read Only Groups\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Fields\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Fields\'])[1]/following::button[1]'))

assertEquals('Editable Groups', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Fields\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Groups\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Editable Groups\'])[1]/following::button[1]'))

assertEquals('Form Buttons', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Misc\'])[1]/following::label[1]'))

assertEquals('SavePublishSave or Publish', selenium.getText('id=FormButtonsSelectInput'))

assertEquals('Allow Republish', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Buttons\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=AllowRepublishSelectInput'))

assertEquals('Set Field Values', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Fields\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=SetFieldValuesSelectTriggerInput'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebInit\'])[2]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=WebSession')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'WebSession\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=descriptionInput'))

assertEquals('Method', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Get ValueSet Value', selenium.getText('id=MethodSelectTriggerInput'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Method\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::button[1]'))

selenium.type('id=nameInput', 'WebSession')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::input[1]', 'Name')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[2]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'AuthUser\'])[2]/following::i[1]')

selenium.click('link=Disable Action')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Error\'])[2]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ManageRoles\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Query\'])[1]/following::i[1]')

selenium.click('link=Copy')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'QueryUser\'])[1]/following::i[1]')

selenium.click('link=Paste Action Before')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Send Email\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export XML\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Stored Procedure\'])[1]/following::div[4]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=CSVImport')

assertEquals('CSVImport', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CSVImport\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('File', selenium.getText('//div[2]/div/div/div/div/label'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::button[1]'))

assertEquals('Delimiter', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delimiter\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delimiter\'])[1]/following::button[1]'))

assertEquals('Quote Character', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Delimiter\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Quote Character\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Quote Character\'])[1]/following::button[1]'))

assertEquals('End of Line Symbols', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Quote Character\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'End of Line Symbols\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'End of Line Symbols\'])[1]/following::button[1]'))

assertEquals('First Row Contains Column Headers', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'End of Line Symbols\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=FirstRowContainsColumnHeadersSelectTriggerInput'))

assertEquals('Index After Header', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'First Row Contains Column Headers\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Index After Header\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Index After Header\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'CSVImport')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]', 'File')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Index After Header\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=DateUtils')

assertEquals('DateUtils', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DateUtils\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Date PeriodDate Values', selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('It accepts a date string and returns the begin and end date for a period.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::div[1]'))

assertEquals('Date', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'It accepts a date string and returns the begin and end date for a period.\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date\'])[1]/following::i[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'DateUtils')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=DMS Index')

assertEquals('DMS Index', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DMS Index\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('File', selenium.getText('//div[2]/div/div/label'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::button[1]'))

assertEquals('Created by', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::button[1]'))

assertEquals('Document type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::label[1]'))

assertEquals('Script Document', selenium.getText('id=dmsIndexDocumentType'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'DMSIndex')

selenium.type('id=descriptionInput', 'Description')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'File\'])[2]/following::input[1]', 'file')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Created by\'])[1]/following::input[1]', 'me')

selenium.click('id=dmsIndexDocumentType')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DMS Index\'])[3]/following::div[1]')

selenium.click('id=dmsIndexDocumentType')

selenium.select('id=dmsIndexDocumentType', 'label=Script Document')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Index\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Index\'])[1]/following::input[1]', 'Value')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Index\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=DmsSearch')

assertEquals('DmsSearch', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DmsSearch\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Document Type', selenium.getText('//div/div/div/div/div/label'))

selenium.select('//select', 'label=Script Document')

assertEquals('ApplicationCorrespondanceCorrespondence TemplatesDemo TemplatesInvoiceRenewalResumeScript DocumentSurvey', 
    selenium.getText('//select'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'DmsSearch')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=DocumentTypeSelectTriggerInput')

selenium.select('id=DocumentTypeSelectTriggerInput', 'label=Script Document')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'- Script Index Comparison\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'- Script Index Comparison\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=HL7MessageBuilder')

assertEquals('HL7MessageBuilder', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7MessageBuilder\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('HL7 Version', selenium.getText('//div/div/div/div/div/label'))

assertEquals('2.12.22.32.3.12.42.52.5.12.6', selenium.getText('id=HL7VersionSelectTriggerInput'))

assertEquals('HL7 version supported', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 Version\'])[1]/following::div[1]'))

assertEquals('Mode', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 version supported\'])[1]/following::label[1]'))

assertEquals('Build HL7 MessageAdd Non-standard HL7 SegmentAdd Custom Z SegmentInsert Repeating HL7 SegmentInsert Repeating HL7 FieldClose HL7 Message', 
    selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('HL7 Message Type', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertEquals('ADR_A19ADT_A01ADT_A02ADT_A03ADT_A05ADT_A06ADT_A09ADT_A12ADT_A15ADT_A16ADT_A17ADT_A18ADT_A20ADT_A21ADT_A24ADT_A30ADT_A37ADT_A38ADT_A39ADT_A43ADT_A45ADT_A50ADT_A52ADT_A54ADT_A60ADT_A61ADT_AXXBAR_P01BAR_P02BAR_P05BAR_P06BAR_P10BAR_P12BPS_O29BRT_O32BTS_O31CRM_C01CSU_C09DFT_P03DFT_P11DOC_T12DSR_Q01DSR_Q03EAC_U07EAN_U09EAR_U08EHC_E01EHC_E02EHC_E04EHC_E10EHC_E12EHC_E13EHC_E15EHC_E20EHC_E21EHC_E24ESR_U02ESU_U01INR_U06INU_U05LSU_U12MDM_T01MDM_T02MFK_M01MFN_M01MFN_M02MFN_M03MFN_M04MFN_M05MFN_M06MFN_M07MFN_M08MFN_M09MFN_M10MFN_M11MFN_M12MFN_M13MFN_M15MFN_M16MFN_M17MFN_ZnnMFQ_M01MFR_M01MFR_M04MFR_M05MFR_M06MFR_M07NMD_N02NMQ_N01NMR_N01OMB_O27OMD_O03OMG_O19OMI_O23OML_O21OML_O33OML_O35OMN_O07OMP_O09OMS_O05OPL_O37OPR_O38OPU_R25ORB_O28ORD_O04ORF_R04ORG_O20ORI_O24ORL_O22ORL_O34ORL_O36ORM_O01ORN_O08ORP_O10ORR_O02ORS_O06ORU_R01ORU_R30OSQ_Q06OSR_Q06OUL_R21OUL_R22OUL_R23OUL_R24PEX_P07PGL_PC6PMU_B01PMU_B03PMU_B04PMU_B07PMU_B08PPG_PCGPPP_PCBPPR_PC1PPT_PCLPPV_PCAPRR_PC5PTR_PCFQBP_E03QBP_E22QBP_Q11QBP_Q13QBP_Q15QBP_Q21QBP_QnnQBP_Z73QCK_Q02QCN_J01QRY_A19QRY_PC4QRY_Q01QRY_Q02QRY_R02QRY_T12QSB_Q16QVR_Q17RAR_RARRAS_O17RCI_I05RCL_I06RDE_O11RDR_RDRRDS_O13RDY_K15REF_I12RER_RERRGR_RGRRGV_O15ROR_RORRPA_I08RPI_I01RPI_I04RPL_I02RPR_I03RQA_I08RQC_I05RQI_I01RQP_I04RRA_O18RRD_O14RRE_O12RRG_O16RRI_I12RSP_E03RSP_E22RSP_K11RSP_K21RSP_K23RSP_K25RSP_K31RSP_Q11RSP_Z82RSP_Z86RSP_Z88RSP_Z90RTB_K13RTB_Z74SDR_S31SDR_S32SIU_S12SLR_S28SQM_S25SQR_S25SRM_S01SRR_S01SSR_U04SSU_U03STC_S33SUR_P09TCU_U10UDM_Q05VXQ_V01VXR_V03VXU_V04VXX_V02', 
    selenium.getText('id=HL7MessageTypeSelectTriggerInput'))

assertEquals('HL7 message type to write', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 Message Type\'])[1]/following::div[1]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'HL7MessageBuilder')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=HL7MessageTypeSelectTriggerInput')

selenium.select('id=HL7MessageTypeSelectTriggerInput', 'label=ADT_A12')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 Message Type\'])[1]/following::option[8]')

assertEquals('Segment - MSH', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 message type to write\'])[1]/following::h5[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include optional DG1 segment?\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include optional DG1 segment?\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=HL7MessageSender')

assertEquals('HL7MessageSender', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7MessageSender\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Raw HL7 Message', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Raw HL7 Message\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Raw HL7 Message\'])[1]/following::i[1]'))

assertEquals('Error On Negative HL7 Acknowledgment', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Raw HL7 Message\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=UseExistingConnectionSelectTriggerInput'))

assertEquals('Overwrite Outbound Host/Port', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Use Existing Connection\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=OverwriteOutboundHost/PortSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'HL7MessageSender')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Raw HL7 Message\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Overwrite Outbound Host/Port\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Overwrite Outbound Host/Port\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=HL7Util')

assertEquals('HL7Util', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7Util\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7Util\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('HL7 Version', selenium.getText('//div/div/div/div/div/label'))

assertEquals('2.12.22.32.3.12.42.52.5.12.6', selenium.getText('id=HL7VersionSelectTriggerInput'))

assertEquals('HL7 version supported', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 Version\'])[1]/following::div[1]'))

assertEquals('Mode', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 version supported\'])[1]/following::label[1]'))

assertEquals('Get Current Time As HL7 TimestampGet Date As HL7 TimestampGet HL7 Timestamp As DateGet HL7 Timestamp As DateTime', 
    selenium.getText('id=ModeSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'HL7Util')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=ModeSelectTriggerInput')

selenium.select('id=ModeSelectTriggerInput', 'label=Get Date As HL7 Timestamp')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::option[2]')

assertEquals('Date to convert', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::i[1]'))

assertEquals('Date formats accepted: "MM/dd/yyyy\'T\'HH:mm:ssZZ", "MM/dd/yyyy\'T\'HH:mm:ss", "MM/dd/yyyy", "yyyy-MM-dd\'T\'HH:mm:ssZZ", "yyyy-MM-dd\'T\'HH:mm:ss", "yyyy-MM-dd"', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::div[4]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::input[1]', 
    'MM/dd/yyyy')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Date to convert\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultiPageCreate')

assertEquals('MultiPageCreate', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageCreate\'])[4]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

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

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[1]'))

assertEquals('Not required. Name for all pages of this multi-page form/application - can be used in SWAT publish scripts', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultipageCreate')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=TemplateSelectInput')

selenium.select('id=TemplateSelectInput', 'label=New Template')

selenium.click('id=WebFormStyleSelectTriggerInput')

selenium.select('id=WebFormStyleSelectTriggerInput', 'label=Default')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Form Style\'])[1]/following::option[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Multipage Form Name\'])[1]/following::button[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultiPageGetFormId')

assertEquals('MultiPageGetFormId', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageGetFormId\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Page Map Mode', selenium.getText('//div/div/div/div/div/label'))

assertEquals('Pass in the page mapLoad map from formPull map from current form', selenium.getText('id=PageMapModeSelectTriggerInput'))

assertEquals('Page Map', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map Mode\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::button[1]'))

assertEquals('This value should be set with the paramMap value returned from the MuliPageCreate action', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::div[4]'))

assertEquals('Page Index', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'This value should be set with the paramMap value returned from the MuliPageCreate action\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::i[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::button[1]'))

assertEquals('The 1-based index of the page form id to return', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Index\'])[1]/following::div[4]'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultiPageGetFormId')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Map\'])[1]/following::input[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The 1-based index of the page form id to return\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The 1-based index of the page form id to return\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=MultiPageMerge')

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MultiPageMerge\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Template', selenium.getText('//div/div/div/div/div/label'))

assertTrue(selenium.isElementPresent('id=TemplateSelectTriggerInput'))

assertEquals('Web Form Style', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The template for the final merged form (not an individual page template)\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=WebFormStyleSelectTriggerInput'))

assertEquals('The web form style to apply to the final merged form', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Web Form Style\'])[1]/following::div[1]'))

assertEquals('Page Form Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The web form style to apply to the final merged form\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::button[1]'))

assertEquals('The form id of any page of the multipage form (the rest of the ids are automatically inferred)', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::div[4]'))

assertEquals('Save Method', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The form id of any page of the multipage form (the rest of the ids are automatically inferred)\'])[1]/following::label[1]'))

assertEquals('SavePublish', selenium.getText('id=SaveMethodSelectTriggerInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'MultiPageMerge')

selenium.type('id=descriptionInput', 'Description')

selenium.click('id=TemplateSelectTriggerInput')

selenium.select('id=TemplateSelectTriggerInput', 'label=New Template')

selenium.click('id=WebFormStyleSelectTriggerInput')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Page Form Id\'])[1]/following::input[1]', 'PageFormID')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Save Method\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Call Script\'])[1]/following::i[1]')

selenium.click('link=Insert New Action After')

selenium.click('link=RemoveServerObject')

assertEquals('RemoveServerObject', selenium.getText('//ngb-modal-window/div/div/div/h4'))

assertEquals('Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'RemoveServerObject\'])[2]/following::label[1]'))

assertTrue(selenium.isEditable('id=nameInput'))

assertEquals('Description', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Name\'])[3]/following::label[1]'))

assertTrue(selenium.isEditable('id=descriptionInput'))

assertEquals('Object Type', selenium.getText('//div/div/div/div/div/label'))

assertEquals('FormDocumentMedia', selenium.getText('id=ObjectTypeSelectTriggerInput'))

assertEquals('Form Id', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Object Type\'])[1]/following::label[1]'))

assertTrue(selenium.isEditable('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::i[1]'))

assertEquals('Remove Media', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=RemoveMediaSelectInput'))

assertEquals('This will remove the media associated with the specified form or document, if present.', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Remove Media\'])[1]/following::div[1]'))

assertEquals('Fail if Object not found', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'This will remove the media associated with the specified form or document, if present.\'])[1]/following::label[1]'))

assertEquals('YesNo', selenium.getText('id=FailifObjectnotfoundSelectInput'))

selenium.click('id=nameInput')

selenium.type('id=nameInput', 'RemoveServerObject')

selenium.type('id=descriptionInput', 'Description')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]')

selenium.type('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Form Id\'])[1]/following::input[1]', 'FormId')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Fail if Object not found\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Verify Script\'])[1]/preceding::button[1]')

selenium.close()

