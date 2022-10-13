import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

    @Test
    public void testReverseInPlaceArrayMultipleElements() {
        int[] input = { 1, 2, 3, 4, 5 };
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, input);
    }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

    @Test
    public void testReversedMultipleElements() {
        int[] input1 = { 1, 2, 3, 4, 5 };
        assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
    }

    @Test
    public void testAverageWithoutLowest() {
        double[] input = { };
        assertEquals(0.0D, ArrayExamples.averageWithoutLowest(input), 0.0D);
    }

    @Test
    public void testAverageWithoutLowestMultipleElements() {
        double[] input = { 1.0D, 2.0D, 3.0D, 4.0D, 5.0D };
        assertEquals(3.5D, ArrayExamples.averageWithoutLowest(input), 0.0D);
    }

    @Test
    public void testAverageWithoutLowestOneElement() {
        double[] input = { 1.0D };
        assertEquals(0.0D, ArrayExamples.averageWithoutLowest(input), 0.0D);
    }

    @Test
    public void testAverageWithMultipleLowestElements() {
        double[] input = { 1.0D, 1.0D, 2.0D, 3.0D, 4.0D, 5.0D };
        assertEquals(3.5D, ArrayExamples.averageWithoutLowest(input), 0.0D);
    }
}
