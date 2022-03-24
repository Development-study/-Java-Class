package kr.hs.dgsw.java.dept23.d0324;

import java.util.Scanner;

public class Calculator {

    private final String operator;

    private final Scanner scanner;

    public Calculator(String operator) {
        this.operator = operator;
        this.scanner = new Scanner(System.in);
    }

    public int calculate(int operand1, int operand2) {
        if("+".equals(operator)){
            return operand1 + operand2;
        } else if("-".equals(operator)){
            return operand1 - operand2;
        } else if("*".equals(operator)) {
            return operand1 * operand2;
        } else if("/".equals(operator)){
            return operand1 / operand2;
        } else if("%".equals(operator)){
            return operand1 % operand2;
        } else {
            throw new RuntimeException("Unknown operator");
        }
    }

    public void execute() {
        while(true) {
            System.out.println("정수를 두 개 입력하세요.");
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();

            if(operand1 == 0 && operand2 == 0) {
                break;
            }

            int result = calculate(operand1, operand2);
            System.out.printf("%d %s %d = %d\n", operand1, operator, operand2, result)    ;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();
        Calculator calculator = new Calculator(operator);
        calculator.execute();
    }

}
