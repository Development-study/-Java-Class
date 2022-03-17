package kr.hs.dgsw.java.dept23.d0317;

public class DataTypeStudy {

    public void studyInteger() {
        byte byteValue = 127;
        short shortValue = 30000;
        int intValue = 2100000000;
        long longValue = 30000000001L;
    }

    public void studyReal() {
        double doubleValue = 3.1415926;
        float floatValue = 3.1415926F;

        System.out.println(doubleValue);
        System.out.println(floatValue);
    }

    public void studyBoolean() {
        boolean bool1 = true;
        boolean bool2 = false;

        if(bool1) {
            // do something
        }
    }

    public void studyChar() {
        char ch = 'A';
        char ch2 = 65;

        /*
        for(char i = 0; i < 256; i++) {
            System.out.printf("%04X %d = %c\n",(int)i, (int)i, i);
        }
         */

        int h1 = '가';
        System.out.println(h1);

        int count = '힣' - '가' + 1;
        System.out.println(count);

        /*
        for (int i = '가'; i < '갸'; i++) {
            System.out.printf("%d = %c\n", i, (char)i);
        }
         */

        int hanja1 = '一';
        int hanja2 = '鳥';
        int hanja3 = '入';
        int hanja4 = '力';

        System.out.println(hanja1 + " " + hanja2 + " " + hanja3 + " " + hanja4 );
    }

    public static void main(String[] args) {
        DataTypeStudy study = new DataTypeStudy();
//        study.studyReal();
        study.studyChar();
    }
}
