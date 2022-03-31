package JCF.Assign4MinMax;

public class HeapPractice {
	
	public static Integer smallestMinHeap(MinHeap H)
	{
		// Write your logic
		
		return H.delete();
	}
	
	public static Integer largestMaxHeap(MaxHeap H)
	{
		// Write your logic
		
		return H.delete();
	}
	
	public static Integer largestMinHeap(MinHeap H)
	{
		int num = Integer.MIN_VALUE;
		while(!H.isEmpty()){
			num = H.delete();
		}

		return num;
	}
	
	public static Integer smallestMaxHeap(MaxHeap H)
	{
		int num = Integer.MAX_VALUE;

		while(!H.isEmpty()){
			num = H.delete();
		}
		return num;

	}
	
	public static void main(String[] args)
	{
		
		// Create Min Heap for 2, 5, 18, 10, 6, 22
		MinHeap H1 = new MinHeap();
		H1.insert(2);
		H1.insert(5);
		H1.insert(18);
		H1.insert(10);
		H1.insert(6);
		H1.insert(22);


		HeapPractice.displayLeaf(H1);
		System.out.println("Smallest of MinHeap:" +
					HeapPractice.smallestMinHeap(H1));
		System.out.println("Largest of MinHeap:" + 
				HeapPractice.largestMinHeap(H1));

		
		// Create Max Heap for 10, 9, 8, 7, 6, 5, 4
		MaxHeap H2 = new MaxHeap();
		H2.insert(10);
		H2.insert(9);
		H2.insert(8);
		H2.insert(7);
		H2.insert(6);
		H2.insert(5);
		H2.insert(4);
		System.out.println("Largest of MaxHeap:" + 
				HeapPractice.largestMaxHeap(H2));
	System.out.println("Smallest of MaxHeap:" + 
			HeapPractice.smallestMaxHeap(H2));

	}
	public static void displayLeaf(MinHeap H){
		int num;
		if(H.size() % 2 == 0){
			num = H.size()/2;
		}else{
			num = (H.size() + 1)/2;
		}
		int size = H.size();
		System.out.printf("Leaf Nodes: ");

		while(num  > 0 ){
			System.out.printf(H.findElement(H.size()-num+1 ) + " ");
			num -=1;

		}
		System.out.println();

	}

}
