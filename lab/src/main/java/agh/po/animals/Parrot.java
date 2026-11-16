package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2);
    }

    @Override
    public String getDescription() {
        return "Papuga o imieniu " + name + ", liczba nóg: " + legs;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " mówi: Kra! Kra!");
    }
}
