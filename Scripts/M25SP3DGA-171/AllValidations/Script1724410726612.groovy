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

'Verify user is navigated to dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/01_VerifyTextDashboard - Quick Actions'), 'Quick Actions')

'Take screenshot of the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3681443419436131440.png')
Mobile.takeScreenshot()

'Tao on the Accounts from the footer'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/02_TapOnAccounts'), 0)

Mobile.delay(4)

'Verify user is on the Accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/03_VerifyText- ACCOUNTS'), 'ACCOUNTS')

'Take screenshot of the Accounts'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2278992190105423702.png')
Mobile.takeScreenshot()

'Verify Global Access Account-i is visible'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/05_Verify_GAA_Text - Global Access Account-i'), 
    'Global Access Account-i')

'Verify if the Account number is visible'
//Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-171/06_VerifyAccNoVisible - 9000 0001 7559'), 0)

'Verify the amount is Present on the G1A tile'
//Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-171/07_VerifyAmountVisible- RM 13,057.29'), 0)

'User tap on Global Access Account-i'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/08_UserTapOn - Global Access Account-i'), 0)

'Verify screen once user navigated inside GAA'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/09_VerifyText - Accounts'), 'Accounts')

'Take screenshot once the user navigate inside Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3013957433880442789.png')
Mobile.takeScreenshot()

'Verify Total Currency value is correct'
//Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/10_VerifyCurrentBalance - RM 13,057.29'), 0)

'Verify the balance is sdisplayed correctly in the MYR tile'
//Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-171/11_VerifyMYRtileBalance - MYR 13,057.29'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
//Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'), 
    'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()
//-----------------------------------------------------------------------USD--------------------------------------------------------------------------------

'Tap on USD tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/31_TapUSDTile - USD 0.00'), 0)
//Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/102_VerifyUDSMYRAmt -  MYR 0.00'), 0)

'Verify USD Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/101_VerifyUSDAmt - USD 0.00'), 0)

'Verify USD to MYR Converted Currency value is correct'
//Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/102_VerifyUDSMYRAmt -  MYR 0.00'), 0)
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/32_VerifyUSDTileMYR - MYR 0.00'), '≈MYR 0.00')

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'), 
    'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//----------------------------------------------------------------------------GBP-----------------------------------------------------------------------------

Mobile.delay(3)

'Tap on GBP tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/33_TapGBPTile - GBP 0.00'), 0)

//Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/103_VerifyGBPAmt - GBP 0.00'), 0)

'Verify GBP Currency value is correct'

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/103_VerifyGBPAmt - GBP 0.00'), 'GBP 0.00')

'Verify GBP to MYR Converted Currency value is correct'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/34_VerifyGBPTileMYR- MYR 0.00'), '≈MYR 0.00')

//Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/104_VerifyGBPMYRAmt -  MYR 0.00'), '≈ MYR 0.00')

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

//-------------------------------------------------------------------------EUR--------------------------------------------------------------------------------

'Tap on EUR tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/105_VerifyEURAmt - EUR 0.00'), 0)

'Verify EUR Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/105_VerifyEURAmt - EUR 0.00'), 0)

'Verify EUR to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/106_VerifyEURMYRAmt-  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//--------------------------------------------------------------AUD------------------------------------------------------------------------------------

'Tap on AUD tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/107_VerifyAUDAmt - AUD 0.00'), 0)

'Verify AUD Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/107_VerifyAUDAmt - AUD 0.00'), 0)

'Verify AUD to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/108_VerifyAUDMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

//-------------------------------------------------------------JPY-------------------------------------------------------------------------------------

'Tap on JPY tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/109_VerifyJPYAmt - JPY 0'), 0)

'Verify JPY Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/109_VerifyJPYAmt - JPY 0'), 0)

'Verify JPY to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/110_VerifyJPYMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//-------------------------------------------------------------SGD-------------------------------------------------------------------------------------

'Tap on SGD tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/111_VerifySGDAmt - SGD 0.00'), 0)

'Verify SGD Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/111_VerifySGDAmt - SGD 0.00'), 0)

'Verify SGD to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/112_VerifySGDMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')
//-------------------------------------------------------------AED-------------------------------------------------------------------------------------

'Tap on AED tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/113_VerifyAEDAmt - AED 0.00'), 0)

'Verify AED Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/113_VerifyAEDAmt - AED 0.00'), 0)

'Verify AED to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/114_VerifyAEDMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//-------------------------------------------------------------BND-------------------------------------------------------------------------------------

'Tap on BND tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/115_VerifyBNDAmt - BND 0.00'), 0)

'Verify BND Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/115_VerifyBNDAmt - BND 0.00'), 0)

'Verify BND to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/116_VerifyBNDMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')


//-------------------------------------------------------------CAD-------------------------------------------------------------------------------------

'Tap on CAD tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/117_VerifyCADAmt - CAD 0.00'), 0)

'Verify CAD Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/117_VerifyCADAmt - CAD 0.00'), 0)

'Verify CAD to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/118_VerifyCADMYRAmt-  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//-------------------------------------------------------------CHF-------------------------------------------------------------------------------------

'Tap on CHF tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/119_VerifyCHFAmt - CHF 0.00'), 0)

'Verify CHF Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/119_VerifyCHFAmt - CHF 0.00'), 0)

'Verify CHF to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/120_VerifyCHFMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

//-------------------------------------------------------------DKK-------------------------------------------------------------------------------------

'Tap on DKK tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/121_VerifyDKKAmt - DKK 0.00'), 0)

'Verify DKK Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/121_VerifyDKKAmt - DKK 0.00'), 0)

'Verify DKK to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/122_VerifyDKKMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//-------------------------------------------------------------HDK-------------------------------------------------------------------------------------

'Tap on HKD tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/123_VerifyHKDAmt - HKD 0.00'), 0)

'Verify HKD Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/123_VerifyHKDAmt - HKD 0.00'), 0)

'Verify HKD to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/124_VerifyHKDMYRAmt-  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')


//-------------------------------------------------------------NOK-------------------------------------------------------------------------------------
'Tap on NOK tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/125_VerifyNOKAmt - NOK 0.00'), 0)

'Verify NOK Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/125_VerifyNOKAmt - NOK 0.00'), 0)

'Verify NOK to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/126_VerifyNOKMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//-------------------------------------------------------------NZD-------------------------------------------------------------------------------------

'Tap on NZD tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/127_VerifyNDZAmt - NZD 0.00'), 0)

'Verify NZD Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/127_VerifyNDZAmt - NZD 0.00'), 0)

'Verify NZD to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/128_VerifyNDZMYRAmt-  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

//-------------------------------------------------------------QAR-------------------------------------------------------------------------------------
'Tap on QAR tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/129_VerifyQARAmt - QAR 0.00'), 0)

'Verify QAR Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/129_VerifyQARAmt - QAR 0.00'), 0)

'Verify QAR to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/130_VerifyQARMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)


//-------------------------------------------------------------SAR-------------------------------------------------------------------------------------
'Tap on SAR tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/131_VerifySARAmt- SAR 0.00'), 0)

'Verify SAR Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/131_VerifySARAmt- SAR 0.00'), 0)

'Verify SAR to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/132_VerifySARMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

//-------------------------------------------------------------SEK-------------------------------------------------------------------------------------
'Tap on SEK tile'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-171/133_VerifySEKAmt - SEK 0.00'), 0)

'Verify SEK Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/133_VerifySEKAmt - SEK 0.00'), 0)

'Verify SEK to MYR Converted Currency value is correct'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/134_VerifySEKMYRAmt -  MYR 0.00'), 0)

'Swipe the screen '
Mobile.swipe(0, 400, 0, 0)

'Verify Current balance text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/12_CurrentBalanceText - Current balance'), 'Current balance')

'Verify Current balance amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/13_CurrentBalanceValue - MYR 13,057.29'), 0)

'Verify One Day Float text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/14_OneDayFloatText - One-day float'), 'One-day float')

'Verify One Day Float amount'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/15_OneDayFloatValue - MYR 0.00'), 0)

'Verify late clearing text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-171/16_VerifyText - Late clearingOutstation chequefloat'),
	'Late clearing/\nOutstation cheque\nfloat')

'Verify late clearing value'
Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-171/17_VerifyLateClearingValue- MYR 0.00'), 0)

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741259829651531764.png')
Mobile.takeScreenshot()

'Swipe the screen '
Mobile.scrollToText('Global Access Account-i')

WebUI.callTestCase(findTestCase('M25SP3DGA-171/HorizontalSwipeCurrencyTile'), [:], FailureHandling.CONTINUE_ON_FAILURE)
