import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.aliexpress.com/')

WebUI.delay(2)

'Verify if Promo Modal Present'
promo_modal_present = WebUI.verifyElementPresent(findTestObject('Page_Buy iiPhone and get free shipp/close_promo_modal'), 
    0)

if (promo_modal_present == true) {
    'Close Promo Modal'
    WebUI.click(findTestObject('Page_Buy iiPhone and get free shipp/close_promo_modal'))
}

'Search for item'
WebUI.setText(findTestObject('Page_AliExpress - Online Shopping f/input_Search'), GlobalVariable.search_for_text)

WebUI.click(findTestObject('Page_AliExpress - Online Shopping f/Search_button'))

'Scroll to bottom'
WebUI.scrollToPosition(0, 14000)

WebUI.delay(2)

'Click on GlobalVariable: <Page Number>'
modified_obj = WebUI.modifyObjectProperty(findTestObject('Page_Buy iiPhone and get free shipp/page_number'), 'text', 'equals', 
    GlobalVariable.page_number, true, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(modified_obj)
WebUI.delay(2)

'Scroll to bottom'
WebUI.scrollToPosition(0, 14000)

'Dinamically build xpath_locator for Premium Product based on variable <choose_premium_prod>'
xpath_locator = "//div[@id='p4p']/div[2]/div[" + GlobalVariable.choose_premium_prod + "]/div[2]/div/a"
print("xpath_locator:" + xpath_locator)
modified_obj = WebUI.modifyObjectProperty(findTestObject('Page_Buy iPhone and get free shippi/Premium_Related_Products_2'), 'xpath', 'equals',
	xpath_locator, true, FailureHandling.CONTINUE_ON_FAILURE)
'Click on Premium Product specified by variable <choose_premium_prod>'
WebUI.click(modified_obj)

'Switch to New Tab'
WebUI.switchToWindowIndex('1')

'Verify "Buy Now" button is shown'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Lovebay LED 2M Micro USB Cable/button_Buy Now'))

