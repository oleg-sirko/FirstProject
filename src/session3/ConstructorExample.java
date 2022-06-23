package session3;

import session2.Student;

public class ConstructorExample {
    private String name;
    private int year;

    public ConstructorExample (String name, int year) {
        this.name = name;
        this.year = year;
    }

    public ConstructorExample (String name){
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }


}
