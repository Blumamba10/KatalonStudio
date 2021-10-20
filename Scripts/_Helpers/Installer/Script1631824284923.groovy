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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent

not_run: Windows.startApplicationWithTitle('C:\\Users\\njones\\Desktop\\Installs and Updates\\Convergence\\19.6.1\\convergence-install-19.6.1-20210914.224354-7.exe', 
    'Convergence Install')

not_run: WebUI.delay(5)

not_run: Robot robot = new Robot()

not_run: robot.keyPress(KeyEvent.VK_ENTER)

not_run: robot.keyRelease(KeyEvent.VK_ENTER)

not_run: Windows.startApplicationWithTitle('C:\\Users\\njones\\Desktop\\Installs and Updates\\Convergence\\2021\\convergence-install-21.0.0-20210903.011042-555.exe', 
    'Convergence Install')

not_run: Windows.clickElementOffset(findWindowsObject('Windows/Window'), 100, 100)

not_run: robot.keyPress(KeyEvent.VK_ENTER)

Windows.startApplicationWithTitle('C:\\Users\\njones\\Desktop\\Installs and Updates\\Convergence\\19.5\\convergence-install-19.5.0.exe', 
    'Convergence Install')

not_run: Windows.doubleClick(findWindowsObject('Object Repository/Windows/TitleBar'))

Windows.click(findWindowsObject('Object Repository/Installer/Button(1)'))

