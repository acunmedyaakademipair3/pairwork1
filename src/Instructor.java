public class Instructor extends User {
    private String role;
    private String speciality;

    public Instructor(String role, String speciality, int id, String username, String name, String surname, String email) {
        super(surname, email, name, id, username);
        this.role = role;
        this.speciality = speciality;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "role='" + role + '\'' +
                ", speciality='" + speciality + '\'' +
                ", id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
