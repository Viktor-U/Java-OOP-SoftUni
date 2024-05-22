package P03StudentSystem;

public class Student {
    private final String name;
    private final int age;
    private final double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {

        String studentFormat = String.format("%s is %s years old.", name, age);

        if (grade >= 5.00) {
            studentFormat += " Excellent student.";
        } else if (grade < 5.00 && grade >= 3.50) {
            studentFormat += " Average student.";
        } else {
            studentFormat += " Very nice person.";
        }
        return studentFormat;
    }
}
