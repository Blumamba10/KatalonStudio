package cutomKeywords

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

public class TestObjectHelper {

	public static TestObject getTestObjectWithXpath(String xpath) {
		return new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath)
	}
}

