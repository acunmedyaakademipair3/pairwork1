public class Student extends User {
    private String role;
    private String studentNumber;
    private String studentClass;

    public Student(int id, String username, String name, String surname, String email, String role, String studentNumber, String studentClass) {
        super(surname, email, name, id, username);
        this.role = role;
        this.studentNumber = studentNumber;
        this.studentClass = studentClass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
