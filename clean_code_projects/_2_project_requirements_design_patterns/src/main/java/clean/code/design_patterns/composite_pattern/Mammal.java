package clean.code.design_patterns.composite_pattern;

public class Mammal implements Animal{

    Lion lion;

    public Mammal() {
        System.out.println("The mammals reproduce as follow:");
        this.lion = new Lion();
    }

    @Override
    public void reproduce() {
        lion.reproduce();
    }
}

class Lion implements Animal {

    @Override
    public void reproduce() {
        System.out.println("The young ones develop within the mother and are given birth to and breastfed by their mothers.");
    }
}
