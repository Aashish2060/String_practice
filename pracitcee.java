public class pracitcee  {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Call the reverseString function
        String reversed = reverseString(str);

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); // Reverse and return as a string
    }
}

