import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void testAddStudent() {
        assertEquals("Added student successfully!", Student.addStudent());
    }

    @Test
    void testViewStudent() {
        assertEquals("Student : ABC", Student.viewStudent());
    }
}
