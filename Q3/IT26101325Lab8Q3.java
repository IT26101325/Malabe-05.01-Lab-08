import java.util.Scanner;

public class IT26101325Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {

            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        // Display array contents
        System.out.println("\nArray Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Find maximum
        int maximum = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + maximum);

        input.close();
    }
}