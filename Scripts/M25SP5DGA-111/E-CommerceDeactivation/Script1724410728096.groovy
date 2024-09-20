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

//Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is on Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the card manegement screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4384473632079081717.png')

Mobile.takeScreenshot()

'VerifyElementText for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/29_VerifyCardText - Maybank Global Access Mastercard World Debit Card'), 
    'Maybank Global Access Mastercard World Debit Card')

'Verify Ecommerce Activation menu'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/01_VerifyText - E-Commerce Activation'), 'E-Commerce Activation')

'Verify the tagline present below Ecommerce Activation'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/02.1_VerifyText - Enable your online transactions'), 
    'Enable your online transactions')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot221800534313236791.png')
Mobile.takeScreenshot()
//-----------------------------------------------------------S2U Expire------------------------------------------------------------------------------------------
'Tap on the toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify Text stating De-activate E commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate Ecommenrce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'), 
    'Are you sure you want to deactivate e-commerce?')
Mobile.takeScreenshot()

'User taps on cross icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/18_TapOnCrossIcon'), 0)

'User lands on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()

'User taps on Toggle switch again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate e-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'), 
    'Are you sure you want to deactivate e-commerce?')
Mobile.takeScreenshot()
'User taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/19_UserTapsOnCancel'), 0)

'User lands on Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()
'Tap on toggle switch again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate e-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'), 
    'Are you sure you want to deactivate e-commerce?')

'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

'User navigates to Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/21_Secure2UScreen - Secure2u authorisation'), 'Secure2u authorisation')

'Verify text stating Deactivate E-Commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/23_DateTime - Date  time'), 'Date & time')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3865515398391437153.png')
Mobile.takeScreenshot()
'Delay for 50 seconds to let the secure2u expire'
Mobile.delay(50)

'Verify text on the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

'Verify text stating the failure reason'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14.1_VerifyText - Your Secure Verification authorisation has expired. Please perform the transaction again'), 
    'Your Secure Verification authorisation has expired. Please perform the transaction again.')

'Verify reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/08_Reference - Reference ID'), 'Reference ID')

'Verify date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

'Verify transaction type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/25_TransactionType - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')
Mobile.takeScreenshot()
'Tap Done on the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

//------------------------------------------------------------------Secure2U Rejected---------------------------------------------------------------------------
'User lands on Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()
'Tap on toggle switch again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate e-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'), 
    'Are you sure you want to deactivate e-commerce?')
Mobile.takeScreenshot()
'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

'User navigates to Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/21_Secure2UScreen - Secure2u authorisation'), 'Secure2u authorisation')

'Verify text stating Deactivate E-Commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/23_DateTime - Date  time'), 'Date & time')

'Take screenshot for Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3865515398391437153.png')
Mobile.takeScreenshot()
'User tap on Reject'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/13_UserTapsOnReject'), 0)

'Verify text on the decision screen'
//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

'Verify text stating the failure reason'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14_FailureReason - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Verify date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

'Verify transaction type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')
Mobile.takeScreenshot()
'Tap Done on the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

//----------------------------------------------------------------------Approve S2U----------------------------------------------------------------------------
'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()
'Tap on toggle switch again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify text stating deactivate E-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/16_PopUpHeaderText - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify text confirming if user is sure to deactivate e-commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/17_PopUpBody - Are you sure you want to deactivate e-commerce'), 
    'Are you sure you want to deactivate e-commerce?')
Mobile.takeScreenshot()
'User taps on Deactivate button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/20_UserTapsOnDeactivateButton'), 0)

'User navigates to Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/21_Secure2UScreen - Secure2u authorisation'), 'Secure2u authorisation')

'Verify text stating Deactivate E-Commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/22_DeactivateMsg - Deactivate E-Commerce'), 'Deactivate E-Commerce')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/23_DateTime - Date  time'), 'Date & time')

'Take screenshot for Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3865515398391437153.png')
Mobile.takeScreenshot()
'Tap on Approve'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/15_ApproveButton'), 0)

'Verify successful text on the decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/26_DecisionScreen - E-commerce successfully deactivated'), 
    'E-commerce successfully deactivated')

'Verify Reference ID text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/27_VerifyText - Reference ID'), 'Reference ID')

'Verify date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/28_VerifyText- Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8128159577518447456.png')
Mobile.takeScreenshot()
'Tap on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

'User navigated to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8128159577518447456.png')

Mobile.takeScreenshot()