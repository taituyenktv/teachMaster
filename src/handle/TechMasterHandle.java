package handle;

import entity.*;
import entity.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterHandle {
    public TechMaster inputTechMaster(Scanner sc,ArrayList<Student> students ){
        TeacherHandle teacherHandle= new TeacherHandle();
        ClassHandle classHandle = new ClassHandle();

        ClassManaHandle classManaHandle = new ClassManaHandle();
        Class name = classHandle.inputClass(sc,students);


        Teacher teacherName = teacherHandle.inputTeacher(sc);

        ClassManagement classManagement = classManaHandle.inputCMana(sc);
        return new TechMaster(name,teacherName,classManagement);

    }
}
