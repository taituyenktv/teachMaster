package entity;

public class Teacher extends People{
    private String teachingSubject;
    private String rank;

    public Teacher(String name, int agr, String teachingSubject, String rank) {
        super(name, agr);
        this.teachingSubject = teachingSubject;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "Môn giảng dạy: " + teachingSubject +
                ", Trình độ :" + rank + " "
                ;
    }
}
