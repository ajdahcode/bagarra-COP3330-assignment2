package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isAnagram() {
        App app = new App();
        assertTrue(app.isAnagram("note","tone"));
        assertFalse(app.isAnagram("dope", "tone"));
    }
}