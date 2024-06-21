package Poly2;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Dog(), new Dog(), new Dog()};

        for (Animal animal : animals) {
            soundAnimal(animal);

        }
    }
            private static void soundAnimal(Animal animal){
              animal.sound();
            }
        };

