package src;
import java.util.*;
class Man{
	int n;
	int[] arr;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
		arr = new int[n];
	}
//	public int[] sortz(int n) {
//		int[] arr = new int[n];
//		Scanner sc = new Scanner(System.in);
//		for(int i =0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		return arr;
//	}
	public int[] arrange() {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++) {
			if (i %2 ==0) {
				for(int j =0;j<arr.length-2;j=j+2) {
					int temp=0;
					if(arr[j] > arr[j+2]) {
						temp = arr[j+2];
						arr[j+2] = arr[j];
						arr[j] = temp;
						
					}
					
				}
			}
			else {
				for(int j =1;j<arr.length-2;j= j+2) {
					int temp =0;
					if(arr[j] < arr[j+2]) {
						temp = arr[j+2];
						arr[j+2] = arr[j];
						arr[j] = temp;
						
					}
					
				}
			}
		}
		return arr;
	}
}
public class Main11 {
	public static void main(String[] args) {
		Man man = new Man();
		man.setN(6);
		int[] arr = man.arrange();
		for (int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
