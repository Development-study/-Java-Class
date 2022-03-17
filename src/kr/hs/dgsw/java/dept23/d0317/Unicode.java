package kr.hs.dgsw.java.dept23.d0317;

import java.util.Scanner;

public class Unicode {

    Scanner scanner = new Scanner(System.in);

    public Character changeChar(int code) {
        char ch = (char)code;
        return ch;
    }

    public void printChar() {
        while(true) {
            System.out.print("Write : ");
            int value = scanner.nextInt();
            char chValue = changeChar(value);

            if(value == -1) {
                System.out.println("Program close");
                break;
            }

            System.out.printf("%d = %c\n", value, chValue);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Unicode unicode = new Unicode();
        unicode.printChar();
    }

}
