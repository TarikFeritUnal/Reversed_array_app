import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements for the array: ");
        int elementCount = sc.nextInt();

        int sum = 0;
        int index = -1;

        int[] array = new int[elementCount];

        for (int i = 0; i < elementCount; i++) {
            System.out.println("Enter the " + (i) + ". " + "element of the array: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Reversed array: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}