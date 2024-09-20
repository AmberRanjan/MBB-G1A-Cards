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

'Launch Existing Application '
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify the user is on the Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/01_VerifyElementText_UserIsOn - Card Management'), 
    'Card Management')

'Take Screenshot when the user is on Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8668892756506293484.png')
Mobile.takeScreenshot()

'Verify Text for the Change Card PIN mentioned correctly'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/02_VerifyElementTextForPinChange - Change Card PIN'), 
    'Change Card PIN')

'Tap on the Change Card PIN from the list'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/03_UserTapOnChangePin - Change Card PIN'), 0)

'Verify the Text when user is inside Change Card pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/04_VerifyElementText - Enter your 6-digit PIN'), 
    'Enter your 6-digit PIN')

'Verify Second line text "This PIN will be used for ATM withdrawals and purchases."'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/08_VerifyTextOnPinChangeScreen- This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'Take screenshot when the user is on PIN screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify the error message stating the PIN must consist of 6 digits'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/09_VerifyFooterError - PIN must consist of 6 digits'), 
    'PIN must consist of 6 digits.')

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'Delay to wait for the error toast bar to go away'
Mobile.delay(6)

'User enters the pin as 3 times 1'
for (int i = 0; i < 3; i++) {
    //Tap on Number 3 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify the error message stating the PIN must consist of 6 digits'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/09_VerifyFooterError - PIN must consist of 6 digits'), 
    'PIN must consist of 6 digits.')

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'Delay to wait for the error toast bar to go away'
Mobile.delay(6)

'User deletes the partial entered PIN'
for (int i = 0; i < 3; i++) {
    //Delete 3 inputs
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/10_DeleteButton'), 0)
}

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

/*'User enters the pin as 6 times 1'
for (int i = 0; i < 3; i++) {
    //Tap on Number 3 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
*/
'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take screenshot after the user entered the PIN'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8417514673740901779.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify Text when user navigates to the Re-enter your 6-digit PIN screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/07_VerifyElementText- Re-enter your 6-digit PIN'), 
    'Re-enter your 6-digit PIN')

'Verify Second line text "This PIN will be used for ATM withdrawals and purchases."'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/08_VerifyTextOnPinChangeScreen- This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'Take screenshot when the user navigates inside Re-enter Card Pin Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8783268698328687630.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify the error message stating the PIN must consist of 6 digits'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/09_VerifyFooterError - PIN must consist of 6 digits'), 
    'PIN must consist of 6 digits.')

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'Delay to wait for the error toast bar to go away'
Mobile.delay(6)

'User enters the pin as 3 times 1'
for (int i = 0; i < 3; i++) {
    //Tap on Number 3 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify the error message stating the PIN must consist of 6 digits'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/09_VerifyFooterError - PIN must consist of 6 digits'), 
    'PIN must consist of 6 digits.')

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'Delay to wait for the error toast bar to go away'
Mobile.delay(6)

'Usder deletes the partial entered PIN'
for (int i = 0; i < 3; i++) {
    //Delete 3 inputs
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/10_DeleteButton'), 0)
}

'Take screenshot when the user is on Change Card Pin screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'Delay to wait for the error toast bar to go away'
Mobile.delay(6)

'User Enters 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take Screenshot when the user entered the Pin '
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8417514673740901779.png')
Mobile.takeScreenshot()

'User taps on Check icon once the PIN is entered '
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

//--------------------------------------------------------EXPIRE---------------------------------------------------------------------------------------------
'Verify Screen when user is on secure2u authorization screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/11_Secure2UScreenText- Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify Text of the Secure2 U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/12_Secure2UAction - Change Card PIN'), 'Change Card PIN')

'Verify if Date and time is present on the Secure 2 U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/13_DateTime - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3646898636127289855.png')
Mobile.takeScreenshot()

'Delay for 50 seconds to get the session expire for Secure 2 U'
Mobile.delay(50)

'Verify the header of the decision screen stating Card PIN change unsuccessful'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/14_DecisionHeader - Card PIN change unsuccessful'), 
    'Card PIN change unsuccessful.')

'Verify Text on the decision screen stating the reason for the unsuccess'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/15_DecisionReasonUnsuccess - Secure2u has expired. Please perform the transaction again'), 
    'Secure2u has expired. Please perform the transaction again.')

'Verify the visibility of the reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/16_VerifyElement - Reference ID'), 'Reference ID')

'Verify the visibility of Date and time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/17_VerifyElement - Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3646898636127289855.png')
Mobile.takeScreenshot()

'User Taps on Done from the decision screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/18_UserTapsOnDone'), 0)

'Verify the user is on the Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/01_VerifyElementText_UserIsOn - Card Management'), 
    'Card Management')

'Take Screenshot when the user is on Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8668892756506293484.png')
Mobile.takeScreenshot()

'Verify Text for the Change Card PIN mentioned correctly'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/02_VerifyElementTextForPinChange - Change Card PIN'), 
    'Change Card PIN')

//------------------------------------------------------------------REJECT---------------------------------------------------------------------------------
'Tap on the Change Card PIN from the list'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/03_UserTapOnChangePin - Change Card PIN'), 0)

'Verify the Text when user is inside Change Card pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/04_VerifyElementText - Enter your 6-digit PIN'), 
    'Enter your 6-digit PIN')

'Verify the text on Crad PIN change screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/08_VerifyTextOnPinChangeScreen- This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'Take screenshot for the Pun Change Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take screenshot after the user entered the PIN'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8417514673740901779.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify Text when user navigates to the Re-enter your 6-digit PIN screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/07_VerifyElementText- Re-enter your 6-digit PIN'), 
    'Re-enter your 6-digit PIN')

'Verify the text on Crad PIN change screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/08_VerifyTextOnPinChangeScreen- This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take screenshot after the user entered the PIN'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8417514673740901779.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify when the user is on Secure 2 u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/11_Secure2UScreenText- Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the Secure 2 u screen text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/12_Secure2UAction - Change Card PIN'), 'Change Card PIN')

'Verify the presence of Date and Time on Secure 2 u screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/13_DateTime - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3646898636127289855.png')
Mobile.takeScreenshot()

'User taps on REJECT button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/19_RejectButton'), 0)

'Text from the decision screen stating Card PIN change unsuccessful'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/14_DecisionHeader - Card PIN change unsuccessful'), 
    'Card PIN change unsuccessful.')

'Text stating the reason for unsuccessful card PIN change'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/20_RejectUnsuccessfulReason - Your Secure Verification authorisation was rejected'), 
    'Your Secure Verification authorisation was rejected.')

'Reference Id presence on the screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/16_VerifyElement - Reference ID'), 'Reference ID')

'Date and time presence on the screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/17_VerifyElement - Date  time'), 'Date & time')

'Take Screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3646898636127289855.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/18_UserTapsOnDone'), 0)

'Verify the user is on the Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/01_VerifyElementText_UserIsOn - Card Management'), 
    'Card Management')

'Take Screenshot when the user is on Card Management Screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8668892756506293484.png')
Mobile.takeScreenshot()

//----------------------------------------------------------APPROVE--------------------------------------------------------------------------------------------

'Verify Text for the Change Card PIN mentioned correctly'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/02_VerifyElementTextForPinChange - Change Card PIN'), 
    'Change Card PIN')

'Tap on the Change Card PIN from the list'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/03_UserTapOnChangePin - Change Card PIN'), 0)

'Verify the Text when user is inside Change Card pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/04_VerifyElementText - Enter your 6-digit PIN'), 
    'Enter your 6-digit PIN')

'Verify additional text present on the change pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/08_VerifyTextOnPinChangeScreen- This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'Take Screenshot before entering the pin'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2778307596094489711.png')
Mobile.takeScreenshot()

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take screenshot after the user entered the PIN'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8417514673740901779.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify Text when user navigates to the Re-enter your 6-digit PIN screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/07_VerifyElementText- Re-enter your 6-digit PIN'), 
    'Re-enter your 6-digit PIN')

'Verify additional text present on the change pin screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/08_VerifyTextOnPinChangeScreen- This PIN will be used for ATM withdrawals and purchases'), 
    'This PIN will be used for ATM withdrawals and purchases.')

'User enters the pin as 6 times 1'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/05_UserTapsOn - 1'), 0)
}

'Take screenshot after the user entered the PIN'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8417514673740901779.png')
Mobile.takeScreenshot()

'User taps on the Check icon to proceed to the next screen'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/06_UserTapsOnDone'), 0)

'Verify when the user is on Secure2U screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/11_Secure2UScreenText- Secure2u authorisation'), 
    'Secure2u authorisation')

'Verify the reason for which the secure2u screen is being used'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/12_Secure2UAction - Change Card PIN'), 'Change Card PIN')

'Check the presence of Date and time on the screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/13_DateTime - Date  time'), 'Date & time')

'Take screenshot of the Secure2U screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3646898636127289855.png')
Mobile.takeScreenshot()

'User taps on APPROVE button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/21_ApproveButton'), 0)

'Verify the decision screen stating card PIN successfully changed'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/22_DecisionSuccessHeader - Card PIN successfully changed'), 
    'Card PIN successfully changed.')

'Verify the presence of Reference ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/16_VerifyElement - Reference ID'), 'Reference ID')

'Verify the presence of Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/17_VerifyElement - Date  time'), 'Date & time')

'Take screenshot of the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3646898636127289855.png')
Mobile.takeScreenshot()

'User taps on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-113/18_UserTapsOnDone'), 0)

'Verify the user is on the Card Management Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-113/01_VerifyElementText_UserIsOn - Card Management'), 
    'Card Management')

Mobile.takeScreenshot()