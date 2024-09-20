import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Launch Application'
WebUI.callTestCase(findTestCase('AppVersion/AppVersion'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify User is on Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-110/01_UserIsOn - Card Management'), 'Card Management')

'Screenshot once the user is on Card Management Screen'
Mobile.takeScreenshot()

'Scroll down the screen'
Mobile.swipe(0, 300, 0, 0)

'Verify Text Contactless Limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/01_VerifyText - Contactless Limit'), 'Contactless Limit')

'Take Screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'Tap on Contactless Limit'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/02_UserTapsOn - Contactless Limit'), 0)

Mobile.delay(5)

'Verify Screen once user is navigated inside Contactless Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/03_VerifyScreenName - Contactless Limit'), 'Contactless Limit')

'Take Screenshot after navigating inside Contactless Limit Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7953562804075974578.png')
Mobile.takeScreenshot()

'User taps on Back Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/04_TapOnBackButton'), 0)

'Verify user navigated back successfully'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/01_VerifyText - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user is Navigated Back'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'User taps on Contactless Limit Again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/02_UserTapsOn - Contactless Limit'), 0)

Mobile.delay(5)

'Verify user navigated to Contactless Limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/05_PageTitle - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user naviates to Contactless Limit'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7953562804075974578.png')
Mobile.takeScreenshot()

'Verify the description present for the slider'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/06_Description - Drag the slider to adjust your maximum daily contactless limit. Contactless transactions include payWave, Apple Pay, Google Pay, etc'), 
    'Drag the slider to adjust your maximum daily contactless limit. Contactless transactions include payWave, Apple Pay, Google Pay, etc.')

'Get the displayed amount by default'
def defLim = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-122/07DefaultLimit - RM 250'), 0)

'Validate the amount is correct or not'
String amt = 'RM 250'

if (defLim.equals(amt)) {
    print('The default amount is RM 250')
}

'Validate the Minimum limit is RM 0'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/08_MinLimit - RM 0'), 'RM 0')

'Verify the Maximum Limit is RM 1,000'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/09_MaxLimit - RM 1,000'), 'RM 1,000')

'Slide the slider bar to change the amount'
Mobile.delay(8)

'Take screenshot after changing the slider value/amount'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'Tap on back button '
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/04_TapOnBackButton'), 0)

'Validate user is navigated back to the Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/01_VerifyText - Contactless Limit'), 'Contactless Limit')

'Screenshot once the user is navigated back to Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'User taps on Contactless Limit again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/02_UserTapsOn - Contactless Limit'), 0)

Mobile.delay(5)

'Verify the user is navigated inside Contactless Limit screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/05_PageTitle - Contactless Limit'), 'Contactless Limit')

'Verify the amount which should be unchanged as the amount was not updated previously'
if (defLim.equals(amt)) {
    print('The amount remains unchanged RM 250')
}

'Validate the user is able to Slide the slider to RM 0'
Mobile.delay(7)

'Take Screenshot once the slider value is RM 0'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'Validate the user is able to Slide the slider to RM 1,000'
Mobile.delay(7)

'Take Screenshot once the slider value is RM 1,000'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'User tap on Update button to update the Value'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/10_TapOnUpdateButton'), 0)

'Validate the Secure2U Text '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/11_S2UHeader - Update Contactless Limit'), 'Update Contactless Limit')

'Validate Date And Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/12_Validate - Date  time'), 'Date & time')

'Take Screenshot for the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot632064215480080319.png')
Mobile.takeScreenshot()

'User taps on Reject'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/13_TapOnReject'), 0)

'Decision screen stating Authorisation Failed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/14_DecisionScreen - Authorisation failed'), 'Authorisation failed')

'Decision screen stating the failure reason'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/15_VerifyFailureReason - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/16_Validate - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/17_Verify- Date  time'), 'Date & time')

'Verify Transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/18_Verify - Transaction type'), 'Transaction type')

'Verify Transaction Type agenda'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/19_TranType - Update Contactless Limit'), 'Update Contactless Limit')

'Take Screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3336211677931199995.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/20_UserTapOnDone'), 0)

'User navigated to Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/01_VerifyText - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user navigated to Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'User navigates inside Contactless Limit screen\r\n'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/02_UserTapsOn - Contactless Limit'), 0)

'Verify user navigated to Contactless Limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/05_PageTitle - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user naviates to Contactless Limit'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7953562804075974578.png')
Mobile.takeScreenshot()

'Verify the amount as it remains unchanged as the request was rejected'
if (defLim.equals(amt)) {
    print('The default amount is RM 250')
}

Mobile.delay(7)

'Take Screenshot once the slider value is RM 300'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'User tap on Update button to update the Value'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/10_TapOnUpdateButton'), 0)

'Validate the Secure2U Text '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/11_S2UHeader - Update Contactless Limit'), 'Update Contactless Limit')

'Validate Date And Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/12_Validate - Date  time'), 'Date & time')

'Take Screenshot for the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot632064215480080319.png')
Mobile.takeScreenshot()

'User Taps on Approve'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/21_UserTapsOnApprove'), 0)

'Verify decision screen stating Contactless Limit successfully updated'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/22_DecisionScreen - Contactless Limit successfully updated'), 
    'Contactless Limit successfully updated.')

'Verify Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/23_Verify - Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/24_Verify - Date  time'), 'Date & time')

'Screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4014297195396798587.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/25_Done'), 0)

'User navigated to Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/01_VerifyText - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user navigated to Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()

'User navigates inside Contactless Limit screen\r\n'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/02_UserTapsOn - Contactless Limit'), 0)

'Verify user navigated to Contactless Limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/05_PageTitle - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user naviates to Contactless Limit'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7953562804075974578.png')
Mobile.takeScreenshot()

'Verify the amount is changed to RM 300'
if (defLim.equals(amt)) {
    print('The default amount is RM 300')
}

'User taps on Back Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-122/04_TapOnBackButton'), 0)

'Verify user navigated back successfully'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-122/01_VerifyText - Contactless Limit'), 'Contactless Limit')

'Take Screenshot once user is Navigated Back'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7185501415981672631.png')
Mobile.takeScreenshot()
