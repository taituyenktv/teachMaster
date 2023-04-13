package entity;

public class Student extends People{
    private static int AUTO_ID;
    private int id;
    private String rank;

    public Student(String name, int agr,  String rank) {
        super(name, agr);
        this.id = ++AUTO_ID;
        this.rank = rank;
    }

    public static int getAutoId() {
        return AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+
                "id=" + id +
                ", Học lực: " + rank +" "
                ;
    }
}
