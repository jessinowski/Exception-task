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
        StudentRepo studentRepo = new StudentRepo();

        try {
            System.out.println(studentRepo.findById("123"));
        } catch (NoStudentFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
