import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FileTests {
    @Test
    public void testFileGetFiles() throws IOException {
        File file = new File("./folder1");

        List<File> files = Arrays.asList(
                new File("./folder1"),
                new File("./folder1/folder2"),
                new File("./folder1/folder2/folder3")
        );

        assertEquals(files, FileExample.getFiles(file));
    }
}
