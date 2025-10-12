package p1;

public class Triangle {
	public static void main(String[] args) {
		int n = 5;
		for(int i =0;i<n;i++) {
			int temp =i;
			for(int j = 0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k =0;k<(i*2)+1;k++) {
				System.out.print(Math.abs(temp--));					
			}
			
			System.out.println();

		}
		
	}

}
