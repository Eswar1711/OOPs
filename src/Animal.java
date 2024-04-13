// Animal class with encapsulation and abstraction
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic sound");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Inherited class for mammals
class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes a sound");
    }
}

// Dog class demonstrating inheritance, polymorphism, and encapsulation
class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Additional method specific to Dog class
    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

// Cat class demonstrating inheritance, polymorphism, and encapsulation
class Cat extends Mammal {
    private boolean isFriendly;

    public Cat(String name, int age, boolean isFriendly) {
        super(name, age);
        this.isFriendly = isFriendly;
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    // Additional method specific to Cat class
    public void purr() {
        System.out.println("Cat purrs");
    }

    // Getter method for the isFriendly property
    public boolean isFriendly() {
        return isFriendly;
    }
}

// Fish class demonstrating encapsulation and interface implementation
class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish makes bubbles");
    }

    @Override
    public void swim() {
        System.out.println("Fish swims gracefully");
    }
}

// Interface demonstrating abstraction
interface Swimmable {
    void swim();
}

// Zoo class demonstrating composition and polymorphism
class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void performActivities() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " is " + animal.getAge() + " years old.");
            animal.makeSound();

            // Check if the animal can swim ||
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }

            // Check if the animal is a cat and is friendly
            if (animal instanceof Cat && ((Cat) animal).isFriendly()) {
                System.out.println(animal.getName() + " is friendly!");
            }
        }
    }
}


