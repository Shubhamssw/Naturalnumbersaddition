public class Sum
{
    public static void main(String[] args) {
        int sum = 0; // Initialize sum to zero

        // Loop through numbers from 1 to 50
        for (int i = 1; i <= 100; i++) {
            sum += i; // Add each number to sum
        }

        System.out.println("The sum of the first 100 numbers is: " + sum);
    }
}
