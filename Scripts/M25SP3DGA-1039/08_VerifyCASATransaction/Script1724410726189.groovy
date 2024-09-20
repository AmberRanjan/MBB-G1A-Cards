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
//Mobile.startExistingApplication('com.maybank2u.life.uat')

'User taps on CASA Account'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/42_TapOn - Personal Current Account'), 
    0)

'User navigates to CASA account '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/43_VerifyText - Accounts'), 
    'Accounts')

'Take screenshot of casa account '
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4456983175443209733.png')
Mobile.takeScreenshot()

'Tap on View Transactions'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/44_UserTapOn - View Transactions'), 
    0)

'User navigates inside transaction details screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/45_VerifyText- Transactions'), 
    'Transactions')

'Screenshot of transaction details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1482212791078782497.png')
Mobile.takeScreenshot()
//---------------------------------------------------------Debit - Non Optional---------------------------------------------------------------------------------------------
'User captures text for the transaction from CASA to G1A without optional field'
def CASANonOpD = Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/0001_CASANonOpD - LIANA HUDA BINTI LOCASA_To_G1A'), 
    0)

	/*
	 * def CASANonOpD = Mobile.getText(findTestObject('Object
	 * Repository/M25SP3DGA-1039/07_VerifyCASATransaction/
	 * 46_CASA_NonOptionalAccDebit - JAMIL IBRAHIM BIN YCASA_To_G1A'), 0)
	 */
////-----------------------------------------------------------Recepient Name-------------------------------------------------------------
CASANonOpD0 = CASANonOpD.replace('*CASA_To_G1A', '')

def CASANonOpD1 = CASANonOpD0.contains('JAMIL IBRAHIM BIN Y')

String obj1 = 'JAMIL IBRAHIM BIN Y'

'Validate the Receipient name is correct'
if (CASANonOpD1.equals(obj1)) {
    print('Receipient name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASANonOpD2 = CASANonOpD.replace('JAMIL IBRAHIM BIN Y*', '')

def CASANonOpD3 = CASANonOpD2.contains('CASA_To_G1A')

String obj2 = 'CASA_To_G1A'

'Validate the Receipient reference is correct'
if (CASANonOpD3.equals(obj2)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASANonOpD4 = CASANonOpD.replace('JAMIL IBRAHIM BIN Y', '')

CASANonOpD5 = CASANonOpD4.replace('CASA_To_G1A', '')

def CASANonopC6 = CASANonOpD5.contains('*')

String obj3 = '*'

'Validate the "*" saperator is correct'
if (CASANonopC6.equals(obj3)) {
    print('Saperator is visible')
}

'Verify the debited amount is correct'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/46.1_Casa_NonOptionalDebitAmt - -RM 1.00'), 
    '-RM 1.00')

//-------------------------------------------------------------Debit - Optional--------------------------------------------------------------------------------------------
'User captures text for the transaction from CASA to G1A with optional field'
def CASAOpD =Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/0002_CASAOpD- CASA-G1A-Optional LIANA HUDA BINTI LOCASA_To_G1A_Op'), 
    0)

/*
 * def CASAOpD = Mobile.getText(findTestObject('Object
 * Repository/M25SP3DGA-1039/07_VerifyCASATransaction/47_CASA_OptionalAccDebit -
 * CASA-G1A-Optional JAMIL IBRAHIM BIN YCASA_To_G1A_Op'), 0)
 */
////-----------------------------------------------------------Payment Details--------------------------------------------------------------
CASAOpD7 = CASAOpD.replace(' JAMIL IBRAHIM BIN Y*CASA_To_G1A_Op', '')

def CASAOpD8 = CASAOpD7.contains('CASA-G1A-Optional')

String obj4 = 'CASA-G1A-Optional'

'Validate the optional statement is displayed correctly'
if (CASAOpD8.equals(obj4)) {
    print('Payment Details is correct')
}

//-------------------------------------------------------------Receipient Name----------------------------------------------------------------
CASAOpD9 = CASAOpD.replace('CASA-G1A-Optional ', '')

CASAOpD10 = CASAOpD9.replace('*CASA_To_G1A_Op', '')

def CASAOpD11 = CASAOpD10.contains('JAMIL IBRAHIM BIN Y')

String obj5 = 'JAMIL IBRAHIM BIN Y'

'Validate the Receipient name is correct'
if (CASAOpD11.equals(obj5)) {
    print('Receipient Name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASAOpD12 = CASAOpD.replace('CASA-G1A-Optional JAMIL IBRAHIM BIN Y*', '')

def CASAOpD13 = CASAOpD12.contains('CASA_To_G1A_Op')

String obj6 = 'CASA_To_G1A_Op'

'Validate the Receipient reference is correct'
if (CASAOpD13.equals(obj6)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASAOpD14 = CASAOpD.replace('CASA-G1A-Optional JAMIL IBRAHIM BIN Y', '')

CASAOpD15 = CASAOpD14.replace('CASA_To_G1A_Op', '')

def CASAOpD16 = CASAOpD15.contains('*')

String obj7 = '*'

'Validate the "*" saperator is correct'
if (CASAOpD16.equals(obj7)) {
    print('Saperator is visible')
}

'Verify the debited amount is correct'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/47.1_CasaOptionalDebitAmt - -RM 1.00'), 
    '-RM 1.00')

//------------------------------------------------------------Credit - Non Optional---------------------------------------------------------------------------------------------
'User captures text for the transaction from G1A to CASA without optional field'
def CASANonOpC = Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/0003_CASANonnOpC - LIANA HUDA BINTI LOG1A_To_CASA'), 
    0)

/*
 * def CASANonOpC = Mobile.getText(findTestObject('Object
 * Repository/M25SP3DGA-1039/07_VerifyCASATransaction/48_CASA_NonOptionalCredit
 * - JAMIL IBRAHIM BIN YG1A_To_CASA'), 0)
 */
////-----------------------------------------------------------Recepient Name-------------------------------------------------------------
CASANonOpC17 = CASANonOpC.replace('*G1A_To_CASA', '')

def CASANonOpC18 = CASANonOpC17.contains('JAMIL IBRAHIM BIN Y')

String obj8 = 'JAMIL IBRAHIM BIN Y'

'Validate the Receipient name is correct'
if (CASANonOpC18.equals(obj8)) {
    print('Receipient name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASANonOpC19 = CASANonOpC.replace('JAMIL IBRAHIM BIN Y*', '')

def CASANonOpC20 = CASANonOpC19.contains('G1A_To_CASA')

String obj9 = 'G1A_To_CASA'

'Validate the Receipient name is correct'
if (CASANonOpC20.equals(obj9)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASANonOpC21 = CASANonOpC.replace('JAMIL IBRAHIM BIN Y', '')

CASANonOpC22 = CASANonOpC21.replace('G1A_To_CASA', '')

def CASANonOpC23 = CASANonOpC22.contains('*')

String obj10 = '*'

'Validate the "*" saperator is correct'
if (CASANonopC6.equals(obj10)) {
    print('Saperator is visible')
}

'Verify the credited amount is correct'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/48.1_CASA_NonOptionalCreditAmt - RM 1.00'), 
    'RM 1.00')

//---------------------------------------------------------------Credit - Optional-------------------------------------------------------------------------------------------
'User captures text for the transaction from G1A to CASA with optional field'
def CASAOpC =Mobile.getText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/0004_CASAOpC_ G1A_To_CASA_OptionalLIANA HUDA BINTI LOG1A_To_CASA_Op'), 
    0)

/*
 * def CASAOpC = Mobile.getText(findTestObject('Object
 * Repository/M25SP3DGA-1039/07_VerifyCASATransaction/49_CASA_OptionalCredit -
 * G1A-CASA-Optional JAMIL IBRAHIM BIN YG1A_To_CASA_Op'), 0)
 */
////-----------------------------------------------------------Payment Details--------------------------------------------------------------
CASAOpC24 = CASAOpC.replace(' JAMIL IBRAHIM BIN Y*G1A_To_CASA_Op', '')

def CASAOpC25 = CASAOpC24.contains('G1A-CASA-Optional')

String obj11 = 'G1A-CASA-Optional'

'Validate the Optional field value is correct'
if (CASAOpC25.equals(obj11)) {
    print('Payment Details is correct')
}

//-------------------------------------------------------------Receipient Name----------------------------------------------------------------
CASAOpC26 = CASAOpC.replace('G1A-CASA-Optional ', '')

CASAOpC27 = CASAOpC26.replace('*G1A_To_CASA_Op', '')

def CASAOpC28 = CASAOpC27.contains('JAMIL IBRAHIM BIN Y')

String obj12 = 'JAMIL IBRAHIM BIN Y'

'Validate the Receipient name is correct'
if (CASAOpC28.equals(obj12)) {
    print('Receipient Name is correct')
}

//-------------------------------------------------------------Receipient Reference------------------------------------------------------------
CASAOpC29 = CASAOpC.replace('G1A-CASA-Optional JAMIL IBRAHIM BIN Y*', '')

def CASAOpC30 = CASAOpC29.contains('G1A_To_CASA_Op')

String obj13 = 'G1A_To_CASA_Op'

'Validate the Receipient Reference is correct'
if (CASAOpC30.equals(obj13)) {
    print('Receipient Reference is correct')
}

//------------------------------------------------------------* Seperator----------------------------------------------------------------
CASAOpC31 = CASAOpC.replace('G1A-CASA-Optional JAMIL IBRAHIM BIN Y', '')

CASAOpC32 = CASAOpC31.replace('G1A_To_CASA_Op', '')

def CASAOpC32 = CASAOpC32.contains('*')

String obj14 = '*'

'Validate the "*" saperator is correct'
if (CASAOpC32.equals(obj14)) {
    print('Saperator is visible')
}

'Verify the credited amount is correct'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/49.1_CASA_OptionalCreditAmt - RM 1.00'), 
    'RM 1.00')

'User taps on Close button'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/50_TapOnClose'), 0)

'User taps on Back button'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/51_TapOnBackButton'), 0)

'User taps on Home'
Mobile.tap(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/52_TapOnHome'), 0)

'Verify once user navigates to Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP3DGA-1039/07_VerifyCASATransaction/53_VerifyText - Quick Actions'), 
    'Quick Actions')

'Screenshot of Dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6608309422328643882.png')
Mobile.takeScreenshot()
