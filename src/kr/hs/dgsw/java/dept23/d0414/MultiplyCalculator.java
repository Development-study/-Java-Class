package kr.hs.dgsw.java.dept23.d0414;

public class MultiplyCalculator extends PlusCalculator{

    public int calculate() {
        return this.value1 * this.value2;
    }

    public String getOperator() {
        return "*";
    }

    public static void main(String[] args) {
        MultiplyCalculator Calculator = new MultiplyCalculator();
        Calculator.execute();
    }

}
