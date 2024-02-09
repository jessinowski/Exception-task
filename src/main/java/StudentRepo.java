import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(students.get(id));
    }

    // Step 1:
    // Extend the StudentDB with a findById method with a parameter id that returns a Student.
    // Step 2:
    // The findById method should throw an appropriate exception if no student with the Id exists.
    // Also consider what the "appropriate exception" might be.
    // A Checked Exception or an Unchecked Exception? An instance of a predefined or a self-written exception class?


    public Student findById(String id) throws NoStudentFoundException {
        Student student = students.get(id);
        if (student != null) {
            return student;
        } else {
            throw new NoStudentFoundException("No student found with ID: " + id);
        }
    }

}
