public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kazi Rabeya", 123456);
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student ID: " + student1.id);
        System.out.println(student1.getGrade());
    }
}
