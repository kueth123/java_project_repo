public class Teacher extends Person {
    private String specialization;

    public Teacher(int age, boolean parentPermission, String name, String specialization) {
        super(age, parentPermission, name);
        this.specialization = specialization;
    }
}
