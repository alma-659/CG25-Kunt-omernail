import java.util.Arrays;

public class ThreeSumVariant {

    // Checks if there exist a, b, c such that 2*b = a + c
    public static boolean hasTriple(int[] A, int[] B, int[] C) {
        if (A == null || B == null || C == null) return false;

        Arrays.sort(A);
        Arrays.sort(B);

        // compute 2a
        int[] twoB = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            twoB[i] = 2 * B[i];
        }

        // first pick each elemnts of C or A then compute a + c and save it as D
        for (int c : C) {
            int[] D = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                D[i] = A[i] + c;
            }
            Arrays.sort(D);

            if (intersects(D, twoB)) return true;
        }
        return false;
    }

    // so, up to this point, we have two array: 1- int[] twoB 2- int[] D
    // after creating d then check if there is any intersections
    private static boolean intersects(int[] A, int[] B) {
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) return true;
            else if (A[i] < B[j]) i++;
            else j++;
        }
        return false;
    }
}
