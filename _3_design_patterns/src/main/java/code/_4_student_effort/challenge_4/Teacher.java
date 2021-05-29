package code._4_student_effort.challenge_4;

import java.util.Arrays;

public class Teacher implements ObservedSubject {

    Observer[] students = new Observer[0];

    public void teach(String lesson) {
        for (Observer student : students)
            student.update(lesson);
    }

    @Override
    public void register(Observer obj) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = obj;
    }

    @Override
    public void unregister(Observer obj) {

    }

    @Override
    public void notifyObservers(String message) {

    }
}
