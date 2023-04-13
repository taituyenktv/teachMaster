import com.intellij.ide.a.i.T;
import entity.ClassManagement;
import entity.Student;
import entity.TechMaster;
import handle.*;
import show.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Chào mừng bạn đến với trình quản lý lớp học TechMaster ====");
        ClassManaHandle classManaHandle = new ClassManaHandle();

        TeacherHandle teacherHandle = new TeacherHandle();
        ClassHandle classHandle = new ClassHandle();
        StudentHandle studentHandle = new StudentHandle();
        ArrayList<Student> students = new ArrayList<>();


        ArrayList<Class> classes = new ArrayList<>();
        TechMaster techMaster = new TechMaster(classHandle.inputClass(sc, students), teacherHandle.inputTeacher(sc), classManaHandle.inputCMana(sc));

        ArrayList<TechMaster> techMasters = new ArrayList<>();
        techMasters.add(techMaster);


        do {
            Menu menu = new Menu();
            menu.showMenu();
            int choose = Integer.parseInt(sc.nextLine());
            if (choose == 6) break;
            while (choose <= 0 || choose > 6) {
                System.out.println("Bạn chọn sai số mời bạn chọn lại!");
                choose = Integer.parseInt(sc.nextLine());
            }

            switch (choose) {
                case 1:

                    System.out.println(techMasters);

                    break;
                case 2:

                    classHandle.updateStudent(sc, students);
                    break;


                case 3:
                    Student student = studentHandle.updateRankBID(sc, students);
                    studentHandle.inPutUpdateById(student, sc);

                    break;
                case 4:
                    ArrayList<Student> clStudent =new ArrayList<>();
                    classHandle.clearStudent(sc,students,clStudent);
                    students.removeAll(clStudent);

                    break;

            }
        } while (true);


    }
}
