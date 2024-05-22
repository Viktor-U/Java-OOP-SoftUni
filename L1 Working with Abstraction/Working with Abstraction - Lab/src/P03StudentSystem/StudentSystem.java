package P03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> report;

    public StudentSystem() {
        this.report = new HashMap<>();
    }

    public void ParseCommand(String[] args) {
        String name = args[1];

        if (args[0].equals("Create")) {
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            Student student = new Student(name, age, grade);

            report.putIfAbsent(name, student);
        } else if (args[0].equals("Show")) {
            if (report.containsKey(name)){
            System.out.println(report.get(name));
            }
        }
    }
}
