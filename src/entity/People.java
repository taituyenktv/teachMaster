package entity;

public class People {
    private String name;

    private int age;

    public People(String name, int agr) {
        this.name = name;

        this.age = agr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAgr() {
        return age;
    }

    public void setAgr(int agr) {
        this.age = agr;
    }

    @Override
    public String toString() {
        return
                "Họ tên: " + name +
                ", Tuổi: " + age +", "
                ;
    }
}
