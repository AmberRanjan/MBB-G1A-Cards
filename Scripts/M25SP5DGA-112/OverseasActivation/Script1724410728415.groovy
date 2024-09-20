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

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'User is on Card Management'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/01_VerifyText - Card Management'), 'Card Management')

'Take Screenshot when user is on Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

'Verify Overseas Debit Menu'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/02_VerifyText - Overseas Debit'), 'Overseas Debit')

'Verify text present below overseas Debit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/03_VerifyText - Enable your foreign currency spend and overseas ATM withdrawals'), 
    'Enable your foreign currency spend and overseas ATM withdrawals')

'Tap on toggle'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/04_TapOnToggle'), 0)

'Verify text stating Activate Overseas Debit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/05_VerifyText - Activate Overseas Debit'), 'Activate Overseas Debit')

'Take Screenshot of the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4327892923376799360.png')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/06_TapOnBackButton'), 0)

'User navigates back to card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/01_VerifyText - Card Management'), 'Card Management')

'Take screenshot of Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

'Tap on toggle again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/04_TapOnToggle'), 0)

'User again navigates to Activate overseas debit screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/05_VerifyText - Activate Overseas Debit'), 'Activate Overseas Debit')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4327892923376799360.png')

Mobile.takeScreenshot()

'Verify start date text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/07_VerifyText- Start Date'), 'Start Date')

'User taps on start date field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/08_TapOnStartDate - Tap to select start date'), 0)

'Verify the calender launch'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/09_VerifyText - M'), 'M')

'Take screenshot of the calendar'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2342183210986235614.png')

Mobile.takeScreenshot()

'User taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/10_TapOnCancel - Cancel'), 0)

'User taps on start date field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/08_TapOnStartDate - Tap to select start date'), 0)

'Verify the calender launch'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/09_VerifyText - M'), 'M')

'Take screenshot of the calendar'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2342183210986235614.png')

Mobile.takeScreenshot()

'Select current date and Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/11_TapOnDoneForCurrentDate'), 0)

'Verify end date text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/12_VerifyText - End Date'), 'End Date')

Mobile.takeScreenshot()

'User taps on end date field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/13_UserTapOnEndDate- Tap to select end date'), 0)

'Verify the calender launch'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/14_VerifyText - M'), 'M')

'Take screenshot of the calendar'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2284915403890371204.png')

Mobile.takeScreenshot()

'User taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/15_UserTapOn - Cancel'), 0)

'Verify user navigated back'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/12_VerifyText - End Date'), 'End Date')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2284915403890371204.png')

Mobile.takeScreenshot()

'User taps on end date field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/13_UserTapOnEndDate- Tap to select end date'), 0)

'Verify the calender launch'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/14_VerifyText - M'), 'M')

'Take screenshot of the calendar'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2284915403890371204.png')

Mobile.takeScreenshot()

'User taps on done for the next day'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/16_UserTapOnDone'), 0)

'User on Activate Overseas Debit Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/05_VerifyText - Activate Overseas Debit'), 'Activate Overseas Debit')

'Take screenshot of the Overseas debit screen with dates selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5112650111891064869.png')

Mobile.takeScreenshot()

'User taps on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/17_UserTapOnContinue'), 0)

'Verify Secure2U screen text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/22_VerifyText- Secure2u authorisation'), 'Secure2u authorisation')

'Verify text stating the Activation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/23_VerifyTextforS2U - Activate Overseas Debit'), 
    'Activate Overseas Debit')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/24_Verify - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4236587578870773064.png')

Mobile.takeScreenshot()

'User taps on approve'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/25_TapOnApprove'), 0)

'Verify the decision screen stating the successful Activation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/26_DecisionScreenActivated - Overseas debit successfully activated'), 
    'Overseas debit successfully activated.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/27_VerifyText - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/28_VerifyText - Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1536436965365505856.png')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/29_TapOnDone'), 0)

'User lands on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/01_VerifyText - Card Management'), 'Card Management')

'Take screenshot for the card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

'Verify Overseas debit menu\r\n'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/02_VerifyText - Overseas Debit'), 'Overseas Debit')

'Verify the time duration exist'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-112/30_VerifyElementExist - From 26 Jan 2024 - 27 Jan 2024'), 
    0)

'Tap on toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/31_TapOnToggle'), 0)

'Verify pop-up stating deactivation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/32_VerifyTextPopUp - Deactivate Overseas Debit'), 
    'Deactivate Overseas Debit')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

'User taps on close icon of the popUp'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/33_TapOnCloseIcon'), 0)

'User navigated back to the management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/02_VerifyText - Overseas Debit'), 'Overseas Debit')

'User taps on toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/31_TapOnToggle'), 0)

'Verify confirmation text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/34_VerifyText - Are you sure you want to deactivate Overseas Debit'), 
    'Are you sure you want to deactivate Overseas Debit?')

'Take screenshot of the popUp'
Mobile.takeScreenshot()

'User taps on Cancel button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/35_TapOnCancel'), 0)

'User lands on Cards Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/02_VerifyText - Overseas Debit'), 'Overseas Debit')

'Take screenshot of the card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

'User taps on toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/31_TapOnToggle'), 0)

'Verify pop-up text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/32_VerifyTextPopUp - Deactivate Overseas Debit'), 
    'Deactivate Overseas Debit')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/36_UserTapOnDeactivate'), 0)

'Verify Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/37_VerifyText - Secure2u authorisation'), 'Secure2u authorisation')

'Verify Secure2U deactivation text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/38_VerifyText - Deactivate Overseas Debit'), 'Deactivate Overseas Debit')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/39_VerifyText - Date  time'), 'Date & time')

'Take screenshot of the Secure2U'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7976679017891589492.png')

Mobile.takeScreenshot()

'User taps on Approve'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/40_TapOnApprove'), 0)

'Verify Decision screen stating the successful disabling of Overseas debit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/41_VerifyText - Overseas debit successfully deactivated'), 
    'Overseas debit successfully deactivated.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/42_VerifyText - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/43_VerifyText - Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7976679017891589492.png')

Mobile.takeScreenshot()

'User Taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-112/44_TapOnDone'), 0)

'User navigates to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-112/01_VerifyText - Card Management'), 'Card Management')

'Take screenshot of the Card Management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3636999969979690980.png')

Mobile.takeScreenshot()

