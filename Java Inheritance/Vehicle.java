class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    public void drive() {
        System.out.println("Driving the motorcycle");
    }
}

