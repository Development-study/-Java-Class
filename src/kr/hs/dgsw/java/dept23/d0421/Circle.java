package kr.hs.dgsw.java.dept23.d0421;

public class Circle extends Polygon{

    protected final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "원";
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.print();
    }
}
