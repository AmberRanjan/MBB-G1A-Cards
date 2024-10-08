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

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/26_TapOn - Personal Current Account'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/27_VerifyText - Accounts'),
	'Accounts')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4048748041264085045.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/28_UserTapOnTransfer'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/29_VerifyText - Transfer To'),
	'Transfer To')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2554585654453119515.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/30_TapOn - Global Access Account-i'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/31_VerifyText - Transfer To'),
	'Transfer To')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7653144149636462672.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/13_TapNumber - 1'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/14_TapOn - 0'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/14_TapOn - 0'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7785579576996103587.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/15_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/16_VerifyText - Enter recipient reference'),
	'Enter recipient reference')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1225820430825356221.png')

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5648806581385782014.png')

Mobile.setText(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/17_SetTextForG1AtoCASAoptional'), 'CASA_To_G1A_Optional',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2471642506259329252.png')

Mobile.setText(findTestObject('Object Repository/M25SP3DGA-1039/05_TransferFromCASA_Optional/android.widget.EditText'),
	'CASA-G1A-Optional', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2471642506259329252.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/18_UserTapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/19_VerifyText - Confirmation'),
	'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2140062544050983951.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/21_TapOnTransferNow'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/22_DecisionScreen - Transfer successful'),
	'Transfer successful')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/23_Verify - Reference ID'),
	'Reference ID')

Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/24_Verify - Date  time'), 'Date & time')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot878163206338928513.png')

Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/03_TransferFromG1A/25_TapOnDone'), 0)




