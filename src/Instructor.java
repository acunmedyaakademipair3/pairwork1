public class Instructor extends User {
    private String role;
    private String Speciality;

    public Instructor(String role, String speciality, int id, String username, String name, String surname, String email) {
        super(surname, email, name, id, username);
        this.role = role;
        Speciality = speciality;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
