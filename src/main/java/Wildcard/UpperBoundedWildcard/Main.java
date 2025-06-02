package Wildcard.UpperBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(new Dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(new Animal());

//        Box<Date> dateBox = new Box<>();


        ExtendsWildcard.makeSound(dogBox);
        ExtendsWildcard.makeSound(catBox);
        ExtendsWildcard.makeSound(animalBox);

    }
}
