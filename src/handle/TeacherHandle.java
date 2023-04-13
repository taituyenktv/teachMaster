package handle;

import entity.Teacher;

import java.util.Scanner;

public class TeacherHandle {
    public Teacher inputTeacher(Scanner sc){
        System.out.println("Mời bạn nhập tên giảng viên : ");
        String name = sc.nextLine();

        System.out.println("Mời bạn nhập tuổi của giảng viên : ");
        int age= Integer.parseInt(sc.nextLine());
        while (age <= 0 ) {
            System.out.println("Mời bạn nhập lại tuổi!");
            age = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mời bạn nhập Môn giảng dạy");
        String teachingSubject = sc.nextLine();

        System.out.println("Mời các bạn nhập trình độ học vấn: ");
        String rank = sc.nextLine();
        return new Teacher(name,age,teachingSubject,rank);
    }
}
