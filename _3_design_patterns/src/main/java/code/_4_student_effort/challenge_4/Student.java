package code._4_student_effort.challenge_4;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}
