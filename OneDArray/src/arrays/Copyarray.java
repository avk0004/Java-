package arrays;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1, 2, 3, 4,2};
		int[] arr1 = arr.clone();
		for(int a:arr1) {
			System.out.println(a);
		}
	}

}
