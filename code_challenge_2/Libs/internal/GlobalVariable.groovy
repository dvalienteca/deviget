package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object search_for_text
     
    /**
     * <p></p>
     */
    public static Object page_number
     
    /**
     * <p></p>
     */
    public static Object choose_premium_prod
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['search_for_text' : 'Samsung', 'page_number' : '5', 'choose_premium_prod' : 3])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        search_for_text = selectedVariables['search_for_text']
        page_number = selectedVariables['page_number']
        choose_premium_prod = selectedVariables['choose_premium_prod']
        
    }
}
