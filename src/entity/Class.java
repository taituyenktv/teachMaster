package entity;

import java.util.ArrayList;

public class Class {
    private String name;
    private String subject;
    private ArrayList<Student> students;

    public Class(String name, String subject, ArrayList<Student> students) {
        this.name = name;
        this.subject = subject;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return
                "Tên lớp:  " + name +
                ", Môn học: " + subject +
                ", Danh sách học sinh: " + students + " "
                ;
    }
}
