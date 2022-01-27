package JCF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public void testArrayList(){
		
		
		List<Integer> objList = new ArrayList<>();
		
		objList.add(1);
		objList.add(3);
		objList.add(5);
		
		System.out.println("List is: "+objList);
		
		objList.remove(1);
		
		System.out.println("List after removing 1: "+objList);
		
	}
	
	
public void testLinkedList(){
		
		
		List<Integer> objList = new LinkedList<>();
		
		objList.add(1);
		objList.add(3);
		objList.add(5);
		
		System.out.println("List is: "+objList);
		
		objList.remove(1);
		
		System.out.println("List after removing 1: "+objList);
		
	}


public boolean isPalindrome(ArrayList<String> arr) {
	System.out.println(arr);
	ArrayList<String> reverse = reverse(arr);
	System.out.println(reverse);
	return arr.equals(reverse);
	
	
	
}
public ArrayList<String> reverse(ArrayList<String> a){
	if(a==null){
		return null;
	}
	ArrayList<String> r = new ArrayList<String>();
	for(int i = a.size()-1; i>=0; i--) {
		r.add(a.get(i));
	}
	return r;
}





}
