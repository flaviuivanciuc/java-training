package code._4_student_effort;

import code._4_student_effort.challenge_1.ArrayCustomIterator;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        // challenge no.1
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
