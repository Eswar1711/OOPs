
// Main class
public class Oops {
    public static void main(String[] args) {
        // Creating objects of different classes
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        Cat myCat = new Cat("Whiskers", 2, true);
        Fish myFish = new Fish("Nemo", 1);

        // Creating an array of animals
        Animal[] animals = {myDog, myCat, myFish};

        // Creating a zoo with the array of animals
        Zoo myZoo = new Zoo(animals);

        // Performing activities in the zoo
        myZoo.performActivities();
    }
}