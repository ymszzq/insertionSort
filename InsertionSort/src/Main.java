import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomArray = {5,2,9,8,1,0,7};
		insertionSort(randomArray,randomArray.length);
		System.out.println(Arrays.toString(randomArray));
		
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

}
