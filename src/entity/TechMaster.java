package entity;

import java.util.ArrayList;

public class TechMaster {
    private Class name;
    private Teacher teacherName;
    private ClassManagement classManagementName;


    public TechMaster(Class name, Teacher teacherName, ClassManagement classManagementName) {
        this.name = name;
        this.teacherName = teacherName;
        this.classManagementName = classManagementName;
    }

    public Class getName() {
        return name;
    }

    public void setName(Class name) {
        this.name = name;
    }

    public Teacher getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(Teacher teacherName) {
        this.teacherName = teacherName;
    }

    public ClassManagement getClassManagementName() {
        return classManagementName;
    }

    public void setClassManagementName(ClassManagement classManagementName) {
        this.classManagementName = classManagementName;
    }

    @Override
    public String toString() {
        return "TeachMaster{" +
                 name +
                ", Tên giáo viên: " + teacherName +
                ", Tên quản lý: " + classManagementName +
                '}';
    }
}
