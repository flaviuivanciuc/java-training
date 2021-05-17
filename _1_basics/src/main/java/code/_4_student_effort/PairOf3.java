package code._4_student_effort;

public class PairOf3 {

    public int pairOf3(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        result += 1;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
