package kr.hs.dgsw.java.first.oneClass;

public class Doer {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "고양이";
        cat.color = "빨강";

        cat.print();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 15;
        rectangle.height = 8;

        rectangle.printArea();
    }
}
