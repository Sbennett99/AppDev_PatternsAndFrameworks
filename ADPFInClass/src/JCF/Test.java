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

		TestStack objStack = new TestStack();
		objStack.testStack();
	}

	public static void testQueue(){
		System.out.println("\n\nTesting Queue now:");
		TestQueue objQueue = new TestQueue();
		objQueue.testPriorityQueue();

		objQueue.testPriorityQueueAdv();
	}

	public static void testDeque(){

		System.out.println("\n\nTesting Dequeue now:");

		TestDeque objDeque = new TestDeque();

		objDeque.testDeque();
		objDeque.testDequeAdv();
	}
	public  static void testSet(){
		System.out.println("\n\nTesting Set Now: ");
		TestSet setT = new TestSet();
		setT.testHashSet();
		System.out.println("ADV---------");
		setT.testHashSetAdvanced();
	}
	public static void testMap(){
		System.out.println("\n\nTesting Map Now:");
		TestMap tMap = new TestMap();

		tMap.testHashMap();
		System.out.println("ADV---------");
		tMap.testHashMapADV();


	}
	public static void testCollection(){
		System.out.println("\n\nTesting Collection Now:");
		TestCollection tCol = new TestCollection();

		tCol.testCollection();
		System.out.println("ADV---------");



	}

}
