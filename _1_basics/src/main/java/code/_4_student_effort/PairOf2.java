package code._4_student_effort;

public class PairOf2 {

    public int pairOf2(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 0) {
                    result += 1;
                    break;
                }
            }
        }
        return result;
    }
}
