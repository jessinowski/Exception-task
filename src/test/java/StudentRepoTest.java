import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepoTest {
    // Step 3:
    // Write at least one test that verifies this behavior.
    @Test
    void findById() {
        StudentRepo repo = new StudentRepo();
        assertThrows(NoStudentFoundException.class, () -> {repo.findById("123");});
    }
}