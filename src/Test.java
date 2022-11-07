public class Test {


    public static void main(String[] args) {
        Animal animal = new Animal("Penguin");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");


        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}