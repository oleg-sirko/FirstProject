package session3;

public class Student {
    private String name;
    private String javaLevel;

    public Student(String name, String javaLevel) {
        this.name = name;
        this.javaLevel = javaLevel;
    }

    public void printDetails() {
        System.out.println(name + " Java skills level is " + javaLevel);
    }

}