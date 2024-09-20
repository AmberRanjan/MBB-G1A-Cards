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

WebUI.callTestCase(findTestCase('AppVersion/AppVersion'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.startExistingApplication('com.maybank2u.life.uat')

'TC-Block/Unblock Card-001 - VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot for the card manegement screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4384473632079081717.png')

Mobile.takeScreenshot()

'VerifyElementText for the G1A card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/29_VerifyCardText - Maybank Global Access Mastercard World Debit Card'), 
    'Maybank Global Access Mastercard World Debit Card')

'VerifyElementText for Card Details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/05_VerifyBlickCardTitle - Block Card'), 'Block Card')

'VerifyElementText for the block Crad text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/06_VerifyElementText - Temporarily deactivate your card'), 
    'Temporarily deactivate your card')

'User Taps on block card toggle button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/07_UserTapOnToggleButton'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot221800534313236791.png')

Mobile.takeScreenshot()

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your Otp no. is ', '')

def otpArr = otpText.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr.length; i++) {
    if ((otpArr[i]) == '1') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
    } else if ((otpArr[i]) == '2') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
    } else if ((otpArr[i]) == '3') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
    } else if ((otpArr[i]) == '4') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
    } else if ((otpArr[i]) == '5') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
    } else if ((otpArr[i]) == '6') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
    } else if ((otpArr[i]) == '7') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
    } else if ((otpArr[i]) == '8') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
    } else if ((otpArr[i]) == '9') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
    } else if ((otpArr[i]) == '0') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
    }
}

'Screenshot for the screen when user entered pin for create pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/08_Entered PIN for the app')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/55_TapOnCheck'), 0)

'VerifyElementText when user is on Decision screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/25_VerifyElementText- Card successfully blocked'), 
    'Card successfully blocked')

'Take Screenshot for decision screen'
Mobile.takeScreenshot()

'VerifyElementText present below the decision'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/26_VerifyElementText- If you see transactions that you dont recognise on your card, call us now to report them'), 
    'If you see transactions that you don’t recognise on your card, call us now to report them.')

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/18.1_UserTapOnDone'), 0)

Mobile.delay(5)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

'Block Message is on the Card Management Scren'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/27_BlockMessage - Youve temporarily blocked this card. To unblock or replace it, kindly visit a nearby branch or call us now'), 
    'You’ve temporarily blocked this card. To unblock or replace it, kindly visit a nearby branch or call us now.')

'Scroll the screen below'
Mobile.scrollToText('Contactless Limit')

Mobile.takeScreenshot()

/*
'Tap on locate nearest branch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/28_TapOnLocateNearestBranch'), 0)

'Verify Element Text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/29_VerifyText - Locate Nearest Branch'), 'Locate Nearest Branch')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1521021942342791488.png')

Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/30_UserTapOnBackButton'), 0)
*/

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
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-111/29_VerifyCardText - Maybank Global Access Mastercard World Debit Card'), 
    'Maybank Global Access Mastercard World Debit Card')

'Verify text stating the status of the card'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/38_CardStatus - Temporarily Blocked'), 'Temporarily Blocked')

'Screenshot of the blocked card on the cards screen\r\n'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7834116783961254937.png')

Mobile.takeScreenshot()

'User taps on Maybank Card'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/39.1_TapOnGAA_Card - Maybank Global Access Mastercard World Debit Card'), 
    0)

'VerifyElementText when user is on Card management screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Take screenshot when user is on Card management screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot86417130906527599.png')

Mobile.takeScreenshot()

Mobile.delay(165)

'User taps on Unblock switch'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/40_UserTapsOnUnblockSwitch'), 0)

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Storing the pin inside a variable
def otpText2 = Mobile.getText(findTestObject('Object Repository/TAC/02_OTP - Your Otp no. is 098308'), 0)

//Applying the read pin from keyboard
otpText2 = otpText2.replace('Your Otp no. is ', '')

def otpArr2 = otpText2.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr.length; i++) {
    if ((otpArr2[i]) == '1') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
    } else if ((otpArr2[i]) == '2') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
    } else if ((otpArr2[i]) == '3') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
    } else if ((otpArr2[i]) == '4') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
    } else if ((otpArr2[i]) == '5') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
    } else if ((otpArr2[i]) == '6') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
    } else if ((otpArr2[i]) == '7') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
    } else if ((otpArr2[i]) == '8') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
    } else if ((otpArr2[i]) == '9') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
    } else if ((otpArr2[i]) == '0') {
        Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
    }
}

'Screenshot for the screen when user entered pin for create pin screen'
Mobile.takeScreenshot('Screenshots/004_Login/001_Login/08_Entered PIN for the app')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-110/55_TapOnCheck'), 0)

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

