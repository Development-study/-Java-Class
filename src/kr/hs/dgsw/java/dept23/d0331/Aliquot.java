package kr.hs.dgsw.java.dept23.d0331;

import java.util.LinkedList;
import java.util.List;

public class Aliquot {

    public String findAliquots(int value) {
        String aliquot = "";
        for(int i = 1; i <= value; i++) {
            if(value%i == 0) {
                //Aliquot = Aliquot.concat(i + " ");
                aliquot += i + ", ";
            }
        }

        return aliquot.substring(0, aliquot.length() - 2);
    }

    public static void main(String[] args) {
        long check1 = System.currentTimeMillis();
        Aliquot ali = new Aliquot();
        System.out.println(ali.findAliquots(2000000000));
        long check2 = System.currentTimeMillis();
        System.out.println("time : " + (check2 - check1));
    }

}
