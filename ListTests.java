import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListTests {
    @Test
    public void testListFilterNoFilter() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        assertEquals(list, ListExamples.filter(list, (s) -> true));
    }

    @Test
    public void testListFilterNormal() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        assertEquals(Arrays.asList("1", "2", "4", "5"), ListExamples.filter(list, (s) -> !s.equalsIgnoreCase("3")));
    }

    @Test
    public void testListMerge() {
        List<String> listA = Arrays.asList("a", "b", "c", "d", "e");
        List<String> listB = Arrays.asList("f", "g", "h", "i", "j");

        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"), ListExamples.merge(listA, listB));
    }
}
