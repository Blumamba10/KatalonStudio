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

WebUI.click(findTestObject('Convergence/_NavigationLinks/Administration Console/a_Authentication'))

assertEquals('Authentication Methods', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::i[1]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Internal Database\'])[1]/following::h1[1]'))

assertEquals('Convergence supports a variety of authentication methods. These can be configured from this page.', selenium.getText(
        'xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

WebUI.click(findTestObject('Convergence/Security/Authentication_Page/h1_Help'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Authentication Methods\'])[1]/following::div[3]')

assertEquals('Directory Server', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Build:\'])[1]/following::h1[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Directory Server\'])[1]/following::i[2]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Directory Server\'])[1]/following::i[2]')

assertEquals('Convergence can authenticate users using an external LDAP-compatible directory server, such as Active Directory. Users will first be authenticated against the directory server, and if they exist, will then be looked up in Convergence for their roles.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Directory Server\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Users must be added manually to gain access to Convergence.\'])[1]/following::div[4]')

assertTrue(selenium.isElementPresent('id=authWithLdapCheck'))

assertEquals('Enabled', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Directory Server\'])[1]/following::label[1]'))

selenium.click('id=authWithLdapCheck')

assertEquals('Configuration Parameters', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::h4[1]'))

assertEquals('Server Name', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Configuration Parameters\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=serverNameInput'))

assertTrue(selenium.isElementPresent('name=useSSL'))

assertEquals('SSL', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Server Name\'])[1]/following::label[1]'))

assertEquals('Port', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SSL\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=portInput'))

assertEquals('Root DN', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Port\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=rootDNInput'))

assertEquals('User Prefix', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Root DN\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=userIdPrefixInput'))

assertEquals('User Suffix', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'User Prefix\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=userIdSuffixInput'))

assertTrue(selenium.isElementPresent('id=testConnectionButton'))

assertEquals('Auto Create Users', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Test Connection\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('id=createUsersAsNeededTrue'))

assertEquals('Automatically create accounts with the DE_USER role for users who authenticate successfully against the directory server and do not currently have a Convergence user account.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Auto Create Users\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Users must be added manually to gain access to Convergence.\'])[1]/input[1]'))

assertEquals('Users must be added manually to gain access to Convergence.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Auto Create Users\'])[1]/following::label[2]'))

selenium.click('id=authWithLdapCheck')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Directory Server\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SAML\'])[1]/following::p[1]')

selenium.click('id=samlEnabledCheck')

assertEquals('Service Provider', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Enabled\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('link=Export Metadata'))

assertEquals('Base URL', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Export Metadata\'])[1]/following::h5[1]'))

assertEquals('URL to Convergence as seen by the end-user\'s browser (e.g. https://app-server/tdes). If the server is behind a reverse proxy or load balancer, the address of the reverse proxy or load-balancer should be entered. The browser will POST back to this URL to send SAML responses (assertions).', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base URL\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=baseUrlInput'))

assertEquals('Key Store Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Base URL\'])[1]/following::h5[1]'))

assertEquals('The password to the Key Store where the signing and encryption keys are stored.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Key Store Password\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=keyStorePassword'))

assertEquals('Signing Key', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The password to the Key Store where the signing and encryption keys are stored.\'])[1]/following::h5[1]'))

assertEquals('The Key Store alias of the private key to use for signing.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Signing Key\'])[1]/following::label[1]'))

assertEquals('Signing Key Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The Key Store alias of the private key to use for signing.\'])[1]/following::h5[1]'))

assertEquals('The Key Store password of the private key to use for signing.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Signing Key Password\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=signingKeyPasswordInput'))

assertEquals('Encryption Key', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The Key Store password of the private key to use for signing.\'])[1]/following::h5[1]'))

assertEquals('The Key Store alias of the private key to use for encryption.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Encryption Key\'])[1]/following::label[1]'))

assertEquals('Encryption Key Password', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The Key Store alias of the private key to use for encryption.\'])[1]/following::h5[1]'))

assertEquals('The Key Store password of the private key to use for encryption.', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Encryption Key Password\'])[1]/following::label[1]'))

assertTrue(selenium.isElementPresent('id=encryptionKeyPasswordInput'))

assertEquals('Identity Provider', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The Key Store password of the private key to use for encryption.\'])[1]/following::h4[1]'))

assertTrue(selenium.isElementPresent('xpath=(//a[contains(text(),\'Export Metadata\')])[2]'))

assertEquals('Assertion Signing', selenium.getText('//div[@id=\'saml-identity-provider-options\']/fieldset/h5'))

assertEquals('Indicates if the Service Provider requires that the Identity Provider sign SAML responses (assertions).', 
    selenium.getText('//div[@id=\'saml-identity-provider-options\']/fieldset/p'))

assertTrue(selenium.isElementPresent('name=signAssertions'))

assertEquals('Enable assertion signing', selenium.getText('//div[@id=\'saml-identity-provider-options\']/fieldset/label'))

assertEquals('Metadata', selenium.getText('//div[@id=\'saml-identity-provider-options\']/fieldset/h5[2]'))

assertEquals('Allows the XML Metadata file received from the Identity Provider to be updated.', selenium.getText('//div[@id=\'saml-identity-provider-options\']/fieldset/label[2]'))

assertTrue(selenium.isElementPresent('id=idpMetadata'))

assertEquals('Miscellaneous', selenium.getText('//div[@id=\'saml-misc-options\']/h4'))

assertEquals('Authentication Failure Handling', selenium.getText('//div[@id=\'saml-misc-options\']/fieldset/h5'))

assertEquals('Indicates how users that fail to authenticate via SAML should be handled. Examples of SAML authentication failures are when the Identity Provider fails the assertion or when the user does not exist in Convergence.', 
    selenium.getText('//div[@id=\'saml-misc-options\']/fieldset/p'))

assertTrue(selenium.isElementPresent('id=useSecondaryAuthFalse'))

assertEquals('Access denied page', selenium.getText('//div[@id=\'saml-misc-options\']/fieldset/label'))

assertTrue(selenium.isElementPresent('id=useSecondaryAuthTrue'))

assertEquals('Secondary login', selenium.getText('//div[@id=\'saml-misc-options\']/fieldset/label[2]'))

assertEquals('Alternate User Name Attribute', selenium.getText('//div[@id=\'saml-misc-options\']/fieldset[2]/h5'))

assertEquals('Typically the Name ID sent by the Identity Provider in the SAML assertion is used as the user name for verification in Convergence. In rarer cases, an attribute value included by the Identity Provider in the SAML assertion may need to be used. Enter the friendly name of that attribute here.', 
    selenium.getText('//div[@id=\'saml-misc-options\']/fieldset[2]/label'))

assertTrue(selenium.isElementPresent('id=alternateAttributeNameInput'))

selenium.click('id=samlEnabledCheck')

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SAML\'])[1]/following::i[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SAML\'])[1]/following::i[2]')

assertEquals('Help', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Alternate User Name Attribute\'])[1]/following::h1[1]'))

assertEquals('Convergence can authenticate users using the SAML Single Sign-On protocol. In a clustered environment this functionality can be enabled on an individual node level.', 
    selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Help\'])[1]/following::p[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Alternate User Name Attribute\'])[1]/following::div[6]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SAML\'])[1]/following::i[1]')

