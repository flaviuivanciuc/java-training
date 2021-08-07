package clean.code.design_patterns.builder_pattern;

public class Car {
    private String name;
    private String model;
    private String engineSize;
    private String color;
    private int doors;
    private int yearOfProduction;

    public Car (Builder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.engineSize = builder.engineSize;
        this.color = builder.color;
        this.doors = builder.doors;
        this.yearOfProduction = builder.yearOfProduction;
    }

    public static class Builder {
        private final String name;
        private String model;
        private String engineSize;
        private String color;
        private int doors;
        private int yearOfProduction;

        public Builder (String name) {this.name = name;}

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder engineSize(String engineSize) {
            this.engineSize = engineSize;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder yearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
