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

//Mobile.startExistingApplication('com.maybank2u.life.uat')

'Launch App'
WebUI.callTestCase(findTestCase('AppVersion/AppVersion'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Navigate inside G1A'
WebUI.callTestCase(findTestCase('M25SP3DGA-1039/02_Navigate_Inside_G1A'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Tap on View Transactions'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/32_TapOn - View Transactions'), 0)

'Verify screen once the user navigated inside Transactions screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/33_VerifyElementText - Transactions'), 
    'Transactions')

Mobile.takeScreenshot()

//-------------------------------------------------------------Credit Amount without optional value---------------------------------------
'Capture the object for receiving amount from CASA account without optional field'
def CASANonopC = Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/0004_CASANonopC - LIANA HUDA BINTI LO CASA_To_G1A'), 
    0)

/*
 * def CASANonopC = Mobile.getText(findTestObject('Object
 * Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/34_NonOptionalReceive -
 * JAMIL IBRAHIM BIN Y CASA_To_G1A'), 0)
 */
////-----------------------------------------------------------Recepient Name-------------------------------------------------------------
CASANonopC0 = CASANonopC.replace(' *CASA_To_G1A', '')

def CASANonopC1 = CASANonopC0.contains('LINA HUDA BINTI LO')

String obj1 = 'LINA HUDA BINTI LO'

'Verify the Receipient name is available correctly'
if (CASANonopC1.equals(obj1)) {
    print('Receipient name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASANonopC2 = CASANonopC.replace('LINA HUDA BINTI LO *', '')

def CASANonopC3 = CASANonopC2.contains('CASA_To_G1A')

String obj2 = 'CASA_To_G1A'

'Verify the Receipient Reference is available correctly'
if (CASANonopC3.equals(obj2)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASANonopC4 = CASANonopC.replace('LINA HUDA BINTI LO ', '')

CASANonopC5 = CASANonopC4.replace('CASA_To_G1A', '')

def CASANonopC6 = CASANonopC5.contains('*')

String obj3 = '*'

'Verify the "*" saperator is present between Receipient name and Receipient reference'
if (CASANonopC6.equals(obj3)) {
    print('Saperator is visible')
}

'Verify the amount credited is correct'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/34.1_NonOptionalAmountReceive - RM 1.00'), 
    'RM 1.00')

//--------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------Credit Amount with optional value-----------------------------------------------
'Capture the object for receiving amount from CASA account with optional field'
def CASAOptC =Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/0003_CASAOptC - CASA-G1A-Optional LIANA HUDA BINTI LO CASA_To_G1A_Op'), 
    0)

/*
 * def CASAOptC = Mobile.getText(findTestObject('Object
 * Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/35_OptionalReceive -
 * CASA-G1A-Optional JAMIL IBRAHIM BIN Y CASA_To_G1A_Op'), 0)
 */
////-----------------------------------------------------------Payment Details--------------------------------------------------------------
CASAOptC7 = CASAOptC.replace(' LINA HUDA BINTI LO *CASA_To_G1A_Op', '')

def CASAOpt8 = CASAOptC7.contains('CASA-G1A-Optional')

String obj4 = 'CASA-G1A-Optional'

'Verify the Payment Details is available correctly'
if (CASAOpt8.equals(obj4)) {
    print('Payment Details is correct')
}

//-------------------------------------------------------------Receipient Name----------------------------------------------------------------
CASAOptC9 = CASAOptC.replace('CASA-G1A-Optional ', '')

CASAOptC10 = CASAOptC9.replace(' *CASA_To_G1A_Op', '')

def CASAOptC11 = CASAOptC10.contains('LINA HUDA BINTI LO')

String obj5 = 'LINA HUDA BINTI LO'

'Verify the Receipient Name is available correctly'
if (CASAOptC11.equals(obj5)) {
    print('Receipient Name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASAOptC12 = CASAOptC.replace('CASA-G1A-Optional LINA HUDA BINTI LO *', '')

def CASAOptC13 = CASAOptC12.contains('CASA_To_G1A_Op')

String obj6 = 'CASA_To_G1A_Op'

'Verify the Receipient Reference is available correctly'
if (CASAOptC13.equals(obj6)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASAOptC14 = CASAOptC.replace('CASA-G1A-Optional LINA HUDA BINTI LO ', '')

CASAOptC15 = CASAOptC14.replace('CASA_To_G1A_Op', '')

def CASAOptC16 = CASAOptC15.contains('*')

def obj7 = '*'

'Verify the "*" saperator is present between Receipient name and Receipient reference'
if (CASAOptC16.equals(obj7)) {
    print('Saperator is visible')
}

'Verify the amount credited is correct'
String CASAOptAmtC = Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/35.1_OptionalAmountReceive - RM 1.00'), 
    'RM 1.00')

//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Debit Amount without optional value---------------------------------------
'Capture the object for amount debited from CASA account with optional field'
def CASANonopD = Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/0002_CASANonoptD- LIANA HUDA BINTI LO G1A_To_CASA'), 
    0)

	/*def CASANonopD = Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/36.2 - JAMIL IBRAHIM BIN Y G1A_To_CASA'), 
    0)
*/
////-----------------------------------------------------------Recepient Name-------------------------------------------------------------
'Capture the object for amount debited from G1A account without optional field'
CASANonopD0 = CASANonopD.replace(' *G1A_To_CASA', '')

def CASANonopD1 = CASANonopD0.contains('LINA HUDA BINTI LO')

String obj8 = 'LINA HUDA BINTI LO'

'Verify the Receipient name is available correctly'
if (CASANonopD1.equals(obj8)) {
    print('Receipient name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASANonopD2 = CASANonopD.replace('LINA HUDA BINTI LO *', '')

def CASANonopD3 = CASANonopD2.contains('G1A_To_CASA')

String obj9 = 'G1A_To_CASA'

'Verify the Receipient Reference is available correctly'
if (CASANonopD3.equals(obj9)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASANonopD4 = CASANonopD.replace('LINA HUDA BINTI LO ', '')

CASANonopD5 = CASANonopD4.replace('G1A_To_CASA', '')

def CASANonopD6 = CASANonopD5.contains('*')

String obj10 = '*'

'Verify the "*" saperator is present between Receipient name and Receipient reference'
if (CASANonopD6.equals(obj10)) {
    print('Saperator is visible')
}

'Verify the amount debited is correct'
String CASANonopAmtD = Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/36.1_NonOptionalAmountDebit - -RM 1.00'), 
    '-RM 1.00')

//----------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------Debit Amount with optional value-----------------------------------------------
'Capture the object for receiving debited from G1A account with optional field'
def CASAOptD = Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/0001_CASAOptD - G1A_To_CASA_Optional LIANA HUDA BINTI LO G1A_To_CASA_Op'), 
    0)

	/*
	 * def CASAOptD = Mobile.getText(findTestObject('Object
	 * Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/37.2_ G1A-CASA-Optional
	 * JAMIL IBRAHIM BIN Y G1A_To_CASA_Op'), 0)
	 */
////-----------------------------------------------------------Payment Details--------------------------------------------------------------
CASAOptD7 = CASAOptD.replace(' LINA HUDA BINTI LO *G1A_To_CASA_Op', '')

def CASAOptD8 = CASAOptD7.contains('G1A-CASA-Optional')

String obj11 = 'G1A-CASA-Optional'

'Verify the Payment Details is available correctly'
if (CASAOptD8.equals(obj11)) {
    print('Payment Details is correct')
}

//-------------------------------------------------------------Receipient Name----------------------------------------------------------------
CASAOptD9 = CASAOptD.replace('G1A-CASA-Optional ', '')

CASAOptD10 = CASAOptD9.replace(' *G1A_To_CASA_Op', '')

def CASAOptD11 = CASAOptD10.contains('LINA HUDA BINTI LO')

String obj12 = 'LINA HUDA BINTI LO'

'Verify the Receipient name is available correctly'
if (CASAOptD11.equals(obj12)) {
    print('Receipient Name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASAOptD12 = CASAOptD.replace('G1A-CASA-Optional LINA HUDA BINTI LO *', '')

def CASAOptD13 = CASAOptD12.contains('G1A_To_CASA_Op')

String obj13 = 'G1A_To_CASA_Op'

'Verify the Receipient Reference is available correctly'
if (CASAOptD13.equals(obj13)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASAOptD14 = CASAOptD.replace('G1A-CASA-Optional LINA HUDA BINTI LO ', '')

CASAOptD15 = CASAOptD14.replace('G1A_To_CASA_Op', '')

def CASAOptD16 = CASAOptD15.contains('*')

def obj14 = '*'

'Verify the "*" saperator is available correctly'
if (CASAOptD16.equals(obj14)) {
    print('Saperator is visible')
}

//String CASAOptAmtC = Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/35.1_OptionalAmountReceive - RM 1.00'),'RM 1.00')
'Verify the debited amount is correct'
String CASAOptAmtD = Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/37.1_OptionalAmountDebit - -RM 1.00'), 
    '-RM 1.00')

'User taps on Close icon'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/38_TapOnClose'), 0)

'User navigated to Accounts screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/39_NavigatedBack- Your Currencies'), 
    'Your Currencies')

'Take screebshot of accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6270423313362732711.png')
Mobile.takeScreenshot()

'User taps on Back button'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/40_TapOnBackButton'), 0)

'User navigates back to Account list screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/06_VerifyG1ATransaction/41_VerifyText - ACCOUNTS'), 
    'ACCOUNTS')

'Screenshot for the accounts list screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7704607825414758047.png')
Mobile.takeScreenshot()
