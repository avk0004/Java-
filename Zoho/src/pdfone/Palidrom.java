package pdfone;

public class Palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var = "banana";
		int right = 1;
			for(int left =0;left<var.length()-1;left++) {
			if(var.charAt(left) == 'a' ||  (var.charAt(left) == 'e') || (var.charAt(left) == 'i') || (var.charAt(left) == 'o') || (var.charAt(left) == 'u') ) {
				right++;
			}

		}
		System.out.println("non Vowels \t"+ (var.length()-right));
		System.out.println("Vowels \t "+ right);


	}

}
