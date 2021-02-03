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

WebUI.callTestCase(findTestCase('ClearView/Login'), [:], FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.click('link=Financial')

selenium.click('link=Batch Posting')

selenium.click('link=Posted Batches')

selenium.click('//button[@type=\'button\']')

selenium.click('//div[@id=\'ff-batchDetailsDisplay-4-postDate\']/a[2]/i')

assertEquals('Post Date Help', selenium.getText('id=ui-id-5'))

assertEquals('This is the date your payments/adjustments will be applied and used as the post date on reports.', selenium.getText(
        'id=lbl-help-instructions'))

selenium.click('//div[13]/div[3]/div/button/span')

selenium.click('xpath=(//button[@type=\'button\'])[2]')

selenium.type('id=fc-editDialog-patientSelect-search-lastName', 'Agassi')

selenium.type('id=fc-editDialog-patientSelect-search-firstName', 'Antoine')

selenium.click('xpath=(//button[@type=\'button\'])[16]')

selenium.click('link=00000802')

selenium.click('id=fc-editDialog-form-transactionType')

selenium.select('id=fc-editDialog-form-transactionType', 'label=Payment - Self Pay')

WebUI.click(findTestObject('ClearView/PFS Post Batch/Page_Post Batch/select_Description'))

WebUI.selectOptionByValue(findTestObject('ClearView/PFS Post Batch/Page_Post Batch/select_Description'), 'Check', false)

