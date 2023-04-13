package handle;

import entity.*;
import entity.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterHandle {
    public TechMaster inputTechMaster(Scanner sc,ArrayList<Student> students ){
        TeacherHandle teacherHandle= new TeacherHandle();
        ClassHandle classHandle = new ClassHandle();

//        ArrayList<Class> classes = new ArrayList<>();
        ClassManaHandle classManaHandle = new ClassManaHandle();
//        System.out.println("Mời bạn nhập tên lớp: ");
        Class name = classHandle.inputClass(sc,students);
//        classes.add(name);


//        System.out.println("Mời bạn nhập tên giáo viên: ");
        Teacher teacherName = teacherHandle.inputTeacher(sc); ;

//        System.out.println("Mời bạn nhập tên quản lý: ");
        ClassManagement classManagement = classManaHandle.inputCMana(sc);
        return new TechMaster(name,teacherName,classManagement);

    }
}
