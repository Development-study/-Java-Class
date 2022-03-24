package kr.hs.dgsw.java.dept23.d0324;

public class Dog {

    private final String name;
    private int age;

    public Dog() {
        this("몰라");
    }

    public Dog(String name) {
        System.out.println("생성자 호출됨");
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }

    public static void main(String[] args) {

        System.out.println("count : " + args.length);

        for (int i = 0; i < args.length; i++) {
            Dog dog = new Dog(args[i]);
            dog.sayHello();
        }

    }

}
