package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student s;

    @BeforeEach
    void setUp() {
        s = new Student("67xxxxxxxx", "Test");
    }

    @Test
    @DisplayName("Test addScore Method")
    void testAddScore() {
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    @DisplayName("Test Grading method")
    void testCalculateGrade() {
        s.addScore(85.2);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("Test changeName Method")
    void testChangeName() {
        s.changeName("Joe");
        assertEquals("Joe", s.getName());
    }

    @Test
    @DisplayName("Test isId Method")
    void testIsId() {
        assertTrue(s.isId("67xxxxxxxx"));
        assertFalse(s.isId("68xxxxxxxx"));
    }

    @Test
    @DisplayName("Test isNameContains Method")
    void testIsNameContains() {
        assertTrue(s.isNameContains("Test"));
        assertFalse(s.isNameContains("Joe"));
    }

    @Test
    @DisplayName("Test toString Method")
    void testToString() {
        String expected = "{id: '67xxxxxxxx', name: 'Test', score: 0.0}";
        assertEquals(expected, s.toString());
    }
}