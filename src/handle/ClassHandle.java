package handle;

import entity.Class;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassHandle {

    public Class inputClass(Scanner sc,ArrayList<Student> students ) {

        StudentHandle studentHandle = new StudentHandle();
        System.out.println("Mời bạn nhập tên lớp : ");
        String className = sc.nextLine();

        System.out.println("Mời bạn nhập môn học : ");
        String subject = sc.nextLine();

        System.out.println("Mời bạn nhập danh sách lớp :");
        System.out.println("1. Mời bạn nhập số lượng học sinh : ");

        int n = Integer.parseInt(sc.nextLine());
        while (n < 0) {
            System.out.println("Mời bạn nhập lại số học sinh phải >0 ");
            n = Integer.parseInt(sc.nextLine());

        }
        for (int i = 0; i < n; i++) {
            Student student = studentHandle.inputStudent(sc, i);
            students.add(student);

        }
        return new Class(className, subject, students);
    }

    public ArrayList<Student> updateStudent(Scanner sc,ArrayList<Student> students) {

        StudentHandle studentHandle = new StudentHandle();

        System.out.println("1. Mời bạn nhập số lượng học sinh muốn thêm  : ");


        int n = Integer.parseInt(sc.nextLine());
        while (n < 0) {
            System.out.println("Mời bạn nhập lại số học sinh phải >0 ");
            n = Integer.parseInt(sc.nextLine());

        }
        for (int i = 0; i < n; i++) {
            Student student = studentHandle.inputStudent(sc, i);
            students.add(student);

        }
        return students;
    }
    public ArrayList<Student> clearStudent(Scanner sc, ArrayList<Student> students,ArrayList<Student> clStudent){
        System.out.println("Mời bạn nhập ID học sinh cần thay đổi học lực: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Student cl : students) {
            if (id == cl.getId()) {
                clStudent.add(cl);

                return clStudent;
            }
        }return null;
    }

}
