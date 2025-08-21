package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    private StudentList s;

    @BeforeEach
    void setUp() {
        s = new StudentList();
        s.addNewStudent("6710400001", "First");
        s.addNewStudent("6710400002", "Second");
        s.addNewStudent("6710400003", "Third");
        s.addNewStudent("6710400004", "Fourth");
    }
    @Test
    @DisplayName("Test readData Method")
    void testReadData() {
        assertEquals("6710400001", s.getStudents().get(0).getId());
        assertEquals("First", s.getStudents().get(0).getName());
        assertEquals(4, s.getStudents().size());
    }
}