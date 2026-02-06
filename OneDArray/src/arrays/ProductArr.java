package arrays;

public class ProductArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int sum = 1;
		for(int a:arr) {
			sum *=a;
		}
		System.out.println(sum);	}
}
