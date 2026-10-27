public class Student {
    private String name;
    private String albumNumber;
    static int numberOfStudents;
    public static final String UNIVERSITY_PREFIX = "ALB-";

    public Student(String name, int albumNumberDigits) {
        this.name = name;
        this.albumNumber = UNIVERSITY_PREFIX + albumNumberDigits;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public String getAlbumNumber() {
        return albumNumber;
    }

    static int getNumberOfStudents() {
        return numberOfStudents;
    }
}
