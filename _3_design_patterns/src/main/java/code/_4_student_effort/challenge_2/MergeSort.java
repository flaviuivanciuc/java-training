package code._4_student_effort.challenge_2;

public class MergeSort implements SortingStrategy {

    @Override
    public void sort(Integer[] array) {
        if (array.length < 2)
            return;

        // divide the array into half
        int middle = array.length / 2;

        Integer[] left = new Integer[middle];
        for (int i = 0; i < middle; i++)
            left[i] = array[i];

        Integer[] right = new Integer[array.length - middle];
        for (int i = middle; i < array.length; i++)
            right[i - middle] = array[i];

        // sort each half
        sort(left);
        sort(right);

        // merge the results
        merge(left, right, array);
    }

    private void merge(Integer[] left, Integer[] right, Integer[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }
}
