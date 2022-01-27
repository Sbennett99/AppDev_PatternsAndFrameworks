package JCF;

import java.util.ArrayList;

public class Test {

	
	public static void testList(){
		TestList objTestList = new TestList();
		objTestList.testArrayList();
		objTestList.testLinkedList();
	}
	public static void testPCompare(){
		TestList objTestList = new TestList();
		ArrayList<String> List = new ArrayList<String>();
		List.add("Ram");
		List.add("is");
		List.add("Ram");
		System.out.println(objTestList.isPalindrome(List));

	}
	public static void testStack(){

	}
}
