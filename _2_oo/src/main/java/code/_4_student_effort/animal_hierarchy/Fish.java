package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal {

    protected Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and doesn't have legs");
    }

    @Override
    public void eat() {

    }
}
