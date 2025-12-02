import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] c = new int[a.length + b.length];

        int i = 0;

        for (int x : a) { 
            c[i++] = x; 
        }
        for (int x : b) { 
            c[i++] = x; 
        }

        System.out.println("Concatenated Array: " + Arrays.toString(c));
    }
}
