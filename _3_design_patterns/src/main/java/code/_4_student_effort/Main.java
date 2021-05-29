package code._4_student_effort;

import code._2_challenge._2_strategy.BubleSort;
import code._4_student_effort.challenge_1.ArrayCustomIterator;
import code._4_student_effort.challenge_2.BubbleSort;
import code._4_student_effort.challenge_2.SortingStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // challenge no.1
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // challenge no.2
        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArray = Arrays.copyOf(array, array.length);
        Integer[] copy02OfArray = Arrays.copyOf(array, array.length);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.displaySorted(new BubbleSort(), copy01OfArray);
    }
}
