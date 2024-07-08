import java.util.Scanner;

public class InsertElements {
    public static void main(String[] args) {
        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 Elements: ");
        for (i=0; i<10; i++)
            arr[i] = scan.nextInt();

        System.out.println("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\nNow the new array is: ");
        for (int j = 0; j < 11; j++) {
            System.out.print(arr[j] + " ");

        }



    }
}
