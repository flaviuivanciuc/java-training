package clean.code.design_patterns.composite_pattern;

public class Reptile implements Animal {

    Crocodile crocodile;
    Snake snake;

    public Reptile() {
        this.crocodile = new Crocodile();
        this.snake = new Snake();
    }

    @Override
    public void reproduce() {
        System.out.println("The reptiles are reproducing as follow:");
        crocodile.reproduce();
        snake.reproduce();
    }
}

class Snake implements Animal {

    @Override
    public void reproduce() {
        System.out.println("The snakes lay eggs and give little care to their young ones.");
    }
}

class Crocodile implements Animal {

    @Override
    public void reproduce() {
        System.out.println("The crocodiles lay eggs and give little care to their young ones.");
    }
}
