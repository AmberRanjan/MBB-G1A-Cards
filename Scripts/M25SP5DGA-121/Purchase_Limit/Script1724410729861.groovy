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

'Application Launched'
Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.delay(5)

'User is on Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/01_UserIsOn - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8633931817441572469.png')

'User Scrolls the screen to view Purchase Limit'
Mobile.swipe(0, 300, 0, 0)

'Verify Text to make sure user is able to view Purchase Limit in the list'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/02_VerifyElementText - Purchase Limit'), 'Purchase Limit')

'User taps on Purchase Limit'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-121/03_UserTapsOn - Purchase Limit'), 0)

Mobile.delay(5)

'User is inside Purchase Limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/04_UserIsOn- Purchase Limit'), 'Purchase Limit')

'Verify Text for Slider'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/05_VerifyElementText - Drag the slider to adjust your daily purchase limit per transaction'), 
    'Drag the slider to adjust your daily purchase limit per transaction.')

'Verify the default amount'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/06_VerifyElementTextDefaultAmount - RM 3,000'), 
    'RM 3,000')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7943318892200677789.png')

//Mobile.tapAndHold(findTestObject('Object Repository/M25SP5DGA-121/07_Slider'), 0, 0)
//Mobile.getAttribute(findTestObject('M25SP5DGA-121/08_UpdateButton'), 'enabled', 10)
'The Update Button is not clickabe'
Mobile.verifyElementAttributeValue(findTestObject('M25SP5DGA-121/08_UpdateButton'), 'clickable', 'false', 10)

'System reads the OTP'
Mobile.getText(findTestObject('M25SP5DGA-121/android.widget.TextView - Your TAC no. is 785785'), 0)

//Storing the pin inside a variable
def otpText = Mobile.getText(findTestObject('M25SP5DGA-121/android.widget.TextView - Your TAC no. is 785785'), 0)

//Applying the read pin from keyboard
otpText = otpText.replace('Your TAC no. is ', '')

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

'User taps on Confirm button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-121/10_UserTaoOnConfirm'), 0)

Mobile.delay(4)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/Decision Screen - Purchase Limit successfully updated'), 
    'Purchase Limit successfully updated.')

'Verify decision screen transaction Type text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/12_VerifyElementText - Transaction type'), 'Transaction type')

'Verify Transaction as Update purchase limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/13_VerifyElementText - Update Purchase Limit'), 
    'Update Purchase Limit')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3611440528227784552.png')

'User Taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-121/14_UserTapsOnDone'), 0)

'User Navigated to Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-121/15_UserNavigatedTo - Card Management'), 'Card Management')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2189359437287863174.png')

