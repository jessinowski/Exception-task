public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        // Step 2:

        try {
            System.out.println(studentService.getRepo().findById("123"));
        } catch (NoStudentFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(studentService.getRepo().findById(savedStudent.id()));
        } catch (NoStudentFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
