package kr.hs.dgsw.java.first.oneClass;

public class Rectangle {

    int width;
    int height;

    int calculateArea() {
        return (width * height);
    }

    void printArea() {
        int area = calculateArea();

        System.out.printf("높이 : %d 너비 : %d 의 면적은 %d입니다\n", height, width, area);

        System.out.println("높이 : " + height + " 너비 : " + width + " 의 면적은 " + area + "입니다");
    }
}
