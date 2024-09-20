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

'User is on Card Management Screen'
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


'Tap on toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify Secure2U header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/04_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

'Verify Text stating Activate E commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/05_ActivateText - Activate E-Commerce'), 'Activate E-Commerce')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/06_VerifyDateTime - Date  time'), 'Date & time')

Mobile.takeScreenshot()

'Delay for 49 seconds'
Mobile.delay(49)

'Verify text stating Authorisation failed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

'Verify text stating the reason for failure'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14.1_VerifyText - Your Secure Verification authorisation has expired. Please perform the transaction again'), 
    'Your Secure Verification authorisation has expired. Please perform the transaction again.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/08_Reference - Reference ID'), 'Reference ID')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

'Verify text for transaction'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/11_TransactionType - Activate E-Commerce'), 'Activate E-Commerce')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')
Mobile.takeScreenshot()

'Tap on Done on the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

//----------------------------------------------------------S2U Reject------------------------------------------------------------------------------------------
'Verify user is navigated to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()

'Tap on the toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify Secure2U header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/04_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

'Verify Text stating Activate E commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/05_ActivateText - Activate E-Commerce'), 'Activate E-Commerce')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/06_VerifyDateTime - Date  time'), 'Date & time')
Mobile.takeScreenshot()

'User taps on Reject'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/13_UserTapsOnReject'), 0)

'Verify text stating Authorisation failed'
//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07_Decision - Authorisation failed'), 'Authorisation failed')

'Verify text stating the reason for failure'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/14_FailureReason - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

'Verify transaction type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/10_TranType- Transaction type'), 'Transaction type')

'Verify text for transaction'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/11_TransactionType - Activate E-Commerce'), 'Activate E-Commerce')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6901398728333019665.png')
Mobile.takeScreenshot()

'Tap on Done on the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

//----------------------------------------------------------S2U Approve-----------------------------------------------------------------------------------------
'Verify user is navigated to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')
Mobile.takeScreenshot()

'Tap on the toggle switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/03_UserTapsOnToggleSwitch'), 0)

'Verify Secure2U header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/04_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

'Verify Text stating Activate E commerce'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/05_ActivateText - Activate E-Commerce'), 'Activate E-Commerce')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/06_VerifyDateTime - Date  time'), 'Date & time')
Mobile.takeScreenshot()

'Tap on Approve button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/15_ApproveButton'), 0)

'Verify Decision screen text stating E commerce successfully activated'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/07.1_VerifyText - E-commerce successfully activated'), 
    'E-commerce successfully activated')

'Verify Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/09_DateTime- Date  time'), 'Date & time')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/08_Reference - Reference ID'), 'Reference ID')
Mobile.takeScreenshot()

'Tap on Done on the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-111/12.1_TapOnDone'), 0)

'Verify user is navigated to Card Management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

Mobile.takeScreenshot()

