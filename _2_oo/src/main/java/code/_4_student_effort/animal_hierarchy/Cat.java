package code._4_student_effort.animal_hierarchy;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        Cat cat = new Cat("");
    }

    @Override
    public void eat() {
        System.out.println("Cats eats mouse");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {
        System.out.println("The cat plays with a ball");
    }
}
