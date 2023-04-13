package handle;

import entity.ClassManagement;

import java.util.Scanner;

public class ClassManaHandle {
    public ClassManagement inputCMana(Scanner sc){
        System.out.println("Mời nhập tên Quản lý : ");
        String name = sc.nextLine();

        System.out.println("Mời nhập tuổi : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Mời nhập tên lớp quản lý : ");
        String className = sc.nextLine();
        return new ClassManagement(name,age,className);
    }
}
