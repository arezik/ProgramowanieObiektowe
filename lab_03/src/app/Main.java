package app;

import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.name = "Burek";
        myCat.name = "Karol";

        myDog.makeSound();
        myCat.makeSound();
    }

}
