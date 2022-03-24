package kr.hs.dgsw.java.dept23.d0324;

import java.util.Scanner;

public class ScannerHomework {

    private final String name;

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }

    public ScannerHomework(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("강아지 이름을 입력하세요 : ");
            String name = scanner.next();
            if(name.equals("quit")) {
                break;
            }
            ScannerHomework dog = new ScannerHomework(name);
            dog.sayHello();
        }
    }

}
