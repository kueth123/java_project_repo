

public class Teacher extends Person {
    private String specialization;

    public Teacher(int age, boolean parentPermission, String name, String specialization) {
        super(age, parentPermission, name);
        this.specialization = specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}


