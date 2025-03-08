import java.util.*;

public class InstructorManager {
    private List<Instructor> instructors;

    public InstructorManager() {
        this.instructors = new ArrayList<>();
        instructors.add(new Instructor("teacher", "software", 1, "engin21", "engin", "demirog", "engindemirog@admin.com"));
        instructors.add(new Instructor("teacher", "software", 2, "muhammed", "muhammed", "inan", "muhammedinan@admin.com"));
        instructors.add(new Instructor("ceo", "management", 3, "gökhan", "gökhan", "mutlay", "gokhanmutlay@admin.com"));
    }

    public void add (Instructor instructor) {
        instructors.add(instructor);
    }
    public List<Instructor> getAl(){
        return instructors;
    }

    public Instructor getById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }

    public void delete (Instructor instructor) {
        instructors.remove(instructor);
    }

    public void update(Instructor instructor) {
        Instructor instructorToUpdate = getById(instructor.getId());
        if (instructorToUpdate != null) {
            instructorToUpdate.setRole(instructor.getRole());
            instructorToUpdate.setSpeciality(instructor.getSpeciality());
            instructorToUpdate.setId(instructor.getId());
            instructorToUpdate.setUsername(instructor.getUsername());
            instructorToUpdate.setName(instructor.getName());
            instructorToUpdate.setSurname(instructor.getSurname());
            instructorToUpdate.setEmail(instructor.getEmail());
        }
    }
}
