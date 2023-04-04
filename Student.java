public class Student implements Gradeable {
    public String name;
    public int id;
    public Java javaGrade;
    public Mathematics mathGrade;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.javaGrade = new Java();
        this.mathGrade = new Mathematics();
    }

    @Override
    public String getGrade() {
        return "Java Grade: " + javaGrade.getGrade() + " Mathematics Grade: " + mathGrade.getGrade();
    }
}
