class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public void move() {
        System.out.println("The animal moves");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    @Override
    public void move() {
        System.out.println("The dog runs");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }

    @Override
    public void move() {
        System.out.println("The cat walks");
    }
}

class Bird extends Animal {

    public void makeSound() {
        System.out.println("The bird chirps");
    }


    public void move() {
        System.out.println("The bird flies");
    }
}



