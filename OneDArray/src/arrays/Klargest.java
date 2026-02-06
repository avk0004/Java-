package arrays;

public class Klargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1, 2, 3, 4};
		boolean f =false;
		for(int a =0;a<arr.length-1;a++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int n =2;
		for(int i =0;i<2;i++) System.out.println(arr[i]);


	}

}
