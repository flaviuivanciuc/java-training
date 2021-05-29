package code._4_student_effort.challenge_2;

import java.util.Arrays;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {
        boolean isSorted;
        for (int i = 0; i < list.length; i++) {
            isSorted = true;
            for (int j = 1; j < list.length - i; j++)
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    isSorted = false;
                }
            if (isSorted)
                return;
        }
    }

    public void displaySorted(SortingStrategy sortingStrategy, Integer[] array) {
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
