package Poly2;

import java.util.concurrent.Callable;

public class AnimalMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

         soundAnimal(donkey);
         soundAnimal(dog);
         soundAnimal(cat);



            }
            private static void soundAnimal(Animal animal){
              animal.sound();
            }
        };

