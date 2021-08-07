package clean.code.design_patterns.requirements;

import clean.code.design_patterns.builder_pattern.Car;
import clean.code.design_patterns.composite_pattern.Mammal;
import clean.code.design_patterns.composite_pattern.Reptile;

public class Main {
    public static void main(String[] args) {

        Reptile reptile = new Reptile();
        reptile.reproduce();

        Mammal mammal = new Mammal();
        mammal.reproduce();

        System.out.println("----------------------------------------------");

        Car audi = new Car.Builder("Audi")
                .model("A6")
                .doors(5)
                .color("Grey")
                .engineSize("2500 cmc")
                .yearOfProduction(2016)
                .build();

        Car volvo = new Car.Builder("Volvo")
                .model("XC90")
                .color("White")
                .doors(5)
                .engineSize("2000")
                .yearOfProduction(2020)
                .build();

        System.out.println(audi);
        System.out.println(volvo);
    }
}
