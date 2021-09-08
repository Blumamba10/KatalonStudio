package dbConnection

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.sql.ResultSet
import java.sql.Statement
import java.sql.*
import java.sql.DriverManager
import internal.GlobalVariable


public class Udemy {

	@Keyword
	public connection(String url, String user, String password, String driverClassName){

		def sqlConnection = Sql.newInstance(url, user, password, driverClassName)

		sqlConnection.eachRow("Show tables") { row ->
			println row[0]
		}
	}

	@Keyword
	public createTable(String url, String user, String password, String driverClassName){

		def sqlConnection = Sql.newInstance(url, user, password, driverClassName)

		def creatSQLQuery = """Create Table PersonDdetails(
			firstname varchar(50), LastName varchar(90)"""

		sqlConnection.eachRow("Describe personDetail") { row ->
			println "Column " + row[0] + "Type of Column " + row[1]
		}
		sqlConnection.eachRow("Show tables") { row ->
			println row[0]
		}
	}
}
