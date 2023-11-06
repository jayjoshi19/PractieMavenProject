package arrayEx;

public class AssignArrayToAnotherArray {

	public static void main(String args[]) {

	    int[]  arr1 = new int[50];
	    int[]  arr2 = new int[100];
	    arr1 = arr2;
	    System.out.println(arr1.length);

	    }

}
