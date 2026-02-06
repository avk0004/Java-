package arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1, 2, 3, 4,2};
		for(int a =0;a<arr.length;a++) {
			for(int j = 0;j<arr.length;j++) {
				if(arr[a] == arr[j] && a !=j)
				{System.out.println(arr[a]);}
			}
		}

	}

}
