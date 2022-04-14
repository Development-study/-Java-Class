package kr.hs.dgsw.java.dept23.d0414;

public class Pig extends Animal{

    public Pig(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("꿀꿀");
    }

    public static void main(String[] args) {
        Animal pig = new Pig("돼지");

        pig.move();
        pig.eat("돼지고기");
        pig.makeSound();
    }
}
