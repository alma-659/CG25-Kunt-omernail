import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumVariantTest {

    @Test
    public void testExampleTrue() {
        int[] A = {1, 3, 5, 10};
        int[] B = {1, 2, 4, 5};
        int[] C = {1, 6};
        assertTrue(ThreeSumVariant.hasTriple(A, B, C));
    }

    @Test
    public void testNoTriple() {
        int[] A = {2, 4, 6};
        int[] B = {1, 3, 5};
        int[] C = {0, 1};
        assertFalse(ThreeSumVariant.hasTriple(A, B, C));
    }

    @Test
    public void testSingleValuesTrue() {
        int[] A = {4};
        int[] B = {3};
        int[] C = {2};
        assertTrue(ThreeSumVariant.hasTriple(A, B, C));
    }

    @Test
    public void testNegativeNumbers() {
        int[] A = {-2, 0, 3};
        int[] B = {1, 2};
        int[] C = {-1, 5};
        assertFalse(ThreeSumVariant.hasTriple(A, B, C));
    }

    @Test
    public void testEmptyArrays() {
        int[] A = {};
        int[] B = {};
        int[] C = {};
        assertFalse(ThreeSumVariant.hasTriple(A, B, C));
    }
}
