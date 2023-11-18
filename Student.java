public class Student extends Person {
    private Classroom classroom;
    public Student(int id, String name, int age, boolean parent_permission) {
        super(id, name, age, parent_permission);
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }


}