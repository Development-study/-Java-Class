package kr.hs.dgsw.java.dept23.d0407;

import java.util.Arrays;

public class ArrayStudy {

    public void studyArray() {
        int array2[];

        String[] names = new String[5];

        int[] array1 = new int[10];
        int[] values = {1, 2, 3, 4, 5};

        String[] colors = {"빨강", "주황", "노랑", "초록", "파랑"};

        System.out.println(colors[1]);
        colors[4] = "분홍";

//        String myColor = colors[5];
//        System.out.println("myColor : " + myColor);

        String[] colors2 = colors;

        colors2[2] = "blue";
//        System.out.println(colors[2]);

        ArrayCopy arrayCopy = new ArrayCopy();
        String[] colors3 = arrayCopy.copy(colors);
        colors3[3] = "green";
//        System.out.println(colors[3]);

//        System.out.println("colors : ", Arrays.toString);
//        System.out.println("colors2 : ", Arrays.toString(colors2));
//        System.out.println("colors3 : ", Arrays.toString(colors3));

    }

    public void printColors(String[] colors) {
        for(int i = 0; i < colors.length; i++) {
            System.out.println(i + " - " + colors[i]);
        }

        for(String i:colors) {
            System.out.println(colors);
        }
    }

    public void printLastValue(String[] values) {
        int length = values.length;
        System.out.println(values[length - 1]);
    }

    public static void main(String[] args) {
        ArrayStudy study = new ArrayStudy();
        study.studyArray();
    }

}
