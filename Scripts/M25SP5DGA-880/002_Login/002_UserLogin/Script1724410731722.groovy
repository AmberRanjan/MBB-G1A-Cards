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

'Tap on Log in Now'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/01_TapOn - Log In Now'), 0)

'User inside login user type tile selection screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/02_VeridyText - Log in to enjoy the app to its fullest'), 
    'Log in to enjoy the app to its fullest.')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2319205804740841865.png')

'Tap on Existing user'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/03_TapOn - Existing M2UMAE user Log in here'), 0)

'Verify user navigated to enter username screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/04_VerifyText - Please enter your username'), 
    'Please enter your username')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2319205804740841865.png')

'Set text for the username'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/05_SetText'), 'lifeofram_ab1', 0)

'Hide Keyboard'
Mobile.hideKeyboard()

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1417137480570230392.png')

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/06_TapOnContinue'), 0)

'Verify user navigated to security phrase confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/07_VerifyText- Is this your security phrase'), 
    'Is this your security phrase?')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7404817550303175802.png')

'Tap on Yes it\'s mine'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/08_TapOnYesItsMine'), 0)

'Verify text once user ios on Password screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/09_VerifyText - Enter your password'), 
    'Enter your password')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot863989778260574757.png')

'Enter the password'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/10_PasswordEntered'), 'Maybank@11', 0)

'Hide Keyboard'
Mobile.hideKeyboard()

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8536613521790044931.png')

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/11_TapOnContinue'), 0)

'Verify text once user navigated to create pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/12_VerifyText - Create your PIN for the app'), 
    'Create your PIN for the app')

'Take screenshot once user navigated to Create Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6175532962647249629.png')

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/13_TapOn - 1'), 0)
}

'Take screenshot after entering pin'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4373779608093509893.png')

'Tap on check icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/14_TapOnCheck'), 0)

'Verify once user navigates to confirm pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/15_VerifyText - Confirm your 6-digit PIN'), 
    'Confirm your 6-digit PIN')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot66885158451637722.png')

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/13_TapOn - 1'), 0)
}

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4373779608093509893.png')

'Tap on Check'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/14_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/16_VerifyText - Enable biometric ID for instant access'), 
    'Enable biometric ID for instant access')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6319298005878170049.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/17_TapOn - Set Up Later'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/18_VerifyText - Verify Number'), 'Verify Number')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2714793747474514706.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/19_TapOnYesProceed'), 0)

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/20_OTP - Your OTP no. is 434649'), 0)

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/20_OTP - Your OTP no. is 434649'), 
    0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your OTP no. is ', '')

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
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2714793747474514706.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/14_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/21_VerifyText - Welcome Onboard'), 'Welcome Onboard')

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/22_SetText- Enter your name'), 'AmberTest', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8197107317094653241.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/23_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/24_VerifyText- Set Primary Account'), 
    'Set Primary Account')

Mobile.verifyElementNotExist(findTestObject('Object Repository/M25SP5DGA-880/002_Login/001_G1A_NotExist - Global Access Account-i'), 
    0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4094842682667303696.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/25_TapOn - Savings Account-i'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2027267939002189283.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/26_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/27_VerifyText - Are you a new Maybank customer'), 
    'Are you a new Maybank customer?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot138645394216141225.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/28_TapOn- Skip'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/29_VerifyText - Set Up Successful'), 
    'Set Up Successful')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5181490473079652789.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/30_TapOnActivateSecure2U'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/31_VerifyText - Secure2u'), 'Secure2u')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/32_TapOnRegisterS2U'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/33_VerifyText - One Time Password'), 
    'One Time Password')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5356878810435176614.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/34_TapOnRequestOTP'), 0)

'System reads the pin'
Mobile.getText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/20_OTP - Your OTP no. is 434649'), 0)

//Storing the pin inside a variable
def otpText2 = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/20_OTP - Your OTP no. is 434649'), 
    0)

//Applying the read pin from keyboard
otpText2 = otpText2.replace('Your OTP no. is ', '')

def otpArr2 = otpText2.toCharArray()

'Pin is entered for create screen'
for (def i = 0; i < otpArr2.length; i++) {
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
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2714793747474514706.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/14_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/35_VerifyText - Enter ID'), 'Enter ID')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1253554529140971383.png')

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/36_SetText - Your ID number'), '931226055268', 
    0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7395310796679565606.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/37_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-880/002_Login/38_VerifyText - Device Name'), 'Device Name')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8578096722621346573.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-880/002_Login/39_TapOnNext'), 0)

