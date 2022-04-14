package kr.hs.dgsw.java.dept23.d0414;

public class Rabbit extends Animal{

    public Rabbit() {
        super("룰루");
    }

    @Override
    public void makeSound() {
        System.out.println("깡총깡총");
    }

    public static void main(String[] args) {
        Animal rabbit = new Rabbit();

        rabbit.move();
        rabbit.eat("당근");
        rabbit.makeSound();d
    }
}
