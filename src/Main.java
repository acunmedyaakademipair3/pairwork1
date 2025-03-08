public class Main {
    public static void main(String[] args) {
        InstructorManager in = new InstructorManager();
        Instructor instructor = new Instructor("teacher", "software", 4, "halit", "halitenes", "kalaycı", "kalaycı@admin.com");

        in.add(instructor);

        for (Instructor instructorss : in.getAll()) {
            System.out.println(instructorss);
        }

        System.out.println("--------------------------------------");

        Instructor newInstructor = new Instructor("teacher", "software", 4, "medeni", "medeni", "kartal", "medenikrtll@gmail.com");

        in.update(newInstructor);
        for (Instructor instructorss : in.getAll()) {
            System.out.println(instructorss);
        }

        System.out.println("--------------------------------------");

        in.delete(instructor);
        for (Instructor instructorss : in.getAll()) {
            System.out.println(instructorss);
        }
    }
}
