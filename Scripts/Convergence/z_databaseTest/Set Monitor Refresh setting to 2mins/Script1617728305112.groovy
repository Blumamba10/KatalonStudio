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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

if (GlobalVariable.dbType == 'SQL') {
    CustomKeywords.'dbConnection.DB.connectSQL'('localhost', '1433', GlobalVariable.dbName, 'sa', '#749Bloomdale')

    CustomKeywords.'dbConnection.DB.execute'('  SET IDENTITY_INSERT tdes_project ON')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedHistoryCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedSubmittedCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedHoldCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedErrorCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.closeDatabaseConnection'()
}

if (GlobalVariable.dbType == 'MYSQL') {
    CustomKeywords.'dbConnection.DB.connectMYSQL'('localhost', '3306', GlobalVariable.dbName, 'root', '#749Bloomdale')

    CustomKeywords.'dbConnection.DB.execute'('SET SQL_SAFE_UPDATES=0;')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedHistoryCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedSubmittedCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedHoldCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.execute'('Update tdes_setting set value = 120000 where name = \'cachedErrorCountIntervalMillis\'')

    CustomKeywords.'dbConnection.DB.closeDatabaseConnection'()
}

