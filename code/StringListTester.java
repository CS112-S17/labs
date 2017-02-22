
public class StringListTester {

	public static void main(String[] args) {
		StringList sl = new StringList(2);

		//test isEmpty with empty list
		boolean actualBoolean = sl.isEmpty();		
		boolean expectedBoolean = true;
		String passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test isEmpty [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);


		//test size with empty list
		int actualInt = sl.size();		
		int expectedInt = 0;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test size empty list [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);
		
		//test toString with empty list
		String actualString = sl.toString();
		String expectedString = "{}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test toString [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		sl.add("a");
		sl.add("b");
		sl.add("c");

		//test add
		actualString = sl.toString();
		expectedString = "{a,b,c}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test add [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test add at index
		sl.add(3, "d");
		actualString = sl.toString();
		expectedString = "{a,b,c,d}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test add at index [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test add at index - bad index
		sl.add(30, "e");
		actualString = sl.toString();
		expectedString = "{a,b,c,d}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test add bad index [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test contains true
		actualBoolean = sl.contains("b");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains true [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test contains false
		actualBoolean = sl.contains("z");		
		expectedBoolean = false;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains false [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test contains last
		actualBoolean = sl.contains("d");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains (last item) [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test contains first
		actualBoolean = sl.contains("a");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains (first item) [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test size
		actualInt = sl.size();		
		expectedInt = 4;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test size empty list [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		//test indexOf first
		actualInt = sl.indexOf("a");		
		expectedInt = 0;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test indexOf (first item) [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		//test indexOf last
		actualInt = sl.indexOf("d");		
		expectedInt = 3;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test indexOf (last item) [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		//test indexOf bad item
		actualInt = sl.indexOf("z");		
		expectedInt = -1;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test indexOf (bad item) [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		//test lastIndexOf 
		actualInt = sl.lastIndexOf("c");		
		expectedInt = 2;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test lastIndexOf [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		sl.add("b");
		//test lastIndexOf repeated
		actualInt = sl.lastIndexOf("b");		
		expectedInt = 4;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test lastIndexOf (repeated item) [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);


		//test lastIndexOf repeated
		actualInt = sl.lastIndexOf("b");		
		expectedInt = 4;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test lastIndexOf (repeated item) [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		//test get 
		actualString = sl.get(2);		
		expectedString = "c";
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test get [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test get bad index
		actualString = sl.get(25);		
		expectedString = null;
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test get (bad index) [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test remove middle
		actualString = sl.remove(2);		
		expectedString = "c";
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test remove (middle) [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test remove first
		actualString = sl.remove(0);		
		expectedString = "a";
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test remove (first) [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test remove bad index
		actualString = sl.remove(90);		
		expectedString = null;
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test remove (bad index) [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test remove last
		actualString = sl.remove(2);		
		expectedString = "b";
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test remove (last) [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test remove item
		actualBoolean = sl.remove("b");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test remove item [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test remove nonexistent item 
		actualBoolean = sl.remove("z");		
		expectedBoolean = false;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test remove nonexistent item [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test set 
		actualString = sl.set(0, "z");		
		expectedString = "d";
		passFail = (actualString == expectedString)?"PASS":"FAIL";
		System.out.println("test remove (last) [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test toString		
		actualString = sl.toString();
		expectedString = "{z}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test toString [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test isEmpty with non-empty list
		actualBoolean = sl.isEmpty();		
		expectedBoolean = false;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test isEmpty [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);
	}

}
