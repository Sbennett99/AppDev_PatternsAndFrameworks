package JCF;

import java.util.ArrayList;

public class Test {

	
	public static void testList(){
		System.out.println("\n\nTesting List now:");
		TestList objTestList = new TestList();
		objTestList.testArrayList();
		objTestList.testLinkedList();
	}
	public static void testPCompare(){
		System.out.println("\n\nTesting Palindrome now:");
		TestList objTestList = new TestList();
		ArrayList<String> List = new ArrayList<String>();
		List.add("Ram");
		List.add("is");
		List.add("Ram");
		System.out.println(objTestList.isPalindrome(List));

	}
	public static void testStack(){
		System.out.println("\n\nTesting Stack now:");
		TestStack objtestStack = new TestStack();
		objtestStack.testStack();
	}

	public static void testQueue(){
		System.out.println("\n\nTesting Queue now:");
		TestQueue objtestQueue = new TestQueue();
		objtestQueue.testQueue();
	}

	public static void testDequeue(){
		System.out.println("\n\nTesting Dequeue now:");
		TestDequeue objtestDequeue = new TestDequeue();
		objtestDequeue.testDequeue();
	}
}