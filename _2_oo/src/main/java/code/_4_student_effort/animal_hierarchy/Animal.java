package code._4_student_effort.animal_hierarchy;

public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        if (legs == 4) {
            System.out.println("This animal walks well balanced because of his 4 legs");
        } else if (legs == 2) {
            System.out.println("This animal walks less better than an animal with 4 legs because he has only 2 legs");
        } else if (legs == 0) {
            System.out.println("This animal doesn't walks because he has no legs");
        } else if (legs > 4) {
            System.out.println("This animal walks very fast because has more than 4 legs");
        }
    }
}
