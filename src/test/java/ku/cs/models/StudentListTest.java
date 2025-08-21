package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {
    private StudentList s;

    @BeforeEach
    void setUp() {
        s = new StudentList();
        s.addNewStudent("67001", "Test", 0.0);
    }

    @Test
    @DisplayName("Test addNewStudent Method")
    void testAddNewStudent() {
        s.addNewStudent(" 67002", "Messi", 10.0);
        assertEquals("67002", s.getStudents().get(1).getId());
        assertEquals("Messi", s.getStudents().get(1).getName());
        assertEquals(10.0, s.getStudents().get(1).getScore());
        assertEquals(2, s.getStudents().size());
    }

    @Test
    @DisplayName("Test findStudentById Method")
    void testFindStudentById() {
        assertEquals("67001", s.getStudents().get(0).getId());
    }

    @Test
    @DisplayName("Test filterByName Method")
    void testFilterByName() {
        assertEquals("Test", s.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("Test giveScoreToId Method")
    void testGiveScoreToId() {
        s.giveScoreToId("67001", 20.0);
        assertEquals(20.0, s.getStudents().get(0).getScore());
    }

    @Test
    @DisplayName("Test viewGradeOfId Method")
    void testViewGradeOfId() {
        assertEquals("F", s.getStudents().get(0).getGrade());
    }
}
