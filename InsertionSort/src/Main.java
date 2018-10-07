import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomArray = {1,2,3};
		insertionSort(randomArray,randomArray.length);
		System.out.println(Arrays.toString(randomArray));
		
		ArrayList<ArrayList<Integer>> collection =permutation(randomArray, randomArray.length);
		System.out.println(collection);
		
		ArrayList<ArrayList<Integer>> collectionSubset =subset(randomArray, randomArray.length);
		System.out.println(collectionSubset);
		
	}
	
	public static void insertionSort(int[] intArray,int n) {
		if(n>=2) {
		insertionSort(intArray, n-1);

			while(n>=2&&intArray[n-2]>intArray[n-1]) {
				int temp = intArray[n-2];
				intArray[n-2] = intArray[n-1];
				intArray[n-1]=temp;
				n--;
			}
		}//loop compare
			
	}
	public static ArrayList<ArrayList<Integer>> permutation(int[] intArray, int n) {
		ArrayList<ArrayList<Integer>> collection = new ArrayList<>();
		if(n==1) {
			ArrayList<Integer> oneIntegerArray = new ArrayList<>();
			oneIntegerArray.add(intArray[0]);
			collection.add(oneIntegerArray);
		}else if (n>1) {
			ArrayList<ArrayList<Integer>> previousArray= permutation(intArray, n-1);
			
			for (ArrayList<Integer> onePreviouseArray : previousArray) {
				for(int i =0;i<n;i++) {
					ArrayList<Integer> temp =(ArrayList<Integer>)onePreviouseArray.clone();
					temp.add(i, intArray[n-1]);
					collection.add(temp);
				}
			}

		}
		
		return collection;
		
	}
	public static ArrayList<ArrayList<Integer>> subset(int[] intArray, int n) {
		ArrayList<ArrayList<Integer>> collection = new ArrayList<>();
		if(n==1) {
			ArrayList<Integer> oneIntegerArray = new ArrayList<>();
			oneIntegerArray.add(intArray[0]);
			collection.add(oneIntegerArray);
			collection.add(new ArrayList<>());
		}else if (n>1) {
			ArrayList<ArrayList<Integer>> previousArray= subset(intArray, n-1);
			
			for (ArrayList<Integer> onePreviouseArray : previousArray) {
					ArrayList<Integer> temp =(ArrayList<Integer>)onePreviouseArray.clone();
					temp.add(intArray[n-1]);
					collection.add(temp);
					collection.add(onePreviouseArray);
			}

		}
		
		return collection;
		
	}
}
