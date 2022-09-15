package Creational.Builder;

public class Car {
    private String color;
    private String engine;
    private String wheels;
    private String seats;

    private Car(CarBuilder builder) {
        this.color = builder.color;
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }

    public static class CarBuilder {
        private String color;
        private String engine;
        private String wheels;
        private String seats;

        public CarBuilder(String color, String engine) {
            this.color = color;
            this.engine = engine;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(String seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car = new CarBuilder("red", "v8").setSeats("leather").setWheels("alloy").build();
        System.out.println(car);
    }
}
