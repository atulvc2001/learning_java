import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args){
		
		int[] myarray1 = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2156,1457,2456};

		String[] myarray2 = {
			"java","python","php","C#","C programming","C++"
		};

		//Numeric array
		System.out.println("Original numeric array: " + Arrays.toString(myarray1));
		Arrays.sort(myarray1);
		System.out.println("Sorted numeric array: " + Arrays.toString(myarray1));

		//String array
		System.out.println("Original String array: " + Arrays.toString(myarray2));
		Arrays.sort(myarray2);
		System.out.println("Sorted String array: " + Arrays.toString(myarray2));
	}
}
