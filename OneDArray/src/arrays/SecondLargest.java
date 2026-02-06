package arrays;

public class SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1, 2,11, 3, 4,2};
		int h=arr[0];
		int h1 =arr[0];
		for(int a =0 ;a<arr.length;a++) {
			if(h<arr[a]) h = arr[a];
			if(h<h1 && arr[a]>h1) h1 = arr[a];
		}
		System.out.print(h1);
	}

}
