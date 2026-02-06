package arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1, 2,11, 3, 4,2};
		int h=arr[0];
		for(int a =1 ;a<arr.length;a++) {
			if(h<arr[a]) h = arr[a];
		}
		System.out.print(h);
	}

}
