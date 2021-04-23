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

CustomKeywords.'sqlConnection.blog.connectDB'('localhost', '1433', GlobalVariable.dbName, 'sa', '#749Bloomdale')

CustomKeywords.'sqlConnection.blog.execute'('  SET IDENTITY_INSERT tdes_project ON')

CustomKeywords.'sqlConnection.blog.executeQuery'('select value from tdes_setting where id = 1')

CustomKeywords.'sqlConnection.blog.execute'('Update tdes_setting set value = 120000 where name = \'cachedHistoryCountIntervalMillis\'')

CustomKeywords.'sqlConnection.blog.execute'('Update tdes_setting set value = 120000 where name = \'cachedSubmittedCountIntervalMillis\'')

CustomKeywords.'sqlConnection.blog.execute'('Update tdes_setting set value = 120000 where name = \'cachedHoldCountIntervalMillis\'')

CustomKeywords.'sqlConnection.blog.execute'('Update tdes_setting set value = 120000 where name = \'cachedErrorCountIntervalMillis\'')

CustomKeywords.'sqlConnection.blog.closeDatabaseConnection'()

