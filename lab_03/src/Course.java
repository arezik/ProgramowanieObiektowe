public class Course {
    private String name;
    private int maxStudents;
    static int numberOfCreatedCourses;
    public static final int DEFAULT_MAX_STUDENTS = 30;

    public Course(String name) {
        this.name = name;
        this.maxStudents = DEFAULT_MAX_STUDENTS;
        numberOfCreatedCourses++;
    }

    public Course(String name, int maxStudents) {
        this.name = name;
        setMaxStudents(maxStudents);
        numberOfCreatedCourses++;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents <= 0) {
            System.out.println("Maksymalna liczba studentów musi być > 0!");
            return;
        }
        this.maxStudents = maxStudents;
    }

    public String getName() {
        return name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }
}
