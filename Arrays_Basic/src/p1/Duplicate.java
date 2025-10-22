package p1;

public class Duplicate {

    public static void main(String[] args) {
        int arr[] = {10, -1, 8, 10, 1, 10, 1, 1, 9, -1}; // Example with negative values

        // Boolean array to track which elements have been processed
        boolean[] processed = new boolean[arr.length];

        // Iterate through the array to find and print duplicates
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            
            // Skip already processed elements
            if (processed[i]) continue;

            // Count the occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If it's a duplicate and hasn't been processed yet
            if (count > 1) {
                // Mark subsequent occurrences as processed
                for (int k = i; k < arr.length; k++) {
                    if (arr[k] == arr[i]) {
                        processed[k] = true;  // Mark as processed
                    }
                }

                // Print the duplicate element and its count
                System.out.println(count + "\tindex\t" + arr[i]);
            }
        }
    }
}
