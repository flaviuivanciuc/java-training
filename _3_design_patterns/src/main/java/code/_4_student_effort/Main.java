package code._4_student_effort;

import code._4_student_effort.challenge_1.ArrayCustomIterator;
import code._4_student_effort.challenge_2.BubbleSort;
import code._4_student_effort.challenge_2.MergeSort;
import code._4_student_effort.challenge_2.SortingStrategy;
import code._4_student_effort.challenge_3.Apartment;
import code._4_student_effort.challenge_3.RealEstateAgentProxy;
import code._4_student_effort.challenge_3.Student;
import code._4_student_effort.challenge_4.Teacher;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // challenge no.1
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        // challenge no.2
        System.out.println();

        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArray = Arrays.copyOf(array, array.length);
        Integer[] copy02OfArray = Arrays.copyOf(array, array.length);

        displaySorted(new BubbleSort(), copy01OfArray);
        displaySorted(new MergeSort(), copy02OfArray);

        // challenge no.3
        System.out.println();

        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();

        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);

        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);

        // challenge no.4
        System.out.println();

        Teacher teacher = new Teacher();
        code._4_student_effort.challenge_4.Student s01 = new code._4_student_effort.challenge_4.Student("Popescu");
        code._4_student_effort.challenge_4.Student s02 = new code._4_student_effort.challenge_4.Student("Ionescu");
        code._4_student_effort.challenge_4.Student s03 = new code._4_student_effort.challenge_4.Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = {
                "basics", "oo", "design patterns"
        };

        for (String topic : javaTopics)
            teacher.teach(topic);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] array) {
        strategy.sort(array);
        for (int number : array)
            System.out.print(number + " ");
        System.out.println();
    }
}
