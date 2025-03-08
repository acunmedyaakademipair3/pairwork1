public class Main {
    public static void main(String[] args) {
        var in = new InstructorManager();
        var instructor = new Instructor("teacher", "software", 4, "halit", "halitenes", "kalaycı", "kalaycı@admin.com");

        in.add(instructor);

        for (var instructorss : in.getAl()) {
            System.out.println(instructorss);
        }

        System.out.println("--------------------------------------");

        var newInstructor = new Instructor("teacher", "software", 4, "medeni", "medeni", "kartal" ,"medenikrtll@gmail.com");

        in.update(newInstructor);
        for (var instructorss : in.getAl()) {
            System.out.println(instructorss);
        }

        System.out.println("--------------------------------------");

        in.delete(instructor);
        for (var instructorss : in.getAl()) {
            System.out.println(instructorss);
        }
    }
}
