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

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Diagnostics'))

assertEquals('Diagnostics', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertEquals('Server Version', selenium.getText('link=Server Version'))

assertEquals('Classpath', selenium.getText('link=Classpath'))

assertEquals('JVM', selenium.getText('link=JVM'))

assertEquals('Config', selenium.getText('link=Config'))

assertEquals('System Properties', selenium.getText('link=System Properties'))

assertEquals('Application Libraries', selenium.getText('link=Application Libraries'))

assertEquals('Tomcat Libraries', selenium.getText('link=Tomcat Libraries'))

selenium.click('link=Server Version')

assertEquals('Server', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server Version\'])[1]/following::strong[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server\'])[2]/following::td[1]'))

assertEquals('Build', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server\'])[2]/following::strong[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build\'])[1]/following::td[1]'))

assertEquals('Server Up Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build\'])[1]/following::strong[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server Up Time\'])[1]/following::td[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Classpath\'])[1]/i[1]')

WebUI.verifyElementPresent(findTestObject('Convergence/Server/Diagnostics_Page/h4_Apache Tomcat9.0.35'), 0)

selenium.click('link=JVM')

assertEquals('JVM', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM\'])[2]/following::pre[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Version\'])[1]/following::pre[1]'))

assertEquals('JVM Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Version\'])[1]/following::td[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Name\'])[1]/following::pre[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Java Version\'])[1]/following::pre[1]'))

assertEquals('Server OS', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Java Version\'])[1]/following::td[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server OS\'])[1]/following::pre[1]'))

assertEquals('Memory (free / total)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Windows 10\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Memory (free / total)\'])[1]/following::pre[1]'))

assertEquals('Non-heap Memory (free / total)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Memory (free / total)\'])[1]/following::td[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Non-heap Memory (free / total)\'])[1]/following::pre[1]'))

assertEquals('PermGen Memory (free / total)', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Non-heap Memory (free / total)\'])[1]/following::td[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PermGen Memory (free / total)\'])[1]/following::pre[1]'))

assertEquals('JVM Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'PermGen Memory (free / total)\'])[1]/following::td[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Time\'])[1]/following::pre[1]'))

assertEquals('JVM Start Time', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Time\'])[1]/following::td[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Start Time\'])[1]/following::pre[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'JVM Up Time\'])[1]/following::pre[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Config\'])[1]/i[1]')

assertEquals('Export Server Configuration...', selenium.getText('link=Export Server Configuration...'))

assertEquals('Export Security Configuration...', selenium.getText('link=Export Security Configuration...'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'System Properties\'])[1]/i[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vendor\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'org.apache.xml.security.ignoreLineBreaks\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'catalina.base\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.management.compiler\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'catalina.useNaming\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'os.name\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.specification.vendor\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.runtime.version\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.util.logging.manager\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'user.timezone\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.arch.data.model\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.cpu.isalist\'])[1]/following::td[1]'))

assertEquals('sun.jnu.encoding', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'amd64\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.jnu.encoding\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'package.access\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'file.separator\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.specification.name\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.class.version\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'org.owasp.esapi.SecurityConfiguration\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'user.country\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.home\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.info\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'os.version\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'path.separator\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.version\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'user.variant\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.io.unicode.encoding\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'package.definition\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'user.script\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'tomcat.util.scan.StandardJarScanFilter.jarsToSkip\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.library.path\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vendor.url\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.vendor\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'common.loader\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.runtime.name\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.class.path\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.specification.name\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.specification.version\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'catalina.home\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.cpu.endian\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'sun.os.patch.level\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.io.tmpdir\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vendor.url.bug\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'server.loader\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'os.arch\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'user.dir\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'line.separator\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.vm.name\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'ignore.endorsed.dirs\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'file.encoding\'])[1]/following::td[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Application Libraries\'])[1]/i[1]')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'java.specification.version\'])[1]/following::td[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Application Libraries\'])[1]/following::pre[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Tomcat Libraries\'])[1]/i[1]')

