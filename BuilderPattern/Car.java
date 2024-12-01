package BuilderPattern;

public class Car {
    private String color;
    private String engine;
    private int seats;

    // Private constructor to enforce the use of Builder
    private Car(Builder builder) {
        this.color = builder.color;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
    
    // Static nested Builder class
    public static class Builder {
        private String color;
        private String engine;
        private int seats;

        // Method to set color
        public Builder color(String color) {
            this.color = color;
            return this; // Return the builder itself for chaining
        }

        // Method to set engine
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        // Method to set seats
        public Builder seats(int seats) {
            this.seats = seats;
            return this;
        }

        // Final method to build the Car object
        public Car build() {
            return new Car(this); // Pass the builder to the Car constructor
        }
    }

}
