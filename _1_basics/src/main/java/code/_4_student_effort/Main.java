package code._4_student_effort;

public class Main {

    public static void main(String[] args) {

        // Challenge #1
        FizzBuzz fizzBuzzObject = new FizzBuzz();
        fizzBuzzObject.printFizzBuzz();

        // Challenge #2
        FooBarQix fooBarQix = new FooBarQix();
        System.out.println(fooBarQix.compute(33));

        // Challenge #3
        PairOf2 pairOf2 = new PairOf2();
        System.out.println(pairOf2.pairOf2(new int[]{1, 1, 0, -1, -1}));

        // Challenge #4
        PairOf3 pairOf3 = new PairOf3();
        System.out.println(pairOf3.pairOf3(new int[]{-1, -1, -1, 2}));

    }
}
