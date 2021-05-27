package code._4_student_effort.challenge_1;

public class ArrayCustomIterator {

    private int[] intArray;
    private int pointer;

    public ArrayCustomIterator() {
    }

    public ArrayCustomIterator(int[] intArray) {
        this.intArray = intArray;
        this.pointer = 0;
    }

    public boolean hasNext() {
        return this.pointer < this.intArray.length;
    }

    public int next() {
        return intArray[this.pointer++];
    }
}
