package session2;

public class Student {
    private String name;
    private String facultyName;
    private String cityName;
    private String javaLevel;

    public void setName (String name) {
        this.name = name;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getJavaLevel() {
        return javaLevel;
    }

    public void setJavaLevel(String javaLevel) {
        this.javaLevel  = javaLevel;
    }


    public void printDetails() {
        System.out.println(name + " Java skills level is " + javaLevel);
    }

}