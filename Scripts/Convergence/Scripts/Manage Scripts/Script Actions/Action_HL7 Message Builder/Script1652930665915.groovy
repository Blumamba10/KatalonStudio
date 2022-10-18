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

WebUI.click(findTestObject('Convergence/_SelectProject/Select Project'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Convergence/_SelectProject/a_Default'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Convergence/_SelectProject/a_Default'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Scripts'))

WebUI.click(findTestObject('Convergence/_NavigationMenu/Administration Console/a_Manage Scripts'))

selenium.click('id=addScriptButton')

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

selenium.click('id=scriptNameInput')

selenium.type('id=scriptNameInput', 'HL7 Message Builder')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Title\'])[1]/following::i[1]')

selenium.click('id=scriptDescriptionInput')

selenium.type('id=scriptDescriptionInput', 'HL7 Message Builder')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Script Description\'])[1]/following::i[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Action\'])[1]/following::button[1]')

selenium.click('link=HL7MessageBuilder')

WebUI.delay(2)

assertEquals('HL7MessageBuilder', selenium.getText('//h4[@class="modal-title"]'))

assertEquals('Name', selenium.getText('//label[@for="nameInput"]'))

assertEquals('Description', selenium.getText('//label[@for="descriptionInput"]'))

assertEquals('HL7 Version', selenium.getText('//label[@for="HL7VersionSelectTriggerInput"]'))

assertEquals('2.12.22.32.3.12.42.52.5.12.6', selenium.getText('id=HL7VersionSelectTriggerInput'))

assertEquals('HL7 version supported', selenium.getText('//div[contains(text(),"HL7 version supported")]'))

assertEquals('Mode', selenium.getText('//label[@for="ModeSelectTriggerInput"]'))

assertEquals('Build HL7 MessageAdd Non-standard HL7 SegmentAdd Custom Z SegmentInsert Repeating HL7 SegmentInsert Repeating HL7 FieldClose HL7 Message', 
    selenium.getText('id=ModeSelectTriggerInput'))

assertEquals('HL7 Message Type', selenium.getText('//label[@for="HL7MessageTypeSelectTriggerInput"]'))

assertEquals('ADR_A19ADT_A01ADT_A02ADT_A03ADT_A05ADT_A06ADT_A09ADT_A12ADT_A15ADT_A16ADT_A17ADT_A18ADT_A20ADT_A21ADT_A24ADT_A30ADT_A37ADT_A38ADT_A39ADT_A43ADT_A45ADT_A50ADT_A52ADT_A54ADT_A60ADT_A61ADT_AXXBAR_P01BAR_P02BAR_P05BAR_P06BAR_P10BAR_P12BPS_O29BRT_O32BTS_O31CRM_C01CSU_C09DFT_P03DFT_P11DOC_T12DSR_Q01DSR_Q03EAC_U07EAN_U09EAR_U08EHC_E01EHC_E02EHC_E04EHC_E10EHC_E12EHC_E13EHC_E15EHC_E20EHC_E21EHC_E24ESR_U02ESU_U01INR_U06INU_U05LSU_U12MDM_T01MDM_T02MFK_M01MFN_M01MFN_M02MFN_M03MFN_M04MFN_M05MFN_M06MFN_M07MFN_M08MFN_M09MFN_M10MFN_M11MFN_M12MFN_M13MFN_M15MFN_M16MFN_M17MFN_ZnnMFQ_M01MFR_M01MFR_M04MFR_M05MFR_M06MFR_M07NMD_N02NMQ_N01NMR_N01OMB_O27OMD_O03OMG_O19OMI_O23OML_O21OML_O33OML_O35OMN_O07OMP_O09OMS_O05OPL_O37OPR_O38OPU_R25ORB_O28ORD_O04ORF_R04ORG_O20ORI_O24ORL_O22ORL_O34ORL_O36ORM_O01ORN_O08ORP_O10ORR_O02ORS_O06ORU_R01ORU_R30OSQ_Q06OSR_Q06OUL_R21OUL_R22OUL_R23OUL_R24PEX_P07PGL_PC6PMU_B01PMU_B03PMU_B04PMU_B07PMU_B08PPG_PCGPPP_PCBPPR_PC1PPT_PCLPPV_PCAPRR_PC5PTR_PCFQBP_E03QBP_E22QBP_Q11QBP_Q13QBP_Q15QBP_Q21QBP_QnnQBP_Z73QCK_Q02QCN_J01QRY_A19QRY_PC4QRY_Q01QRY_Q02QRY_R02QRY_T12QSB_Q16QVR_Q17RAR_RARRAS_O17RCI_I05RCL_I06RDE_O11RDR_RDRRDS_O13RDY_K15REF_I12RER_RERRGR_RGRRGV_O15ROR_RORRPA_I08RPI_I01RPI_I04RPL_I02RPR_I03RQA_I08RQC_I05RQI_I01RQP_I04RRA_O18RRD_O14RRE_O12RRG_O16RRI_I12RSP_E03RSP_E22RSP_K11RSP_K21RSP_K23RSP_K25RSP_K31RSP_Q11RSP_Z82RSP_Z86RSP_Z88RSP_Z90RTB_K13RTB_Z74SDR_S31SDR_S32SIU_S12SLR_S28SQM_S25SQR_S25SRM_S01SRR_S01SSR_U04SSU_U03STC_S33SUR_P09TCU_U10UDM_Q05VXQ_V01VXR_V03VXU_V04VXX_V02', 
    selenium.getText('id=HL7MessageTypeSelectTriggerInput'))

assertEquals('HL7 message type to write', selenium.getText('//div[contains(text(),"HL7 message type to write")]'))

selenium.click('id=nameInput')

selenium.typeKeys('id=nameInput', 'HL7MessageBuilder')

selenium.typeKeys('id=descriptionInput', 'Description')

selenium.click('id=HL7MessageTypeSelectTriggerInput')

selenium.select('id=HL7MessageTypeSelectTriggerInput', 'label=ADT_A12')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 Message Type\'])[1]/following::option[8]')

assertEquals('Segment - MSH', selenium.getText('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'HL7 message type to write\'])[1]/following::h5[2]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include optional DG1 segment?\'])[1]/following::button[1]'))

assertTrue(selenium.isElementPresent('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'OK\'])[1]/following::button[1]'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Include optional DG1 segment?\'])[1]/following::button[1]')

WebUI.click(findTestObject('Convergence/Scripts/Manage Scripts/Script Editor_Page/button_Save'))

WebUI.delay(2)

WebUI.closeWindowIndex('1')

WebUI.switchToWindowIndex('0')

WebUI.setText(findTestObject('Convergence/Scripts/Manage Scripts/input_Search Filter'), 'HL7 Message Builder')

assertEquals('HL7 Message Builder', selenium.getText('//a[@class="new-editor-open"]'))

