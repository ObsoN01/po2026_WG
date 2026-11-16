package agh.po.animals;

public class Snake extends Animal {
    public Snake(String name) {
        super(name, 0);
    }

    @Override
    public String getDescription() {
        return "Waz o imieniu " + name + ", liczba nóg: " + legs;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " syczy: Sss...");
    }
}
