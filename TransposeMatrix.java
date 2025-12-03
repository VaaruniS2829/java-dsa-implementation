import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Matrix declaration
        int[][] a = new int[rows][cols];

        // Input elements
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Create transpose matrix
        int[][] t = new int[cols][rows];

        // Calculate transpose
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                t[j][i] = a[i][j];
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Print transposed matrix
        System.out.println("\nTranspose Matrix:");
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
