import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTests {
    @Test
    public void testLinkedListAppend() {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);

        assertEquals(3, list.last());
    }
}
