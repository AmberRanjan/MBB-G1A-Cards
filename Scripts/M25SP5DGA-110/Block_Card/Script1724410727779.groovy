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

Mobile.startExistingApplication('com.maybank2u.life.uat')

'TC-Block/Unblock Card-001 - VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the card manegement screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4384473632079081717.png')

Mobile.takeScreenshot()

'VerifyElementText for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/02_VerifyCardName - Maybank MasterCard Global Access World Debit Card'), 
    'Maybank MasterCard Global Access World Debit Card')

'Get Card number'
Mobile.getText(findTestObject('Object Repository/M25SP5DGA-110/03_getCardNumber -    1215'), 0)

'Verify Element Text for Card Expiry'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/04_VerifyCardExpiry- Valid Thru 1030'), 'Valid Thru 10/30')

'VerifyElementText for Card Details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/05_VerifyBlickCardTitle - Block Card'), 'Block Card')

'VerifyElementText for the block Crad text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/06_VerifyElementText - Temporarily deactivate your card'), 
    'Temporarily deactivate your card')

'User Taps on block card toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/07_UserTapOnToggleButton'), 0)

'VerifyElementText when user is on Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/08_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Take Screenshot for Secure2U screen'
Mobile.takeScreenshot()

'VerifyElementText visible on Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/09_VerifyElementText - Block card'), 'Block card')

'VerifyElementText for date and Time when user is on Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/10_VerifyElementText - Date  time'), 'Date & time')

//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/11_VerifyElementText- 29 Nov 2023, 1148 AM'), '29 Nov 2023, 11:48 AM')
Mobile.delay(49)

'VerifyElementText when user is on Decision Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/12_VerifyElementText - Block MAE card unsuccessful'), 
    'Block MAE card unsuccessful')

'VerifyElementText for unsuccessful reason'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/13_VerifyElementText - Secure2u has expired. Please perform the transaction again'), 
    'Secure2u has expired. Please perform the transaction again.')

'Verify Reference number'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/14_VerifyElementText - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/15_VerifyElementText - Date  time'), 'Date & time')

//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/16_VerifyElementText- 192816107M'), '192816107M')
//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/17_VerifyElementText - 29 Nov 2023, 1148 AM'),'29 Nov 2023, 11:48 AM')
'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot916484928866335200.png')

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/18_UserTapsOnDone'), 0)

Mobile.delay(5)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take Screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

'User taps on toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/07_UserTapOnToggleButton'), 0)

'VerifyElementText when user is on Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/08_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Take Screenshot for Secure2U screen'
Mobile.takeScreenshot()

'VerifyElementText block card text on Secure2u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/09_VerifyElementText - Block card'), 'Block card')

'VerifyElementText for date and time when user is on secure2u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/10_VerifyElementText - Date  time'), 'Date & time')

'User taps on Reject'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/19_UserTapsOnReject'), 0)

'VerifyElementText on the decision screen when user is on decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/20_VerifyElementText - Block MAE card unsuccessful'), 
    'Block MAE card unsuccessful')

'Take Screenshot for decision screen'
Mobile.takeScreenshot()

'VerifyElementText stating the reason of rejection'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/21_VerifyElementText - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Verify reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/22_VerifyElementText - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/23_VerifyElementText- Date  time'), 'Date & time')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot527966218404188148.png')

'User taps on Done'
Mobile.tap(findTestObject('M25SP5DGA-110/18_UserTapsOnDone'), 0)

Mobile.delay(5)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

'User taps on toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/07_UserTapOnToggleButton'), 0)

'VerifyElementText when user is on Secure2u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/08_VerifyElementText - Secure2u authorisation'), 
    'Secure2u authorisation')

'Take Screenshot for Secure2U screen'
Mobile.takeScreenshot()

'VerifyElementText present on Secure2u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/09_VerifyElementText - Block card'), 'Block card')

'VerifyElementText for date and time present on Secure2u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/10_VerifyElementText - Date  time'), 'Date & time')

'User tap on Approve button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/24_UserTapsOnApproveButton'), 0)

'VerifyElementText when user is on Decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/25_VerifyElementText- Card successfully blocked'), 
    'Card successfully blocked')

'Take Screenshot for decision screen'
Mobile.takeScreenshot()

'VerifyElementText present below the decision'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/26_VerifyElementText- If you see transactions that you dont recognise on your card, call us now to report them'), 
    'If you see transactions that you don’t recognise on your card, call us now to report them.')

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/18_UserTapsOnDone'), 0)

Mobile.delay(5)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()





