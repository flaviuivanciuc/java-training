package code._4_student_effort;

public class FooBarQix {

    public String compute(int number) {
        String sufixFoo = "";
        String sufixBar = "";
        String sufixQix = "";
        String contains3 = "";
        String contains5 = "";
        String contains7 = "";

        if (number % 3 == 0) {
            sufixFoo = "Foo";
        }
        if (number % 5 == 0) {
            sufixBar = "Bar";
        }
        if (number % 7 == 0) {
            sufixQix = "Qix";
        }
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            if (String.valueOf(number).charAt(i) == '3') {
                contains3 = "Foo";
            }
            if (String.valueOf(number).charAt(i) == '5') {
                contains5 = "Bar";
            }
            if (String.valueOf(number).charAt(i) == '7') {
                contains7 = "Qix";
            }
        }

        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            return number + " => " + number;
        }

        return number + " => " + sufixFoo + sufixBar + sufixQix + contains3 + contains5 + contains7;
    }
}
