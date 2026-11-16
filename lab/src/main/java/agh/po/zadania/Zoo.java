package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;


public class Zoo {
    private Animal[] animals = new Animal[100];

    public void fillZoo() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0 -> animals[i] = new Parrot("Papuga " + (i + 1));
                case 1 -> animals[i] = new Dog("Pies " + (i + 1));
                case 2 -> animals[i] = new Snake("Wąż " + (i + 1));
            }
        }
    }

    public int countLegs() {
        int totalLegs = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                int legs = animal.getLegs();
                totalLegs += legs;
            }
        }
        return totalLegs;
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.fillZoo();
        System.out.println(zoo.countLegs());
        System.out.println(zoo.animals[0].getDescription());
        zoo.animals[1].makeSound();
    }
}
