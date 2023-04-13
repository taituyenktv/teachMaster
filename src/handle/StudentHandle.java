package handle;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public Student inputStudent(Scanner sc, int i) {
        System.out.println("Mời bạn nhập Tên học sinh thứ " + (i + 1) + ": ");
        String name = sc.nextLine();

        System.out.println("Mời bạn nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Mời bạn nhập học lực: ");
        String rank = sc.nextLine();
        return new Student(name, age, rank);

    }

    public Student updateRankBID(Scanner sc, ArrayList<Student> students) {
        System.out.println("Mời bạn nhập ID học sinh cần thay đổi học lực: ");
        int n = Integer.parseInt(sc.nextLine());
        for (Student id : students) {
            if (n == id.getId()) {


                return id;
            }
        }return null;
    }

    public boolean updaterank(Student student, String newRank) {

        if (student == null) return false;
        else {
            student.setRank(newRank);
        }
        return true;

    }

    public boolean inPutUpdateById(Student student, Scanner sc) {
        System.out.println("Mời bạn nhập học lực mới ");
        String newRank = sc.nextLine();

        StudentHandle studentHandle = new StudentHandle();
        boolean check = studentHandle.updaterank(student, newRank);
        if (check) {
            System.out.println("Cập nhật học lực thành công.");
        } else System.out.println("Không tìm thấy học sinh cần cập nhật.");

        return check;
    }


}