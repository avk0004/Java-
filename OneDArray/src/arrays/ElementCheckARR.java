package arrays;

public class ElementCheckARR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int sum = 0;
		boolean f =false;
		for(int a:arr) {
			if(a == sum) { f = true; break;}
		}
		if(f) System.out.println("Found");
		else System.out.println("Not found");
	}

}
