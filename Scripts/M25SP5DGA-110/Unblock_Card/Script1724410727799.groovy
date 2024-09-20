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

/*
'Block Message is on the Card Management Scren'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/27_BlockMessage - Youve temporarily blocked this card. To unblock or replace it, kindly visit a nearby branch or call us now'), 
    'You’ve temporarily blocked this card. To unblock or replace it, kindly visit a nearby branch or call us now.')

'Scroll the screen below'
Mobile.scrollToText('Contactless Limit')

Mobile.takeScreenshot()

'Tap on locate nearest branch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/28_TapOnLocateNearestBranch'), 0)

'Verify Element Text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/29_VerifyText - Locate Nearest Branch'), 'Locate Nearest Branch')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1521021942342791488.png')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/30_UserTapOnBackButton'), 0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

'User taps on Call Us Now'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/31_TapOnCallUsNow'), 0)

'Verify the overseas number'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/32_VerifyOverseasNo - Call 603-7844-3696 (Overseas)'), 
    'Call +603-7844-3696 (Overseas)')

'Verify the Malaysian number'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/33_VerifyMalaysiaNo - Call 1-300-88-6688 (Malaysia)'), 
    'Call 1-300-88-6688 (Malaysia)')

'Take screenshot of the numbers'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot93784268186510370.png')

Mobile.takeScreenshot()

'Use taps on Cancel'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/34_TapOnCancel'), 0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/35_TapOnBackButton'), 0)

'Verify when user navigates back to cards screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/36_UserIsOn- CARDS'), 'CARDS')

'Verify text for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/37_VerifyElementText - Maybank MasterCard Global Access World Debit Card'), 
    'Maybank MasterCard Global Access World Debit Card')

'Verify text stating the status of the card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/38_CardStatus - Temporarily Blocked'), 'Temporarily Blocked')

'Screenshot of the blocked card on the cards screen\r\n'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7834116783961254937.png')

Mobile.takeScreenshot()

'User taps on Maybank Card'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/39_UserTapsOn - Maybank MasterCard Global Access World Debit Card'), 
    0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

//-----------------------------------------------------------Secure2U Expire------------------------------------------------------------------------------
'User taps on Unblock switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/40_UserTapsOnUnblockSwitch'), 0)

'Verify user navigated to Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/41_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

'Verify the text stating the action "Unblock Card" on Secure 2 U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/42_S2UBodyText - Unblock card'), 'Unblock card')

'Verify Date and time field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/43_VerifyDateandTime - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot563859497445271190.png')

Mobile.takeScreenshot()

'Delay 50 seconds to make the secure2U screen expire'
Mobile.delay(50)

'Verify the Decision screen text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/44_VerifyTextDecisionScreen - Unblock MAE card unsuccessful'), 
    'Unblock MAE card unsuccessful')

'Verify the Reason of unsuccess in decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/45_VerifyReasonforUnsuccessful- Secure2u has expired. Please perform the transaction again'), 
    'Secure2u has expired. Please perform the transaction again.')

'Verify the Reference ID field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/46_Verify - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/47_Verify - Date  time'), 'Date & time')

'Verify the Card field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/48_Verify - Card'), 'Card')

'Screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2268691422425438559.png')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/18_UserTapsOnDone'), 0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

//-----------------------------------------------------------Secure2U Reject---------------------------------------------------------------------------
'User taps on Unblock switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/40_UserTapsOnUnblockSwitch'), 0)

'Verify user navigated to Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/41_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

'Verify the text stating the action "Unblock Card" on Secure 2 U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/42_S2UBodyText - Unblock card'), 'Unblock card')

'Verify Date and time field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/43_VerifyDateandTime - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot563859497445271190.png')

Mobile.takeScreenshot()

'User taps on REJECT button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/50_RejectButton'), 0)

'Verify the Decision screen text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/44_VerifyTextDecisionScreen - Unblock MAE card unsuccessful'), 
    'Unblock MAE card unsuccessful')

'Verify the Reason of unsuccess in decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/51_UnsuccessfulReason - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Verify the Reference ID field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/46_Verify - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/47_Verify - Date  time'), 'Date & time')

'Verify the Card field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/48_Verify - Card'), 'Card')

'Screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2268691422425438559.png')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/18_UserTapsOnDone'), 0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()
*/
//-----------------------------------------------------------Secure2U Approve---------------------------------------------------------------------------
'User taps on Unblock switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/40_UserTapsOnUnblockSwitch'), 0)

'Verify user navigated to Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/41_S2UHeader - Secure2u authorisation'), 'Secure2u authorisation')

'Verify the text stating the action "Unblock Card" on Secure 2 U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/42_S2UBodyText - Unblock card'), 'Unblock card')

'Verify Date and time field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/43_VerifyDateandTime - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot563859497445271190.png')

Mobile.takeScreenshot()

'User taps on APPROVE button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/52_ApproveButton'), 0)

'Verify the Decision screen text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/53_UnblockSuccessMessage - Card successfully unblocked'), 
    'Card successfully unblocked')

'Verify the Reason of unsuccess in decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/54_UnblockMessage- You can now make purchases using your debit card'), 
    'You can now make purchases using your debit card. ')

'Verify the Reference ID field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/46_Verify - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/47_Verify - Date  time'), 'Date & time')

'Verify the Card field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/48_Verify - Card'), 'Card')

'Screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2268691422425438559.png')

Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/18_UserTapsOnDone'), 0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

