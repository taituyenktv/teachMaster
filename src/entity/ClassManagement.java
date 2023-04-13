package entity;

public class ClassManagement extends People{
    private String className;

    public ClassManagement(String name, int agr, String className) {
        super(name, agr);
        this.className = className;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "Tên lớp: " + className
                ;
    }
}
