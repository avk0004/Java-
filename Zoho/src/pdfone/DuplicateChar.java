package pdfone;
import java.util.*;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "programming";
		StringBuilder sb = new StringBuilder();
//		System.out.println();
		for (char c : str.toCharArray()) {
		    if (sb.indexOf(String.valueOf(c)) == -1) {
		        sb.append(c);
		    }
		}

		System.out.println(sb.toString()); 
		
		HashMap<Character,Integer> h = new HashMap<>();
		for(char ch :str.toCharArray()) {
			h.put(ch,h.getOrDefault(ch, 0)+1);
		}
		System.out.println(h);
		
		
	}

}
